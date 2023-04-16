package id.o;
import id.w;
import tc.h;
import id.b0;
import java.lang.String;
import java.io.Closeable;
import bd.d;
import id.c0;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import android.util.Pair;

public class o extends w	// class@0021c3
{
    public final h a;

    public void o(h p0,boolean p1,b0 p2){
       super(p2, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", p1);
       this.a = p0;
    }
    public Closeable cloneOrNull(Closeable p0){
       return d.a(p0);
    }
    public Object getKey(c0 p0){
       return Pair.create(this.a.b(p0.b(), p0.h()), p0.q());
    }
}
