package az5.h;
import java.lang.Runnable;
import az5.i;
import java.lang.Object;
import androidx.collection.LruCache;

public final class h implements Runnable	// class@0003d5
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       LruCache lruCache = tb.b();
       tb.b = lruCache;
       if (lruCache == null || !lruCache.size()) {
          lruCache = new LruCache(tb.f());
          tb.b = lruCache;
          tb.i(lruCache);
       }
       return;
    }
}
