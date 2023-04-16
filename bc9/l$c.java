package bc9.l$c;
import cc9.i;
import bc9.l;
import java.lang.Object;
import cc9.q;
import dc9.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.assistant.a;
import java.util.Objects;
import java.util.List;
import j8c.a;
import q87.c;
import java.lang.Integer;
import bc9.k;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager;
import bc9.n;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$e;
import bc9.o;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$g;
import bc9.p;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwai.gifshow.post.api.core.model.PosterActivityTabInfo;
import java.lang.CharSequence;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import k2b.e0;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import bc9.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import java.lang.Number;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import ac9.g;
import nsd.r0;
import java.util.Arrays;
import kotlin.text.StringsKt__StringsKt;
import android.text.SpannableString;
import fc9.c;
import android.content.Context;
import lnc.a1;
import com.yxcorp.utility.n;
import qd9.f;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import java.lang.Throwable;
import w46.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.util.Map;
import com.yxcorp.gifshow.camera.record.intelligentidentify.a;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.a$b;
import android.app.Activity;
import ec9.j;
import cc9.d;
import sa6.a;
import g9c.a;
import java.lang.System;
import java.lang.Long;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicFaceIconTipMsg;
import com.yxcorp.gifshow.camera.record.assistant.a$a;
import com.google.gson.JsonElement;

public final class l$c implements i	// class@0003f5
{
    public final l a;

    public void l$c(l p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       l$c a;
       String str3;
       d d;
       BaseFragment uBaseFragmen;
       int i1;
       l$c a1;
       d e;
       g og;
       String str5;
       String str6;
       String str7;
       d d6;
       BaseFragment uBaseFragmen5;
       d e1;
       a$b uob1;
       ClientEvent$ElementPackage uElementPack1;
       JSONObject jSONObject;
       String str8;
       CharSequence uCharSequenc;
       Object obj = this;
       String obj1 = p0;
       c uoc = c.class;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, l$c.class, "1")) {
       }else {
          a.p(obj1, "newState");
          if (obj.a.g2().D()) {
             a = obj.a;
             Objects.requireNonNull(a);
             String str = "CameraAssistant";
             String str1 = "mCallerContext";
             String str2 = "mCallerContext.fragment";
             int b = true;
             if (PatchProxy.applyVoidOneRefs(obj1, a, ol, "23") || !a.J.D()) {
                str3 = str;
             }else {
                a.J.h = obj1.f();
                Object[] objArray1 = new Object[0];
                a.D().w(str, "updateRecommendList", objArray1);
                int i5 = obj1.b();
                if (!PatchProxy.isSupport(ol) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i5), a, ol, "26") && (a.t == null || (a.J.p() == null || a.z == null)))) {
                   Object[] objArray3 = new Object[0];
                   a.D().w(str, "initAssistantPanel", objArray3);
                   a.t = a.J.e().b(0x7f0a025f).findViewById(0x7f0a12cb);
                   HGalleryLayoutManager hGalleryLayo = new HGalleryLayoutManager();
                   hGalleryLayo.N(a.t, i5);
                   hGalleryLayo.W(new n(a));
                   hGalleryLayo.X(new o(a));
                   hGalleryLayo.Y(new p(a));
                   l t = a.t;
                   a.m(t);
                   a.J.M(new k(t, hGalleryLayo, a.J));
                   l t1 = a.t;
                   a.m(t1);
                   t1.setAdapter(a.J.p());
                   a.z = a.J.e().b(0x7f0a025a);
                   a.A = a.J.e().b(0x7f0a0262);
                   a.B = a.J.e().b(0x7f0a0264);
                   a.C = a.J.e().b(0x7f0a0263);
                   PosterActivityTabInfo posterActivi = a.J.o();
                   if (posterActivi != null) {
                      posterActivi = posterActivi.mCaptureTitle;
                      if (posterActivi != null) {
                         t1 = (posterActivi.length() > 0)? 1: null;
                         if (t1 == b) {
                            t1 = a.C;
                            if (t1 != null) {
                               PosterActivityTabInfo posterActivi1 = a.J.o();
                               posterActivi1 = (posterActivi1 != null)? posterActivi1.mCaptureTitle: null;
                               t1.setText(posterActivi1);
                            }
                         }
                      }
                   }
                   a.k2();
                }
                k ok1 = a.J.p();
                a.m(ok1);
                if (a.g(ok1.s1(), obj1.f()) ^ b) {
                   d d3 = a.d;
                   a.o(d3, str1);
                   BaseFragment uBaseFragmen2 = d3.f();
                   a.o(uBaseFragmen2, str2);
                   a.J.h().i(a.J.p(), uBaseFragmen2, a.J.m());
                   d d4 = a.d;
                   a.o(d4, str1);
                   BaseFragment uBaseFragmen3 = d4.f();
                   a.o(uBaseFragmen3, str2);
                   a.J.h().g(uBaseFragmen3, a.J.m());
                   ok1 = a.J.p();
                   a.m(ok1);
                   Objects.requireNonNull(ok1);
                   ok1 = a.J.p();
                   a.m(ok1);
                   ok1.W0(obj1.f());
                   ok1 = a.J.p();
                   a.m(ok1);
                   ok1.k0();
                   ok1 = a.J.p();
                   a.m(ok1);
                   i1 = obj1.b();
                   q h = obj1.h;
                   Objects.requireNonNull(ok1);
                   k ok2 = k.class;
                   if (!PatchProxy.isSupport(ok2) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), Boolean.valueOf(h), ok1, ok2, "4")) {
                      ok1.y.U(i1);
                      if (ok1.y.Q() != i1) {
                         ok1.x.getViewTreeObserver().addOnGlobalLayoutListener(new j(ok1, h, i1));
                      }
                   }
                   if (PatchProxy.applyVoidOneRefs(obj1, a, ol, "24") || (a.J.y() && (obj1.b() < 0 || obj1.b() >= obj1.f().size()))) {
                   label_0227 :
                      str3 = str;
                   }else {
                      Object[] objArray2 = new Object[0];
                      a.D().w(str, "onRefreshRecommendList", objArray2);
                      AssistantUtils d5 = AssistantUtils.d;
                      Integer integer2 = d5.i(obj1);
                      if (integer2 != null) {
                         int i6 = integer2.intValue();
                         if (a.g(a.u.get(Integer.valueOf(i6)), Boolean.TRUE)) {
                            goto label_0227 ;
                         }else {
                            PatchProxyResult patchProxyRe = PatchProxyResult.class;
                            AssistantUtils uAssistantUt = AssistantUtils.class;
                            g obj2 = PatchProxy.applyOneRefs(obj1, d5, uAssistantUt, "10");
                            if (obj2 != patchProxyRe) {
                               str7 = 1;
                            label_029d :
                               str3 = str;
                            }else {
                               obj2 = d5.g(obj1);
                               if (obj2 != null) {
                                  str7 = 1;
                                  if (obj2.getRecognitionType() == str7) {
                                     r0 obj3 = PatchProxy.applyOneRefs(obj1, d5, uAssistantUt, "11");
                                     if (obj3 != patchProxyRe) {
                                        obj2 = obj3;
                                        goto label_029d ;
                                     }else {
                                        Integer integer3 = d5.i(obj1);
                                        if (integer3 != null && integer3.intValue() == str7) {
                                           str8 = d5.l(R.string.arg_RES_7f10169f);
                                        }else {
                                           obj3 = 2;
                                           if (integer3 != null && integer3.intValue() == obj3) {
                                              str8 = d5.l(R.string.arg_RES_7f10169e);
                                           }else if(integer3 != null && integer3.intValue() == 4){
                                              str8 = d5.l(R.string.arg_RES_7f1016a0);
                                           }else {
                                              str8 = null;
                                           }
                                        }
                                        if (str8 != null) {
                                           str6 = d5.h(obj1);
                                           if (str6 != null) {
                                              objArray1 = new Object[]{"FORMAT_SIGNAL"};
                                              str5 = String.format(str8, Arrays.copyOf(objArray1, 1));
                                              a.o(str5, "java.lang.String.format\(format, *args\)");
                                              b = StringsKt__StringsKt.i3(str5, "FORMAT_SIGNAL", 0, false, 6, null);
                                              int i7 = str6.length() + b;
                                              str3 = str;
                                              int i8 = 1;
                                              Object[] objArray4 = new Object[i8];
                                              objArray4[0] = str6;
                                              str6 = String.format(str8, Arrays.copyOf(objArray4, i8));
                                              a.o(str6, "java.lang.String.format\(format, *args\)");
                                              try{
                                                 SpannableString spannableStr = new SpannableString(str6);
                                                 spannableStr.setSpan(new c(n.c0(a1.c(), (float)AssistantUtils.a), a1.a(R.color.arg_RES_7f0620c7), R.dimen.arg_RES_7f07042c), b, i7, 17);
                                              }catch(java.lang.Exception e0){
                                                 obj2 = null;
                                              }
                                           }
                                        }
                                     }
                                  }else {
                                     str3 = str;
                                     obj2 = d5.c(obj1);
                                  }
                               }
                               str3 = str;
                               goto label_034e ;
                            }
                         }
                      }else {
                         goto label_0227 ;
                      }
                   }
                   a.J.g().w0(new d(13, 0));
                }else {
                   str3 = str;
                }
                if (obj1.h()) {
                   d = a.d;
                   a.o(d, str1);
                   uBaseFragmen = d.f();
                   a.o(uBaseFragmen, str2);
                   n.W(a.z, 0, AssistantUtils.d.n(uBaseFragmen));
                }else {
                   n.Y(a.z, 4, 0);
                }
                if (obj1.g()) {
                   a.k2();
                   e = a.d;
                   a.o(e, str1);
                   BaseFragment uBaseFragmen4 = e.f();
                   a.o(uBaseFragmen4, str2);
                   n.W(a.h2(), 0, AssistantUtils.d.n(uBaseFragmen4));
                }else {
                   n.Y(a.h2(), 4, 0);
                }
             }
             a = obj.a;
             if (obj1.b() != a.v) {
                c uoc1 = a.g2().h();
                int i = obj1.b();
                k ok = obj.a.g2().p();
                d = obj.a.d;
                a.o(d, str1);
                uBaseFragmen = d.f();
                a.o(uBaseFragmen, str2);
                i1 = obj.a.g2().m();
                Objects.requireNonNull(uoc1);
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(i), ok, uBaseFragmen, Integer.valueOf(i1), uoc1, c.class, "2")) {
                   a.p(uBaseFragmen, "page");
                   c b1 = uoc1.b;
                   if (b1 == null || b1.intValue() != i) {
                      uoc1.g(uBaseFragmen, i1);
                      if (ok != null) {
                         og = ok.N0(i);
                         if (og != null) {
                            a.o(og, "adapter.getItem\(index\) ?: return");
                            uoc1.d = og;
                            uoc1.c = Long.valueOf(System.currentTimeMillis());
                            Integer integer1 = Integer.valueOf(i);
                            uoc1.b = integer1;
                            a.m(integer1);
                            int i4 = integer1.intValue();
                            c d2 = uoc1.d;
                            a.m(d2);
                            uoc1.j(i4, d2, uBaseFragmen, 1, null, i1);
                         }
                      }
                   }
                }
                uoc1 = obj.a.g2().h();
                i = obj1.b();
                ok = obj.a.g2().p();
                d = obj.a.d;
                a.o(d, str1);
                BaseFragment uBaseFragmen1 = d.f();
                a.o(uBaseFragmen1, str2);
                int i2 = obj.a.g2().m();
                Objects.requireNonNull(uoc1);
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(i), ok, uBaseFragmen1, Integer.valueOf(i2), uoc1, c.class, "8")) {
                   a.p(uBaseFragmen1, "page");
                   if (ok != null) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "AI_RECORD_TEMPLATE_ITEM";
                      og = ok.N0(i);
                      if (og != null) {
                         a.o(og, "adapter.getItem\(position\) ?: return");
                         String str4 = uoc1.a(Integer.valueOf(og.getType()));
                         str5 = (!str4.length())? 1: null;
                         if (!str5) {
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.c0("ai_record_type", str4);
                            jsonObject.c0("ai_record_id", og.getTemplateId());
                            jsonObject.c0("ai_record_name", og.getTemplateName());
                            jsonObject.a0("ai_record_index", Integer.valueOf(uoc1.c(og, i2, i)));
                            jsonObject.c0("ai_func_type", uoc1.b(i2));
                            if (og instanceof MagicAssistantTemplate) {
                               MagicEmoji$MagicFace magicFace = og.getMagicFace();
                               if (magicFace != null) {
                                  jsonObject.c0("req_id", magicFace.mRequestId);
                                  magicFace = magicFace.mMagicFaceIconTipMsg;
                                  if (magicFace != null) {
                                     str6 = String.valueOf(magicFace.mStrategyId);
                                     if (str6 != null) {
                                     label_05c6 :
                                        jsonObject.c0("strategy_id", str6);
                                     }
                                  }
                                  str6 = "";
                                  goto label_05c6 ;
                               }
                            }
                            if (i2 == a.I.c()) {
                               jsonObject.H("is_follow_shot", Boolean.TRUE);
                            }
                            uElementPack.params = jsonObject.toString();
                            u1.M("", uBaseFragmen1, 1, uElementPack, null, null);
                         }
                      }
                   }
                }
                obj.a.v = obj1.b();
                a1 = obj.a;
                Objects.requireNonNull(a1);
                if (!PatchProxy.applyVoidOneRefs(obj1, a1, ol, "25") && (!a1.J.y() || (obj1.b() >= 0 && obj1.b() < obj1.f().size()))) {
                   Object[] objArray = new Object[0];
                   a.D().w(str3, "tryShowRecommendToast", objArray);
                   AssistantUtils d1 = AssistantUtils.d;
                   Integer integer = d1.i(obj1);
                   if (integer != null) {
                      int i3 = integer.intValue();
                      Boolean tRUE = Boolean.TRUE;
                      if (!a.g(a1.u.get(Integer.valueOf(i3)), tRUE)) {
                         e = a1.e;
                         if (e != null) {
                            obj1 = d1.c(obj1);
                            if (obj1 != null) {
                               a1.u.put(Integer.valueOf(i3), tRUE);
                               a$b uob = new a$b(e);
                               uob.b(obj1);
                               uob.a(3000);
                               a1.J.v().b(uob);
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_067b :
       return;
    }
}
