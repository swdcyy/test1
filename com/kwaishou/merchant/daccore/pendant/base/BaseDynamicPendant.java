package com.kwaishou.merchant.daccore.pendant.base.BaseDynamicPendant;
import l08.c;
import com.kwaishou.merchant.daccore.pendant.base.BaseDynamicPendant$a;
import nsd.u;
import d08.b;
import com.google.gson.JsonObject;
import android.view.View;
import q08.a;
import n08.a;
import java.lang.String;
import b08.a;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import com.kuaishou.bowl.data.center.data.model.RenderInfo;
import f08.f;
import java.lang.StringBuilder;
import f08.f$a;
import java.util.Map;
import java.lang.Object;
import hu4.h;
import com.kwaishou.merchant.daccore.pendant.base.BaseDynamicPendant$b;
import hu4.f;
import android.view.ViewGroup;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.lang.CharSequence;
import zsd.u;
import fg6.a;
import b08.b;
import java.lang.Class;
import com.google.gson.Gson;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import java.lang.Throwable;
import l08.a;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import com.kwaishou.merchant.daccore.util.PendantUtil$Companion;
import com.yxcorp.gifshow.image.KwaiImageView;
import c08.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.net.Uri;
import com.yxcorp.image.request.a;
import yz7.n;
import s0d.a;
import l08.b;
import dd.d;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import s0d.e;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import kotlin.jvm.internal.a;
import com.kwaishou.merchant.daccore.mount.anim.DynamicTopRightPendantView;
import trd.s0;
import f08.b;
import f08.b$a;
import android.os.Handler;
import ekd.x0;
import com.kuaishou.live.basic.tk.LiveTkBridge;
import com.kwaishou.merchant.daccore.pendant.base.BaseDynamicPendant$createRenderEngine$1$1;
import o63.a;
import msd.a;
import java.util.List;
import trd.t;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import androidx.fragment.app.FragmentActivity;

public class BaseDynamicPendant extends c	// class@001330
{
    public h h;
    public h i;
    public a j;
    public static final BaseDynamicPendant$a k;

    static {
       BaseDynamicPendant.k = new BaseDynamicPendant$a(null);
    }
    public void BaseDynamicPendant(b p0){
       super(p0);
    }
    public View a(JsonObject p0){
       MaterialDataItem materialData;
       u ou1;
       BaseDynamicPendant j1;
       View view;
       float f;
       BaseDynamicPendant uBaseDynamic = this;
       u ou = null;
       int i = 0;
       if (uBaseDynamic.j == null) {
          String str = a.b(this.c().c());
          if (str == null) {
             str = "";
          }
          uBaseDynamic.j = new a(str, i, 2, ou);
       }
       if (uBaseDynamic.h == null) {
          materialData = this.f().c();
          if (materialData != null) {
             materialData = materialData.renderInfo;
             if (materialData != null) {
                RenderInfo renderUrl = materialData.renderUrl;
             label_0037 :
                f$a.c(f.a, this.d(), this.e(), "start render component view:"+renderUrl, null, false, 24, null);
                h oh = uBaseDynamic.l(renderUrl);
                uBaseDynamic.h = oh;
                if (oh != null) {
                   BaseDynamicPendant j = uBaseDynamic.j;
                   if (j != null) {
                      j.a("render_main_view", 0);
                   }
                   oh.k(new BaseDynamicPendant$b(uBaseDynamic));
                }
             }
          }
          ou1 = ou;
          goto label_0037 ;
       }
       BaseDynamicPendant h = uBaseDynamic.h;
       ViewGroup viewGroup = (h != null)? h.d(): ou;
       PendantMountInfo pendantMount = this.f().e();
       if (pendantMount != null && pendantMount.getAnimationSwitch() == Float.MIN_VALUE) {
          pendantMount = this.f().e();
          int i1 = (pendantMount != null)? pendantMount.getExtraViewWidth(): 0;
          pendantMount = this.f().e();
          int i2 = (pendantMount != null)? pendantMount.getExtraViewHeight(): 0;
          if (uBaseDynamic.i == null) {
             materialData = this.f().c();
             if (materialData != null) {
                String str1 = this.d();
                materialData = materialData.renderInfo;
                RenderInfo renderInfo = (materialData != null)? materialData.extraRenderUrlInfo: ou;
                ou1 = (renderInfo == null || u.S1(renderInfo))? 1: null;
                try{
                   if (!ou1) {
                      b imageBgUrl = a.a.h(renderInfo, b.class);
                   label_00ff :
                      b preRenderUrl = (ou1 != null)? ou1.preRenderUrl: ou;
                      imageBgUrl = (ou1 != null)? ou1.imageBgUrl: ou;
                      h oh1 = uBaseDynamic.l(preRenderUrl);
                      uBaseDynamic.i = oh1;
                      long l = 3500;
                      if (oh1 != null) {
                         f$a.c(f.a, this.d(), this.e(), "start render extraView", null, false, 24, null);
                         h = uBaseDynamic.i;
                         if (h != null) {
                            j1 = uBaseDynamic.j;
                            if (j1 != null) {
                               j1.a("render_extra_view", l);
                            }
                            h.k(new a(uBaseDynamic));
                         }
                         h = uBaseDynamic.i;
                         if (h != null) {
                            ViewGroup viewGroup1 = h.d();
                            if (viewGroup1 != null) {
                               view = PendantUtil.a.h(viewGroup1, (float)i1, (float)i2);
                            label_01ca :
                               if (viewGroup != null && view != null) {
                                  PendantMountInfo pendantMount1 = this.f().e();
                                  if (pendantMount1 != null) {
                                     ou = pendantMount1.getArea();
                                  }
                                  if (a.g(ou, "TEMP_PLAY_AREA")) {
                                     viewGroup = new DynamicTopRightPendantView(viewGroup.getContext(), viewGroup, view);
                                  }
                               }
                            }
                         }
                      }else if(imageBgUrl == null || u.S1(imageBgUrl)){
                         i = 1;
                      }
                      if (!i) {
                         f$a.c(f.a, this.d(), this.e(), "start render extraImage", null, false, 24, null);
                         j1 = uBaseDynamic.j;
                         if (j1 != null) {
                            j1.a("render_extra_view", l);
                         }
                         KwaiImageView kwaiImageVie = new KwaiImageView(this.c().b().a());
                         kwaiImageVie.setScaleType(ImageView$ScaleType.CENTER_CROP);
                         f = (float)i1;
                         float f1 = (float)i2;
                         Fresco.getImagePipeline().prefetchToBitmapCache(a.t(Uri.parse(imageBgUrl)).o(n.b(f), n.b(f1)).m(new b(uBaseDynamic, kwaiImageVie, imageBgUrl)).q(), ou);
                         view = PendantUtil.a.h(kwaiImageVie, f, f1);
                         goto label_01ca ;
                      }
                   }
                }catch(java.lang.Exception e0){
                   Pair[] pairArray = new Pair[Float.MIN_VALUE];
                   pairArray[i] = r0.a("extraRenderUrl", renderInfo);
                   f.a.n(str1, "extraRenderUrlInfo deserialize error", e0, t0.j0(pairArray));
                }
             }
          }
       label_0155 :
          view = ou;
          goto label_01ca ;
       }
    label_01ee :
       return viewGroup;
    }
    public void j(JsonObject p0){
       BaseDynamicPendant th = this.h;
       if (th != null) {
          th.o(s0.k(r0.a("data", p0)));
       }
       return;
    }
    public void k(int p0){
       super.k(p0);
       BaseDynamicPendant tj = this.j;
       if (tj != null) {
          b$a.e(b.a, tj.f+":clear", null, 2, null);
          tj.e().removeCallbacksAndMessages(null);
       }
       return;
    }
    public final h l(String p0){
       Uri uri = (p0 == null || u.S1(p0))? 1: null;
       if (uri) {
          return null;
       }else {
          uri = Uri.parse(p0);
          String str = x0.a(uri, "bundleId");
          String str1 = x0.a(uri, "componentName");
          LiveTkBridge liveTkBridge = (str == null || u.S1(str))? 1: null;
          if (!liveTkBridge) {
             b uob = (str1 == null || u.S1(str1))? 1: null;
             try{
                if (!uob) {
                   a i = this.c().b().i;
                   List list = (i != null)? t.k(new LiveTkBridge(i, BaseDynamicPendant$createRenderEngine$1$1.INSTANCE)): null;
                   return this.f().a(this.c().b().a(), this.e(), this.c().b().d(), p0, this.c().a(), this.c().d(), this.c().e(), list);
                }
             }catch(java.lang.Exception e2){
                Pair[] pairArray = new Pair[v1];
                pairArray[v0] = r0.a("renderUrl", p0);
                f.a.a(a.d(this.c().b()), this.e(), "createRenderEngine error", e2, t0.j0(pairArray));
             }
          }
       }
    }
    public final h m(){
       return this.i;
    }
    public final h n(){
       return this.h;
    }
}
