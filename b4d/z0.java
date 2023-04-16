package b4d.z0;
import java.lang.Runnable;
import b4d.v0$f;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import b4d.v0;

public final class z0 implements Runnable	// class@0003a2
{
    public final v0$f b;
    public final KwaiImageView c;
    public final CDNUrl[] d;
    public final Runnable e;

    public void z0(v0$f p0,KwaiImageView p1,CDNUrl[] p2,Runnable p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       this.b.e.P8(this.c, this.d, this.e);
    }
}
