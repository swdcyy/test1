package i6a.r$j;
import com.yxcorp.gifshow.detail.view.InterestSnackBar$b;
import i6a.r;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.r0;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo;
import kotlin.jvm.internal.a;
import xh7.b;
import qh7.b;
import qh7.a;
import e17.i;
import e17.s;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class r$j implements InterestSnackBar$b	// class@0027b5
{
    public final r a;
    public final InterestManageSnackBarInfo b;

    public void r$j(r p0,InterestManageSnackBarInfo p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void close(){
       if (PatchProxy.applyVoidWithListener(null, this, r$j.class, "3")) {
          return;
       }
       this.a.W8(this.b, "CLOSE");
       r.S8(this.a, false, 1, null);
       PatchProxy.onMethodExit(r$j.class, "3");
       return;
    }
    public void dismiss(){
       if (PatchProxy.applyVoidWithListener(null, this, r$j.class, "4")) {
          return;
       }
       r.S8(this.a, false, 1, null);
       PatchProxy.onMethodExit(r$j.class, "4");
       return;
    }
    public void onClick(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, r$j.class, "2")) {
          return;
       }
       if (r0.d(this.a.getActivity())) {
          InterestManageSnackBarInfo mActionInfo = this.b.mActionInfo;
          if (mActionInfo != null) {
             InterestManageSnackBarInfo$ActionInfo mScheme = mActionInfo.mScheme;
             if (mScheme != null) {
                Activity activity = this.a.getActivity();
                a.m(activity);
                a.b(b.j(activity, mScheme), objArray);
             }
          }
       }else {
          s.f(R.string.arg_RES_7f1038e5);
       }
       this.a.W8(this.b, "JUMP");
       this.a.R8(true);
       PatchProxy.onMethodExit(r$j.class, "2");
       return;
    }
    public void show(){
       r r;
       if (PatchProxy.applyVoidWithListener(null, this, r$j.class, "1")) {
          return;
       }
       r$j tb = this.b;
       tb.mHasShow = true;
       r$j ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefsWithListener(tb, ta, r.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TOAST_INFO_CARD";
          i3 oi3 = i3.f();
          oi3.d("toast_content", tb.mContent);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          r = ta.r;
          if (r == null) {
             a.S("photo");
          }
          uContentPack.photoPackage = w1.f(r.mEntity);
          r p = ta.p;
          if (p == null) {
             a.S("fragment");
          }
          u1.D0("", p, 5, uElementPack, uContentPack, null);
          PatchProxy.onMethodExit(r.class, "7");
       }
       PatchProxy.onMethodExit(r$j.class, "1");
       return;
    }
}
