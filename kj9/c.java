package kj9.c;
import com.yxcorp.gifshow.channel.stagger.banner.CustomBannerView$a;
import kj9.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Float;
import ij9.d;

public class c implements CustomBannerView$a	// class@002ca6
{
    public final b a;

    public void c(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.S8(p0);
       this.a.V8(p0);
       return;
    }
    public void b(float p0,int p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, c.class, "2")) {
          return;
       }
       this.a.V8(p1);
       return;
    }
    public void onScrollStateChanged(int p0){
       d.b(this, p0);
    }
}
