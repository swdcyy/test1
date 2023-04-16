package a2c.d;
import erd.g;
import a2c.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import crd.b;
import lnc.b9;

public final class d implements g	// class@00003f
{
    public final a b;
    public final GifshowActivity c;

    public void d(a p0,GifshowActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uod, "1")) {
          if (b) {
             this.b.b(this.c);
          }
          b9.a(this.b.e);
       }
       return;
    }
}
