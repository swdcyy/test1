package n0d.a;
import yc.b;
import ed.v;
import java.lang.Object;
import bd.d;
import bd.h;
import uc.b;
import com.facebook.imagepipeline.image.a;
import com.kwai.video.ksheifdec.HeifImageDecoder;
import nc.a;
import com.facebook.imageformat.a;

public final class a implements b	// class@001ef5
{
    public final v a;

    public void a(v p0){
       this.a = p0;
    }
    public final a decode(d p0,int p1,h p2,b p3){
       return new HeifImageDecoder(this.a, a.k).decodeHeif(p0, p3);
    }
}
