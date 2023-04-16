package e8a.v$a$a;
import android.view.View$OnClickListener;
import e8a.v$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import e8a.v;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import uw9.o;
import q87.c;
import wh5.c;
import e17.i;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import java.lang.Long;
import java.lang.Number;
import k2b.e0;
import k2b.u1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideForwardPresenter$logShareClicked$1;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import com.kwai.robust.PatchProxyResult;
import z8a.g;
import whc.k0;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPreInfo;
import z8a.a;

public final class v$a$a implements View$OnClickListener	// class@0020dc
{
    public final v$a b;

    public void v$a$a(v$a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       Object[] objArray1;
       v t1;
       v v;
       if (PatchProxy.applyVoidOneRefs(p0, this, v$a$a.class, "1")) {
          return;
       }
       v$a b = this.b.b;
       Objects.requireNonNull(b);
       v ov = v.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, b, ov, "5")) {
          String str = "ShareDebugLog";
          if (VisitorModeManager.g(0)) {
             objArray1 = new Object[0];
             o.C().w(str, "提示关闭访客模式", objArray1);
          }else {
             int i = 0x7f11066a;
             if (c.b() && !c.j()) {
                objArray1 = new Object[0];
                o.C().w(str, "青少年非底导不可分享", objArray1);
                i.a(i, R.string.arg_RES_7f10054d);
             }else {
                v t = b.t;
                String str1 = "mPhoto";
                if (t == null) {
                   a.S(str1);
                }
                if (t.isQuestionnaire()) {
                   objArray1 = new Object[0];
                   o.C().w(str, "问卷不允许分享", objArray1);
                   i.a(i, R.string.arg_RES_7f100a54);
                }else if(PatchProxy.applyVoid(objArray, b, ov, "9")){
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   t1 = b.t;
                   if (t1 == null) {
                      a.S(str1);
                   }
                   uContentPack.photoPackage = w1.f(t1.mEntity);
                   t1 = b.t;
                   if (t1 == null) {
                      a.S(str1);
                   }
                   if (!TextUtils.x(t1.getUserId())) {
                      ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                      uContentPack.userPackage = userPackage;
                      v = b.t;
                      if (v == null) {
                         a.S(str1);
                      }
                      userPackage.identity = v.getUserId();
                   }
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   i = 1;
                   uElementPack.type = i;
                   uElementPack.action = 33;
                   uElementPack.name = "share_photo";
                   i3 oi3 = i3.f();
                   oi3.d("show_pos", "SLIDE_BAR");
                   v z = b.z;
                   if (z == null) {
                      a.S("mPlayModule");
                   }
                   e player = z.getPlayer();
                   a.o(player, "mPlayModule.player");
                   oi3.c("ActionRelativeTime", Long.valueOf(player.getCurrentPosition()));
                   uElementPack.params = oi3.e();
                   u1.L("", b.u, i, uElementPack, uContentPack);
                   Kgi.c(new NasaProfileSideForwardPresenter$logShareClicked$1(uContentPack));
                }
                if (!PatchProxy.applyVoid(objArray, b, ov, "6")) {
                   a uoa = PatchProxy.apply(objArray, b, ov, "7");
                   if (uoa != PatchProxyResult.class) {
                   }else {
                      ov = b.t;
                      if (ov == null) {
                         a.S(str1);
                      }
                      ov.setShareScene("share_button");
                      String str2 = "mPhotoDetailParam";
                      if (b.y == null) {
                         t1 = b.t;
                         if (t1 == null) {
                            a.S(str1);
                         }
                         v = b.v;
                         if (v == null) {
                            a.S(str2);
                         }
                         Activity activity = b.getActivity();
                         Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                         b.y = new k0(t1, v.mDetailCommonParam.mPreInfo, activity);
                      }
                      t1 = b.v;
                      if (t1 == null) {
                         a.S(str2);
                      }
                      uoa = new a(t1, b.y, objArray, 0);
                   }
                   b.x = uoa;
                   if (uoa != null) {
                      uoa.g();
                   }
                }
             }
          }
       }
       return;
    }
}
