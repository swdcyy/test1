package ec9.k0;
import ec9.k;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.q;
import j8c.a;
import q87.c;
import java.util.HashMap;
import java.lang.Integer;
import cc9.h;
import cc9.j;
import w46.b;
import cc9.c;
import qr4.k$a;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import u80.d;
import ac9.j;
import android.app.Activity;
import tkd.b;
import tkd.d;
import u80.j;
import ec9.j0;
import java.lang.Runnable;
import lnc.a1;

public final class k0 extends k	// class@002181
{
    public final f1 b;

    public void k0(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "1")) {
       }else {
          a.p(p0, "action");
          q oq = this.a().j();
          String str = "CameraAssistant";
          int i = 0;
          if (p0.b() != oq.b()) {
             objArray = new Object[i];
             a.D().A(str, "ClickKuaiShanDelegate, action.index != listState.currentSelectPosition", objArray);
          }else {
             h oh = oq.i().get(Integer.valueOf(p0.b()));
             if (!oh instanceof j) {
                objArray = new Object[i];
                a.D().t(str, "ClickKuaiShanDelegate state error", objArray);
             }else if(oq.h()){
                this.b.w0(new c(3));
             }else {
                k$a uoa = new k$a();
                uoa.e = oh.b().mTemplateId;
                uoa.d = i;
                VideoContext videoContext = new VideoContext();
                videoContext.I1(uoa);
                uoa = videoContext.J();
                String str1 = AssistantUtils.d.h(oq);
                if (str1 == null) {
                   str1 = "";
                }
                uoa.h = str1;
                if (oh.d() != null) {
                   Activity activity = this.b.u0().getActivity();
                   if (activity != null) {
                      b uob = d.a(-215111236);
                      if (uob.TT(oh.b())) {
                         if (uob.JN()) {
                            uob.Xr(activity, new j0(uob, activity, oh, videoContext), null, oh.b().mPrivacyPolicyTitle, oh.b().mPrivacyPolicyUrl);
                         }else {
                            uob.pC(activity, oh.d(), videoContext, true);
                         }
                      }else {
                         uob.pC(activity, oh.d(), videoContext, true);
                      }
                   }
                }else {
                   str1 = a1.p(R.string.arg_RES_7f1041ef);
                   a.o(str1, "CommonUtil.string\(R.stri¡­oot_resource_downloading\)");
                   this.b.u0().g(str1);
                }
             }
          }
       }
       return;
    }
}
