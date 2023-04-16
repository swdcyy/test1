package okhttp3.internal.cache.DiskLruCache$Entry;
import okhttp3.internal.cache.DiskLruCache;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import java.lang.StringBuilder;
import java.io.IOException;
import java.util.Arrays;
import java.lang.Long;
import okhttp3.internal.cache.DiskLruCache$Snapshot;
import java.lang.Thread;
import okio.n;
import okhttp3.internal.io.FileSystem;
import java.io.Closeable;
import okhttp3.internal.Util;
import java.lang.AssertionError;
import okio.c;

public final class DiskLruCache$Entry	// class@001f7c
{
    public final File[] cleanFiles;
    public DiskLruCache$Editor currentEditor;
    public final File[] dirtyFiles;
    public final String key;
    public final long[] lengths;
    public boolean readable;
    public long sequenceNumber;
    public final DiskLruCache this$0;

    public void DiskLruCache$Entry(DiskLruCache p0,String p1){
       this.this$0 = p0;
       super();
       this.key = p1;
       DiskLruCache valueCount = p0.valueCount;
       long[] olongArray = new long[valueCount];
       this.lengths = olongArray;
       File[] uFileArray = new File[valueCount];
       this.cleanFiles = uFileArray;
       File[] uFileArray1 = new File[valueCount];
       this.dirtyFiles = uFileArray1;
       StringBuilder str = p1+'.';
       int i = str.length();
       for (int i1 = 0; i1 < p0.valueCount; i1 = i1 + 1) {
          str = str+i1;
          this.cleanFiles[i1] = new File(p0.directory, str);
          str = str+".tmp";
          this.dirtyFiles[i1] = new File(p0.directory, str);
          str.setLength(i);
       }
       return;
    }
    public final IOException invalidLengths(String[] p0){
       throw new IOException("unexpected journal line: "+Arrays.toString(p0));
    }
    public void setLengths(String[] p0){
       if (p0.length != this.this$0.valueCount) {
          throw this.invalidLengths(p0);
       }
       try{
          for (int i = 0; i < p0.length; i = i + 1) {
             this.lengths[i] = Long.parseLong(p0[i]);
          }
          return;
       }catch(java.lang.NumberFormatException e0){
          throw this.invalidLengths(p0);
       }
    }
    public DiskLruCache$Snapshot snapshot(){
       if (!Thread.holdsLock(this.this$0)) {
          throw new AssertionError();
       }
       n[] onArray = new n[this.this$0.valueCount];
       Object obj = this.lengths.clone();
       int i = 0;
       try{
          DiskLruCache$Entry tthis$0 = this.this$0;
          while (i < tthis$0.valueCount) {
             onArray[i] = tthis$0.fileSystem.source(this.cleanFiles[i]);
             i = i + 1;
          }
          DiskLruCache$Snapshot snapshot = new DiskLruCache$Snapshot(tthis$0, this.key, this.sequenceNumber, onArray, obj);
          return v9;
       }catch(java.io.FileNotFoundException e0){
       label_003b :
          DiskLruCache$Entry tthis$01 = this.this$0;
          if (0 < tthis$01.valueCount && e0[0] != null) {
             Util.closeQuietly(e0[0]);
             int i1 = 0 + 1;
             goto label_003b ;
          }else {
             try{
                tthis$01.removeEntry(this);
                return null;
             }catch(java.io.IOException e0){
             }
          }
       }
    }
    public void writeLengths(c p0){
       DiskLruCache$Entry tlengths = this.lengths;
       int len = tlengths.length;
       for (int i = 0; i < len; i = i + 1) {
          p0.writeByte(32).writeDecimalLong(tlengths[i]);
       }
       return;
    }
}
