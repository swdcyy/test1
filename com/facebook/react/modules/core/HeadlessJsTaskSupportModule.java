package com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.facebook.react.bridge.ReactContext;
import ee.c;
import cb.a;
import com.facebook.react.bridge.Promise;
import java.util.Map;
import ee.a;
import java.lang.StringBuilder;
import od.a;
import ee.f;
import com.facebook.react.bridge.WritableMap;
import ee.b;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.Boolean;

public class HeadlessJsTaskSupportModule extends ReactContextBaseJavaModule	// class@00128e
{

    public void HeadlessJsTaskSupportModule(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "HeadlessJsTaskSupport";
    }
    public void notifyTaskFinished(int p0){
       if (PatchProxy.isSupport(HeadlessJsTaskSupportModule.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HeadlessJsTaskSupportModule.class, "2")) {
          return;
       }
       c uoc = c.c(this.getReactApplicationContext());
       if (uoc.e(p0)) {
          uoc.b(p0);
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          a.v(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", objArray);
       }
       return;
    }
    public void notifyTaskRetry(int p0,Promise p1){
       HeadlessJsTaskSupportModule headlessJsTa = HeadlessJsTaskSupportModule.class;
       if (PatchProxy.isSupport(headlessJsTa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, headlessJsTa, "1")) {
          return;
       }
       c uoc = c.c(this.getReactApplicationContext());
       boolean b = false;
       if (uoc.e(p0)) {
          _monitor_enter(uoc);
          a uoa = uoc.f.get(Integer.valueOf(p0));
          boolean b1 = (uoa != null)? true: false;
          a.b(b1, "Tried to retrieve non-existent task config with id "+p0+".");
          a e = uoa.e;
          if (!e.a()) {
             _monitor_exit(uoc);
          }else {
             uoc.g(p0);
             a uoa1 = new a(uoa.b(), uoa.a(), uoa.c(), uoa.d(), e.c());
             UiThreadUtil.runOnUiThread(new b(uoc, b, p0), (long)e.getDelay());
             _monitor_exit(uoc);
             b = true;
          }
          p1.resolve(Boolean.valueOf(b));
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          a.v(headlessJsTa, "Tried to retry non-active task with id %d. Did it time out?", objArray);
          p1.resolve(Boolean.FALSE);
       }
       return;
    }
}
