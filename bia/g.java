package bia.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xl8.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class g	// class@0003c7
{
    public final b a;
    public BaseFragment b;
    public GifshowActivity c;

    public void g(GifshowActivity p0){
       super();
       this.c = p0;
       this.a = new b(Boolean.FALSE);
    }
    public void g(BaseFragment p0){
       super();
       this.b = p0;
       this.a = new b(Boolean.FALSE);
    }
    public final void a(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "2")) {
          return;
       }
       this.a.d(Boolean.valueOf(p0));
       return;
    }
}
