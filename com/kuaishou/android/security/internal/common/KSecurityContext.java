package com.kuaishou.android.security.internal.common.KSecurityContext;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.internal.init.SecDidProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import com.kuaishou.android.security.internal.common.KSecurityContext$Feature;
import java.lang.StringBuilder;
import java.util.UUID;

public class KSecurityContext	// class@0006c9
{
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public KSecurityContext$Feature l;
    public SecDidProxy m;
    public static String n;
    public static Map o;

    public void KSecurityContext(){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.d = "";
       this.e = false;
       this.f = false;
       this.g = "";
       this.j = "";
       this.k = "";
    }
    public String getDid(){
       return this.i;
    }
    public String getEgid(){
       return this.g;
    }
    public Map getKeyconfigMap(){
       return KSecurityContext.o;
    }
    public String getKgSessionId(){
       return this.a;
    }
    public String getLoadSoStatus(){
       return this.b;
    }
    public String getNewDid(){
       String obj = PatchProxy.apply(null, this, KSecurityContext.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       KSecurityContext tm = this.m;
       if (tm != null) {
          obj = tm.getNewDid();
       }
       if (TextUtils.isEmpty(obj)) {
          return this.getDid();
       }else {
          return obj;
       }
    }
    public String getPrepareSoStatus(){
       return this.c;
    }
    public String getProductName(){
       return this.h;
    }
    public String getRdid(){
       return this.j;
    }
    public String getRdidtag(){
       return this.k;
    }
    public String getRetrySessionId(){
       return this.d;
    }
    public SecDidProxy getSecDidProxy(){
       return this.m;
    }
    public KSecurityContext$Feature getWithFeature(){
       return this.l;
    }
    public boolean isHasRetryInit(){
       return this.e;
    }
    public boolean isbSbeoLoad(){
       return this.f;
    }
    public void setDid(String p0){
       this.i = p0;
       KSecurityContext.n = p0;
    }
    public void setEgid(String p0){
       this.g = p0;
    }
    public void setHasRetryInit(boolean p0){
       this.e = p0;
    }
    public void setKeyconfigMap(Map p0){
       KSecurityContext.o = p0;
    }
    public void setKgSessionId(String p0){
       this.a = p0;
    }
    public void setLoadSoStatus(String p0){
       this.b = p0;
    }
    public void setPrepareSoStatus(String p0){
       this.c = p0;
    }
    public void setProductName(String p0){
       this.h = p0;
    }
    public void setRdid(String p0){
       this.j = p0;
    }
    public void setRdidtag(String p0){
       this.k = p0;
    }
    public void setRetrySessionId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSecurityContext.class, "1")) {
          return;
       }
       this.d = this.a+"+"+UUID.randomUUID().toString();
       return;
    }
    public void setSecDidProxy(SecDidProxy p0){
       this.m = p0;
    }
    public void setWithFeature(KSecurityContext$Feature p0){
       this.l = p0;
    }
    public void setbSbeoLoad(boolean p0){
       this.f = p0;
    }
}
