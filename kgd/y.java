package kgd.y;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import k2b.e0;
import sgd.b;

public class y implements PopupInterface$h	// class@0017ca
{
    public final GifshowActivity b;

    public void y(GifshowActivity p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oy, "1")) {
          return;
       }
       b.k(this.b, "CLOSED_FRIEND_RELATIONSHIP", 2);
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
