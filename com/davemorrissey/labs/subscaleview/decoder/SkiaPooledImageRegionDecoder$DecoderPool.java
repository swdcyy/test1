package com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder$DecoderPool;
import java.lang.Object;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ConcurrentHashMap;
import com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder$1;
import android.graphics.BitmapRegionDecoder;
import java.lang.Boolean;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class SkiaPooledImageRegionDecoder$DecoderPool	// class@000fc4
{
    public final Semaphore available;
    public Map decoders;

    public void SkiaPooledImageRegionDecoder$DecoderPool(){
       super();
       this.available = new Semaphore(0, true);
       this.decoders = new ConcurrentHashMap();
    }
    public void SkiaPooledImageRegionDecoder$DecoderPool(SkiaPooledImageRegionDecoder$1 p0){
       super();
    }
    public BitmapRegionDecoder acquire(){
       this.available.acquireUninterruptibly();
       return this.getNextAvailable();
    }
    public synchronized void add(BitmapRegionDecoder p0){
       this.decoders.put(p0, Boolean.FALSE);
       this.available.release();
    }
    public synchronized final BitmapRegionDecoder getNextAvailable(){
       Map$Entry uEntry;
       Iterator iterator = this.decoders.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uEntry = iterator.next();
          if (!uEntry.getValue().booleanValue()) {
             break ;
          }
       }
       uEntry.setValue(Boolean.TRUE);
       return uEntry.getKey();
    }
    public synchronized boolean isEmpty(){
       return this.decoders.isEmpty();
    }
    public synchronized final boolean markAsUnused(BitmapRegionDecoder p0){
       Map$Entry uEntry;
       Iterator iterator = this.decoders.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          uEntry = iterator.next();
          if (p0 == uEntry.getKey()) {
             if (!uEntry.getValue().booleanValue()) {
                return false;
             }
             break ;
          }
       }
       uEntry.setValue(Boolean.FALSE);
       return true;
    }
    public synchronized void recycle(){
       while (!this.decoders.isEmpty()) {
          BitmapRegionDecoder uBitmapRegio = this.acquire();
          uBitmapRegio.recycle();
          this.decoders.remove(uBitmapRegio);
       }
       return;
    }
    public void release(BitmapRegionDecoder p0){
       if (this.markAsUnused(p0)) {
          this.available.release();
       }
       return;
    }
    public synchronized int size(){
       return this.decoders.size();
    }
}
