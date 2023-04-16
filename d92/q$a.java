package d92.q$a;
import com.kuaishou.live.common.core.basic.widget.VerticalScrollGestureListener;
import d92.q;
import android.content.Context;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Float;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.ref.WeakReference;
import android.app.Activity;
import d61.g;
import android.view.ViewStub;
import android.view.ViewParent;
import android.view.View;
import java.util.Objects;
import ekd.m1;
import android.widget.ImageView;
import com.kwai.library.widget.progressbar.StepProgressBar;
import com.yxcorp.utility.n;
import va1.n0;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import usd.q;
import java.lang.Integer;
import android.content.ContentResolver;
import android.provider.Settings$System;
import android.net.Uri;
import android.database.ContentObserver;
import java.lang.Throwable;
import android.media.AudioManager;
import o56.c;
import o56.a;
import android.app.Application;
import android.view.ViewConfiguration;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class q$a extends VerticalScrollGestureListener	// class@0024b9
{
    public final q d;

    public void q$a(q p0,Context p1){
       this.d = p0;
       super(p1);
    }
    public void a(MotionEvent p0,MotionEvent p1,float p2,float p3,float p4,float p5){
       if (PatchProxy.isSupport(q$a.class)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, q$a.class, "5")) {
             return;
          }
       }
       a.p(p0, "e1");
       a.p(p1, "e2");
       b.Z(LiveLogTag.LIVE_GESTURE, "onHorizontalScroll");
       this.d.e(p0, p1, p2, p3, p4, p5);
       return;
    }
    public void b(MotionEvent p0,MotionEvent p1,float p2,float p3,float p4,float p5){
       q$a td1;
       WindowManager$LayoutParams attributes;
       Activity uActivity1;
       int i = 2;
       int i1 = 3;
       if (PatchProxy.isSupport(q$a.class)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, q$a.class, "4")) {
             return;
          }
       }
       a.p(p0, "e1");
       a.p(p1, "e2");
       b.Z(LiveLogTag.LIVE_GESTURE, "onVerticalScroll");
       q h = this.d.h;
       p2 = 0;
       Activity uActivity = (h != null)? h.get(): p2;
       if (g.h(uActivity)) {
          return;
       }else if(q.a(this.d).getParent() != null){
          q$a td = this.d;
          View view = q.a(td).inflate();
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoidOneRefs(view, td, q.class, "9")) {
             td.c = m1.f(view, 0x7f0a3b5f);
             td.d = m1.f(view, 0x7f0a3b5e);
             td.e = m1.f(view, 0x7f0a3b5d);
          }
          n.a(this.d.c);
       }
       int i2 = n0.f();
       if (p0.getX() - (float)(i2 / 3) < 0) {
          td1 = this.d;
          Objects.requireNonNull(td1);
          if (!PatchProxy.isSupport(q.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p3), td1, q.class, "11")) {
             h = td1.f;
             if (h != null) {
                try{
                   attributes = h.getAttributes();
                   a.o(attributes, "it.attributes");
                   View decorView = h.getDecorView();
                   a.o(decorView, "it.decorView");
                   p5 = attributes.screenBrightness + (p3 / (float)decorView.getHeight());
                   attributes.screenBrightness = p5;
                   p3 = q.t(p5, 0x3f800000);
                   attributes.screenBrightness = p3;
                   attributes.screenBrightness = q.m(p3, 0.01f);
                   h.setAttributes(attributes);
                   i2 = (int)(attributes.screenBrightness * (float)255);
                   if (!PatchProxy.isSupport(q.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), td1, q.class, "12")) {
                      q h1 = td1.h;
                      if (h1 != null) {
                         uActivity1 = h1.get();
                         if (uActivity1 != null) {
                            ContentResolver contentResol = uActivity1.getContentResolver();
                         label_0141 :
                            Settings$System.putInt(contentResol, "screen_brightness_mode", 0);
                            h1 = td1.h;
                            if (h1 != null) {
                               uActivity1 = h1.get();
                               if (uActivity1 != null) {
                                  contentResol = uActivity1.getContentResolver();
                               label_0158 :
                                  Uri uriFor = Settings$System.getUriFor("screen_brightness");
                                  Settings$System.putInt(contentResol, "screen_brightness", i2);
                                  if (contentResol) {
                                     contentResol.notifyChange(uriFor, p2);
                                  }
                               }
                            }
                            uActivity1 = p2;
                            goto label_0158 ;
                         }
                      }
                      uActivity1 = p2;
                      goto label_0141 ;
                   }
                }catch(java.lang.Exception e7){
                   b.I(LiveLogTag.LIVE_GESTURE, "设置当前系统的亮度值失败：", e7);
                }
                td1.j(R.drawable.arg_RES_7f0811ca, (int)((attributes.screenBrightness * (float)16) + 0x3f000000));
             }
          }
       }else if((float)((i2 * 2) / i1) - p0.getX() < 0){
          td1 = this.d;
          Objects.requireNonNull(td1);
          if (!PatchProxy.isSupport(q.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p3), td1, q.class, "13")) {
             i2 = td1.g.getStreamVolume(i1);
             int streamMaxVol = td1.g.getStreamMaxVolume(i1);
             c uoc = a.a();
             a.o(uoc, "AppEnv.get\(\)");
             ViewConfiguration viewConfigur = ViewConfiguration.get(uoc.a());
             a.o(viewConfigur, "ViewConfiguration.get\(AppEnv.get\(\).appContext\)");
             int i3 = viewConfigur.getScaledTouchSlop() / i;
             if (p3 - (float)i3 >= 0) {
                i2++;
             }else if(p3 - (float)(- i3) <= 0){
                i2--;
             }
             i2 = q.u(q.n(i2, 0), streamMaxVol);
             td1.g.setStreamVolume(i1, q.u(i2, streamMaxVol), 16);
             td1.j(R.drawable.arg_RES_7f0811cb, (int)((((float)i2 / (float)streamMaxVol) * (float)16) + 0x3f000000));
          }
       }
       return;
    }
    public boolean onDoubleTap(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       b.Z(LiveLogTag.LIVE_GESTURE, "onDoubleTap");
       return this.d.c(p0);
    }
    public boolean onDoubleTapEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       b.Z(LiveLogTag.LIVE_GESTURE, "onDoubleTapEvent");
       return this.d.d(p0);
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$a.class, "8")) {
          return;
       }
       a.p(p0, "e");
       b.Z(LiveLogTag.LIVE_GESTURE, "onLongPress");
       this.d.f(p0);
       return;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       boolean b;
       if (PatchProxy.isSupport(q$a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, q$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b.d0(LiveLogTag.LIVE_GESTURE, "onScroll", "distanceX", Float.valueOf(p2), "distanceY", Float.valueOf(p3));
       b = (this.d.g(p0, p1, p2, p3) || super.onScroll(p0, p1, p2, p3))? true: false;
       return b;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       b.Z(LiveLogTag.LIVE_GESTURE, "onSingleTapConfirmed");
       return this.d.h(p0);
    }
    public boolean onSingleTapUp(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       b.Z(LiveLogTag.LIVE_GESTURE, "onSingleTapUp");
       return this.d.i(p0);
    }
}
