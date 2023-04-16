package com.kwai.yoda.kernel.cookie.CookieModel;
import com.kwai.yoda.kernel.cookie.CookieModel$a;
import nsd.u;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.String;
import java.util.TimeZone;
import com.kwai.yoda.kernel.cookie.CookieModel$Companion$NOT_EXPIRED_TIME$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.yoda.kernel.cookie.CookieModel$Companion$ALREADY_EXPIRED_TIME$2;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import java.util.Objects;
import zsd.u;
import kotlin.TypeCastException;
import java.net.URLEncoder;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.lang.Number;

public final class CookieModel	// class@001296
{
    public String a;
    public String b;
    public int c;
    public boolean d;
    public boolean e;
    public String f;
    public static final SimpleDateFormat g;
    public static final p h;
    public static final p i;
    public static final CookieModel$a j;

    static {
       CookieModel.j = new CookieModel$a(null);
       SimpleDateFormat simpleDateFo = new SimpleDateFormat("d MMM yyyy HH:mm:ss \'GMT\'", Locale.US);
       simpleDateFo.setTimeZone(TimeZone.getTimeZone("GMT"));
       CookieModel.g = simpleDateFo;
       CookieModel.h = s.c(CookieModel$Companion$NOT_EXPIRED_TIME$2.INSTANCE);
       CookieModel.i = s.c(CookieModel$Companion$ALREADY_EXPIRED_TIME$2.INSTANCE);
    }
    public void CookieModel(){
       super();
       this.a = "";
       this.b = "";
       this.f = "";
    }
    public void CookieModel(String p0,String p1,boolean p2,boolean p3){
       a.q(p0, "key");
       a.q(p1, "value");
       super();
       this.a = "";
       this.b = "";
       this.f = "";
       this.a = p0;
       if (PatchProxy.applyVoidOneRefs(p1, this, CookieModel.class, "2")) {
       }else {
          a.q(p1, "value");
          this.b = p1;
          this.c = p1.hashCode();
       }
       this.d = p2;
       this.e = p3;
       return;
    }
    public final String a(String p0){
       CookieModel tf;
       CookieModel$a j;
       CookieModel$a uoa = CookieModel$a.class;
       CookieModel uCookieModel = CookieModel.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, uCookieModel, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.q(p0, "host");
       int i = 1;
       obj = (this.f.length() > 0)? 1: null;
       if (obj) {
          tf = this.f;
       }else if(this.e != null){
          j = CookieModel.j;
          Objects.requireNonNull(j);
          tf = PatchProxy.apply(null, j, uoa, "2");
          if (tf == patchProxyRe) {
             tf = CookieModel.i.getValue();
          }
       }else {
          j = CookieModel.j;
          Objects.requireNonNull(j);
          tf = PatchProxy.apply(null, j, uoa, "1");
          if (tf == patchProxyRe) {
             tf = CookieModel.h.getValue();
          }
       }
       String str = PatchProxy.applyOneRefs(p0, this, uCookieModel, "5");
       if (str != patchProxyRe) {
       }else if(u.q2(p0, "www.", false, 2, null)){
          int i1 = 3;
          if (p0 != null) {
             p0 = p0.substring(i1);
             a.h(p0, "\(this as java.lang.String\).substring\(startIndex\)");
          }else {
             throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
          }
       }
       str = p0;
       if (str.length()) {
          i = 0;
       }
       if (i) {
          return "";
       }else {
          p0 = URLEncoder.encode(this.a, "UTF-8")+'='+URLEncoder.encode(this.b, "UTF-8")+"; Domain="+str+"; Path=/; expires="+tf;
          if (this.d != null) {
             p0 = p0+";HttpOnly";
          }
          return p0;
       }
    }
    public final String b(){
       return this.a;
    }
    public final String c(){
       return this.b;
    }
    public boolean equals(Object p0){
       CookieModel uCookieModel = CookieModel.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uCookieModel, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       Class class = (p0 != null)? p0.getClass(): null;
       if (a.g(uCookieModel, class) ^ true) {
          return false;
       }else if(p0 != null){
          if (a.g(this.a, p0.a) ^ true) {
             return false;
          }else if(a.g(this.b, p0.b) ^ true){
             return false;
          }else if(this.d != p0.d){
             return false;
          }else if(this.e != p0.e){
             return false;
          }else {
             return true;
          }
       }else {
          throw new TypeCastException("null cannot be cast to non-null type com.kwai.yoda.kernel.cookie.CookieModel");
       }
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, CookieModel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (((this.a).hashCode() * 31) + (this.b).hashCode()) * 31;
       int i1 = 1231;
       int i2 = (this.d != null)? 1231: 1237;
       i = (i + i2) * 31;
       if (this.e == null) {
          i1 = 1237;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CookieModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "cookie: ["+this.a("/")+']';
    }
}
