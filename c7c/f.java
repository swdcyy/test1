package c7c.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import wb5.g;
import android.view.View;
import com.yxcorp.utility.n;
import zf6.k;
import android.widget.ImageView;
import lu7.i;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import c7c.e;
import android.view.View$OnClickListener;
import com.kwai.framework.model.user.RecoUser;
import f7c.c;

public class f extends PresenterV2	// class@000543
{
    public KwaiImageView p;
    public ImageView q;
    public RecoUser r;
    public c s;
    public View t;
    public User u;

    public void f(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       g.b(this.p, this.u, HeadImageSize.ADJUST_BIG);
       f tu = this.u;
       if (tu.mIsLiving != null) {
          View[] viewArray = new View[]{this.q};
          n.Z(8, viewArray);
       }else {
          i.d(this.q, tu, k.d());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0fb1);
       this.p = m1.f(p0, 0x7f0a0333);
       this.q = m1.f(p0, 0x7f0a4479);
       m1.a(p0, new e(this), R.id.avatar);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.u = this.q8(User.class);
       this.r = this.q8(RecoUser.class);
       this.s = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       return;
    }
}
