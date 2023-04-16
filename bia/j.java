package bia.j;
import vga.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xl8.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class j implements b	// class@0003ca
{
    public final b a;
    public BaseFragment b;
    public GifshowActivity c;
    public b d;

    public void j(GifshowActivity p0){
       super();
       this.c = p0;
       this.a = new b(Boolean.TRUE);
    }
    public void j(BaseFragment p0){
       super();
       this.b = p0;
       this.a = new b(Boolean.TRUE);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       b9.a(this.d);
       this.d = null;
       return;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.a.a();
          a.o(obj, "mPhotoScreenVisible.value");
       }
       return obj.booleanValue();
    }
}
