package bia.c;
import vga.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xl8.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public final class c implements b	// class@0003c2
{
    public final b a;
    public BaseFragment b;
    public GifshowActivity c;
    public b d;

    public void c(GifshowActivity p0){
       super();
       this.c = p0;
       this.a = new b(null);
    }
    public void c(BaseFragment p0){
       super();
       this.b = p0;
       this.a = new b(null);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       b9.a(this.d);
       this.d = null;
       return;
    }
}
