package okhttp3.Cache;
import java.io.Closeable;
import java.io.Flushable;
import java.io.File;
import okhttp3.internal.io.FileSystem;
import java.lang.Object;
import okhttp3.Cache$1;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.HttpUrl;
import java.lang.String;
import okio.ByteString;
import okio.d;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.NumberFormatException;
import okhttp3.internal.cache.DiskLruCache$Editor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.cache.DiskLruCache$Snapshot;
import okhttp3.Cache$Entry;
import okio.n;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.Cache$CacheRequestImpl;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.Cache$CacheResponseBody;
import java.util.Iterator;
import okhttp3.Cache$2;

public final class Cache implements Closeable, Flushable	// class@001f36
{
    public final DiskLruCache cache;
    public int hitCount;
    public final InternalCache internalCache;
    public int networkCount;
    public int requestCount;
    public int writeAbortCount;
    public int writeSuccessCount;
    public static final int VERSION = 201105;

    public void Cache(File p0,long p1){
       super(p0, p1, FileSystem.SYSTEM);
    }
    public void Cache(File p0,long p1,FileSystem p2){
       super();
       this.internalCache = new Cache$1(this);
       this.cache = DiskLruCache.create(p2, p0, 0x31191, 2, p1);
    }
    public static String key(HttpUrl p0){
       return ByteString.encodeUtf8(p0.toString()).md5().hex();
    }
    public static int readInt(d p0){
       try{
          long l = p0.readDecimalLong();
          String str = p0.readUtf8LineStrict();
          if (l - null >= 0 && (l - 0x7fffffff <= 0 && str.isEmpty())) {
             return (int)l;
          }
          throw new IOException("expected an int but was \""+l+str+"\"");
       }catch(java.lang.NumberFormatException e5){
          throw new IOException(e5.getMessage());
       }
    }
    public final void abortQuietly(DiskLruCache$Editor p0){
       try{
          if (p0 != null) {
             p0.abort();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public void close(){
       this.cache.close();
    }
    public void delete(){
       this.cache.delete();
    }
    public File directory(){
       return this.cache.getDirectory();
    }
    public void evictAll(){
       this.cache.evictAll();
    }
    public void flush(){
       this.cache.flush();
    }
    public Response get(Request p0){
       String str = Cache.key(p0.url());
       try{
          int i = 0;
          DiskLruCache$Snapshot snapshot = this.cache.get(str);
          if (snapshot == null) {
             return i;
          }
          try{
             Cache$Entry uEntry = new Cache$Entry(snapshot.getSource(0));
             Response response = uEntry.response(snapshot);
             if (uEntry.matches(p0, response)) {
                return response;
             }
             Util.closeQuietly(response.body());
             return i;
          }catch(java.io.IOException e0){
             Util.closeQuietly(e0);
             return i;
          }
       }catch(java.io.IOException e0){
       }
    }
    public synchronized int hitCount(){
       return this.hitCount;
    }
    public void initialize(){
       this.cache.initialize();
    }
    public boolean isClosed(){
       return this.cache.isClosed();
    }
    public long maxSize(){
       return this.cache.getMaxSize();
    }
    public synchronized int networkCount(){
       return this.networkCount;
    }
    public CacheRequest put(Response p0){
       CacheRequest uCacheReques;
       String str = p0.request().method();
       if (HttpMethod.invalidatesCache(p0.request().method())) {
          try{
             this.remove(p0.request());
             return null;
          }catch(java.io.IOException e0){
          }
       }else if(!str.equals("GET")){
          return null;
       }else if(HttpHeaders.hasVaryAll(p0)){
          return null;
       }else {
          try{
             Cache$Entry uEntry = new Cache$Entry(p0);
             DiskLruCache$Editor uEditor = this.cache.edit(Cache.key(p0.request().url()));
             if (uEditor == null) {
                return null;
             }
             try{
                uEntry.writeTo(uEditor);
                return new Cache$CacheRequestImpl(this, uEditor);
             }catch(java.io.IOException e0){
                this.abortQuietly(uCacheReques);
                return null;
             }
          }catch(java.io.IOException e0){
             uCacheReques = null;
             goto label_0053 ;
          }
       }
    }
    public void remove(Request p0){
       this.cache.remove(Cache.key(p0.url()));
    }
    public synchronized int requestCount(){
       return this.requestCount;
    }
    public long size(){
       return this.cache.size();
    }
    public synchronized void trackConditionalCacheHit(){
       this.hitCount = this.hitCount + 1;
    }
    public synchronized void trackResponse(CacheStrategy p0){
       this.requestCount = this.requestCount + 1;
       if (p0.networkRequest != null) {
          this.networkCount = this.networkCount + 1;
       }else if(p0.cacheResponse != null){
          this.hitCount = this.hitCount + 1;
       }
       return;
    }
    public void update(Response p0,Response p1){
       DiskLruCache$Editor uEditor;
       Cache$Entry uEntry = new Cache$Entry(p1);
       Cache$CacheResponseBody uCacheRespon = p0.body();
       try{
          uCacheRespon = uCacheRespon.snapshot;
          uEditor = uCacheRespon.edit();
          if (uEditor != null) {
             try{
                uEntry.writeTo(uEditor);
                uEditor.commit();
             }catch(java.io.IOException e0){
                this.abortQuietly(uEditor);
             }
          }
       }catch(java.io.IOException e0){
          uEditor = null;
          goto label_001b ;
       }
       return;
    }
    public Iterator urls(){
       return new Cache$2(this);
    }
    public synchronized int writeAbortCount(){
       return this.writeAbortCount;
    }
    public synchronized int writeSuccessCount(){
       return this.writeSuccessCount;
    }
}
