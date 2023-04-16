package com.kuaishou.android.security.internal.plugin.l;
import com.kuaishou.android.security.internal.plugin.g;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.android.security.internal.plugin.e;
import java.lang.String;
import com.kuaishou.android.security.internal.plugin.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.internal.plugin.l$a;
import android.content.Context;
import com.kuaishou.android.security.internal.plugin.j;
import com.kuaishou.android.security.internal.plugin.m;
import dalvik.system.DexClassLoader;
import android.content.pm.PackageInfo;
import com.kuaishou.android.security.internal.init.d;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.exception.KSException;
import com.kuaishou.android.security.base.perf.l;
import com.kuaishou.android.security.base.perf.b;
import com.kuaishou.android.security.internal.plugin.h;
import java.lang.annotation.Annotation;
import java.io.File;
import com.kuaishou.android.security.base.util.e;

public class l implements g	// class@0006fe
{
    public Context a;
    public final ConcurrentHashMap b;
    public ConcurrentHashMap c;
    public e d;

    public void l(){
       super();
       this.b = new ConcurrentHashMap();
       this.c = new ConcurrentHashMap();
       this.d = null;
    }
    public e a(){
       return this.d;
    }
    public f a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(p0);
    }
    public final j a(String p0,l$a p1,Context p2){
       String this;
       j oj1;
       Object[] objArray;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, l.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       String str = null;
       try{
          m om = new m();
          String str1 = "";
          DexClassLoader uDexClassLoa = null;
          PackageInfo packageInfo = null;
          j oj = v9;
          g og = this;
          this = p0;
          m om1 = om;
          try{
             oj = new j(str1, og, this, uDexClassLoa, packageInfo, om1);
             if (p0.equalsIgnoreCase(this.b())) {
                KSecurityTrack.sLog(25);
                objArray = new Object[]{Integer.valueOf(0),"",""};
                this.d = om.a(p2, null, v9, "kwsgmain", objArray);
             }else {
                KSecurityTrack.sLog(24);
                objArray = new Object[0];
                om.a(p2, this.d, v9, "kwsg", objArray);
             }
          }catch(com.kuaishou.android.security.base.exception.KSException e0){
             int i = v9;
             KSecurityTrack.sLog(23);
             oj1 = str;
          }
          return oj1;
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
       }
    }
    public Object a(Class p0){
       String obj = PatchProxy.applyOneRefs(p0, this, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.get(p0);
       if (obj != null) {
          return p0.cast(obj);
       }
       obj = this.b(p0);
       if (obj == null || !obj.length()) {
          throw new KSException("\(str == null\) || \(str.length\(\) == 0\)", 150);
       }
       f uof = this.b(obj);
       if (uof == null) {
          throw new KSException("localISGPluginInfo == null", 110);
       }
       Object obj1 = uof.e().a(p0);
       if (obj1 != null) {
          this.c.put(p0, obj1);
          return p0.cast(obj1);
       }else {
          this.a(0x186cd, 112, "", p0.getName(), obj+"\("+uof.getVersion()+"\)", this.c(uof.b()), "");
          throw new KSException("localISGPluginInfo.getSGPluginEntry\(\).getInterface\(paramClass\)", 112);
       }
    }
    public final void a(int p0,int p1,String p2,String p3,String p4,String p5,String p6){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, ol, "1")) {
             return;
          }
       }else {
          int i = this;
       }
       l.a(p0, p1, 0, "", 0, p2, p3, p4, p5, p6);
       return;
    }
    public void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "5")) {
          return;
       }
       if (p0.getApplicationContext() != null) {
          p0 = p0.getApplicationContext();
       }
       this.a = p0;
       return;
    }
    public synchronized f b(String p0){
       j obj = PatchProxy.applyOneRefs(p0, this, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.get(p0);
       if (obj != null) {
          return obj;
       }
       KSecurityTrack.sLog(b.L);
       l$a uoa = null;
       obj = this.a(p0, uoa, this.a);
       if (obj != null) {
          KSecurityTrack.sLog(22);
          this.b.put(p0, obj);
          return obj;
       }else {
          KSecurityTrack.sLog(21);
          return uoa;
       }
    }
    public String b(){
       return "main";
    }
    public final String b(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       h annotation = p0.getAnnotation(h.class);
       if (annotation == null) {
          return null;
       }
       return annotation.pluginName();
    }
    public final String c(String p0){
       File obj = PatchProxy.applyOneRefs(p0, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.length() > 0) {
          try{
             obj = new File(p0);
             StringBuilder str = p0;
             if (e.e(obj)) {
                p0 = "->";
                str+p0;
                str = str+obj.getCanonicalPath();
             }
             p0 = str+'['+"exists:"+e0.exists()+","+"size:"+e0.length()+","+"canRead:"+e0.canRead()+","+"canWrite:"+e0.canWrite()+","+"totalSpace:"+e0.getTotalSpace()+","+"freeSpace:"+e0.getFreeSpace()+","+']';
          }catch(java.lang.Exception e0){
          }
       }else {
          p0 = "";
       }
    }
}
