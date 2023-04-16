package bc9.l$g;
import cc9.i;
import bc9.l;
import java.lang.Object;
import cc9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.assistant.a;
import java.util.List;
import java.util.Collection;
import j8c.a;
import q87.c;
import ec9.j;
import cc9.e;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.base.b;
import nsd.u;
import sa6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import qd9.f;
import com.yxcorp.gifshow.camera.record.intelligentidentify.a;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.a$b;
import android.app.Activity;
import lnc.a1;
import java.lang.CharSequence;
import java.util.HashMap;
import ec9.f1;
import cc9.l;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import bc9.t;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import qrd.l1;
import bc9.w;
import android.view.animation.Animation$AnimationListener;
import w46.b;
import e17.i;
import sa6.b;
import com.kwai.framework.mvs.BaseViewModel;
import bc9.u;
import bc9.v;

public final class l$g implements i	// class@0003f9
{
    public final l a;

    public void l$g(l p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       l z;
       IdentifyCircleImageView identifyCirc1;
       d d;
       BaseFragment uBaseFragmen;
       List templateList;
       int i;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, l$g.class, "1")) {
       }else {
          a.p(p0, "newState");
          l$g ta = this.a;
          AssistantResponse uAssistantRe = p0.b();
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(uAssistantRe, ta, ol, "22") && (ta.J.F() && (uAssistantRe != null && (uAssistantRe.getTemplateList().isEmpty() ^ 0x01)))) {
             ta.J.N(uAssistantRe);
          }
       label_0042 :
          if (p0.e() && (!this.a.g2().y() || this.a.g2().w())) {
             ta = this.a;
             uAssistantRe = p0.b();
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidOneRefs(uAssistantRe, ta, ol, "21") && !a.g(ta.r, uAssistantRe)) {
                Object[] objArray1 = new Object[0];
                a.D().w("CameraAssistant", "updateRecommendResponse", objArray1);
                ta.r = uAssistantRe;
                if (uAssistantRe != null && (uAssistantRe.getTemplateList().isEmpty() && ta.J.y())) {
                   if (ta.J.D()) {
                      d d1 = ta.d;
                      a.o(d1, "mCallerContext");
                      e uoe = new e(AssistantUtils.d.m(d1), 0, false, null, 12, null);
                      ta.J.g().w0(v3);
                   }
                   d d2 = ta.d;
                   a.o(d2, "mCallerContext");
                   f.a(d2.f());
                   if (ta.e != null) {
                      ta.J.v().a(0);
                      a$b uob = new a$b(ta.e);
                      uob.b(a1.p(R.string.arg_RES_7f1041e9));
                      ta.J.v().b(uob);
                   }
                }else {
                   ta.u.clear();
                   f1 uof1 = ta.J.r();
                   if (uAssistantRe != null) {
                      templateList = uAssistantRe.getTemplateList();
                      if (templateList != null) {
                      label_011e :
                         List list1 = templateList;
                         i = (uAssistantRe != null)? uAssistantRe.getInitPosition(): 0;
                         l ol1 = new l(list1, i, false, false, 12, null);
                         uof1.w0(v3);
                      }
                   }
                   templateList = new ArrayList();
                   goto label_011e ;
                }
             }
             ta = this.a;
             Objects.requireNonNull(ta);
             String str = "mCallerContext.fragment";
             if (!PatchProxy.applyVoidOneRefs(p0, ta, ol, "15") && p0.e()) {
                List list = ta.J.k();
                if (list == null || list.isEmpty()) {
                   uAssistantRe = p0.b();
                   if (uAssistantRe != null) {
                      list = uAssistantRe.getTemplateList();
                      if (list != null && !list.isEmpty()) {
                      label_0170 :
                         View view = ta.J.e().b(R.id.assistant_empty_btn);
                         if (view != null) {
                            d = ta.d;
                            a.o(d, "mCallerContext");
                            uBaseFragmen = d.f();
                            a.o(uBaseFragmen, str);
                            n.W(view, 4, AssistantUtils.d.n(uBaseFragmen));
                         }
                      }
                   }
                   identifyCirc1 = ta.J.e().b(R.id.assistant_empty_btn);
                   if (identifyCirc1 != null) {
                      identifyCirc1.setImageResource(R.drawable.arg_RES_7f080e09);
                      n.Y(identifyCirc1, 0, 0);
                      identifyCirc1.setOnClickListener(new t(ta));
                   }
                }else {
                   goto label_0170 ;
                }
             }
          label_01b1 :
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidOneRefs(p0, ta, ol, "18") && (p0.e() && ta.x != p0.g())) {
                boolean b1 = p0.g();
                ta.x = b1;
                if (b1) {
                   ImageView imageView = ta.J.e().b(R.id.assistant_download_retry);
                   ta.z = imageView;
                   n.Y(imageView, 0, 0);
                   Animation uAnimation = AnimationUtils.loadAnimation(ta.e, R.anim.arg_RES_7f01001b);
                   uAnimation.setDuration(1000);
                   ta.I = uAnimation;
                   uAnimation.setAnimationListener(new w(ta));
                   z = ta.z;
                   if (z != null) {
                      z.startAnimation(ta.I);
                   }
                   IdentifyCircleImageView identifyCirc = ta.J.e().b(R.id.assistant_empty_btn);
                   if (identifyCirc != null) {
                      identifyCirc.setImageResource(R.drawable.arg_RES_7f080e08);
                      n.Y(identifyCirc, 0, 0);
                   }
                }else {
                   z = ta.I;
                   if (z != null) {
                      z.cancel();
                   }
                   z = ta.z;
                   if (z != null) {
                      z.clearAnimation();
                   }
                   n.Y(ta.z, 4, 0);
                   identifyCirc1 = ta.J.e().b(R.id.assistant_empty_btn);
                   if (identifyCirc1 != null) {
                      d = ta.d;
                      a.o(d, "mCallerContext");
                      uBaseFragmen = d.f();
                      a.o(uBaseFragmen, str);
                      n.W(identifyCirc1, 4, AssistantUtils.d.n(uBaseFragmen));
                   }
                }
             }
          label_025f :
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidOneRefs(p0, ta, ol, "19") && (p0.e() && ta.y != p0.h())) {
                boolean b = p0.h();
                ta.y = b;
                if (b && ta.J.D()) {
                   Object[] objArray = new Object[0];
                   a.D().t("CameraAssistant", "loading error", objArray);
                   i.a(R.style.arg_RES_7f110668, 0x7f1041e3);
                   b = ta.J.g().p0().b();
                   if (b != null) {
                      b = b.getTemplateList();
                      if (b != null && !b.isEmpty()) {
                      label_02fa :
                         return;
                      }
                   }
                   b = ta.J.e().b(R.id.assistant_empty_btn);
                   if (b != null) {
                      b.setImageResource(R.drawable.arg_RES_7f080e0a);
                      n.Y(b, 0, 0);
                      if (ta.J.x()) {
                         b.setOnClickListener(new u(ta));
                         goto label_02fa ;
                      }else if(ta.J.E()){
                         b.setOnClickListener(new v(ta));
                         goto label_02fa ;
                      }else {
                         goto label_02fa ;
                      }
                   }else {
                      goto label_02fa ;
                   }
                }else {
                   goto label_02fa ;
                }
             }
          }
       }
    }
}
