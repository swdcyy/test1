package com.kwai.feature.post.api.widget.bubble.GrowthBubbleView;
import s36.d;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$a;
import nsd.u;
import android.app.Activity;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import z36.c;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$lifeCycleObserver$1;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import lnc.p3;
import q87.c;
import com.kwai.feature.post.api.widget.bubble.g;
import com.kwai.library.widget.popup.common.c;
import s36.e;
import r46.e;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleInfo;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.lang.Throwable;
import w46.b;
import com.kwai.feature.post.api.model.AnchorPosition;
import android.view.View;
import p36.a;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$d;
import erd.g;
import crd.b;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$e;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$f;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$g;
import com.kwai.library.widget.popup.bubble.a;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import dn6.a;
import u46.a;
import com.kwai.feature.post.api.widget.bubble.a;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleInfo$a;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleInfo$BubbleConfig;
import java.lang.Float;
import ok.h;
import java.lang.Integer;
import lnc.a1;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import u46.c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import en6.a;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import en6.b;
import u46.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import java.lang.Number;
import u46.d;
import android.view.View$OnClickListener;
import r36.b;
import java.lang.Runnable;
import java.lang.StringBuilder;
import x36.a;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$c;
import ekd.k1;

public final class GrowthBubbleView implements d	// class@001492
{
    public b a;
    public boolean b;
    public e c;
    public LifecycleObserver d;
    public g e;
    public final Runnable f;
    public View g;
    public final Activity h;
    public final GrowthGuideItemConfig i;
    public final c j;
    public final Map k;
    public static final GrowthBubbleView$a l;

    static {
       GrowthBubbleView.l = new GrowthBubbleView$a(null);
    }
    public void GrowthBubbleView(Activity p0,GrowthGuideItemConfig p1,c p2,Map p3){
       a.p(p0, "activity");
       a.p(p1, "guideInfoItem");
       a.p(p2, "guideViewItem");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p3;
       this.d = new GrowthBubbleView$lifeCycleObserver$1(this);
       this.f = new GrowthBubbleView$b(this);
    }
    public void a(boolean p0){
       GrowthBubbleView growthBubble = GrowthBubbleView.class;
       if (PatchProxy.isSupport(growthBubble) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, growthBubble, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("PostGrowth", "GrowthBubbleView dismiss", objArray);
       if (this.c()) {
          Object[] objArray1 = new Object[i];
          p3.D().w("PostGrowth", "GrowthBubbleView dismiss bubble", objArray1);
          GrowthBubbleView te = this.e;
          if (te != null && !PatchProxy.applyVoid(null, te, g.class, "3")) {
             g h = te.h;
             if (h != null) {
                h.o();
             }
          }
       }else {
          this.b("dismiss error");
       }
       this.g();
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthBubbleView.class, "5")) {
          return;
       }
       GrowthBubbleView tc = this.c;
       if (tc != null) {
          tc.a(p0);
       }
       this.g();
       if (this.b == null) {
          e.d(this.i.getUiType(), 2, null, 4, null);
       }
       return;
    }
    public boolean c(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       GrowthBubbleView obj = PatchProxy.apply(objArray, this, GrowthBubbleView.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.e;
       boolean b = false;
       if (obj != null) {
          Object obj1 = PatchProxy.apply(objArray, obj, g.class, "1");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             g h = obj.h;
             if (h != null) {
                b1 = h.K();
             }
          }
          b = b1;
       }
       return b;
    }
    public void d(e p0){
       GrowthBubbleView e;
       a uoa;
       BubbleInterface$Position tOP;
       GrowthBubbleInfo$BubbleConfig obj3;
       int i;
       a uoa3;
       e uoe = this;
       Object[] obj = p0;
       GrowthBubbleInfo growthBubble = GrowthBubbleInfo.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GrowthBubbleView growthBubble1 = GrowthBubbleView.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(obj, uoe, growthBubble1, str)) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "GrowthBubbleView show", objArray);
       uoe.c = obj;
       if (uoe.b != null) {
          obj = new Object[0];
          p3.D().w("PostGrowth", "GrowthBubbleView show, already discard", obj);
          return;
       }else {
          Map map = uoe.j.e();
          objArray = null;
          Object[] objArray1 = (map != null)? map.get("bubbleInfo"): objArray;
          if (!objArray1 instanceof Map) {
             objArray1 = objArray;
          }
          if (objArray1 != null) {
             try{
                Gson a = a.a;
                GrowthBubbleInfo growthBubble2 = a.c(a.x(objArray1), growthBubble);
             label_0070 :
                if (growthBubble2 == null) {
                   obj = new Object[0];
                   p3.D().w("PostGrowth", "GrowthBubbleView show, bubbleInfo is null", obj);
                   uoe.b("data invalid");
                   return;
                }else {
                   String str1 = uoe.i.getPosition().b();
                   String str2 = uoe.i.getPosition().a();
                   View view = uoe.j.c();
                   View view1 = PatchProxy.applyTwoRefs(str1, str2, uoe, growthBubble1, "8");
                   boolean b = true;
                   if (view1 != patchProxyRe) {
                   }else if(str2 == null || !str2.length()){
                      uoa3 = 1;
                   }else {
                      uoa3 = null;
                   }
                   if (!uoa3) {
                      view1 = a.b.c(str2, objArray, str1);
                      if (view1 == null) {
                      }
                   }else {
                      growthBubble1 = uoe.k;
                      if (growthBubble1 != null && a.g("LifeCycleTrigger", growthBubble1.get("TriggerSource"))) {
                         String str4 = uoe.k.get("LIFE_CYCLE_PATH_KEY");
                         str2 = uoe.k.get("LIFE_CYCLE_PATH_ID");
                         if (str4 != null && str2 != null) {
                            view1 = a.b.c(str4, str2, str1);
                            if (view1 == null) {
                            }
                         }else {
                         }
                      }else {
                      }
                   }
                label_00fd :
                   if (view1 == null || view == null) {
                      p3 op3 = p3.D();
                      StringBuilder str3 = "GrowthBubbleView show, bubbleView or anchor is null, anchor: ";
                      b = (view1 == null)? true: false;
                      Object[] objArray2 = new Object[0];
                      op3.w("PostGrowth", str3+b, objArray2);
                      uoe.b("targetView not found");
                      return;
                   }else if(!view1.isShown()){
                      obj = new Object[0];
                      p3.D().w("PostGrowth", "GrowthBubbleView anchorView isn\'t shown", obj);
                      uoe.b("widget discard");
                      return;
                   }else {
                      GrowthBubbleView h = uoe.h;
                      Objects.requireNonNull(h, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                      h.getLifecycle().addObserver(uoe.d);
                      uoe.a = RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new GrowthBubbleView$d(uoe));
                      g og = new g(uoe.h, view1, growthBubble2, view);
                      uoe.e = og;
                      a.m(og);
                      og.e = new GrowthBubbleView$e(uoe, obj);
                      og.g = new GrowthBubbleView$f(uoe);
                      og.f = new GrowthBubbleView$g(uoe, obj);
                      e = uoe.e;
                      a.m(e);
                      Objects.requireNonNull(e);
                      g og1 = g.class;
                      GrowthBubbleInfo$a obj1 = PatchProxy.apply(objArray, e, og1, str);
                      if (obj1 != patchProxyRe) {
                         b = obj1.booleanValue();
                      }else {
                         str = "4";
                         FrameLayout$LayoutParams obj2 = PatchProxy.apply(objArray, e, og1, str);
                         if (obj2 != patchProxyRe) {
                            objArray = obj2;
                         }else if(e.c.mBubbleConfig == null){
                            obj2 = new FrameLayout$LayoutParams(-2, -2);
                            obj2.gravity = 17;
                            e.d.setLayoutParams(obj2);
                            og = e.d;
                            if (og instanceof ViewGroup) {
                               og.setClipChildren(0);
                               e.d.setClipToPadding(0);
                            }
                            if (e.c.mIsAdjustScreenSize != null) {
                               a b1 = a.b;
                               Objects.requireNonNull(b1);
                               uoa = new a(b1);
                            }else {
                               uoa = a.b;
                            }
                            og = e.c;
                            Objects.requireNonNull(og);
                            obj1 = PatchProxy.applyOneRefs(uoa, og, growthBubble, str);
                            GrowthBubbleInfo growthBubble3 = 2;
                            if (obj1 != patchProxyRe) {
                            }else {
                               obj1 = new GrowthBubbleInfo$a();
                               GrowthBubbleInfo mBubbleConfi1 = og.mBubbleConfig;
                               if (mBubbleConfi1 != null) {
                                  GrowthBubbleInfo$BubbleConfig mDirection2 = mBubbleConfi1.mDirection;
                                  if (mDirection2 != null) {
                                     if (mDirection2 != b) {
                                        obj1.a = (mDirection2 != growthBubble3)? mBubbleConfi1.mArrowHeight * 0xbf800000: mBubbleConfi1.mArrowHeight;
                                     }else {
                                        obj1.b = mBubbleConfi1.mArrowHeight * 0xbf800000;
                                     }
                                  }else {
                                     obj1.b = mBubbleConfi1.mArrowHeight;
                                  }
                                  obj1.a = (float)uoa.apply(Float.valueOf(obj1.a)).intValue();
                                  obj1.b = (float)uoa.apply(Float.valueOf(obj1.b)).intValue();
                                  obj1.a = obj1.a + (float)a1.e(og.mBubbleConfig.mOffsetX);
                                  obj1.b = obj1.b + (float)a1.e(og.mBubbleConfig.mOffsetY);
                               }
                            }
                            a$c uoc = new a$c(e.a);
                            uoc.o0(e.b);
                            uoc.B0((int)obj1.a);
                            uoc.C0((int)obj1.b);
                            GrowthBubbleInfo mBubbleConfi = e.c.mBubbleConfig;
                            if (mBubbleConfi == null) {
                               tOP = BubbleInterface$Position.TOP;
                            }else {
                               GrowthBubbleInfo$BubbleConfig mDirection1 = mBubbleConfi.mDirection;
                               if (mDirection1 != null) {
                                  if (mDirection1 != b) {
                                     tOP = (mDirection1 != growthBubble3)? BubbleInterface$Position.LEFT: BubbleInterface$Position.RIGHT;
                                  }else {
                                     tOP = BubbleInterface$Position.TOP;
                                  }
                               }else {
                                  tOP = BubbleInterface$Position.BOTTOM;
                               }
                            }
                            uoc.D0(tOP);
                            uoc.M(new c(e));
                            uoc.A(0);
                            uoc.B(b);
                            uoc.T(e.c.mShowDuration);
                            if (e.c.mDisableAnimation == null) {
                               uoc.F(new a());
                               uoc.N(new b());
                            }
                            uoc.L(new b(e, uoa));
                            uoc.D(PopupInterface$Excluded.NOT_AGAINST);
                            g c = e.c;
                            GrowthBubbleInfo$BubbleConfig mDirection = c.mBubbleConfig.mDirection;
                            str2 = (mDirection == 1 || mDirection == null)? 1: null;
                            if (str2) {
                               obj3 = PatchProxy.apply(null, c, growthBubble, "1");
                               if (obj3 != patchProxyRe) {
                                  i = obj3.intValue();
                               }else {
                                  growthBubble = c.mScreenEdgeInsets;
                                  i = (growthBubble == null || growthBubble.length < 2)? 0: a1.e((float)growthBubble[1]);
                               }
                               uoc.v0(i);
                               mDirection = 0;
                            }else {
                               Object[] objArray3 = null;
                               Object obj4 = PatchProxy.apply(objArray3, c, growthBubble, "5");
                               if (obj4 != patchProxyRe) {
                                  i = obj4.intValue();
                               }else {
                                  growthBubble = c.mScreenEdgeInsets;
                                  i = (growthBubble == null || growthBubble.length < 1)? 0: a1.e((float)growthBubble[0]);
                               }
                               uoc.Y = i;
                            }
                            obj3 = e.c.mBubbleConfig.mBlankAreaTappedType;
                            if (obj3 != null) {
                               if (obj3 != true) {
                                  if (obj3 != 2) {
                                     if (obj3 != 3) {
                                        uoc.A(true);
                                        uoc.P(0);
                                     }else {
                                        uoc.A(true);
                                        uoc.P(true);
                                     }
                                  }else {
                                     uoc.A(0);
                                     uoc.P(true);
                                  }
                               }else {
                                  uoc.A(true);
                                  uoc.P(0);
                               }
                            }else {
                               uoc.A(0);
                               uoc.P(0);
                            }
                            a uoa1 = uoc.e0();
                            if (e.c.mBubbleConfig.mBubbleTappedDismiss != null) {
                               og = e.d;
                               View view2 = PatchProxy.applyOneRefs(og, e, og1, "5");
                               if (view2 != patchProxyRe) {
                               }else if(og instanceof ViewGroup && og.getChildCount() > 0){
                                  view2 = og.getChildAt(0);
                               }else {
                                  view2 = mDirection;
                               }
                               if (view2 != null) {
                                  view2.setClickable(0);
                               }
                               uoc.K(new d(e, view2, uoa1));
                            }
                            a uoa2 = uoa1;
                         label_0379 :
                            e.h = objArray;
                            if (objArray == null) {
                               b = false;
                            }else {
                               objArray.Z();
                               b = true;
                            }
                         }
                         obj1 = 1;
                         goto label_0379 ;
                      }
                      if (!b) {
                         obj = new Object[0];
                         p3.D().w("PostGrowth", "GrowthBubbleView show bubble failed, bubble info error", obj);
                         uoe.b("data invalid");
                         return;
                      }else if(view1 instanceof b){
                         view1.s(uoe.f);
                      }
                      uoe.g = view1;
                      return;
                   }
                }
             }catch(com.google.gson.JsonSyntaxException e0){
                p3.D().e("PostGrowth", "parse configString Json error", e0);
             }catch(com.google.gson.JsonIOException e0){
                p3.D().e("PostGrowth", "parse configString Json IO exception", e0);
             }
          }
       }
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, GrowthBubbleView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getGuideItemId();
    }
    public void f(e p0){
       this.c = p0;
    }
    public final void g(){
       GrowthBubbleView growthBubble = GrowthBubbleView.class;
       if (PatchProxy.applyVoid(null, this, growthBubble, "6")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       GrowthBubbleView ta = this.a;
       if (ta != null) {
          ta.dispose();
       }
       a uoa = this.j.b();
       if (uoa != null) {
          uoa.a();
       }
       k1.r(new GrowthBubbleView$c(this), 0);
       if (!PatchProxy.applyVoid(null, this, growthBubble, "4")) {
          growthBubble = this.h;
          Objects.requireNonNull(growthBubble, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          growthBubble.getLifecycle().removeObserver(this.d);
       }
       growthBubble = this.g;
       if (growthBubble instanceof b) {
          Objects.requireNonNull(growthBubble, "null cannot be cast to non-null type com.kwai.feature.post.api.flywheel.widget.protocol.IFlyWheelViewProtocol");
          growthBubble.z(this.f);
       }
       this.b = true;
       this.g = null;
       return;
    }
}
