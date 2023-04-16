package okhttp3.internal.cache.DiskLruCache;
import java.io.Closeable;
import java.io.Flushable;
import java.lang.String;
import java.util.regex.Pattern;
import okhttp3.internal.io.FileSystem;
import java.io.File;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.LinkedHashMap;
import okhttp3.internal.cache.DiskLruCache$1;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;
import java.util.concurrent.BlockingQueue;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.util.Collection;
import okhttp3.internal.cache.DiskLruCache$Entry;
import okhttp3.internal.cache.DiskLruCache$Editor;
import okio.m;
import java.lang.StringBuilder;
import okio.c;
import java.lang.Runnable;
import okhttp3.internal.cache.DiskLruCache$Snapshot;
import okhttp3.internal.platform.Platform;
import java.io.IOException;
import java.lang.Throwable;
import okhttp3.internal.cache.DiskLruCache$2;
import okio.l;
import java.util.Iterator;
import okio.n;
import okio.d;
import cud.k;
import java.lang.Integer;
import cud.j;
import okhttp3.internal.cache.DiskLruCache$3;
import java.lang.CharSequence;
import java.util.regex.Matcher;

public final class DiskLruCache implements Closeable, Flushable	// class@001f7e
{
    public final int appVersion;
    public final Runnable cleanupRunnable;
    public boolean closed;
    public final File directory;
    public final Executor executor;
    public final FileSystem fileSystem;
    public boolean hasJournalErrors;
    public boolean initialized;
    public final File journalFile;
    public final File journalFileBackup;
    public final File journalFileTmp;
    public c journalWriter;
    public final LinkedHashMap lruEntries;
    public long maxSize;
    public boolean mostRecentRebuildFailed;
    public boolean mostRecentTrimFailed;
    public long nextSequenceNumber;
    public int redundantOpCount;
    public long size;
    public final int valueCount;
    public static final boolean $assertionsDisabled;
    public static final Pattern LEGAL_KEY_PATTERN;

    static {
       DiskLruCache.LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    }
    public void DiskLruCache(FileSystem p0,File p1,int p2,int p3,long p4,Executor p5){
       super();
       this.size = 0;
       this.lruEntries = new LinkedHashMap(0, 0x3f400000, true);
       this.nextSequenceNumber = 0;
       this.cleanupRunnable = new DiskLruCache$1(this);
       this.fileSystem = p0;
       this.directory = p1;
       this.appVersion = p2;
       this.journalFile = new File(p1, "journal");
       this.journalFileTmp = new File(p1, "journal.tmp");
       this.journalFileBackup = new File(p1, "journal.bkp");
       this.valueCount = p3;
       this.maxSize = p4;
       this.executor = p5;
    }
    public static DiskLruCache create(FileSystem p0,File p1,int p2,int p3,long p4){
       if (p4 - null <= 0) {
          throw new IllegalArgumentException("maxSize <= 0");
       }
       if (p3 <= 0) {
          throw new IllegalArgumentException("valueCount <= 0");
       }
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true));
       DiskLruCache uDiskLruCach = new DiskLruCache(p0, p1, p2, p3, p4, v9);
       return threadPoolEx;
    }
    public synchronized final void checkNotClosed(){
       if (!this.isClosed()) {
          return;
       }
       throw new IllegalStateException("cache is closed");
    }
    public synchronized void close(){
       if (this.initialized == null || this.closed != null) {
          this.closed = true;
          return;
       }else {
          DiskLruCache$Entry[] uEntryArray = new DiskLruCache$Entry[this.lruEntries.size()];
          DiskLruCache$Entry[] uEntryArray1 = this.lruEntries.values().toArray(uEntryArray);
          int len = uEntryArray1.length;
          int i = 0;
          while (i < len) {
             DiskLruCache$Entry currentEdito = uEntryArray1[i].currentEditor;
             if (currentEdito != null) {
                currentEdito.abort();
             }
             i = i + 1;
          }
          this.trimToSize();
          this.journalWriter.close();
          this.journalWriter = null;
          this.closed = true;
          return;
       }
    }
    public synchronized void completeEdit(DiskLruCache$Editor p0,boolean p1){
       int i1;
       DiskLruCache$Editor entry = p0.entry;
       if (entry.currentEditor != p0) {
          throw new IllegalStateException();
       }
       int i = 0;
       if (p1 && entry.readable == null) {
          i1 = 0;
          while (true) {
             if (i1 < this.valueCount) {
                if (p0.written[i1]) {
                   if (!this.fileSystem.exists(entry.dirtyFiles[i1])) {
                      p0.abort();
                      return;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   p0.abort();
                   throw new IllegalStateException("Newly created entry didn\'t create value for index "+i1);
                }
             }
          }
       }
       while (i < this.valueCount) {
          object oobject = entry.dirtyFiles[i];
          if (p1) {
             if (this.fileSystem.exists(oobject)) {
                object oobject1 = entry.cleanFiles[i];
                this.fileSystem.rename(oobject, oobject1);
                long l = entry.lengths[i];
                long l1 = this.fileSystem.size(oobject1);
                oobject[i] = l1;
                long l2 = this.size - l;
                l2 = l2 + l1;
                this.size = l2;
             }
          }else {
             this.fileSystem.delete(oobject);
          }
          i = i + 1;
       }
       i = 1;
       this.redundantOpCount = this.redundantOpCount + i;
       entry.currentEditor = null;
       i1 = 10;
       if (entry.readable | p1) {
          entry.readable = i;
          this.journalWriter.writeUtf8("CLEAN").writeByte(32);
          this.journalWriter.writeUtf8(entry.key);
          entry.writeLengths(this.journalWriter);
          this.journalWriter.writeByte(i1);
          if (p1) {
             DiskLruCache tnextSequenc = this.nextSequenceNumber;
             this.nextSequenceNumber = 1 + tnextSequenc;
             entry.sequenceNumber = tnextSequenc;
          }
       }else {
          this.lruEntries.remove(entry.key);
          this.journalWriter.writeUtf8("REMOVE").writeByte(32);
          this.journalWriter.writeUtf8(entry.key);
          this.journalWriter.writeByte(i1);
       }
       this.journalWriter.flush();
       if (this.size - this.maxSize > 0 || this.journalRebuildRequired()) {
          this.executor.execute(this.cleanupRunnable);
       }
       return;
    }
    public void delete(){
       this.close();
       this.fileSystem.deleteContents(this.directory);
    }
    public DiskLruCache$Editor edit(String p0){
       return this.edit(p0, -1);
    }
    public synchronized DiskLruCache$Editor edit(String p0,long p1){
       this.initialize();
       this.checkNotClosed();
       this.validateKey(p0);
       DiskLruCache$Entry uEntry = this.lruEntries.get(p0);
       if (p1 - -1 && (uEntry == null || uEntry.sequenceNumber - p1)) {
          return null;
       }
       if (uEntry != null && uEntry.currentEditor != null) {
          return null;
       }
       if (this.mostRecentTrimFailed != null || this.mostRecentRebuildFailed != null) {
          this.executor.execute(this.cleanupRunnable);
          return null;
       }else {
          this.journalWriter.writeUtf8("DIRTY").writeByte(32).writeUtf8(p0).writeByte(10);
          this.journalWriter.flush();
          if (this.hasJournalErrors != null) {
             return null;
          }
          if (uEntry == null) {
             uEntry = new DiskLruCache$Entry(this, p0);
             this.lruEntries.put(p0, uEntry);
          }
          DiskLruCache$Editor uEditor = new DiskLruCache$Editor(this, uEntry);
          uEntry.currentEditor = uEditor;
          return uEditor;
       }
    }
    public synchronized void evictAll(){
       this.initialize();
       DiskLruCache$Entry[] uEntryArray = new DiskLruCache$Entry[this.lruEntries.size()];
       DiskLruCache$Entry[] uEntryArray1 = this.lruEntries.values().toArray(uEntryArray);
       int len = uEntryArray1.length;
       for (int i = 0; i < len; i = i + 1) {
          this.removeEntry(uEntryArray1[i]);
       }
       this.mostRecentTrimFailed = false;
       return;
    }
    public synchronized void flush(){
       if (this.initialized == null) {
          return;
       }
       this.checkNotClosed();
       this.trimToSize();
       this.journalWriter.flush();
       return;
    }
    public synchronized DiskLruCache$Snapshot get(String p0){
       this.initialize();
       this.checkNotClosed();
       this.validateKey(p0);
       DiskLruCache$Entry uEntry = this.lruEntries.get(p0);
       DiskLruCache$Snapshot snapshot = null;
       if (uEntry == null || uEntry.readable == null) {
          return snapshot;
       }
       DiskLruCache$Snapshot snapshot1 = uEntry.snapshot();
       if (snapshot1 == null) {
          return snapshot;
       }
       this.redundantOpCount = this.redundantOpCount + 1;
       this.journalWriter.writeUtf8("READ").writeByte(32).writeUtf8(p0).writeByte(10);
       if (this.journalRebuildRequired()) {
          this.executor.execute(this.cleanupRunnable);
       }
       return snapshot1;
    }
    public File getDirectory(){
       return this.directory;
    }
    public synchronized long getMaxSize(){
       return this.maxSize;
    }
    public synchronized void initialize(){
       if (this.initialized != null) {
          return;
       }
       if (this.fileSystem.exists(this.journalFileBackup)) {
          if (this.fileSystem.exists(this.journalFile)) {
             this.fileSystem.delete(this.journalFileBackup);
          }else {
             this.fileSystem.rename(this.journalFileBackup, this.journalFile);
          }
       }
       if (this.fileSystem.exists(this.journalFile)) {
          try{
             this.readJournal();
             this.processJournal();
             this.initialized = true;
             return;
          }catch(java.io.IOException e0){
             Platform.get().log(5, "DiskLruCache "+this.directory+" is corrupt: "+e0.getMessage()+", removing", e0);
             this.delete();
             this.closed = false;
          }
          this.rebuildJournal();
          this.initialized = v1;
          return;
       }else {
          goto label_0079 ;
       }
    }
    public synchronized boolean isClosed(){
       return this.closed;
    }
    public boolean journalRebuildRequired(){
       DiskLruCache tredundantOp = this.redundantOpCount;
       boolean b = (tredundantOp >= 2000 && tredundantOp >= this.lruEntries.size())? true: false;
       return b;
    }
    public final c newJournalWriter(){
       return l.c(new DiskLruCache$2(this, this.fileSystem.appendingSink(this.journalFile)));
    }
    public final void processJournal(){
       int i;
       this.fileSystem.delete(this.journalFileTmp);
       Iterator iterator = this.lruEntries.values().iterator();
       while (iterator.hasNext()) {
          DiskLruCache$Entry uEntry = iterator.next();
          if (uEntry.currentEditor == null) {
             for (i = 0; i < this.valueCount; i = i + 1) {
                long l = this.size + uEntry.lengths[i];
                this.size = l;
             }
          }else {
             uEntry.currentEditor = null;
             for (; i < this.valueCount; i = i + 1) {
                this.fileSystem.delete(uEntry.cleanFiles[i]);
                this.fileSystem.delete(uEntry.dirtyFiles[i]);
             }
             iterator.remove();
          }
       }
       return;
    }
    public final void readJournal(){
       String str = ", ";
       d uod = l.d(this.fileSystem.source(this.journalFile));
       d uod1 = uod;
       String str1 = uod1.readUtf8LineStrict();
       String str2 = uod1.readUtf8LineStrict();
       String str3 = uod1.readUtf8LineStrict();
       String str4 = uod1.readUtf8LineStrict();
       String str5 = uod1.readUtf8LineStrict();
       if (!("libcore.io.DiskLruCache").equals(str1) || (!("1").equals(str2) || (!(Integer.toString(this.appVersion)).equals(str3) || (!(Integer.toString(this.valueCount)).equals(str4) || !("").equals(str5))))) {
          throw new IOException("unexpected journal header: ["+str1+str+str2+str+str4+str+str5+"]");
       }
       int i = 0;
       try{
          while (true) {
             this.readJournalLine(uod1.readUtf8LineStrict());
             i = i + 1;
          }
       }catch(java.io.EOFException e0){
          this.redundantOpCount = e0 - this.lruEntries.size();
          if (!uod1.exhausted()) {
             this.rebuildJournal();
          }else {
             this.journalWriter = this.newJournalWriter();
          }
          Util.closeQuietly(uod);
          return;
       }
    }
    public final void readJournalLine(String p0){
       String str;
       int i = 32;
       int i1 = p0.indexOf(i);
       if (i1 == -1) {
          throw new IOException("unexpected journal line: "+p0);
       }
       int i2 = i1 + 1;
       i = p0.indexOf(i, i2);
       if (i == -1) {
          str = p0.substring(i2);
          if (i1 == 6 && p0.startsWith("REMOVE")) {
             this.lruEntries.remove(str);
             return;
          }
       }else {
          str = p0.substring(i2, i);
       }
       DiskLruCache$Entry uEntry = this.lruEntries.get(str);
       if (uEntry == null) {
          uEntry = new DiskLruCache$Entry(this, str);
          this.lruEntries.put(str, uEntry);
       }
       str = 5;
       if (i != -1 && (i1 == str && p0.startsWith("CLEAN"))) {
          uEntry.readable = true;
          uEntry.currentEditor = null;
          uEntry.setLengths((p0.substring((i + 1))).split(" "));
       }else if(i == -1 && (i1 == str && p0.startsWith("DIRTY"))){
          uEntry.currentEditor = new DiskLruCache$Editor(this, uEntry);
       }else if(i == -1 && (i1 == 4 && p0.startsWith("READ"))){
          throw new IOException("unexpected journal line: "+p0);
       }
       return;
    }
    public synchronized void rebuildJournal(){
       DiskLruCache tjournalWrit = this.journalWriter;
       if (tjournalWrit != null) {
          tjournalWrit.close();
       }
       c uoc = l.c(this.fileSystem.sink(this.journalFileTmp));
       c uoc1 = uoc;
       uoc1.writeUtf8("libcore.io.DiskLruCache");
       int i = 10;
       uoc1.writeByte(i);
       c uoc2 = uoc;
       uoc2.writeUtf8("1");
       uoc2.writeByte(i);
       uoc2.writeDecimalLong((long)this.appVersion);
       uoc2.writeByte(i);
       uoc2.writeDecimalLong((long)this.valueCount);
       uoc2.writeByte(i);
       uoc2.writeByte(i);
       Iterator iterator = this.lruEntries.values().iterator();
       while (iterator.hasNext()) {
          DiskLruCache$Entry uEntry = iterator.next();
          if (uEntry.currentEditor != null) {
             uoc2.writeUtf8("DIRTY");
             uoc2.writeByte(32);
             uoc2.writeUtf8(uEntry.key);
             uoc2.writeByte(i);
          }else {
             uoc2.writeUtf8("CLEAN");
             uoc2.writeByte(32);
             uoc2.writeUtf8(uEntry.key);
             uEntry.writeLengths(uoc);
             uoc2.writeByte(i);
          }
       }
       uoc2.close();
       if (this.fileSystem.exists(this.journalFile)) {
          this.fileSystem.rename(this.journalFile, this.journalFileBackup);
       }
       this.fileSystem.rename(this.journalFileTmp, this.journalFile);
       this.fileSystem.delete(this.journalFileBackup);
       this.journalWriter = this.newJournalWriter();
       this.hasJournalErrors = false;
       this.mostRecentRebuildFailed = false;
       return;
    }
    public synchronized boolean remove(String p0){
       this.initialize();
       this.checkNotClosed();
       this.validateKey(p0);
       DiskLruCache$Entry uEntry = this.lruEntries.get(p0);
       if (uEntry == null) {
          return false;
       }
       boolean b = this.removeEntry(uEntry);
       if (b && this.size - this.maxSize <= 0) {
          this.mostRecentTrimFailed = false;
       }
       return b;
    }
    public boolean removeEntry(DiskLruCache$Entry p0){
       DiskLruCache$Entry currentEdito = p0.currentEditor;
       if (currentEdito != null) {
          currentEdito.detach();
       }
       for (int i = 0; i < this.valueCount; i = i + 1) {
          this.fileSystem.delete(p0.cleanFiles[i]);
          DiskLruCache$Entry lengths = p0.lengths;
          long l = this.size - lengths[i];
          this.size = l;
          lengths[i] = 0;
       }
       this.redundantOpCount = this.redundantOpCount + 1;
       this.journalWriter.writeUtf8("REMOVE").writeByte(32).writeUtf8(p0.key).writeByte(10);
       this.lruEntries.remove(p0.key);
       if (this.journalRebuildRequired()) {
          this.executor.execute(this.cleanupRunnable);
       }
       return 1;
    }
    public synchronized void setMaxSize(long p0){
       this.maxSize = p0;
       if (this.initialized != null) {
          this.executor.execute(this.cleanupRunnable);
       }
       return;
    }
    public synchronized long size(){
       this.initialize();
       return this.size;
    }
    public synchronized Iterator snapshots(){
       this.initialize();
       return new DiskLruCache$3(this);
    }
    public void trimToSize(){
       while (this.size - this.maxSize > 0) {
          this.removeEntry(this.lruEntries.values().iterator().next());
       }
       this.mostRecentTrimFailed = false;
       return;
    }
    public final void validateKey(String p0){
       if (DiskLruCache.LEGAL_KEY_PATTERN.matcher(p0).matches()) {
          return;
       }
       throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \""+p0+"\"");
    }
}
