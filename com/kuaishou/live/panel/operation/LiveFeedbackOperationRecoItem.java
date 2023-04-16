package com.kuaishou.live.panel.operation.LiveFeedbackOperationRecoItem;
import mf5.w0;
import com.kuaishou.live.panel.operation.LiveFeedbackOperationRecoItem$a;
import nsd.u;
import com.kuaishou.live.panel.operation.LiveFeedbackOperationRecoItem$Companion$recoGuideConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.app.Activity;
import k2b.e0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import a43.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import ci3.c;
import kf5.g;
import kq3.a;
import kq3.b;
import com.kuaishou.live.webview.a;
import java.util.Objects;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig;
import kf5.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kuaishou.live.panel.operation.LiveFeedbackOperationRecoItem$b;

public final class LiveFeedbackOperationRecoItem extends w0	// class@000d1d
{
    public final Activity C;
    public final e0 D;
    public final QPhoto E;
    public final int F;
    public final a G;
    public static final p H;
    public static final LiveFeedbackOperationRecoItem$a I;

    static {
       LiveFeedbackOperationRecoItem.I = new LiveFeedbackOperationRecoItem$a(null);
       LiveFeedbackOperationRecoItem.H = s.c(LiveFeedbackOperationRecoItem$Companion$recoGuideConfig$2.INSTANCE);
    }
    public void LiveFeedbackOperationRecoItem(Activity p0,e0 p1,QPhoto p2,int p3,a p4){
       a.p(p0, "activity");
       a.p(p1, "page");
       a.p(p2, "photo");
       a.p(p4, "liveStreamPackageProvider");
       super("RECOMMEND");
       this.C = p0;
       this.D = p1;
       this.E = p2;
       this.F = p3;
       this.G = p4;
       this.L(R.drawable.arg_RES_7f08131a);
       this.T(R.string.arg_RES_7f101661);
       this.K(a.a.getBoolean(b.d("user")+"showRedPont", true));
    }
    public boolean E(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveFeedbackOperationRecoItem liveFeedback = LiveFeedbackOperationRecoItem.class;
       Object obj = PatchProxy.apply(null, this, liveFeedback, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.F == 2) {
          Object obj1 = PatchProxy.apply(null, this, liveFeedback, "4");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             if (mE.isLogined()) {
                User user = this.E.getUser();
                a.o(user, "photo.user");
                if (user.isFollowingOrFollowRequesting()) {
                   b1 = true;
                }
             }
             b1 = false;
          }
          if (!b1 && c.a()) {
          label_0055 :
             return b;
          }
       }
    label_0054 :
       b = false;
       goto label_0055 ;
    }
    public void d(w0 p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFeedbackOperationRecoItem.class, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       a uoa = a.b(this.C);
       a.o(uoa, "LiveWebViewContext.newInstance\(activity\)");
       b.a(uoa);
       a uoa1 = a.c();
       StringBuilder str = "";
       LiveFeedbackOperationRecoItem$a i = LiveFeedbackOperationRecoItem.I;
       Objects.requireNonNull(i);
       LiveConfigStartupResponse$LiveLiteRecoGuideConfig liveLiteReco = PatchProxy.apply(null, i, LiveFeedbackOperationRecoItem$a.class, "1");
       if (liveLiteReco == PatchProxyResult.class) {
          liveLiteReco = LiveFeedbackOperationRecoItem.H.getValue();
       }
       uoa1.g(str+liveLiteReco.mClickJumpLink+"&expTag="+this.E.getExpTag(), uoa);
       k.a.b(this.D, "OPTIMIZE_RECOMMAND_BUTTON", this.G.invoke());
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"showRedPont", false);
       g.a(uEditor);
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, LiveFeedbackOperationRecoItem.class, "3")) {
          return;
       }
       RxBus.f.b(new LiveFeedbackOperationRecoItem$b());
       k.a.c(this.D, this.G.invoke(), "OPTIMIZE_RECOMMAND_BUTTON");
       return;
    }
}
