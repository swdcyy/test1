package com.kuaishou.krn.model.LaunchModel$b;
import java.lang.Object;
import android.os.Bundle;
import com.kuaishou.krn.instance.JsFramework;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Long;
import java.io.Serializable;
import lk0.c;
import com.google.gson.Gson;
import fi0.a;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.IllegalStateException;

public class LaunchModel$b	// class@000902
{
    public String a;
    public String b;
    public String c;
    public Bundle d;
    public boolean e;
    public JsFramework f;

    public void LaunchModel$b(){
       super();
       this.d = new Bundle();
       this.e = true;
       this.f = JsFramework.REACT;
    }
    public LaunchModel$b a(String p0,float p1){
       LaunchModel$b uob = LaunchModel$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uob, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.d.putFloat(p0, p1);
       return this;
    }
    public LaunchModel$b b(String p0,int p1){
       LaunchModel$b uob = LaunchModel$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.d.putInt(p0, p1);
       return this;
    }
    public LaunchModel$b c(String p0,long p1){
       LaunchModel$b uob = LaunchModel$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uob, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.d.putLong(p0, p1);
       return this;
    }
    public LaunchModel$b d(String p0,Serializable p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LaunchModel$b obj = PatchProxy.applyTwoRefs(p0, p1, this, LaunchModel$b.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.d;
       Bundle uBundle = PatchProxy.applyOneRefs(p1, null, c.class, "1");
       if (uBundle != patchProxyRe) {
       }else {
          uBundle = c.b(a.a().x(p1));
       }
       obj.putBundle(p0, uBundle);
       return this;
    }
    public LaunchModel$b e(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LaunchModel$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d.putString(p0, p1);
       return this;
    }
    public LaunchModel$b f(String p0,boolean p1){
       LaunchModel$b uob = LaunchModel$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.d.putBoolean(p0, p1);
       return this;
    }
    public LaunchModel$b g(boolean p0){
       this.e = p0;
       return this;
    }
    public LaunchModel h(){
       LaunchModel$b uob = LaunchModel$b.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uob, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "17")) {
          if (this.a != null) {
             if (this.b == null) {
                throw new IllegalStateException("Cannot loadApp because componentName is null!");
             }
          }else {
             throw new IllegalStateException("Cannot loadApp because bundleId is null!");
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "18")) {
          this.d.putString("bundleId", this.a);
          this.d.putString("componentName", this.b);
          this.d.putString("title", this.c);
       }
       return new LaunchModel(this);
    }
    public LaunchModel$b i(String p0){
       this.a = p0;
       return this;
    }
    public LaunchModel$b j(String p0){
       this.b = p0;
       return this;
    }
    public LaunchModel$b k(boolean p0){
       LaunchModel$b uob = LaunchModel$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.f("forceShareEngine", p0);
       return this;
    }
    public LaunchModel$b l(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.e("minBundleVersion", p0);
       return this;
    }
    public LaunchModel$b m(String p0){
       this.c = p0;
       return this;
    }
}
