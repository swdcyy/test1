package com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication$1;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import rv8.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gateway.pay.params.webview.JsEventParameter;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;
import lv8.u;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import ukd.a;
import com.yxcorp.gateway.pay.params.webview.JsEmitParameter;
import rv8.e;
import io.reactivex.subjects.PublishSubject;

public class JsNativeEventCommunication implements LifecycleObserver	// class@001278
{
    public final List b;
    public final List c;
    public final BaseActivity d;
    public final WebView e;
    public boolean f;
    public boolean g;
    public final LifecycleObserver h;

    public void JsNativeEventCommunication(BaseActivity p0,WebView p1){
       super();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.g = true;
       JsNativeEventCommunication$1 u1 = new JsNativeEventCommunication$1(this);
       this.h = u1;
       this.d = p0;
       p0.getLifecycle().addObserver(this);
       this.e = p1;
       ProcessLifecycleOwner.get().getLifecycle().addObserver(u1);
       c uoc = c.a();
       _monitor_enter(uoc);
       if (!PatchProxy.applyVoidOneRefs(this, uoc, c.class, "1") && !uoc.a.contains(this)) {
          uoc.a.add(this);
       }
       _monitor_exit(uoc);
       return;
    }
    public void a(JsEventParameter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JsNativeEventCommunication.class, "12")) {
          return;
       }
       if (this.b.indexOf(p0) == -1) {
          this.b.add(p0);
       }
       return;
    }
    public final void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JsNativeEventCommunication.class, "18")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          JsEventParameter jsEventParam = iterator.next();
          if (p0.equals(jsEventParam.mType)) {
             u.d(this.e, jsEventParam.mHandler, p1);
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, JsNativeEventCommunication.class, "11")) {
          return;
       }
       this.b.clear();
       return;
    }
    public boolean d(boolean p0){
       Boolean obj;
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       if (PatchProxy.isSupport(jsNativeEven)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, jsNativeEven, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = 0;
       try{
          Object[] objArray = new Object[0];
          obj = a.a(this.d, "isTopOfTask", objArray);
       }catch(java.lang.Exception e0){
       }
       if (e0 != null) {
          p0 = e0.booleanValue();
       }
       return p0;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, JsNativeEventCommunication.class, "10")) {
          return;
       }
       this.b("native_loadPage", null);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, JsNativeEventCommunication.class, "5")) {
          return;
       }
       this.b("native_pageFinished", null);
       return;
    }
    public boolean g(JsEventParameter p0){
       Iterator iterator;
       JsNativeEventCommunication obj = PatchProxy.applyOneRefs(p0, this, JsNativeEventCommunication.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       boolean b = true;
       if (TextUtils.isEmpty(p0.mType) && TextUtils.isEmpty(p0.mHandler)) {
          this.c();
       }else if(!TextUtils.isEmpty(p0.mType) && !TextUtils.isEmpty(p0.mHandler)){
          b = this.b.remove(p0);
       }else if(!TextUtils.isEmpty(p0.mHandler)){
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             if ((iterator.next().mHandler).equals(p0.mHandler)) {
                iterator.remove();
                obj = 1;
             }
          }
       }else {
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             if ((iterator.next().mType).equals(p0.mType)) {
                iterator.remove();
                obj = 1;
             }
          }
       }
       b = obj;
       return b;
    }
    public void onDestroy(){
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, jsNativeEven, "1")) {
          return;
       }
       this.c();
       if (!PatchProxy.applyVoid(objArray, this, jsNativeEven, "14")) {
          this.c.clear();
       }
       ProcessLifecycleOwner.get().getLifecycle().removeObserver(this.h);
       c uoc = c.a();
       _monitor_enter(uoc);
       if (!PatchProxy.applyVoidOneRefs(this, uoc, c.class, "2")) {
          uoc.a.remove(this);
       }
       _monitor_exit(uoc);
       return;
    }
    public void onEvent(JsEmitParameter p0){
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, jsNativeEven, "4")) {
          return;
       }
       this.b(p0.mType, p0.mData);
       JsEmitParameter mType = p0.mType;
       p0 = p0.mData;
       if (!PatchProxy.applyVoidTwoRefs(mType, p0, this, jsNativeEven, "19") && !TextUtils.isEmpty(mType)) {
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             if (mType.equals(uoe.a)) {
                uoe.b.onNext(p0);
             }
          }
       }
       return;
    }
    public void onPause(){
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       if (PatchProxy.applyVoid(null, this, jsNativeEven, "2")) {
          return;
       }
       if (!this.d(false) && !PatchProxy.applyVoid(null, this, jsNativeEven, "8")) {
          this.b("native_leave", null);
       }
       return;
    }
    public void onResume(){
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       if (PatchProxy.applyVoid(null, this, jsNativeEven, "3")) {
          return;
       }
       if (this.f != null && !PatchProxy.applyVoid(null, this, jsNativeEven, "9")) {
          this.b("native_reentry", null);
       }
       this.f = true;
       return;
    }
}
