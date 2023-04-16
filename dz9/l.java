package dz9.l;
import mf5.w0;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import kp.r1;
import zsd.u;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tac.b;
import kf5.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import z1.a;

public final class l extends w0	// class@002017
{
    public final GifshowActivity C;
    public final BaseFragment D;
    public final QPhoto E;
    public int F;
    public final m0 G;
    public final SlidePageConfig H;

    public void l(m0 p0,SlidePageConfig p1){
       a a;
       int i;
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("friends_reduce");
       this.G = p0;
       this.H = p1;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.C = a;
       this.D = p0.b;
       PhotoDetailParam mPhoto = p0.c.mPhoto;
       this.E = mPhoto;
       User user = r1.T1(mPhoto.mEntity);
       user = (user != null && u.I1("F", user.mSex, true))? 1: 0;
       boolean b = b.a(-1578665399).F();
       if (b && user) {
          i = 0x7f104271;
       }else if(b){
          i = 0x7f104272;
       }else if(user){
          i = 0x7f1010e9;
       }else {
          i = 0x7f1010ee;
       }
       this.T(i);
       this.L(R.drawable.arg_RES_7f080af7);
       if (p1.H() && b) {
          this.F = 1;
          this.J(false);
       }
       return;
    }
    public int C(){
       return this.F;
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       QPhoto mEntity = this.E.mEntity;
       a.o(mEntity, "photo.mEntity");
       boolean b = (b.a(-1578665399).r(mEntity) && this.H.H())? true: false;
       return b;
    }
    public void d(w0 p0,g p1){
       l ol = l.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ol, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ol, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 1;
          uElementPack.action2 = "MOVE_OUT_FRIEND_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ol = this.E;
          a.o(ol, "photo");
          uContentPack.photoPackage = w1.f(ol.getEntity());
          u1.M("", this.D, 1, uElementPack, uContentPack, null);
       }
       User user = r1.T1(this.E.mEntity);
       if (user != null) {
          Object obj = b.a(-1578665399);
          l tC = this.C;
          ol = this.E;
          if (ol != null) {
             objArray = ol.mEntity;
          }
          obj.q(tC, user, objArray, true, true, null);
          p1.a();
       }
       return;
    }
    public void onShow(){
    }
}
