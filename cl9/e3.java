package cl9.e3;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import uc5.a;
import cl9.b3;
import com.yxcorp.gifshow.image.KwaiImageView;
import ok.o;
import cl9.c3;
import com.yxcorp.gifshow.model.CDNUrl;
import android.widget.ImageView;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import cl9.d3;
import java.lang.Boolean;
import lnc.i3;
import android.view.View;
import ekd.m1;

public class e3 extends PresenterV2	// class@00061a
{
    public QPhoto p;
    public QComment q;
    public KwaiImageView r;

    public void e3(){
       super();
    }
    public void E8(){
       e3 uoe3 = e3.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe3, "3")) {
          return;
       }
       User user = this.q.getUser();
       if (user == null) {
          return;
       }
       if (this.r != null) {
          if (a.a(user.mPendantType) && this.q.isLocalCreated()) {
             a.c(this.r, R.drawable.arg_RES_7f0803cc, b3.b);
          }else {
             a.d(this.r, user.mPendants, c3.b);
          }
          if (PatchProxy.applyVoid(objArray, this, uoe3, "5") || (this.r.getVisibility() || (this.q.getUser() != null && a.a(this.q.getUser().mPendantType)))) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "SHOW_PENDANT";
             ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
             uContentPack1.photoPackage = w1.f(this.p.getEntity());
             u1.u0(6, uElementPack1, uContentPack1);
          }
       }
    label_0083 :
       boolean b = a.b(this.q, d3.b);
       if (!PatchProxy.isSupport(uoe3) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoe3, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PHOTO_DISCRIPTION_CARD";
          i3 oi3 = i3.f();
          oi3.a("is_head_pendant", Boolean.valueOf(b));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.p.getEntity());
          u1.u0(6, uElementPack, uContentPack);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e3.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0ac2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e3.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(QComment.class);
       return;
    }
}
