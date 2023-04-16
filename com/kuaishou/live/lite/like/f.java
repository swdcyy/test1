package com.kuaishou.live.lite.like.f;
import com.kuaishou.live.lite.sidebar.e$a;
import com.kuaishou.live.lite.like.c;
import ga1.d;
import ok.o;
import wb3.c;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import java.lang.Object;
import wb3.e;
import wb3.f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import fd3.l;
import com.google.gson.JsonObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.like.f$a;
import android.view.View;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.Collections;
import java.util.Arrays;
import com.kuaishou.live.lite.sidebar.e$b;
import fd3.m;
import android.content.Context;
import java.lang.Boolean;
import android.view.ViewGroup;
import wb3.g;
import ec3.f;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler;
import msd.a;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler$a;

public class f implements e$a	// class@0009f4
{
    public final c a;
    public final d b;
    public final o c;
    public final c d;
    public final LiveActionTrigger e;
    public f$a f;
    public LiveLiteViewRecycler$a g;

    public void f(c p0,d p1,o p2,c p3,Lifecycle p4,LiveActionTrigger p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       p0.i.observe(new e(p4), new f(this));
       this.e = p5;
    }
    public void a(){
       l.c(this);
    }
    public JsonObject b(){
       return l.a(this);
    }
    public boolean c(){
       return l.e(this);
    }
    public JsonObject d(){
       return l.b(this);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       f tf = this.f;
       if (tf != null) {
          tf.b();
          this.f = null;
       }
       return;
    }
    public View f(){
       f tf = this.f;
       if (tf == null) {
          return null;
       }
       return tf.e;
    }
    public List g(){
       f obj = PatchProxy.apply(null, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          return Collections.emptyList();
       }
       View[] viewArray = new View[]{obj.c,obj.b,obj.d};
       return Arrays.asList(viewArray);
    }
    public String getLogName(){
       return "LIKE";
    }
    public void h(){
       m.c(this);
    }
    public void i(){
       m.d(this);
    }
    public int j(){
       return 2;
    }
    public View k(Context p0,JsonObject p1,boolean p2){
       f obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, f.class, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "5");
       if (obj != patchProxyRe) {
       }else if(this.f == null){
          View view = PatchProxy.applyOneRefs(p0, this, f.class, "6");
          if (view != patchProxyRe) {
          }else {
             g og = new g(p0);
             if (f.h() && f.e()) {
                LiveLiteViewRecycler$a uoa = LiveLiteViewRecycler.d.a("SIDEBAR_LIKE", og);
                this.g = uoa;
                view = uoa.getView();
             }else {
                view = og.invoke();
             }
          }
          this.f = new f$a(this, view, p1);
       }
       obj = this.f;
       return obj.a;
    }
}
