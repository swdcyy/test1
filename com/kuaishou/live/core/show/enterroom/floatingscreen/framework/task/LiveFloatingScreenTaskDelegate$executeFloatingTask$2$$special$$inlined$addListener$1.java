package com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2$a;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import w72.a;
import s72.b;
import java.util.Objects;
import android.database.Observable;
import android.view.View;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import s72.a;
import kr5.a;
import u72.a;
import t72.a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1$lambda$1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenMountData;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import nz1.b;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$a;
import hr3.a;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$d;
import java.lang.StringBuilder;
import zsd.u;
import t72.a$b;
import t72.a$c;
import msd.l;
import com.kuaishou.live.common.core.basic.tools.l;
import msd.a;
import java.lang.Number;
import android.animation.ObjectAnimator;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import t72.a$d;
import t72.a$e;
import erd.g;

public final class LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1 implements Animator$AnimatorListener	// class@000b0f
{
    public final LiveFloatingScreenTaskDelegate$executeFloatingTask$2 a;
    public final LiveFloatingScreenTaskDelegate$executeFloatingTask$2$a b;

    public void LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1(LiveFloatingScreenTaskDelegate$executeFloatingTask$2 p0,LiveFloatingScreenTaskDelegate$executeFloatingTask$2$a p1,LiveFloatingScreenTaskDelegate$executeFloatingTask$2 p2){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       a uoa = this.a.b.e();
       LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1 tb = this.b;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(tb, uoa, a.class, "5")) {
          uoa.b.unregisterObserver(tb);
       }
       LiveFloatingScreenTaskDelegate$executeFloatingTask$2 b = this.a.b;
       b.g(b.b());
       LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1 ta = this.a;
       ta.b.d.e(ta.c.h(), this.a.b.b());
       this.a.b.d().c(this.a.c);
       uoa = this.a.b.c();
       if (uoa != null) {
          uoa.b();
       }
       this.a.e.run();
       this.a.b.d().b(this.a.c.h().getRunwayType(), 0);
       this.a.c.f();
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationStart(Animator p0){
       String str2;
       a f1;
       String str3;
       KwaiImageView obj1;
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1.class, str)) {
          return;
       }
       a.p(p0, "animator");
       LiveFloatingScreenTaskDelegate$executeFloatingTask$2 b = this.a.b;
       b.h(b.b());
       a uoa = this.a.b.d();
       int runwayType = this.a.c.h().getRunwayType();
       View view = this.a.b.b();
       int measuredHeig = (view != null)? view.getMeasuredHeight(): 0;
       uoa.b(runwayType, measuredHeig);
       uoa = this.a.b.c();
       if (uoa != null) {
          View view1 = this.a.b.b();
          measuredHeig = 0;
          float f = (view1 != null)? (float)view1.getMeasuredHeight(): 0;
          LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1$lambda$1 uoexecuteFlo = new LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1$lambda$1(this);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), uoexecuteFlo, uoa, a.class, str)) {
             a.p(uoexecuteFlo, "visibilityGetter");
             a c = uoa.c;
             if (c != null) {
                KwaiImageView kwaiImageVie = uoa.g();
                if (kwaiImageVie != null) {
                   int mountType = c.getMountType();
                   int i = 1;
                   if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mountType), uoa, a.class, "9")) {
                      KwaiImageView kwaiImageVie1 = uoa.g();
                      if (kwaiImageVie1 != null) {
                         ViewGroup$LayoutParams layoutParams = kwaiImageVie1.getLayoutParams();
                         a c2 = uoa.c;
                         float f2 = (c2 != null)? (float)c2.getMountWidth(): 0;
                         if (f2 - measuredHeig) {
                            layoutParams.width = a1.e(f2);
                         }
                         c2 = uoa.c;
                         f2 = (c2 != null)? (float)c2.getMountHeight(): 0;
                         if (f2 - measuredHeig) {
                            layoutParams.height = a1.e(f2);
                         }
                         kwaiImageVie1.setLayoutParams(layoutParams);
                      }
                      a b1 = uoa.b;
                      if (b1 != null && (mountType == i && b1.getLayoutParams() instanceof ViewGroup$MarginLayoutParams)) {
                         ViewGroup$LayoutParams layoutParams1 = b1.getLayoutParams();
                         Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                         a c3 = uoa.c;
                         layoutParams1.bottomMargin = (c3 != null && c3.getMountDisplayType() == 4)? a1.e(32.00f): a1.e(21.00f);
                         b1.setLayoutParams(layoutParams1);
                      }
                   }
                label_0111 :
                   if (c.getMountType() == i && (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidOneRefs(Float.valueOf(f), uoa, a.class, "10") && uoa.b == null))) {
                      obj1 = uoa.g();
                      if (obj1 != null) {
                         obj1.setTranslationY(f);
                      }
                   }
                   b c1 = b.c;
                   String str1 = "";
                   if (c1.b() && c.getMountResType() == 34) {
                      c = uoa.c;
                      str2 = PatchProxy.applyOneRefs(c, uoa, a.class, "2");
                      if (str2 != patchProxyRe) {
                      label_01e3 :
                         if (str2 != null && str2.length()) {
                            i = 0;
                         }
                         if (!i) {
                            l.b(kwaiImageVie, str2, false, a$b.b, new a$c(uoa));
                            uoa.e();
                            kwaiImageVie.setVisibility(uoexecuteFlo.invoke().intValue());
                            ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(kwaiImageVie, "alpha", new float[2]{0,0x3f800000});
                            uoa.f = objectAnimat;
                            if (objectAnimat != null) {
                               objectAnimat.setDuration(200);
                            }
                            f1 = uoa.f;
                            if (f1 != null) {
                               f1.start();
                            }
                            b9.a(uoa.h);
                            uoa.h = t.timer(uoa.d, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new a$d(uoa), a$e.b);
                         }
                      }else if(c != null){
                         str = c.getMountResKey();
                         if (str != null) {
                         label_0163 :
                            str3 = c1.a(str, "live_enter_room_effect");
                            str2 = (str3 == null || !str3.length())? 1: null;
                            if (!str2) {
                               str = str3;
                            }
                            f1 = LiveMaterialResourceManager.d.a().b(str);
                            if (f1 != null) {
                               str3 = f1.a();
                               if (str3 != null) {
                               label_01e1 :
                                  str1 = str3;
                               }
                            }
                         }
                      }
                      str = str1;
                      goto label_0163 ;
                   }else {
                      f1 = uoa.c;
                      LiveResourceFileUtil$LiveResourceFileType obj = PatchProxy.applyOneRefs(f1, uoa, a.class, "3");
                      if (obj != patchProxyRe) {
                         str1 = obj;
                      }else if(f1 != null){
                         obj = LiveResourceFileUtil$LiveResourceFileType.fromTypeString(String.valueOf(f1.getMountResType()));
                         obj1 = null;
                         if (obj != null) {
                            obj = obj.mFilePathInfo;
                            if (obj != null) {
                               str = obj.b();
                            label_01b5 :
                               if (str != null) {
                                  str3 = str+f1.getMountResKey();
                                  str = ".webp";
                                  if (!u.H1(str3, str, false, 2, obj1)) {
                                     str3 = str3+str;
                                     goto label_01e1 ;
                                  }else {
                                     goto label_01e1 ;
                                  }
                               }
                            }
                         }
                         str = obj1;
                         goto label_01b5 ;
                      }
                   }
                   str2 = str1;
                   goto label_01e3 ;
                }
             }
          }
       }
    label_0245 :
       LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1 ta = this.a;
       ta.b.d.f(ta.c.h(), this.a.b.b());
       return;
    }
}
