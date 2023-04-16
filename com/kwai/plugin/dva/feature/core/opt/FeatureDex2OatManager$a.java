package com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager$a;
import java.lang.String;
import java.io.File;
import java.lang.ClassLoader;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FeatureDex2OatManager$a	// class@00131d
{
    public final String a;
    public final String b;
    public final File c;
    public final String d;
    public final ClassLoader e;
    public final boolean f;

    public void FeatureDex2OatManager$a(String p0,String p1,File p2,String p3,ClassLoader p4,boolean p5){
       a.p(p0, "featureName");
       a.p(p1, "apkPath");
       a.p(p4, "parent");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final String a(){
       return this.b;
    }
    public final String b(){
       return this.a;
    }
    public final String c(){
       return this.d;
    }
    public final File d(){
       return this.c;
    }
    public final ClassLoader e(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureDex2OatManager$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof FeatureDex2OatManager$a) {
          return false;
       }
       if (!a.g(this.a, p0.a)) {
          return false;
       }
       if (!a.g(this.b, p0.b)) {
          return false;
       }
       if (!a.g(this.c, p0.c)) {
          return false;
       }
       if (!a.g(this.d, p0.d)) {
          return false;
       }
       if (!a.g(this.e, p0.e)) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       return true;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, FeatureDex2OatManager$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (((this.a).hashCode() * 31) + (this.b).hashCode()) * 31;
       FeatureDex2OatManager$a tc = this.c;
       int i1 = 0;
       int i2 = (tc == null)? 0: tc.hashCode();
       i = (i + i2) * 31;
       tc = this.d;
       if (tc != null) {
          i1 = tc.hashCode();
       }
       i = (((i + i1) * 31) + this.e.hashCode()) * 31;
       tc = this.f;
       if (tc != null) {
          i2 = 1;
       }
       return (i + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeatureDex2OatManager$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OptNode\(featureName="+this.a+", apkPath="+this.b+", optDir="+this.c+", libSearchPath="+this.d+", parent="+this.e+", canRetry="+this.f+')';
    }
}
