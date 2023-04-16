package com.kwai.yoda.model.LaunchModel$a;
import com.kwai.yoda.model.LaunchModelInternal$a;
import java.lang.String;
import com.kwai.yoda.model.LaunchModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import az7.a;

public class LaunchModel$a extends LaunchModelInternal$a	// class@0012be
{
    public String A;
    public long B;
    public int C;
    public int D;
    public int E;
    public String F;
    public Boolean G;
    public Boolean H;
    public Boolean I;
    public Boolean J;
    public String K;
    public String a;
    public String b;
    public List c;
    public String d;
    public Map e;
    public String f;
    public Map g;
    public Map h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public Boolean y;
    public String z;

    public void LaunchModel$a(String p0){
       super();
       this.a = p0;
    }
    public LaunchModel a(){
       Object obj = PatchProxy.apply(null, this, LaunchModel$a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LaunchModel(this);
    }
    public LaunchModel$a b(boolean p0){
       LaunchModel$a uoa = LaunchModel$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.J = Boolean.valueOf(p0);
       return this;
    }
    public LaunchModel$a c(String p0){
       this.b = p0;
       return this;
    }
    public LaunchModel$a d(Map p0){
       this.e = p0;
       return this;
    }
    public LaunchModel$a e(boolean p0){
       LaunchModel$a uoa = LaunchModel$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.G = Boolean.valueOf(p0);
       return this;
    }
    public LaunchModel$a f(boolean p0){
       LaunchModel$a uoa = LaunchModel$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.y = Boolean.valueOf(p0);
       return this;
    }
    public LaunchModel$a g(boolean p0){
       LaunchModel$a uoa = LaunchModel$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.H = Boolean.valueOf(p0);
       return this;
    }
    public LaunchModel$a h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.o = p0;
       }
       return this;
    }
    public LaunchModel$a i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.n = p0;
       }
       return this;
    }
    public LaunchModel$a j(int p0){
       LaunchModel$a uoa = LaunchModel$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.s = a.b(p0);
       return this;
    }
    public LaunchModel$a k(int p0){
       LaunchModel$a uoa = LaunchModel$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.t = a.b(p0);
       return this;
    }
    public LaunchModel$a l(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.l = p0;
       }
       return this;
    }
    public LaunchModel$a m(int p0){
       LaunchModel$a uoa = LaunchModel$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v = a.b(p0);
       return this;
    }
}
