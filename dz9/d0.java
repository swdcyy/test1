package dz9.d0;
import mf5.w0;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import f6a.c;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;
import kf5.g;
import jga.f$a;
import java.lang.StringBuilder;
import android.content.Intent;
import android.app.Activity;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import wkd.b;
import l66.a;
import wca.s;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import k2b.e0;
import fz9.a;

public final class d0 extends w0	// class@00200e
{
    public final QPhoto C;
    public final BaseFragment D;
    public final GifshowActivity E;
    public final SlidePageConfig F;

    public void d0(m0 p0,SlidePageConfig p1){
       a a;
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("collect");
       this.F = p1;
       this.C = p0.c.mPhoto;
       this.D = p0.b;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.E = a;
       this.L(R.drawable.arg_RES_7f080b24);
       this.T(R.string.arg_RES_7f100fc2);
       this.J(false);
    }
    public int C(){
       return 4;
    }
    public boolean E(){
       boolean b;
       d0 obj = PatchProxy.apply(null, this, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.F.K0 != null || c.b()) {
          obj = this.C;
          String str = "mPhoto";
          a.o(obj, str);
          User user = obj.getUser();
          a.o(user, "mPhoto.user");
          if (user.isFollowingOrFollowRequesting()) {
             obj = this.C;
             a.o(obj, str);
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             if (!(obj.getUserId()).equals(mE.getId())) {
                b = true;
             label_0053 :
                return b;
             }
          }
       }
       b = false;
       goto label_0053 ;
    }
    public void d(w0 p0,g p1){
       d0 uod0 = d0.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod0, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uod0, "3")) {
          d0 tC = this.C;
          a.o(tC, "mPhoto");
          f$a uoa = new f$a(tC.getUser(), this.E.Q2());
          tC = this.C;
          a.o(tC, "mPhoto");
          uoa.c(tC.getFullSource());
          uoa.o(this.E.getUrl()+"#unfollow");
          uoa.g(this.E.getIntent().getStringExtra("arg_photo_exp_tag"));
          tC = this.C;
          a.o(tC, "mPhoto");
          uoa.f(tC.getExpTag());
          FollowHelper.k(uoa.b()).subscribe(Functions.d(), Functions.d());
          d0 tC1 = this.C;
          a.o(tC1, "mPhoto");
          f.m(tC1.getUser(), User$FollowStatus.UNFOLLOW);
          d0 tC2 = this.C;
          a.o(tC2, "mPhoto");
          User user = tC2.getUser();
          b.a(0x6d2a4fdd).b(new s(user, this.C.mEntity));
       }
       if (!PatchProxy.applyVoid(objArray, this, uod0, "4")) {
          a.a("USER_UN_FOLLOW", "PLAYER_PANEL_SHARE", this.C, this.D, 18);
       }
       p1.a();
       return;
    }
    public void onShow(){
    }
}
