package com.tachikoma.core.component.e;
import com.tkruntime.v8.DomExecutor;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.util.HashMap;
import java.util.LinkedHashMap;
import eq8.a;
import yp8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import jq8.a;
import kp8.d;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable;
import wo8.a;
import crd.b;
import android.widget.ListView;
import android.view.View$OnClickListener;
import android.view.View;
import com.tkruntime.v8.V8Object;
import gx4.c;
import com.tachikoma.core.component.anim.TKBasicAnimation;
import java.util.Map;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import zp8.a;
import java.lang.Float;
import wo8.g;
import com.tachikoma.core.component.anim.TKKeyframeAnimation;
import com.tachikoma.core.component.anim.TKBasicAnimation$c;
import com.tkruntime.v8.V8$CommandRunner;
import com.tachikoma.core.bridge.c;
import com.tkruntime.v8.V8;
import com.tkruntime.v8.V8Function;
import java.lang.Boolean;
import no8.a;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import android.view.ScaleGestureDetector;
import android.content.Context;
import com.tachikoma.core.component.f;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.lang.Exception;
import com.tachikoma.core.component.c;
import com.tachikoma.core.component.view.TKView;
import java.lang.RuntimeException;
import org.json.JSONObject;
import com.facebook.yoga.YogaAlign;
import lg.g;
import java.lang.Number;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaDisplay;
import lg.i;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaWrap;
import com.tachikoma.core.bridge.d;
import wp8.a;
import android.view.ViewParent;
import sp8.b$a;
import sp8.b;
import iq8.n;
import iq8.p;
import gx4.e;
import com.tachikoma.core.yoga.layout.YogaLayout;
import com.facebook.yoga.b;
import com.tachikoma.core.yoga.layout.YogaLayout$a;
import lg.e;
import com.facebook.yoga.YogaUnit;
import android.view.GestureDetector;
import com.tachikoma.core.component.e$d;
import android.view.GestureDetector$OnGestureListener;
import com.tachikoma.core.component.d;
import android.view.View$OnTouchListener;
import com.tkruntime.v8.JavaCallback;
import qp8.d;
import com.tkruntime.v8.V8JSONProxy;
import com.tkruntime.v8.V8ObjectProxy;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;
import android.util.Log;
import android.view.ViewGroup;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.tachikoma.core.component.e$b;
import android.view.View$OnLayoutChangeListener;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import com.tachikoma.core.component.e$c;
import java.lang.Runnable;
import iq8.x;
import com.tachikoma.core.bridge.d$b;
import com.tachikoma.core.bridge.d$b$a;
import com.tkruntime.v8.V8Trace;
import com.tachikoma.core.component.e$e;
import java.util.Set;
import java.util.Map$Entry;
import no8.e;
import android.os.Looper;
import brd.a0;
import com.tachikoma.core.utility.b;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.tachikoma.core.component.a;
import com.tachikoma.core.component.b;
import erd.g;
import android.graphics.Bitmap;
import java.lang.Double;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable$BorderRadiusLocation;
import java.lang.Enum;
import com.tachikoma.core.component.e$a;
import yp8.b;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.lang.Math;
import aq8.g;
import cq8.b;
import aq8.h;
import wo8.n;
import java.util.WeakHashMap;
import wo8.d;
import xo8.c;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import xo8.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public abstract class e extends TKBaseNativeModule implements DomExecutor	// class@000d6d
{
    public boolean disable;
    public boolean disallowParentInterceptTouchEvent;
    public boolean enabled;
    public Map endStyle;
    public View f;
    public int frameCount;
    public final a g;
    public d h;
    public GestureDetector i;
    public ScaleGestureDetector j;
    public final HashMap k;
    public boolean l;
    public boolean m;
    public boolean mAttachToRoot;
    public a mBackgroundImageHelper;
    public String mBorderColor;
    public double mBorderWidth;
    public boolean mHasLayoutListener;
    public e$e mIJS2NativeInvoker;
    public MotionEvent mLatestMotionEvent;
    public JsValueRef mLayoutObserverRef;
    public V8Function mOnLongPressListener;
    public JsValueRef mOnLongPressListenerRef;
    public V8Function mOnPressListener;
    public JsValueRef mOnPressListenerRef;
    public HashMap mPivotPoint;
    public float mPivotX;
    public float mPivotY;
    public JsValueRef mVNodeRef;
    public float maxAnimationProgress;
    public int maxAnimationProgressIndex;
    public float n;
    public String nativeID;
    public final Map o;
    public final HashMap p;
    public TKView parent;
    public HashMap q;
    public HashMap r;
    public e rootTkBase;
    public int s;
    public HashMap style;
    public boolean t;
    public String u;

    public void e(f p0){
       super(p0);
       this.k = new HashMap();
       this.l = false;
       this.m = false;
       this.o = new HashMap();
       this.p = new LinkedHashMap();
       this.endStyle = new HashMap();
       this.maxAnimationProgress = 0;
       this.maxAnimationProgressIndex = 0;
       this.frameCount = 0;
       this.style = new HashMap();
       this.q = new HashMap();
       this.r = new HashMap();
       this.t = false;
       this.mPivotPoint = new HashMap();
       this.mPivotX = 0x3f000000;
       this.mPivotY = 0x3f000000;
       this.mAttachToRoot = false;
       a.d(this);
       a uoa = PatchProxy.applyTwoRefs(this, p0.b, null, a.class, "2");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(this, null);
       }
       this.g = uoa;
       this.nativeID = this.getDomNode().a;
       this.rootTkBase = this;
       return;
    }
    public static void access$600(e p0){
       p0.destroyOnUIThread();
    }
    private void destroyOnUIThread(){
       a f;
       if (PatchProxy.applyVoid(null, this, e.class, "81")) {
          return;
       }
       this.k.clear();
       this.i = null;
       this.j = null;
       this.removeAllAnimation();
       e tg = this.g;
       Objects.requireNonNull(tg);
       String str = "1";
       if (!PatchProxy.applyVoid(null, tg, a.class, str)) {
          f = tg.c;
          if (f != null) {
             f.p(null);
             tg.c = null;
          }
          tg.a = null;
          tg.b = null;
       }
       tg = this.style;
       if (tg != null) {
          tg.clear();
       }
       tg = this.q;
       if (tg != null) {
          tg.clear();
       }
       tg = this.r;
       if (tg != null) {
          tg.clear();
       }
       this.mVNodeRef = null;
       tg = this.h;
       boolean b = true;
       if (tg != null) {
          Objects.requireNonNull(tg);
          if (!PatchProxy.applyVoid(null, tg, d.class, str)) {
             tg.h = b;
             tg.b = null;
             if (tg.a() != null) {
                tg.a().destroy();
             }
          }
       }
       tg = this.mBackgroundImageHelper;
       if (tg != null) {
          Objects.requireNonNull(tg);
          if (!PatchProxy.applyVoid(null, tg, a.class, "5")) {
             tg.g = b;
             f = tg.f;
             if (f != null && !f.isDisposed()) {
                tg.f.dispose();
             }
             tg.e = null;
          }
          this.mBackgroundImageHelper = null;
       }
       tg = this.mPivotPoint;
       if (tg != null) {
          tg.clear();
       }
       tg = this.f;
       if (!tg instanceof ListView && tg != null) {
          tg.setOnClickListener(null);
          this.f.setTag(null);
       }
       return;
    }
    public static e getTKBaseFromView(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getTag(0x7f0a3f87);
    }
    public void addAnimation(V8Object p0,String p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "17")) {
          return;
       }
       TKBasicAnimation nativeModule = this.getNativeModule(p0);
       if (nativeModule == null) {
          return;
       }
       nativeModule.retainJsObj();
       if (this.o.containsKey(p1)) {
          TKBasicAnimation tKBasicAnima = this.o.get(p1);
          if (tKBasicAnima != null) {
             tKBasicAnima.stop(p1);
             tKBasicAnima.unRetainJsObj();
          }
       }
       if (this.getView() == null) {
          a.g("addAnimation", new IllegalStateException("targetView is null!!!"));
          return;
       }else {
          nativeModule.beforeStart(this);
          if (!PatchProxy.applyVoidTwoRefs(nativeModule, p1, this, uoe, "18") && nativeModule.newVersionEnable()) {
             this.d(this.getView());
             this.p.remove(p1);
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             this.p.put(p1, linkedHashMa);
             linkedHashMa.put(Float.valueOf(0), this.makeAnimationPropertySnapshot());
             g og = new g(this, linkedHashMa, nativeModule, p1);
             if (nativeModule instanceof TKKeyframeAnimation) {
                TKBasicAnimation tKBasicAnima1 = nativeModule;
                tKBasicAnima1.readInitial();
                tKBasicAnima1.executeAnimationFunction(og);
                if (this.maxAnimationProgressIndex != (this.frameCount - 1)) {
                   this.setStyle(this.endStyle.get(p1));
                   this.rootTkBase.getDomNode().d();
                }
                float f = 0x3f800000;
                if (this.maxAnimationProgress - f) {
                   linkedHashMa.put(Float.valueOf(f), this.makeAnimationPropertySnapshot());
                }
             }else {
                nativeModule.executeStartValueFunction(og);
                nativeModule.executeEndValueFunction(og);
             }
          }
          nativeModule.start(p1);
          this.o.put(p1, nativeModule);
          return;
       }
    }
    public void addCmdRunner(V8$CommandRunner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "101")) {
          return;
       }
       p0.exec(this.getJSContext().g());
       return;
    }
    public void addEventListener(String p0,V8Function p1,boolean p2){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, e.class, "15")) {
          return;
       }
       if (a.c.booleanValue() && p1 != null) {
          p1.setFunctionName(this.getClass().getSimpleName()+"_"+p0);
       }
       JsValueRef jsValueRef = y.b(p1, this);
       if (!TextUtils.isEmpty(p0) && jsValueRef != null) {
          List list = this.k.get(p0);
          if (list == null) {
             list = new ArrayList();
             this.k.put(p0, list);
          }
          if (!p2) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                JsValueRef jsValueRef1 = iterator.next();
                if (jsValueRef1 != null) {
                   y.c(jsValueRef1);
                }
             }
             list.clear();
          }
          list.add(jsValueRef);
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "88") && this.getView() != null) {
          ScaleGestureDetector obj = PatchProxy.applyOneRefs(p0, this, uoe, "89");
          boolean b = false;
          if (obj != patchProxyRe) {
             obj = obj.booleanValue();
          }else if(TextUtils.isEmpty(p0)){
             obj = false;
          }else {
             obj = p0.equals("pinch");
          }
          if (obj) {
             this.i();
             if (!PatchProxy.applyVoid(null, this, uoe, "92") && this.j == null) {
                obj = new ScaleGestureDetector(this.getContext(), new f(this));
                try{
                   this.j = obj;
                   Field declaredFiel = obj.getClass().getDeclaredField("mMinSpan");
                   declaredFiel.setAccessible(true);
                   declaredFiel.set(this.j, Integer.valueOf(20));
                }catch(java.lang.Exception e11){
                   a.c(e11.getMessage());
                }
             }
          }
       }
    label_0178 :
       return;
    }
    public void attachToParent(TKView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       e tparent = this.parent;
       if (tparent != null && tparent != p0) {
          throw new RuntimeException("TKBaseView is already attach to parent");
       }
       this.parent = p0;
       this.onAttachToParent(p0);
       if (this.t != null) {
          this.l();
       }
       return;
    }
    public void attachToRoot(){
       this.mAttachToRoot = true;
    }
    public JSONObject collectViewAttrs(){
       JSONObject obj = PatchProxy.apply(null, this, e.class, "105");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          View view = this.getView();
          obj.put("className", this.getClass().getSimpleName());
          obj.put("nativeID", this.getViewID());
          obj.put("width", String.valueOf(view.getWidth()));
          obj.put("height", String.valueOf(view.getHeight()));
          obj.put("style", this.style);
          obj.put("invalidStyleCount", this.s);
          return obj;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public JSONObject collectYogaAttrs(){
       float f1;
       float f2;
       a obj3;
       a a;
       a a1;
       Object[] objArray;
       Object[] objArray1;
       Object[] objArray2;
       a uoa = a.class;
       JSONObject obj = PatchProxy.apply(null, this, e.class, "103");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          a uoa1 = this.getDomNode().c();
          String str = "alignContent";
          Objects.requireNonNull(uoa1);
          YogaAlign yogaAlign = PatchProxy.apply(null, uoa1, uoa, "28");
          if (yogaAlign != PatchProxyResult.class) {
          }else {
             a = uoa1.a;
             yogaAlign = (a != null)? a.f(): null;
          }
          obj.put(str, yogaAlign);
          str = "alignItems";
          yogaAlign = PatchProxy.apply(null, uoa1, uoa, "24");
          if (yogaAlign != PatchProxyResult.class) {
          }else {
             a = uoa1.a;
             yogaAlign = (a != null)? a.g(): null;
          }
          obj.put(str, yogaAlign);
          str = "alignSelf";
          yogaAlign = PatchProxy.apply(null, uoa1, uoa, "26");
          if (yogaAlign != PatchProxyResult.class) {
          }else {
             a = uoa1.a;
             yogaAlign = (a != null)? a.h(): null;
          }
          obj.put(str, yogaAlign);
          str = "aspectRatio";
          YogaEdge obj1 = PatchProxy.apply(null, uoa1, uoa, "80");
          float f = 0;
          if (obj1 != PatchProxyResult.class) {
             f1 = obj1.floatValue();
          }else {
             a = uoa1.a;
             f1 = (a != null)? a.i(): 0;
          }
          this.j(obj, str, f1);
          obj1 = YogaEdge.ALL;
          this.j(obj, "border", uoa1.c(obj1));
          YogaEdge lEFT = YogaEdge.LEFT;
          this.j(obj, "leftBorder", uoa1.c(lEFT));
          YogaEdge tOP = YogaEdge.TOP;
          this.j(obj, "topBorder", uoa1.c(tOP));
          YogaEdge rIGHT = YogaEdge.RIGHT;
          this.j(obj, "rightBorder", uoa1.c(rIGHT));
          YogaEdge bOTTOM = YogaEdge.BOTTOM;
          this.j(obj, "bottomBorder", uoa1.c(bOTTOM));
          str = "display";
          YogaDisplay yogaDisplay = PatchProxy.apply(null, uoa1, uoa, "36");
          if (yogaDisplay != PatchProxyResult.class) {
          }else {
             obj3 = uoa1.a;
             yogaDisplay = (obj3 != null)? obj3.n(): null;
          }
          obj.put(str, yogaDisplay);
          str = "flex";
          i obj2 = PatchProxy.apply(null, uoa1, uoa, "38");
          if (obj2 != PatchProxyResult.class) {
             f2 = obj2.floatValue();
          }else {
             obj3 = uoa1.a;
             f2 = (obj3 != null)? obj3.o(): 0;
          }
          this.j(obj, str, f2);
          str = "flexBasis";
          obj2 = PatchProxy.apply(null, uoa1, uoa, "44");
          if (obj2 != PatchProxyResult.class) {
          }else {
             obj3 = uoa1.a;
             obj2 = (obj3 != null)? obj3.p(): null;
          }
          obj.put(str, obj2);
          str = "flexDirection";
          YogaFlexDirection yogaFlexDire = PatchProxy.apply(null, uoa1, uoa, "20");
          if (yogaFlexDire != PatchProxyResult.class) {
          }else {
             obj3 = uoa1.a;
             yogaFlexDire = (obj3 != null)? obj3.q(): null;
          }
          obj.put(str, yogaFlexDire);
          str = "flexGrow";
          obj3 = PatchProxy.apply(null, uoa1, uoa, "40");
          if (obj3 != PatchProxyResult.class) {
             f2 = obj3.floatValue();
          }else {
             obj3 = uoa1.a;
             f2 = (obj3 != null)? obj3.r(): 0;
          }
          this.j(obj, str, f2);
          str = "flexShrink";
          obj3 = PatchProxy.apply(null, uoa1, uoa, "42");
          if (obj3 != PatchProxyResult.class) {
             f = obj3.floatValue();
          }else {
             obj3 = uoa1.a;
             if (obj3 != null) {
                f = obj3.s();
             }
          }
          this.j(obj, str, f);
          obj.put("height", uoa1.d());
          str = "justifyContent";
          YogaJustify yogaJustify = PatchProxy.apply(null, uoa1, uoa, "22");
          if (yogaJustify != PatchProxyResult.class) {
          }else {
             a1 = uoa1.a;
             yogaJustify = (a1 != null)? a1.u(): null;
          }
          obj.put(str, yogaJustify);
          obj.put("margin", uoa1.i(obj1));
          obj.put("leftMargin", uoa1.i(lEFT));
          obj.put("topMargin", uoa1.i(tOP));
          obj.put("rightMargin", uoa1.i(rIGHT));
          obj.put("bottomMargin", uoa1.i(bOTTOM));
          str = "maxHeigh";
          i oi = PatchProxy.apply(null, uoa1, uoa, "77");
          if (oi != PatchProxyResult.class) {
          }else {
             a1 = uoa1.a;
             oi = (a1 != null)? a1.E(): null;
          }
          obj.put(str, oi);
          str = "maxWidth";
          oi = PatchProxy.apply(null, uoa1, uoa, "74");
          if (oi != PatchProxyResult.class) {
          }else {
             a1 = uoa1.a;
             oi = (a1 != null)? a1.F(): null;
          }
          obj.put(str, oi);
          str = "minHeight";
          oi = PatchProxy.apply(null, uoa1, uoa, "71");
          if (oi != PatchProxyResult.class) {
          }else {
             a1 = uoa1.a;
             oi = (a1 != null)? a1.G(): null;
          }
          obj.put(str, oi);
          str = "minWidth";
          oi = PatchProxy.apply(null, uoa1, uoa, "68");
          if (oi != PatchProxyResult.class) {
          }else {
             a1 = uoa1.a;
             oi = (a1 != null)? a1.H(): null;
          }
          obj.put(str, oi);
          str = "overflow";
          YogaOverflow yogaOverflow = PatchProxy.apply(null, uoa1, uoa, "34");
          if (yogaOverflow != PatchProxyResult.class) {
          }else {
             a1 = uoa1.a;
             yogaOverflow = (a1 != null)? a1.I(): null;
          }
          obj.put(str, yogaOverflow);
          obj.put("padding", uoa1.j(obj1));
          obj.put("leftPadding", uoa1.j(lEFT));
          obj.put("topPadding", uoa1.j(tOP));
          obj.put("rightPadding", uoa1.j(rIGHT));
          obj.put("bottomPadding", uoa1.j(bOTTOM));
          obj.put("position", uoa1.k(obj1));
          obj.put("leftPosition", uoa1.k(lEFT));
          obj.put("topPosition", uoa1.k(tOP));
          obj.put("rightPosition", uoa1.k(rIGHT));
          obj.put("bottomPosition", uoa1.k(bOTTOM));
          str = "positionType";
          YogaPositionType yogaPosition = PatchProxy.apply(null, uoa1, uoa, "30");
          if (yogaPosition != PatchProxyResult.class) {
          }else {
             a = uoa1.a;
             yogaPosition = (a != null)? a.N(): null;
          }
          obj.put(str, yogaPosition);
          str = "styleDirection";
          YogaDirection yogaDirectio = PatchProxy.apply(null, uoa1, uoa, "18");
          if (yogaDirectio != PatchProxyResult.class) {
          }else {
             a = uoa1.a;
             yogaDirectio = (a != null)? a.O(): null;
          }
          obj.put(str, yogaDirectio);
          obj.put("width", uoa1.l());
          YogaWrap yogaWrap = PatchProxy.apply(null, uoa1, uoa, "32");
          if (yogaWrap != PatchProxyResult.class) {
          }else {
             uoa = uoa1.a;
             yogaWrap = (uoa != null)? uoa.Q(): null;
          }
          obj.put("wrap", yogaWrap);
          return obj;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return null;
       }
    }
    public final View createOrReuseViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.supportAsyncPrepareView()) {
          obj = a.b(this);
          if (obj != null) {
             return obj;
          }
       }
       return this.createViewInstance(p0);
    }
    public abstract View createViewInstance(Context p0);
    public final void d(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "94")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ViewParent parent = p0.getParent();
       if (!parent instanceof View) {
          return;
       }
       Object tag = parent.getTag(R.id.tk_node);
       if (tag instanceof e) {
          this.rootTkBase = tag;
       }
       this.d(parent);
       return;
    }
    public void detachFromParent(TKView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       if (this.parent != p0) {
          throw new RuntimeException("TKBaseView is not attach to current parent");
       }
       this.parent = null;
       this.onDetachFromParent(p0);
       return;
    }
    public void detachToRoot(){
       this.mAttachToRoot = false;
    }
    public void dispatchEvent(String p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "78")) {
          return;
       }
       List list = this.k.get(p0);
       if (list != null && !list.isEmpty()) {
          b.a(list, p0, this.getJSContext(), p1);
       }
       return;
    }
    public boolean dispatchTouchEvent(String p0,b$a p1){
       List obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k.get(p0);
       if (obj != null && !obj.isEmpty()) {
          p0 = b.a(obj, p0, this.getTKJSContext().b(), p1);
          if (p0 != null && p0 instanceof Boolean) {
             return p0.booleanValue();
          }
       }
       return true;
    }
    public final void e(String p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "64")) {
          return;
       }
       String[] stringArray = p0.split(" ");
       int b = false;
       if (stringArray.length != 4) {
          this.t = b;
          return;
       }else {
          int b1 = true;
          this.t = b1;
          int i = 3;
          float[] uofloatArray = new float[i];
          int i1 = 0;
          while (i1 < i) {
             String str = "px";
             uofloatArray[i1] = (((stringArray[i1]).toLowerCase()).contains(str))? Float.parseFloat((stringArray[i1]).replace(str, "")): (float)n.a(Float.parseFloat(stringArray[i1]));
             i1 = i1 + 1;
          }
          Integer integer = Integer.valueOf(p.c(stringArray[i], this.getJSContext()));
          if (integer == null) {
             this.t = b;
             return;
          }else {
             int i2 = integer.intValue();
             if (p1) {
                uofloatArray[2] = 0;
             }
             d viewBackgrou = this.getViewBackgroundManager();
             int i3 = uofloatArray[2];
             b = uofloatArray[b];
             b1 = uofloatArray[b1];
             Objects.requireNonNull(viewBackgrou);
             if (!PatchProxy.isSupport(d.class) || (!PatchProxy.applyVoidFourRefs(Float.valueOf(i3), Float.valueOf(b), Float.valueOf(b1), Integer.valueOf(i2), viewBackgrou, d.class, "15") && viewBackgrou.h == null)) {
                TKViewBackgroundDrawable tKViewBackgr = viewBackgrou.a();
                if (tKViewBackgr != null) {
                   tKViewBackgr.setShadow(i3, b, b1, i2);
                }
             }
             this.onShadowSet(uofloatArray[2]);
             return;
          }
       }
    }
    public final float f(String p0,YogaEdge p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "86");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.style.containsKey(p0)) {
          obj = this.style.get(p0);
          if (obj instanceof Integer) {
             return Integer.valueOf(n.b(obj.intValue())).floatValue();
          }
       }
       float f = 0;
       int i = -1;
       switch (p0.hashCode()){
           case 0xc1b9bcc7:
             if (p0.equals("marginTop")) {
                i = 0;
             }
             break;
           case 0xeec39179:
             if (p0.equals("marginBottom")) {
                i = 1;
             }
             break;
           case 0x3a1ea90e:
             if (p0.equals("marginRight")) {
                i = 2;
             }
             break;
           case 0x757a12d5:
             if (p0.equals("marginLeft")) {
                i = 3;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 3:
           case 1:
             f = this.getDomNode().c().f(p1);
             break;
           default:
       }
       return f;
    }
    public final a g(){
       Object obj = PatchProxy.apply(null, this, e.class, "107");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mBackgroundImageHelper == null) {
          this.mBackgroundImageHelper = new a(this.getTKJSContext(), this.getViewBackgroundManager());
       }
       return this.mBackgroundImageHelper;
    }
    public HashMap getAnimationPropertySnapshot(){
       return this.p;
    }
    public float getBorderRadius(){
       return this.n;
    }
    public List getChildren(){
       Object obj = PatchProxy.apply(null, this, e.class, "102");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
    public a getDomNode(){
       Object obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g.c() == null) {
          this.getView();
       }
       return this.g;
    }
    public boolean getEnabled(){
       return this.enabled;
    }
    public Map getLocationOnScreen(){
       int[] obj = PatchProxy.apply(null, this, e.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[2];
       this.getView().getLocationOnScreen(obj);
       HashMap hashMap = new HashMap();
       hashMap.put("x", Float.valueOf(n.g((float)obj[0])));
       hashMap.put("y", Float.valueOf(n.g((float)obj[1])));
       return hashMap;
    }
    public Map getOrigin(){
       HashMap obj = PatchProxy.apply(null, this, e.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("x", Integer.valueOf(n.e(this.getView().getX())));
       obj.put("y", Integer.valueOf(n.e(this.getView().getY())));
       return obj;
    }
    public e getParent(){
       return this.parent;
    }
    public Map getSize(){
       HashMap obj = PatchProxy.apply(null, this, e.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("width", Integer.valueOf(n.f(this.getView().getWidth())));
       obj.put("height", Integer.valueOf(n.f(this.getView().getHeight())));
       return obj;
    }
    public View getView(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Context obj = PatchProxy.apply(null, this, uoe, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.f == null) {
          obj = this.getTKContext().getContext();
          View view = PatchProxy.applyOneRefs(obj, this, uoe, "83");
          if (view != patchProxyRe) {
          }else {
             view = this.createOrReuseViewInstance(obj);
          }
          this.f = view;
          view.setTag(R.id.tk_node, this);
          e tg = this.g;
          uoe = this.f;
          Objects.requireNonNull(tg);
          if (!PatchProxy.applyVoidOneRefs(uoe, tg, a.class, "3") && tg.c == null) {
             if (uoe instanceof YogaLayout) {
                tg.c = uoe.getYogaNode();
             }else {
                a uoa = new a(new b());
                tg.c = uoa;
                uoa.p(uoe);
                a c = tg.c;
                YogaLayout$a uoa1 = new YogaLayout$a();
                Objects.requireNonNull(c);
                if (!PatchProxy.applyVoidOneRefs(uoa1, c, a.class, "90")) {
                   c = c.a;
                   if (c != null) {
                      c.D0(uoa1);
                   }
                }
             }
          }
       }
    label_0082 :
       return this.f;
    }
    public d getViewBackgroundManager(){
       Object obj = PatchProxy.apply(null, this, e.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          this.h = new d(this.getView());
       }
       return this.h;
    }
    public String getViewID(){
       Object obj = PatchProxy.apply(null, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getDomNode().a;
    }
    public final float h(String p0,i p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.style.containsKey(p0)) {
          p0 = this.style.get(p0);
          if (p0 instanceof Integer) {
             return Integer.valueOf(n.b(p0.intValue())).floatValue();
          }
       }
       i b = p1.b;
       float f = (b == YogaUnit.UNDEFINED || b == YogaUnit.PERCENT)? 0: p1.a;
       return f;
    }
    public boolean hasRemainRunner(){
       return false;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, e.class, "93")) {
          return;
       }
       if (this.getView() == null) {
          return;
       }
       if (this.i != null) {
          return;
       }
       this.i = new GestureDetector(this.getContext(), new e$d(this));
       this.f.setOnTouchListener(new d(this));
       return;
    }
    public Object invokeJSFunctionWithJSONString(String p0,String p1,String p2,JavaCallback p3){
       String this;
       d uod;
       V8Function v8Function;
       Object[] objArray;
       V8Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, e.class, "99");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.retainJsObj();
       if (!y.a(obj)) {
          return null;
       }
       Boolean c = a.c;
       this = "invokeJSFunction_";
       if (c.booleanValue()) {
          V8Value v8 = obj.v8;
          if (!(v8.currentState % 2)) {
             v8.currentState = 7;
             d.p().h(obj.v8, p0, this+p1);
             uod = 1;
          label_0050 :
             if (p3 != null) {
                v8Function = new V8Function(this.getJSContext().g(), p3);
                if (c.booleanValue()) {
                   v8Function.setFunctionName(this+p1+"_callback");
                }
             }else {
                v8Function = null;
             }
             if (v8Function != null) {
                objArray = new Object[]{p2,v8Function};
                p2 = obj.executeFunction(p1, objArray);
             }else {
                objArray = new Object[]{p2};
                p2 = obj.executeFunction(p1, objArray);
             }
             if (c.booleanValue() && uod) {
                d.p().k(obj.v8);
                uod.currentState = 8;
             }
             if (p2 instanceof V8JSONProxy) {
                uod = p2.getNativeObject();
                if (v8Function != null) {
                   v8Function.setWeak();
                }
                return uod;
             }else {
                uod = V8ObjectUtilsQuick.getValue(p2);
                if (v8Function != null) {
                   v8Function.setWeak();
                }
                return uod;
             }
          }
       }
       uod = null;
       goto label_0050 ;
    }
    public boolean isAttachedToRoot(){
       return this.mAttachToRoot;
    }
    public boolean isTargetViewExist(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public final void j(JSONObject p0,String p1,float p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, e.class, "104")) {
          return;
       }
       try{
          if (!Float.isNaN(p2) && !Float.isInfinite(p2)) {
             p0.put(p1, String.valueOf(p2));
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
    public final int k(HashMap p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          if (!TextUtils.isEmpty(p1) && p0.containsKey(p1)) {
             return n.b(p0.get(p1).intValue());
          }
          return 0;
       }catch(java.lang.Exception e0){
       }
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, e.class, "97")) {
          return;
       }
       if (this.t != null) {
          e tparent = this.parent;
          if (tparent != null) {
             View view = tparent.getView();
             if (view instanceof ViewGroup) {
                view.setClipChildren(false);
                view.setClipToPadding(false);
             }
          }
       }
       return;
    }
    public void layout(){
    }
    public HashMap makeAnimationPropertySnapshot(){
       HashMap obj = PatchProxy.apply(null, this, e.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (this.getView() == null) {
          return obj;
       }
       obj.put("translationX", Float.valueOf(this.f.getTranslationX()));
       obj.put("translationY", Float.valueOf(this.f.getTranslationY()));
       obj.put("scaleX", Float.valueOf(this.f.getScaleX()));
       obj.put("scaleY", Float.valueOf(this.f.getScaleY()));
       obj.put("rotationX", Float.valueOf(this.f.getRotationX()));
       obj.put("rotationY", Float.valueOf(this.f.getRotationY()));
       obj.put("rotation", Float.valueOf(this.f.getRotation()));
       obj.put("bounds", this.f.getClipBounds());
       obj.put("alpha", Float.valueOf(this.f.getAlpha()));
       Drawable background = this.f.getBackground();
       String str = "backgroundColor";
       if (background instanceof TKViewBackgroundDrawable) {
          obj.put(str, Integer.valueOf(background.getColor()));
       }else if(background instanceof ColorDrawable){
          obj.put(str, Integer.valueOf(background.getColor()));
       }
       if (this.getDomNode().c() != null) {
          obj.put("width", this.getDomNode().c().l());
          obj.put("height", this.getDomNode().c().d());
          YogaEdge aLL = YogaEdge.ALL;
          obj.put("margin", this.getDomNode().c().i(aLL));
          YogaEdge lEFT = YogaEdge.LEFT;
          obj.put("marginLeft", Float.valueOf(this.f("marginLeft", lEFT)));
          YogaEdge rIGHT = YogaEdge.RIGHT;
          obj.put("marginRight", Float.valueOf(this.f("marginRight", rIGHT)));
          YogaEdge tOP = YogaEdge.TOP;
          obj.put("marginTop", Float.valueOf(this.f("marginTop", tOP)));
          YogaEdge bOTTOM = YogaEdge.BOTTOM;
          obj.put("marginBottom", Float.valueOf(this.f("marginBottom", bOTTOM)));
          obj.put("padding", Float.valueOf(this.h("padding", this.getDomNode().c().j(aLL))));
          obj.put("paddingLeft", Float.valueOf(this.h("paddingLeft", this.getDomNode().c().j(lEFT))));
          i oi = this.getDomNode().c().j(rIGHT);
          obj.put("paddingRight", Float.valueOf(this.h("paddingRight", oi)));
          obj.put("paddingTop", Float.valueOf(this.h("paddingTop", this.getDomNode().c().j(tOP))));
          obj.put("paddingBottom", Float.valueOf(this.h("paddingBottom", this.getDomNode().c().j(bOTTOM))));
          obj.put("paddingStart", Float.valueOf(this.h("paddingStart", this.getDomNode().c().j(YogaEdge.START))));
          obj.put("paddingEnd", Float.valueOf(this.h("paddingEnd", this.getDomNode().c().j(YogaEdge.END))));
          obj.put("paddingVertical", Float.valueOf(this.h("paddingVertical", this.getDomNode().c().j(YogaEdge.VERTICAL))));
          obj.put("paddingHorizontal", Float.valueOf(this.h("paddingHorizontal", this.getDomNode().c().j(YogaEdge.HORIZONTAL))));
          obj.put("left", Float.valueOf(this.h("left", this.getDomNode().c().k(lEFT))));
          obj.put("top", Float.valueOf(this.h("top", this.getDomNode().c().k(tOP))));
       }
       return obj;
    }
    public void observeNextLayout(V8Function p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, e.class, "71")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (a.c.booleanValue()) {
          p0.setFunctionName(this.getClass().getSimpleName()+"_observeNextLayout");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       this.mLayoutObserverRef = jsValueRef;
       if (jsValueRef != null && this.mHasLayoutListener == null) {
          this.mHasLayoutListener = true;
          this.getView().addOnLayoutChangeListener(new e$b(this, p1));
       }
       return;
    }
    public void onAttachToParent(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "76")) {
          return;
       }
       this.l();
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "80")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.destroyOnUIThread();
       }else {
          x.f(new e$c(this));
       }
       return;
    }
    public void onDetachFromParent(e p0){
    }
    public Object onJSInvokeNativeFunctionWithJSONString(String p0,String p1,V8Function p2){
       d$b$a obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "98");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mIJS2NativeInvoker == null) {
          obj = this.getTKJSContext().h().a();
          if (obj != null) {
             this.mIJS2NativeInvoker = obj.b;
          }
       }
       if (this.mIJS2NativeInvoker == null) {
          if (this.rootTkBase == null) {
             this.d(this.getView());
          }
          e trootTkBase = this.rootTkBase;
          if (trootTkBase != null) {
             this.mIJS2NativeInvoker = trootTkBase.mIJS2NativeInvoker;
          }
       }
       if (this.mIJS2NativeInvoker != null) {
          if (a.c.booleanValue()) {
             V8Trace.traceLog("TKBaseView", "invokeNativeFunction: "+p0+", jsonData = "+p1);
             if (p2 != null) {
                p2.setFunctionName("invokeNativeFunction_"+p0+"_callback");
             }
          }
          return this.mIJS2NativeInvoker.a(p0, p1, p2);
       }else {
          return null;
       }
    }
    public void onShadowSet(float p0){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, e.class, "75")) {
          return;
       }
       this.l();
       return;
    }
    public void pauseAnimations(){
       if (PatchProxy.applyVoid(null, this, e.class, "20")) {
          return;
       }
       if (this.o.isEmpty()) {
          return;
       }
       Iterator iterator = this.o.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry == null || uEntry.getValue() == null) {
             continue ;
          }else {
             uEntry.getValue().pauseAnimation(uEntry.getKey());
          }
       }
       return;
    }
    public View prepareViewInstance(){
       Object[] objArray = null;
       Application obj = PatchProxy.apply(objArray, this, e.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.k;
       if (obj == null) {
          return objArray;
       }
       if (Looper.myLooper() == null) {
          Looper.prepare();
       }
       return this.createViewInstance(obj);
    }
    public void removeAllAnimation(){
       if (PatchProxy.applyVoid(null, this, e.class, "22")) {
          return;
       }
       Iterator iterator = this.o.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          TKBasicAnimation value = uEntry.getValue();
          value.stop(uEntry.getKey());
          value.destroy(uEntry.getKey());
          this.p.remove(uEntry.getKey());
          value.unRetainJsObj();
          iterator.remove();
       }
       return;
    }
    public void removeAnimation(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "19")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       TKBasicAnimation tKBasicAnima = this.o.get(p0);
       if (tKBasicAnima == null) {
          return;
       }
       tKBasicAnima.stop(p0);
       tKBasicAnima.destroy(p0);
       this.o.remove(p0);
       this.p.remove(p0);
       tKBasicAnima.unRetainJsObj();
       return;
    }
    public void removeEventListener(String p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "16")) {
          return;
       }
       List list = this.k.get(p0);
       if (list != null && !list.isEmpty()) {
          if (p1 == null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                JsValueRef jsValueRef = iterator.next();
                if (jsValueRef != null) {
                   y.c(jsValueRef);
                }
             }
             list.clear();
             this.getView().setOnClickListener(null);
             this.l = false;
          }else {
             Iterator iterator1 = list.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   JsValueRef jsValueRef1 = iterator1.next();
                   if (jsValueRef1 != null && (jsValueRef1.get() != null && !jsValueRef1.get().getHandle() - p1.getHandle())) {
                      y.c(jsValueRef1);
                      list.remove(jsValueRef1);
                   }
                }
                if (list.isEmpty()) {
                   this.getView().setOnClickListener(null);
                   this.l = false;
                   break ;
                }
             }
          }
       }
       return;
    }
    public void removeSelf(){
       if (PatchProxy.applyVoid(null, this, e.class, "70")) {
          return;
       }
       if (this.parent instanceof TKView) {
          this.parent.remove(this.getJsObj());
          this.unRetainJsObj();
       }
       return;
    }
    public void resumeAnimations(){
       if (PatchProxy.applyVoid(null, this, e.class, "21")) {
          return;
       }
       if (this.o.isEmpty()) {
          return;
       }
       Iterator iterator = this.o.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry == null || uEntry.getValue() == null) {
             continue ;
          }else {
             uEntry.getValue().resumeAnimation(uEntry.getKey());
          }
       }
       return;
    }
    public void setBackground(String p0){
       int i1;
       int i3;
       String str = " ";
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "28")) {
          return;
       }
       this.m = true;
       if (!TextUtils.isEmpty(p0) && p0.startsWith("linear-gradient")) {
          p0 = (((p0.replace("linear-gradient\(", "")).replace("deg", "")).replace("\)", "")).trim();
          if (TextUtils.isEmpty(p0)) {
             return;
          }else {
             String[] stringArray = p0.split(",");
             if (stringArray.length >= 3) {
                int i = Integer.parseInt((stringArray[0]).trim()) % 360;
                if (i >= 0) {
                   i1 = 90;
                   if (i <= i1) {
                      i1 = i1 - i;
                   label_0060 :
                      int[] ointArray = new int[(stringArray.length - true)];
                      float[] uofloatArray = new float[(stringArray.length - true)];
                      int i2 = 1;
                      String[] stringArray1 = null;
                      while (i2 < stringArray.length) {
                         String str1 = (stringArray[i2]).trim();
                         if (str1.contains(str)) {
                            stringArray1 = str1.split(str);
                            i3 = i2 - 1;
                            ointArray[i3] = p.c((stringArray1[0]).trim(), this.getJSContext());
                            float f = Float.parseFloat((stringArray1[1]).replace("%", "")) / 100.00f;
                            uofloatArray[i3] = f;
                            stringArray1 = 1;
                         }else {
                            int i4 = i2 - 1;
                            ointArray[i4] = p.c(str1, this.getJSContext());
                            i3 = stringArray.length - true;
                            uofloatArray[i4] = (i2 == i3)? 0x3f800000: 0;
                         }
                         i2 = i2 + 1;
                      }
                      if (stringArray1 != null) {
                         this.getViewBackgroundManager().d(i1, ointArray, uofloatArray);
                      }else {
                         this.getViewBackgroundManager().d(i1, ointArray, null);
                      }
                   }
                }
                i1 = i - 450;
                goto label_0060 ;
             }
          }
       }
       return;
    }
    public void setBackgroundColor(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "25")) {
          return;
       }
       this.m = false;
       if (!p0 instanceof String) {
          return;
       }
       p0 = Integer.valueOf(p.c(p0, this.getJSContext()));
       if (p0 == null) {
          return;
       }
       this.getViewBackgroundManager().b(p0.intValue());
       return;
    }
    public void setBackgroundColorInt(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "26")) {
          return;
       }
       this.getViewBackgroundManager().b(p0);
       return;
    }
    public void setBackgroundImage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "37")) {
          return;
       }
       a uoa = this.g();
       Objects.requireNonNull(uoa);
       if (PatchProxy.applyVoidOneRefs(p0, uoa, a.class, "2") || (uoa.g != null || (!TextUtils.isEmpty(p0) && !p0.equals(uoa.d)))) {
          uoa.d = p0;
          a0 uoa0 = b.g(uoa.a.getContext(), p0, uoa.a.e(), uoa.a.g(), 0, 0);
          if (uoa0 == null) {
             a.c("backgroundImage is null or empty");
          }else {
             uoa.f = uoa0.G(a.c()).R(new a(uoa), new b(uoa, p0));
          }
       }
       return;
    }
    public void setBackgroundSize(String p0){
       a e;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "36")) {
          return;
       }
       a uoa = this.g();
       Objects.requireNonNull(uoa);
       if (PatchProxy.applyVoidOneRefs(p0, uoa, a.class, "1") || (uoa.g != null || (!TextUtils.isEmpty(p0) && !p0.equals(uoa.c)))) {
          uoa.c = p0;
          e = uoa.e;
          if (e != null) {
             uoa.a(e);
          }
       }
    label_0039 :
       return;
    }
    public void setBorderBottomColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "47")) {
          return;
       }
       this.getViewBackgroundManager().e(3, p.c(p0, this.getJSContext()));
       return;
    }
    public void setBorderBottomLeftRadius(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "56")) {
          return;
       }
       this.setBottomLeftRadius(p0);
       return;
    }
    public void setBorderBottomRightRadius(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "54")) {
          return;
       }
       this.setBottomRightRadius(p0);
       return;
    }
    public void setBorderBottomStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "61")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.getViewBackgroundManager().h(3, p0);
       return;
    }
    public void setBorderBottomWidth(double p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uoe, "42")) {
          return;
       }
       this.getViewBackgroundManager().i(3, (float)n.a((float)p0));
       return;
    }
    public void setBorderColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "43")) {
          return;
       }
       this.mBorderColor = p0;
       this.getViewBackgroundManager().e(8, p.c(p0, this.getJSContext()));
       return;
    }
    public void setBorderLeftColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "44")) {
          return;
       }
       this.getViewBackgroundManager().e(0, p.c(p0, this.getJSContext()));
       return;
    }
    public void setBorderLeftStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "58")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.getViewBackgroundManager().h(0, p0);
       return;
    }
    public void setBorderLeftWidth(double p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uoe, "39")) {
          return;
       }
       this.getViewBackgroundManager().i(0, (float)n.a((float)p0));
       return;
    }
    public void setBorderRadius(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "48")) {
          return;
       }
       this.n = (float)n.b(p0);
       this.getViewBackgroundManager().f(this.n);
       return;
    }
    public void setBorderRightColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "46")) {
          return;
       }
       this.getViewBackgroundManager().e(2, p.c(p0, this.getJSContext()));
       return;
    }
    public void setBorderRightStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "60")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.getViewBackgroundManager().h(2, p0);
       return;
    }
    public void setBorderRightWidth(double p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uoe, "41")) {
          return;
       }
       this.getViewBackgroundManager().i(2, (float)n.a((float)p0));
       return;
    }
    public void setBorderStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "57")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.getViewBackgroundManager().h(8, p0);
       return;
    }
    public void setBorderTopColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "45")) {
          return;
       }
       this.getViewBackgroundManager().e(1, p.c(p0, this.getJSContext()));
       return;
    }
    public void setBorderTopLeftRadius(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "50")) {
          return;
       }
       this.setTopLeftRadius(p0);
       return;
    }
    public void setBorderTopRightRadius(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "52")) {
          return;
       }
       this.setTopRightRadius(p0);
       return;
    }
    public void setBorderTopStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "59")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.getViewBackgroundManager().h(1, p0);
       return;
    }
    public void setBorderTopWidth(double p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uoe, "40")) {
          return;
       }
       this.getViewBackgroundManager().i(1, (float)n.a((float)p0));
       return;
    }
    public void setBorderWidth(double p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uoe, "38")) {
          return;
       }
       this.mBorderWidth = p0;
       this.getViewBackgroundManager().i(8, (float)n.a((float)p0));
       return;
    }
    public void setBottomLeftRadius(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "55")) {
          return;
       }
       this.getViewBackgroundManager().g((float)n.b(p0), TKViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_LEFT.ordinal());
       return;
    }
    public void setBottomRightRadius(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "53")) {
          return;
       }
       this.getViewBackgroundManager().g((float)n.b(p0), TKViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_RIGHT.ordinal());
       return;
    }
    public void setBoxShadow(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "63")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       if (("none").equals(p0) && !TextUtils.isEmpty(this.u)) {
          this.e(this.u, true);
       }else {
          this.e(p0, false);
       }
       this.u = p0;
       return;
    }
    public void setDisable(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "13")) {
          return;
       }
       this.enabled = p0 ^ 0x01;
       this.getView().setEnabled(this.enabled);
       return;
    }
    public void setDisallowParentInterceptTouchEvent(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "14")) {
          return;
       }
       this.disallowParentInterceptTouchEvent = p0;
       ViewParent parent = this.getView().getParent();
       if (parent == null) {
          a.j("TKBaseView", "setDisallowParentInterceptTouchEvent: parent is null");
          return;
       }else {
          parent.requestDisallowInterceptTouchEvent(p0);
          return;
       }
    }
    public void setEnabled(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "12")) {
          return;
       }
       this.enabled = p0;
       this.getView().setEnabled(this.enabled);
       return;
    }
    public void setGradientBgColor(String p0){
       String str = " ";
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "27")) {
          return;
       }
       try{
          this.m = true;
          if (!TextUtils.isEmpty(p0)) {
             String[] stringArray = p0.split(",");
             if (stringArray != null && stringArray.length >= 3) {
                int i = 0;
                int i1 = Integer.parseInt((stringArray[i]).trim());
                int[] ointArray = new int[(stringArray.length - true)];
                float[] uofloatArray = new float[(stringArray.length - true)];
                int i2 = 1;
                String[] stringArray1 = null;
                while (i2 < stringArray.length) {
                   String str1 = (stringArray[i2]).trim();
                   if (str1.contains(str)) {
                      stringArray1 = str1.split(str);
                      int i3 = i2 - 1;
                      ointArray[i3] = p.c((stringArray1[i]).trim(), this.getJSContext());
                      uofloatArray[i3] = Float.parseFloat(stringArray1[1]);
                      stringArray1 = 1;
                   }else {
                      int i4 = i2 - 1;
                      ointArray[i4] = p.c(str1, this.getJSContext());
                   }
                   i2 = i2 + 1;
                }
                if (stringArray1 != null) {
                   this.getViewBackgroundManager().d(i1, ointArray, uofloatArray);
                }else {
                   this.getViewBackgroundManager().d(i1, ointArray, null);
                }
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void setIJS2NativeInvoker(e$e p0){
       this.mIJS2NativeInvoker = p0;
    }
    public void setOnLongPressListener(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "10")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName(this.getClass().getSimpleName()+"_onLongPress");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.mOnLongPressListenerRef);
       if (jsValueRef == null || !y.a(jsValueRef.get())) {
          this.mOnLongPressListenerRef = null;
          this.mOnLongPressListener = null;
          this.removeEventListener("longPress", null);
       }else {
          this.mOnLongPressListenerRef = jsValueRef;
          this.mOnLongPressListener = jsValueRef.get();
          this.addEventListener("longPress", jsValueRef.get(), false);
       }
       return;
    }
    public void setOnPressListener(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName(this.getClass().getSimpleName()+"_onPress");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.mOnPressListenerRef);
       if (jsValueRef == null || !y.a(jsValueRef.get())) {
          this.mOnPressListenerRef = null;
          this.mOnPressListener = null;
          this.removeEventListener("tap", null);
       }else {
          this.mOnPressListenerRef = jsValueRef;
          this.mOnPressListener = jsValueRef.get();
          this.addEventListener("tap", jsValueRef.get(), false);
       }
       return;
    }
    public void setOpacity(double p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uoe, "65")) {
          return;
       }
       this.getView().setAlpha((float)p0);
       return;
    }
    public void setPivotPoint(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "66")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          this.mPivotPoint = p0;
          e tmPivotX = this.mPivotX;
          e tmPivotY = this.mPivotY;
          Object obj = p0.get("x");
          if (obj instanceof Number) {
             tmPivotX = obj.floatValue();
          }
          p0 = p0.get("y");
          if (p0 instanceof Number) {
             tmPivotY = p0.floatValue();
          }
          if (!this.mPivotX - tmPivotX && !this.mPivotY - tmPivotY) {
             return;
          }else {
             this.mPivotX = tmPivotX;
             this.mPivotY = tmPivotY;
             if (!this.getView().getWidth() && !this.getView().getHeight()) {
                this.getView().addOnLayoutChangeListener(new e$a(this));
             }else {
                this.getView().setPivotX((this.mPivotX * (float)this.getView().getWidth()));
                this.getView().setPivotY((this.mPivotY * (float)this.getView().getHeight()));
             }
          }
       }
       return;
    }
    public void setRotate(float p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "31")) {
          return;
       }
       this.getView().setRotation(p0);
       return;
    }
    public void setRotateX(float p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "29")) {
          return;
       }
       this.getView().setRotationX(p0);
       return;
    }
    public void setRotateY(float p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "30")) {
          return;
       }
       this.getView().setRotationY(p0);
       return;
    }
    public void setScaleX(float p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "34")) {
          return;
       }
       this.getView().setScaleX(p0);
       return;
    }
    public void setScaleY(float p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "35")) {
          return;
       }
       this.getView().setScaleY(p0);
       return;
    }
    public void setShadow(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "62")) {
          return;
       }
       this.e(p0, false);
       return;
    }
    public void setStyle(HashMap p0){
       e value;
       a obj2;
       a uoa;
       YogaUnit obj3;
       int i2;
       Object obj4;
       Object obj5;
       int i3;
       int i4;
       a b;
       a uoa1;
       a uoa2;
       int i6;
       YogaAlign yogaAlign;
       a a;
       Object[] objArray;
       a a1;
       int i = this;
       Object obj = p0;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(obj, i, e.class, "6")) {
          return;
       }
       if (obj != null && !p0.isEmpty()) {
          if (!this.getJsObj() instanceof V8ObjectProxy) {
             a.c("setStyle jsObject is invalid: "+this.getClass().getName());
             return;
          }else {
             i.q.clear();
             i.r.clear();
             Iterator iterator = p0.entrySet().iterator();
             int i1 = 0;
             e uoe = 16;
             e uoe1 = 1;
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String str = uEntry.getKey().toString();
                value = uEntry.getValue();
                b obj1 = i.style.get(str);
                if (value != null && (!value.equals(obj1) || i.styleFilter(str))) {
                   i.style.put(str, value);
                   obj1 = b.a();
                   Objects.requireNonNull(obj1);
                   obj2 = PatchProxy.applyOneRefs(str, obj1, uob, "13");
                   uoa = Integer.MAX_VALUE;
                   if (obj2 != PatchProxyResult.class) {
                      i1 = obj2.intValue();
                   }else {
                      obj3 = PatchProxy.applyOneRefs(str, i1, uob, "9");
                      if (obj3 != PatchProxyResult.class) {
                         i2 = obj3.intValue();
                      }else if(str == null){
                         switch (str.hashCode()){
                             case 0x804ddcb4:
                               if (str.equals("positionBottom")) {
                                  i1 = 0;
                               }
                               break;
                             case 0x8e632c72:
                               if (str.equals("marginHorizontal")) {
                                  i1 = 1;
                               }
                               break;
                             case 0x95adf7c5:
                               if (str.equals("flexBasis")) {
                                  i1 = 2;
                               }
                               break;
                             case 0xa685dfb8:
                               if (str.equals("paddingLeft")) {
                                  i1 = 3;
                               }
                               break;
                             case 0xad762bbf:
                               if (str.equals("positionVertical")) {
                                  i1 = 4;
                               }
                               break;
                             case 0xad8d9a2b:
                               if (str.equals("bottom")) {
                                  i1 = 5;
                               }
                               break;
                             case 0xadfeba94:
                               if (str.equals("minWidth")) {
                                  i1 = 6;
                               }
                               break;
                             case 0xb7389127:
                               if (str.equals("height")) {
                                  i1 = 7;
                               }
                               break;
                             case 0xbf8c85ae:
                               if (str.equals("margin")) {
                                  i1 = 8;
                               }
                               break;
                             case 0xc09ffbbb:
                               if (str.equals("alignItems")) {
                                  i1 = 9;
                               }
                               break;
                             case 0xc1b97513:
                               if (str.equals("marginAll")) {
                                  i1 = 10;
                               }
                               break;
                             case 0xc1b9844d:
                               if (str.equals("marginEnd")) {
                                  i1 = 11;
                               }
                               break;
                             case 0xc1b9bcc7:
                               if (str.equals("marginTop")) {
                                  i1 = 12;
                               }
                               break;
                             case 0xc5e00f86:
                               if (str.equals("flexDirection")) {
                                  i1 = 13;
                               }
                               break;
                             case 0xc6a0077f:
                               if (str.equals("direction")) {
                                  i1 = 14;
                               }
                               break;
                             case 0xc9fe87ab:
                               if (str.equals("maxHeight")) {
                                  i1 = 15;
                               }
                               break;
                             case 0xcff03c11:
                               if (str.equals("padding")) {
                                  i1 = 16;
                               }
                               break;
                             case 0xd32435b4:
                               if (str.equals("alignContent")) {
                                  i1 = 17;
                               }
                               break;
                             case 0xea8c8315:
                               if (str.equals("paddingHorizontal")) {
                                  i1 = 18;
                               }
                               break;
                             case 0xeec39179:
                               if (str.equals("marginBottom")) {
                                  i1 = 19;
                               }
                               break;
                             case 0xf7ce6bb8:
                               if (str.equals("positionAll")) {
                                  i1 = 20;
                               }
                               break;
                             case 0xf7ce7af2:
                               if (str.equals("positionEnd")) {
                                  i1 = 21;
                               }
                               break;
                             case 0xf7ceb36c:
                               if (str.equals("positionTop")) {
                                  i1 = 22;
                               }
                               break;
                             case 0xf8099e19:
                               if (str.equals("minHeight")) {
                                  i1 = 23;
                               }
                               break;
                             case 0x188db:
                               if (str.equals("end")) {
                                  i1 = 24;
                               }
                               break;
                             case 0x1c155:
                               if (str.equals("top")) {
                                  i1 = 25;
                               }
                               break;
                             case 0x2ffff9:
                               if (str.equals("flex")) {
                                  i1 = 26;
                               }
                               break;
                             case 0x32a007:
                               if (str.equals("left")) {
                                  i1 = 27;
                               }
                               break;
                             case 0x203f0d0:
                               if (str.equals("positionLeft")) {
                                  i1 = 28;
                               }
                               break;
                             case 0x207e003:
                               if (str.equals("positionType")) {
                                  i1 = 29;
                               }
                               break;
                             case 0x55effd0:
                               if (str.equals("paddingAll")) {
                                  i1 = 30;
                               }
                               break;
                             case 0x55f0f0a:
                               if (str.equals("paddingEnd")) {
                                  i1 = 31;
                               }
                               break;
                             case 0x55f4784:
                               if (str.equals("paddingTop")) {
                                  i1 = 32;
                               }
                               break;
                             case 0x677c21c:
                               if (str.equals("right")) {
                                  i1 = 33;
                               }
                               break;
                             case 0x68ac462:
                               if (str.equals("start")) {
                                  i1 = 34;
                               }
                               break;
                             case 0x6be2dc6:
                               if (str.equals("width")) {
                                  i1 = 35;
                               }
                               break;
                             case 0xbc40dd5:
                               if (str.equals("borderAll")) {
                                  i1 = 36;
                               }
                               break;
                             case 0xbc41d0f:
                               if (str.equals("borderEnd")) {
                                  i1 = 37;
                               }
                               break;
                             case 0xbc45589:
                               if (str.equals("borderTop")) {
                                  i1 = 38;
                               }
                               break;
                             case 0xc0fb19c:
                               if (str.equals("paddingBottom")) {
                                  i1 = 39;
                               }
                               break;
                             case 0x17dd56c2:
                               if (str.equals("maxWidth")) {
                                  i1 = 40;
                               }
                               break;
                             case 0x1f91b402:
                               if (str.equals("overflow")) {
                                  i1 = 41;
                               }
                               break;
                             case 0x2a8c788b:
                               if (str.equals("paddingRight")) {
                                  i1 = 42;
                               }
                               break;
                             case 0x2a9f7ad1:
                               if (str.equals("paddingStart")) {
                                  i1 = 43;
                               }
                               break;
                             case 0x2be61950:
                               if (str.equals("borderRight")) {
                                  i1 = 44;
                               }
                               break;
                             case 0x2bf91b96:
                               if (str.equals("borderStart")) {
                                  i1 = 45;
                               }
                               break;
                             case 0x2c929929:
                               if (str.equals("position")) {
                                  i1 = 46;
                               }
                               break;
                             case 0x30619570:
                               if (str.equals("borderHorizontal")) {
                                  i1 = 47;
                               }
                               break;
                             case 0x35ea2977:
                               if (str.equals("borderBottom")) {
                                  i1 = 48;
                               }
                               break;
                             case 0x3a1ea90e:
                               if (str.equals("marginRight")) {
                                  i1 = 49;
                               }
                               break;
                             case 0x3a31ab54:
                               if (str.equals("marginStart")) {
                                  i1 = 50;
                               }
                               break;
                             case 0x3d759362:
                               if (str.equals("flexShrink")) {
                                  i1 = 51;
                               }
                               break;
                             case 0x3ed08a73:
                               if (str.equals("positionRight")) {
                                  i1 = 52;
                               }
                               break;
                             case 0x3ee38cb9:
                               if (str.equals("positionStart")) {
                                  i1 = 53;
                               }
                               break;
                             case 0x41194293:
                               if (str.equals("aspectRatio")) {
                                  i1 = 54;
                               }
                               break;
                             case 0x501666a7:
                               if (str.equals("paddingVertical")) {
                                  i1 = 55;
                               }
                               break;
                             case 0x5551c344:
                               if (str.equals("marginVertical")) {
                                  i1 = 56;
                               }
                               break;
                             case 0x63a518c2:
                               if (str.equals("display")) {
                                  i1 = 57;
                               }
                               break;
                             case 0x67ef5bac:
                               if (str.equals("flexGrow")) {
                                  i1 = 58;
                               }
                               break;
                             case 0x67f69fe3:
                               if (str.equals("flexWrap")) {
                                  i1 = 59;
                               }
                               break;
                             case 0x6953cff1:
                               if (str.equals("alignSelf")) {
                                  i1 = 60;
                               }
                               break;
                             case 0x6cc29253:
                               if (str.equals("borderLeft")) {
                                  i1 = 61;
                               }
                               break;
                             case 0x6d3253c2:
                               if (str.equals("borderVertical")) {
                                  i1 = 62;
                               }
                               break;
                             case 0x6ee75fc9:
                               if (str.equals("justifyContent")) {
                                  i1 = 63;
                               }
                               break;
                             case 0x6f0f622d:
                               if (str.equals("positionHorizontal")) {
                                  i1 = 64;
                               }
                               break;
                             case 0x757a12d5:
                               if (str.equals("marginLeft")) {
                                  i1 = 65;
                               }
                               break;
                             default:
                            label_00d7 :
                               i1 = -1;
                         }
                         switch (i1){
                             case 0:
                             case 5:
                               i2 = 46;
                               break;
                             case 1:
                               i2 = 25;
                               break;
                             case 2:
                               i2 = 16;
                               break;
                             case 3:
                               i2 = 40;
                               break;
                             case 4:
                               i2 = 54;
                               break;
                             case 6:
                               i2 = 34;
                               break;
                             case 7:
                               i2 = 20;
                               break;
                             case 8:
                             case 10:
                               i2 = 22;
                               break;
                             case 9:
                               i2 = 1;
                               break;
                             case 11:
                               i2 = 24;
                               break;
                             case 12:
                               i2 = 29;
                               break;
                             case 13:
                               i2 = 17;
                               break;
                             case 14:
                               i2 = 13;
                               break;
                             case 15:
                               i2 = 31;
                               break;
                             case 16:
                             case 30:
                               i2 = 36;
                               break;
                             case 17:
                               i2 = 0;
                               break;
                             case 18:
                               i2 = 39;
                               break;
                             case 19:
                               i2 = 23;
                               break;
                             case 20:
                               i2 = 45;
                               break;
                             case 21:
                             case 24:
                               i2 = 47;
                               break;
                             case 22:
                             case 25:
                               i2 = 52;
                               break;
                             case 23:
                               i2 = 33;
                               break;
                             case 26:
                               i2 = 15;
                               break;
                             case 27:
                             case 28:
                               i2 = 49;
                               break;
                             case 29:
                             case '.':
                               i2 = 53;
                               break;
                             case 31:
                               i2 = 38;
                               break;
                             case 32:
                               i2 = 43;
                               break;
                             case '!':
                             case '4':
                               i2 = 50;
                               break;
                             case '"':
                             case '5':
                               i2 = 51;
                               break;
                             case '#':
                               i2 = 55;
                               break;
                             case '$':
                               i2 = 4;
                               break;
                             case '%':
                               i2 = 6;
                               break;
                             case '&':
                               i2 = 11;
                               break;
                             case 39:
                               i2 = 37;
                               break;
                             case '(':
                               i2 = 32;
                               break;
                             case ')':
                               i2 = 35;
                               break;
                             case '*':
                               i2 = 41;
                               break;
                             case '+':
                               i2 = 42;
                               break;
                             case ',':
                               i2 = 9;
                               break;
                             case '-':
                               i2 = 10;
                               break;
                             case '/':
                               i2 = 7;
                               break;
                             case '0':
                               i2 = 5;
                               break;
                             case '1':
                               i2 = 27;
                               break;
                             case '2':
                               i2 = 28;
                               break;
                             case '3':
                               i2 = 19;
                               break;
                             case '6':
                               i2 = 3;
                               break;
                             case '7':
                               i2 = 44;
                               break;
                             case '8':
                               i2 = 30;
                               break;
                             case '9':
                               i2 = 14;
                               break;
                             case ':':
                               i2 = 18;
                               break;
                             case ';':
                               i2 = 56;
                               break;
                             case '<':
                               i2 = 2;
                               break;
                             case '=':
                               i2 = 8;
                               break;
                             case '>':
                               i2 = 12;
                               break;
                             case '?':
                               i2 = 21;
                               break;
                             case '@':
                               i2 = 48;
                               break;
                             case 'A':
                               i2 = 26;
                               break;
                             default:
                         }
                      }
                      i2 = Integer.MAX_VALUE;
                      i1 = i2;
                   }
                   if (i1 == uoa) {
                      i.r.put(str, value);
                   }else {
                      i.q.put(Integer.valueOf(i1), value);
                   }
                }
             }
             if (!i.q.isEmpty()) {
                a domNode = this.getDomNode();
                value = i.q;
                Objects.requireNonNull(domNode);
                uoa = a.class;
                if (PatchProxy.applyVoidOneRefs(value, domNode, uoa, "5") || (value != null && !value.isEmpty())) {
                   View view = domNode.b();
                   if (!PatchProxy.applyVoidOneRefs(value, domNode, uoa, "15") && !PatchProxy.applyVoidOneRefs(value, domNode, uoa, "14")) {
                      obj2 = domNode.c();
                      b = domNode.b;
                      if (!PatchProxy.applyVoidTwoRefs(obj2, b, i1, uob, "10") && b != null) {
                         if (b.getView().getResources().getConfiguration().getLayoutDirection() == uoe1) {
                            obj2.q(YogaDirection.RTL);
                         }
                         Drawable background = b.getView().getBackground();
                         if (background != null) {
                            Rect rect = new Rect();
                            if (background.getPadding(rect)) {
                               obj2.z(YogaEdge.LEFT, (float)rect.left);
                               obj2.z(YogaEdge.TOP, (float)rect.top);
                               obj2.z(YogaEdge.RIGHT, (float)rect.right);
                               obj2.z(YogaEdge.BOTTOM, (float)rect.bottom);
                            }
                         }
                      }
                   label_05d7 :
                      Iterator iterator1 = value.entrySet().iterator();
                      while (iterator1.hasNext()) {
                         Map$Entry uEntry1 = iterator1.next();
                         int i5 = uEntry1.getKey().intValue();
                         i value1 = uEntry1.getValue();
                         if (!value1 instanceof HashMap) {
                            if (PatchProxy.isSupport(uoa)) {
                               uoa1 = obj2;
                               uoa2 = uoa;
                               if (PatchProxy.applyVoidThreeRefs(Integer.valueOf(i5), value1, uoa1, domNode, a.class, "16")) {
                               label_0b1c :
                                  obj2 = uoa1;
                               label_0b1e :
                                  uoa = uoa2;
                               }
                            }else {
                               uoa1 = obj2;
                               uoa2 = uoa;
                            }
                            if (value1 != null) {
                               b = uoa1;
                               if (b != null) {
                                  obj2 = a.class;
                                  if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(b, Integer.valueOf(i5), value1, null, b.class, "11")) {
                                  label_064c :
                                     i2 = i1;
                                     i6 = 55;
                                  }else {
                                     value1 = b.b(i5, value1);
                                     if (value1 == null) {
                                        goto label_064c ;
                                     }else {
                                        i b1 = value1.b;
                                        obj3 = YogaUnit.PERCENT;
                                        a uoa3 = (b1 == obj3)? 1: null;
                                        i2 = (b1 == YogaUnit.AUTO)? 1: 0;
                                        value1 = value1.a;
                                        if (!uoa3 && !i2) {
                                           switch (i5){
                                               case 0:
                                                 yogaAlign = YogaAlign.fromInt(Math.round(value1));
                                                 if (!PatchProxy.applyVoidOneRefs(yogaAlign, b, obj2, "29")) {
                                                    uoa = b.a;
                                                    if (uoa != null) {
                                                       uoa.b0(yogaAlign);
                                                    }
                                                 }
                                                 break;
                                               case 1:
                                                 b.n(YogaAlign.fromInt(Math.round(value1)));
                                                 break;
                                               case 2:
                                                 yogaAlign = YogaAlign.fromInt(Math.round(value1));
                                                 if (!PatchProxy.applyVoidOneRefs(yogaAlign, b, obj2, "27")) {
                                                    uoa = b.a;
                                                    if (uoa != null) {
                                                       uoa.d0(yogaAlign);
                                                    }
                                                 }
                                                 break;
                                               case 3:
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "81")) {
                                                    a1 = b.a;
                                                    if (a1 != null) {
                                                       a1.e0(value1);
                                                    }
                                                 }
                                                 break;
                                               case 4:
                                                 b.o(YogaEdge.ALL, value1);
                                                 break;
                                               case 5:
                                                 b.o(YogaEdge.BOTTOM, value1);
                                                 break;
                                               case 6:
                                                 b.o(YogaEdge.END, value1);
                                                 break;
                                               case 7:
                                                 b.o(YogaEdge.HORIZONTAL, value1);
                                                 break;
                                               case 8:
                                                 b.o(YogaEdge.LEFT, value1);
                                                 break;
                                               case 9:
                                                 b.o(YogaEdge.RIGHT, value1);
                                                 break;
                                               case 10:
                                                 b.o(YogaEdge.START, value1);
                                                 break;
                                               case 11:
                                                 b.o(YogaEdge.TOP, value1);
                                                 break;
                                               case 12:
                                                 b.o(YogaEdge.VERTICAL, value1);
                                                 break;
                                               case 13:
                                                 b.q(YogaDirection.fromInt(Math.round(value1)));
                                                 break;
                                               case 14:
                                                 YogaDisplay yogaDisplay = YogaDisplay.fromInt(Math.round(value1));
                                                 if (!PatchProxy.applyVoidOneRefs(yogaDisplay, b, obj2, "37")) {
                                                    uoa = b.a;
                                                    if (uoa != null) {
                                                       uoa.j0(yogaDisplay);
                                                    }
                                                 }
                                                 break;
                                               case 15:
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "39")) {
                                                    a1 = b.a;
                                                    if (a1 != null) {
                                                       a1.k0(value1);
                                                    }
                                                 }
                                                 break;
                                               case 16:
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "45")) {
                                                    a1 = b.a;
                                                    if (a1 != null) {
                                                       a1.l0(value1);
                                                    }
                                                 }
                                                 break;
                                               case 17:
                                                 b.r(YogaFlexDirection.fromInt(Math.round(value1)));
                                                 break;
                                               case 18:
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "41")) {
                                                    a1 = b.a;
                                                    if (a1 != null) {
                                                       a1.p0(value1);
                                                    }
                                                 }
                                                 break;
                                               case 19:
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "43")) {
                                                    a1 = b.a;
                                                    if (a1 != null) {
                                                       a1.q0(value1);
                                                    }
                                                 }
                                                 break;
                                               case 20:
                                                 b.s(value1);
                                                 break;
                                               case 21:
                                                 b.u(YogaJustify.fromInt(Math.round(value1)));
                                                 break;
                                               case 22:
                                                 b.v(YogaEdge.ALL, value1);
                                                 break;
                                               case 23:
                                                 b.v(YogaEdge.BOTTOM, value1);
                                                 break;
                                               case 24:
                                                 b.v(YogaEdge.END, value1);
                                                 break;
                                               case 25:
                                                 b.v(YogaEdge.HORIZONTAL, value1);
                                                 break;
                                               case 26:
                                                 b.v(YogaEdge.LEFT, value1);
                                                 break;
                                               case 27:
                                                 b.v(YogaEdge.RIGHT, value1);
                                                 break;
                                               case 28:
                                                 b.v(YogaEdge.START, value1);
                                                 break;
                                               case 29:
                                                 b.v(YogaEdge.TOP, value1);
                                                 break;
                                               case 30:
                                                 b.v(YogaEdge.VERTICAL, value1);
                                                 break;
                                               case 31:
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "78")) {
                                                    a1 = b.a;
                                                    if (a1 != null) {
                                                       a1.z0(value1);
                                                    }
                                                 }
                                                 break;
                                               case 32:
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "75")) {
                                                    a1 = b.a;
                                                    if (a1 != null) {
                                                       a1.B0(value1);
                                                    }
                                                 }
                                                 break;
                                               case '!':
                                                 b.y(value1);
                                                 break;
                                               case '"':
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "69")) {
                                                    a1 = b.a;
                                                    if (a1 != null) {
                                                       a1.G0(value1);
                                                    }
                                                 }
                                                 break;
                                               case '$':
                                                 b.z(YogaEdge.ALL, value1);
                                                 break;
                                               case '%':
                                                 b.z(YogaEdge.BOTTOM, value1);
                                                 break;
                                               case '&':
                                                 b.z(YogaEdge.END, value1);
                                                 break;
                                               case 39:
                                                 b.z(YogaEdge.HORIZONTAL, value1);
                                                 break;
                                               case '(':
                                                 b.z(YogaEdge.LEFT, value1);
                                                 break;
                                               case ')':
                                                 b.z(YogaEdge.RIGHT, value1);
                                                 break;
                                               case '*':
                                                 b.z(YogaEdge.START, value1);
                                                 break;
                                               case '+':
                                                 b.z(YogaEdge.TOP, value1);
                                                 break;
                                               case ',':
                                                 b.z(YogaEdge.VERTICAL, value1);
                                                 break;
                                               case '-':
                                                 b.B(YogaEdge.ALL, value1);
                                                 break;
                                               case '.':
                                                 b.B(YogaEdge.BOTTOM, value1);
                                                 break;
                                               case '/':
                                                 b.B(YogaEdge.END, value1);
                                                 break;
                                               case '0':
                                                 b.B(YogaEdge.HORIZONTAL, value1);
                                                 break;
                                               case '1':
                                                 b.B(YogaEdge.LEFT, value1);
                                                 break;
                                               case '2':
                                                 b.B(YogaEdge.RIGHT, value1);
                                                 break;
                                               case '3':
                                                 b.B(YogaEdge.START, value1);
                                                 break;
                                               case '4':
                                                 b.B(YogaEdge.TOP, value1);
                                                 break;
                                               case '5':
                                                 YogaPositionType yogaPosition = YogaPositionType.fromInt(Math.round(value1));
                                                 if (!PatchProxy.applyVoidOneRefs(yogaPosition, b, obj2, "31")) {
                                                    uoa = b.a;
                                                    if (uoa != null) {
                                                       uoa.N0(yogaPosition);
                                                    }
                                                 }
                                                 break;
                                               case '6':
                                                 b.B(YogaEdge.VERTICAL, value1);
                                                 break;
                                               case '7':
                                                 b.D(value1);
                                                 break;
                                               case '8':
                                                 YogaWrap yogaWrap = YogaWrap.fromInt(Math.round(value1));
                                                 if (!PatchProxy.applyVoidOneRefs(yogaWrap, b, obj2, "33")) {
                                                    a1 = b.a;
                                                    if (a1 != null) {
                                                       a1.R0(yogaWrap);
                                                    }
                                                 }
                                                 break;
                                               default:
                                           }
                                        }
                                        if (i2) {
                                           if (i5 != uoe) {
                                              if (i5 != 20) {
                                                 if (i5 != 55) {
                                                    switch (i5){
                                                        case 22:
                                                          b.w(YogaEdge.ALL);
                                                          break;
                                                        case 23:
                                                          b.w(YogaEdge.BOTTOM);
                                                          break;
                                                        case 24:
                                                          b.w(YogaEdge.END);
                                                          break;
                                                        case 25:
                                                          b.w(YogaEdge.HORIZONTAL);
                                                          break;
                                                        case 26:
                                                          b.w(YogaEdge.LEFT);
                                                          break;
                                                        case 27:
                                                          b.w(YogaEdge.RIGHT);
                                                          break;
                                                        case 28:
                                                          b.w(YogaEdge.START);
                                                          break;
                                                        case 29:
                                                          b.w(YogaEdge.TOP);
                                                          break;
                                                        case 30:
                                                          b.w(YogaEdge.VERTICAL);
                                                          break;
                                                        default:
                                                    }
                                                 }else {
                                                    b.E();
                                                 }
                                              }else {
                                                 b.t();
                                              }
                                              i2 = 0;
                                           }else {
                                              objArray = null;
                                              if (!PatchProxy.applyVoid(objArray, b, obj2, "47")) {
                                                 uoa = b.a;
                                                 if (uoa != null) {
                                                    uoa.m0();
                                                 }
                                              }
                                           }
                                        }else {
                                           objArray = 0;
                                           i6 = 55;
                                        }
                                        if (uoa3) {
                                           switch (i5){
                                               case 16:
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "46")) {
                                                    a = b.a;
                                                    if (a != null) {
                                                       a.n0(value1);
                                                    }
                                                 }
                                                 break;
                                               case 20:
                                                 if (PatchProxy.isSupport(obj2) && (!PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "66") && b.a != null)) {
                                                    if (b.b != null) {
                                                       b.d = new i(value1, obj3);
                                                    }
                                                    b.a.t0(value1);
                                                 }
                                                 break;
                                               case 22:
                                                 b.x(YogaEdge.ALL, value1);
                                                 break;
                                               case 23:
                                                 b.x(YogaEdge.BOTTOM, value1);
                                                 break;
                                               case 24:
                                                 b.x(YogaEdge.END, value1);
                                                 break;
                                               case 25:
                                                 b.x(YogaEdge.HORIZONTAL, value1);
                                                 break;
                                               case 26:
                                                 b.x(YogaEdge.LEFT, value1);
                                                 break;
                                               case 27:
                                                 b.x(YogaEdge.RIGHT, value1);
                                                 break;
                                               case 28:
                                                 b.x(YogaEdge.START, value1);
                                                 break;
                                               case 29:
                                                 b.x(YogaEdge.TOP, value1);
                                                 break;
                                               case 30:
                                                 b.x(YogaEdge.VERTICAL, value1);
                                                 break;
                                               case 31:
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "79")) {
                                                    a = b.a;
                                                    if (a != null) {
                                                       a.A0(value1);
                                                    }
                                                 }
                                                 break;
                                               case 32:
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "76")) {
                                                    a = b.a;
                                                    if (a != null) {
                                                       a.C0(value1);
                                                    }
                                                 }
                                                 break;
                                               case '!':
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "73")) {
                                                    a = b.a;
                                                    if (a != null) {
                                                       a.F0(value1);
                                                    }
                                                 }
                                                 break;
                                               case '"':
                                                 if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "70")) {
                                                    a = b.a;
                                                    if (a != null) {
                                                       a.H0(value1);
                                                    }
                                                 }
                                                 break;
                                               case '$':
                                                 b.A(YogaEdge.ALL, value1);
                                                 break;
                                               case '%':
                                                 b.A(YogaEdge.BOTTOM, value1);
                                                 break;
                                               case '&':
                                                 b.A(YogaEdge.END, value1);
                                                 break;
                                               case 39:
                                                 b.A(YogaEdge.HORIZONTAL, value1);
                                                 break;
                                               case '(':
                                                 b.A(YogaEdge.LEFT, value1);
                                                 break;
                                               case ')':
                                                 b.A(YogaEdge.RIGHT, value1);
                                                 break;
                                               case '*':
                                                 b.A(YogaEdge.START, value1);
                                                 break;
                                               case '+':
                                                 b.A(YogaEdge.TOP, value1);
                                                 break;
                                               case ',':
                                                 b.A(YogaEdge.VERTICAL, value1);
                                                 break;
                                               case '-':
                                                 b.C(YogaEdge.ALL, value1);
                                                 break;
                                               case '.':
                                                 b.C(YogaEdge.BOTTOM, value1);
                                                 break;
                                               case '/':
                                                 b.C(YogaEdge.END, value1);
                                                 break;
                                               case '0':
                                                 b.C(YogaEdge.HORIZONTAL, value1);
                                                 break;
                                               case '1':
                                                 b.C(YogaEdge.LEFT, value1);
                                                 break;
                                               case '2':
                                                 b.C(YogaEdge.RIGHT, value1);
                                                 break;
                                               case '3':
                                                 b.C(YogaEdge.START, value1);
                                                 break;
                                               case '4':
                                                 b.C(YogaEdge.TOP, value1);
                                                 break;
                                               case '6':
                                                 b.C(YogaEdge.VERTICAL, value1);
                                                 break;
                                               case '7':
                                                 if (PatchProxy.isSupport(obj2) && (!PatchProxy.applyVoidOneRefs(Float.valueOf(value1), b, obj2, "62") && b.a != null)) {
                                                    if (b.b != null) {
                                                       b.c = new i(value1, obj3);
                                                    }
                                                    b.a.Q0(value1);
                                                 }
                                                 break;
                                               default:
                                           }
                                        }
                                     }
                                  }
                               label_0b19 :
                                  i1 = i2;
                               }
                               obj2 = b;
                               goto label_0b1e ;
                            }else {
                               goto label_0b1c ;
                            }
                         }
                      }
                   }
                   view.requestLayout();
                }
             }
             if (!i.r.isEmpty()) {
                uoe = i.r;
                String originClzzNa = this.getJsObj().getOriginClzzName();
                if (PatchProxy.applyVoidTwoRefs(uoe, originClzzNa, i, e.class, "95") || (uoe != null && !uoe.isEmpty())) {
                   uoe1 = e.b().a;
                   _monitor_enter(uoe1);
                   obj4 = PatchProxy.applyThreeRefs(originClzzNa, this, uoe, uoe1, g.class, "9");
                   if (obj4 != PatchProxyResult.class) {
                      i3 = obj4.intValue();
                      _monitor_exit(uoe1);
                   }else {
                      uoe1.i();
                      uob = h.c(originClzzNa);
                      if (a.c.booleanValue()) {
                         iterator = uoe.keySet().iterator();
                         i4 = 0;
                         while (iterator.hasNext()) {
                            if (!uob.d(iterator.next())) {
                               i4 = i4 + 1;
                            }
                         }
                      }else {
                         i4 = 0;
                      }
                      uob.b(i, uoe);
                      _monitor_exit(uoe1);
                      i3 = i4;
                   }
                   if (i3 > 0) {
                      i.s = i.s + 1;
                   }
                }
             }
          label_0ba9 :
             obj = obj.get("transform");
             if (obj instanceof Map && (PatchProxy.applyVoidOneRefs(obj, i, e.class, "84") || (obj != null && !obj.isEmpty()))) {
                obj4 = obj.get("scale");
                if (obj4 instanceof Map) {
                   obj5 = obj4.get("x");
                   if (obj5 instanceof Number) {
                      i.setScaleX(obj5.floatValue());
                   }
                   obj4 = obj4.get("y");
                   if (obj4 instanceof Number) {
                      i.setScaleY(obj4.floatValue());
                   }
                }else if(obj4 instanceof Number){
                   i.setScaleX(obj4.floatValue());
                   i.setScaleY(obj4.floatValue());
                }
                obj4 = obj.get("translate");
                if (obj4 instanceof Map) {
                   obj5 = obj4.get("x");
                   if (obj5 instanceof Number) {
                      i.setTranslateX((float)n.a(obj5.floatValue()));
                   }
                   obj4 = obj4.get("y");
                   if (obj4 instanceof Number) {
                      i.setTranslateY((float)n.a(obj4.floatValue()));
                   }
                }else if(obj4 instanceof Number){
                   float f = (float)n.a(obj4.floatValue());
                   i.setTranslateX(f);
                   i.setTranslateY(f);
                }
                obj = obj.get("rotate");
                if (obj instanceof Map) {
                   obj4 = obj.get("x");
                   if (obj4 instanceof Number) {
                      i.setRotateX(obj4.floatValue());
                   }
                   obj4 = obj.get("y");
                   if (obj4 instanceof Number) {
                      i.setRotateY(obj4.floatValue());
                   }
                   obj = obj.get("z");
                   if (obj instanceof Number) {
                      i.setRotate(obj.floatValue());
                   }
                }else if(obj instanceof Number){
                   i.setRotate(obj.floatValue());
                }
             }
          }
       }
    label_0cad :
       return;
    }
    public void setTopLeftRadius(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "49")) {
          return;
       }
       this.getViewBackgroundManager().g((float)n.b(p0), TKViewBackgroundDrawable$BorderRadiusLocation.TOP_LEFT.ordinal());
       return;
    }
    public void setTopRightRadius(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "51")) {
          return;
       }
       this.getViewBackgroundManager().g((float)n.b(p0), TKViewBackgroundDrawable$BorderRadiusLocation.TOP_RIGHT.ordinal());
       return;
    }
    public void setTranslateX(float p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "32")) {
          return;
       }
       this.getView().setTranslationX(p0);
       return;
    }
    public void setTranslateY(float p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "33")) {
          return;
       }
       this.getView().setTranslationY(p0);
       return;
    }
    public void setVNode(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "11")) {
          return;
       }
       y.c(this.mVNodeRef);
       this.mVNodeRef = y.b(p0, this);
       return;
    }
    public void setViewID(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       e tnativeID = this.nativeID;
       this.nativeID = p0;
       this.getDomNode().a = p0;
       this.getView().setContentDescription(p0);
       e tparent = this.parent;
       if (tparent != null) {
          tparent.setChildViewID(tnativeID, this.nativeID);
       }
       return;
    }
    public void setVisibility(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "24")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("hidden")) {
          if (!p0.equals("gone")) {
             this.getView().setVisibility(0);
          }else {
             this.removeSelf();
          }
       }else {
          this.getView().setVisibility(4);
       }
       return;
    }
    public void setZIndex(float p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "106")) {
          return;
       }
       int i = Math.round(p0);
       View view = this.getView();
       n on = n.class;
       if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidTwoRefs(view, Integer.valueOf(i), null, on, "1")) {
          n.d.put(view, Integer.valueOf(i));
       }
       ViewParent parent = this.getView().getParent();
       if (parent instanceof d) {
          parent.updateDrawingOrder();
       }
       return;
    }
    public void startViewAnimation(String p0,int p1,float p2,float p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, e.class, "23")) {
          return;
       }
       c uoc = new c(this, p0, (long)p1, p2, p3);
       if (!PatchProxy.applyVoid(null, v0, c.class, "1") && !TextUtils.isEmpty(v0.b)) {
          c a = v0.a;
          if (a != null && a.getDomNode() != null) {
             p1 = 1;
             int i = 0;
             int i1 = 2;
             if (("height").equals(v0.b) || ("width").equals(v0.b)) {
                float[] uofloatArray = new float[i1];
                uofloatArray[i] = v0.d;
                uofloatArray[p1] = v0.e;
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
                valueAnimato.setDuration(v0.c);
                valueAnimato.addUpdateListener(new b(v0));
                valueAnimato.start();
             }else {
                float[] uofloatArray1 = new float[i1];
                uofloatArray1[i] = v0.d;
                uofloatArray1[p1] = v0.e;
                ObjectAnimator.ofFloat(v0.a.getView(), v0.b, uofloatArray1).setDuration(v0.c).start();
             }
          }
       }
       return;
    }
    public boolean styleFilter(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "100");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0.length() == 15) {
          if (this.m != null && ("backgroundColor").equals(p0)) {
             return true;
          }else if(this.m == null && ("gradientBgColor").equals(p0)){
             b = true;
          }
       }
       return b;
    }
    public boolean supportAsyncPrepareView(){
       return false;
    }
    public void takeControlOfPaddingSet(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "77")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          int b = p0.containsKey("paddingLeft");
          int b1 = p0.containsKey("paddingTop");
          int b2 = p0.containsKey("paddingRight");
          int b3 = p0.containsKey("paddingBottom");
          if (!b && (!b1 && (!b2 && !b3))) {
             return;
          }else if(b){
             b = this.k(p0, "paddingLeft");
          }else {
             b = this.getView().getPaddingLeft();
          }
          b1 = (b1)? this.k(p0, "paddingTop"): this.getView().getPaddingTop();
          b2 = (b2)? this.k(p0, "paddingRight"): this.getView().getPaddingRight();
          b3 = (b3)? this.k(p0, "paddingBottom"): this.getView().getPaddingBottom();
          this.getView().setPadding(b, b1, b2, b3);
          p0.remove("paddingLeft");
          p0.remove("paddingRight");
          p0.remove("paddingTop");
          p0.remove("paddingBottom");
       }
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, e.class, "82")) {
          return;
       }
       super.unRetainAllJsObj();
       Iterator iterator = this.k.entrySet().iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().getValue().iterator();
          while (iterator1.hasNext()) {
             y.c(iterator1.next());
          }
       }
       y.c(this.mVNodeRef);
       y.c(this.mOnPressListenerRef);
       y.c(this.mOnLongPressListenerRef);
       y.c(this.mLayoutObserverRef);
       return;
    }
}
