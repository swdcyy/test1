package com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantView;
import ml8.d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import androidx.appcompat.widget.LinearLayoutCompat;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantItemView;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantItemView$a;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantView$b;
import ekd.m1;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.reflect.Type;
import android.widget.ViewFlipper;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import android.view.ViewParent;
import android.graphics.RectF;
import pm8.a;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import k51.a;
import k51.b;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import yk2.x;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewTreeObserver;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Boolean;
import android.view.MotionEvent;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class LiveSubscribePendantView extends LinearLayoutCompat implements d, Observer, LiveViewFlipper$a	// class@00114e
{
    public ViewGroup A;
    public String q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public float u;
    public float v;
    public float w;
    public float x;
    public LiveSubscribePendantView$b y;
    public LiveCustomViewFlipper z;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;

    static {
       LiveSubscribePendantView.B = a1.e(11.00f);
       LiveSubscribePendantView.C = a1.e(8.00f);
       LiveSubscribePendantView.D = a1.e(11.00f);
       LiveSubscribePendantView.E = a1.e(8.00f);
    }
    public void LiveSubscribePendantView(Context p0){
       super(p0, null);
    }
    public void LiveSubscribePendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSubscribePendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.r = new Rect();
       this.s = new Rect();
       this.t = new Rect();
    }
    public final float B(float p0){
       if (PatchProxy.isSupport(LiveSubscribePendantView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, LiveSubscribePendantView.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return Math.max(Math.min(p0, this.getMaxX()), this.getMinX());
    }
    public final float C(float p0){
       if (PatchProxy.isSupport(LiveSubscribePendantView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, LiveSubscribePendantView.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return Math.max(Math.min(p0, this.getMaxY()), this.getMinY());
    }
    public void a(View p0,int p1){
       if (PatchProxy.isSupport(LiveSubscribePendantView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveSubscribePendantView.class, "15")) {
          return;
       }
       for (int i = 0; i < this.A.getChildCount(); i = i + 1) {
          View childAt = this.A.getChildAt(i);
          boolean b = (i == p1)? true: false;
          childAt.setSelected(b);
       }
       if (this.y != null && this.isShown()) {
          this.y.c(p0.I.h);
       }
       return;
    }
    public void b(View p0,int p1){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribePendantView.class, "1")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a263c);
       this.z.setFlipInterval(a.t().u("SOURCE_LIVE").getValue("displayStickerDuration", Integer.class, Integer.valueOf(0x9c40)).intValue());
       this.z.setInAnimation(this.getContext(), R.anim.arg_RES_7f010109);
       this.z.setOutAnimation(this.getContext(), R.anim.arg_RES_7f01010f);
       this.A = m1.f(p0, 0x7f0a263d);
       this.z.a(this);
       return;
    }
    public final float getMaxX(){
       Object obj = PatchProxy.apply(null, this, LiveSubscribePendantView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)((this.getParent().getWidth() - this.getWidth()) - LiveSubscribePendantView.B);
    }
    public final float getMaxY(){
       Object obj = PatchProxy.apply(null, this, LiveSubscribePendantView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)((this.getParent().getHeight() - this.getHeight()) - LiveSubscribePendantView.C);
    }
    public final float getMinX(){
       return (float)LiveSubscribePendantView.B;
    }
    public final float getMinY(){
       return (float)LiveSubscribePendantView.C;
    }
    public RectF getPendantViewRectInWindow(){
       int[] obj = PatchProxy.apply(null, this, LiveSubscribePendantView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[2];
       this.getLocationInWindow(obj);
       int i = obj[0];
       int i1 = obj[1];
       float f = (float)i;
       float f1 = (float)i1;
       return new RectF(f, f1, (float)(i + this.getWidth()), (float)(i1 + this.getHeight()));
    }
    public final float[] getSubscribePendantLastPosition(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, LiveSubscribePendantView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.getString("liveSubscribePendantViewPosition", "");
       if (!TextUtils.x(obj)) {
          String[] stringArray = obj.split("&");
          if (stringArray.length == 2) {
             int i = 0;
             try{
                objArray = new float[]{Float.parseFloat(stringArray[i]),Float.parseFloat(stringArray[1])};
             }catch(java.lang.NumberFormatException e0){
             }
          }
       }
       return objArray;
    }
    public void onChanged(Object p0){
       LiveSubscribePendantView tz;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribePendantView.class, "14")) {
       }else {
          int i = 0;
          boolean b = true;
          while (i < p0.size()) {
             LiveSubscribePendantItemView$a uoa = p0.get(i);
             LiveSubscribePendantItemView childAt = this.z.getChildAt(i);
             if (childAt == null) {
                b.f(this.getContext(), R.layout.live_subscribe_pendant_item, this.z, b, a.f());
                childAt = this.z.getChildAt(i);
             }
             childAt.I = uoa;
             childAt.H = this.y;
             childAt.setSubscribePendantText(uoa.b);
             childAt.setSubscribeNumber(uoa.c);
             childAt.setSubscribeButtonStatus(uoa.d);
             childAt.setSubscribeBtnIcon(uoa.e);
             LiveSubscribePendantItemView$a f = uoa.f;
             uoa = uoa.g;
             if (!PatchProxy.applyVoidTwoRefs(f, uoa, childAt, LiveSubscribePendantItemView.class, "8")) {
                a$a uoa1 = a.d();
                uoa1.b(":ks-features:ft-live:live");
                uoa1.d(ImageSource.FEED_COVER);
                a uoa2 = uoa1.a();
                if (f != null && f.length > 0) {
                   childAt.F.Y(f, uoa2, new x(childAt, uoa, uoa2));
                }else {
                   childAt.F.M(uoa, uoa2);
                }
             }
             i = i + 1;
          }
          int childCount = this.z.getChildCount();
          for (; i < childCount; i = i + 1) {
             tz = this.z;
             i1 = tz.getChildCount() - b;
             tz.removeViewAt(i1);
          }
          LiveSubscribePendantView liveSubscrib = -1;
          childCount = 0;
          tz = -1;
          while (childCount < p0.size()) {
             if (this.A.getChildAt(childCount) == null) {
                View.inflate(this.getContext(), R.layout.arg_RES_7f0d0df0, this.A);
             }
             if (tz == liveSubscrib || !tz) {
                boolean b1 = this.A.getChildAt(childCount).isSelected();
             }
             childCount = childCount + 1;
          }
          int childCount1 = this.A.getChildCount();
          for (; childCount < childCount1; childCount = childCount + 1) {
             liveSubscrib = this.A;
             i1 = liveSubscrib.getChildCount() - b;
             liveSubscrib.removeViewAt(i1);
          }
          if (this.A.getChildCount() < 2) {
             b = false;
          }
          if (b) {
             this.A.setVisibility(0);
             this.z.startFlipping();
          }else {
             this.A.setVisibility(8);
             this.z.stopFlipping();
          }
          if (!tz) {
             this.a(this.z.getCurrentView(), 0);
          }
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribePendantView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.getViewTreeObserver().addOnGlobalLayoutListener(new LiveSubscribePendantView$a(this));
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveSubscribePendantView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveSubscribePendantView.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.z.getHitRect(this.r);
       LiveSubscribePendantItemView currentView = this.z.getCurrentView();
       if (currentView != null) {
          currentView.C.getHitRect(this.s);
          currentView.D.getHitRect(this.t);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       LiveSubscribePendantView ty;
       LiveSubscribePendantItemView obj = PatchProxy.applyOneRefs(p0, this, LiveSubscribePendantView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          boolean b1 = false;
          if (action != b) {
             if (action == 2) {
                float f = p0.getRawX() - this.u;
                float f1 = p0.getRawY() - this.v;
                if (!PatchProxy.isSupport(LiveSubscribePendantView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), Float.valueOf(f1), this, LiveSubscribePendantView.class, "9")) {
                   this.setX(this.B((this.getX() + f)));
                   this.setY(this.C((this.getY() + f1)));
                }
                this.u = p0.getRawX();
                this.v = p0.getRawY();
                return b;
             }
          }else {
             float f2 = 5.00f;
             if (Math.abs((this.w - this.u)) - f2 >= 0 || Math.abs((this.x - this.v)) - f2 >= 0) {
                b = false;
             }
             if (b) {
                obj = this.z.getCurrentView();
                if (this.s.contains((int)p0.getX(), (int)p0.getY()) || this.t.contains((int)p0.getX(), (int)p0.getY())) {
                   ty = this.y;
                   if (ty != null) {
                      obj = obj.I;
                      ty.b(obj.d, obj.h);
                   }
                }else if(this.r.contains((int)p0.getX(), (int)p0.getY())){
                   ty = this.y;
                   if (ty != null) {
                      ty.e(obj.I.h);
                   }
                }
             }
             if (!PatchProxy.applyVoid(null, this, LiveSubscribePendantView.class, "6")) {
                SharedPreferences$Editor uEditor = a.a.edit();
                uEditor.putString("liveSubscribePendantViewPosition", this.getX()+"&"+this.getY());
                g.a(uEditor);
             }
          }
          return b1;
       }else {
          this.w = p0.getRawX();
          this.x = p0.getRawY();
          this.u = p0.getRawX();
          this.v = p0.getRawY();
          this.requestDisallowInterceptTouchEvent(b);
          return b;
       }
    }
    public void setSubscribePendantListener(LiveSubscribePendantView$b p0){
       this.y = p0;
    }
}
