package com.kwai.wake.pojo.ActiveInfo;
import java.io.Serializable;
import com.kwai.wake.pojo.ActiveInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import kotlin.jvm.internal.a;
import java.lang.String;
import zsd.u;
import kotlin.Result;
import com.kwai.middleware.azeroth.Azeroth2;
import com.google.gson.Gson;
import java.lang.Throwable;
import qrd.j0;

public final class ActiveInfo implements Serializable	// class@001118
{
    public String did;
    public String oaid;
    public String pkg;
    public String versionCode;
    public String versionName;
    public static final ActiveInfo$a Companion;
    public static final long serialVersionUID;

    static {
       ActiveInfo.Companion = new ActiveInfo$a(null);
    }
    public void ActiveInfo(){
       super();
       this.pkg = "";
       this.did = "";
       this.oaid = "";
       this.versionCode = "";
       this.versionName = "";
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 != null) {
          if (this == p0) {
          label_0059 :
             return b;
          }else if(!(a.g(p0.getClass(), ActiveInfo.class) ^ b) && p0 instanceof ActiveInfo){
             ActiveInfo tpkg = this.pkg;
             if (tpkg != null && b == u.I1(tpkg, p0.pkg, false)) {
                tpkg = this.did;
                if (tpkg != null && b == u.I1(tpkg, p0.did, false)) {
                   tpkg = this.oaid;
                   if (tpkg != null && b == u.I1(tpkg, p0.oaid, false)) {
                      tpkg = this.versionCode;
                      if (tpkg != null && b == u.I1(tpkg, p0.versionCode, false)) {
                         tpkg = this.versionName;
                         if (tpkg != null && b == u.I1(tpkg, p0.versionName, false)) {
                            goto label_0059 ;
                         }
                      }
                   }
                }
             }
          }
       }
       b = false;
       goto label_0059 ;
    }
    public int hashCode(){
       int i1;
       int i2;
       ActiveInfo tpkg = this.pkg;
       int i = 0;
       if (tpkg != null) {
          i1 = (tpkg != null)? tpkg.hashCode(): 0;
          i1 = i1 + i;
       }else {
          i1 = 0;
       }
       ActiveInfo tdid = this.did;
       if (tdid != null) {
          i2 = (tdid != null)? tdid.hashCode(): 0;
          i1 = i1 + i2;
       }
       tdid = this.oaid;
       if (tdid != null) {
          i2 = (tdid != null)? tdid.hashCode(): 0;
          i1 = i1 + i2;
       }
       tdid = this.versionCode;
       if (tdid != null) {
          i2 = (tdid != null)? tdid.hashCode(): 0;
          i1 = i1 + i2;
       }
       tdid = this.versionName;
       if (tdid != null) {
          if (tdid != null) {
             i = tdid.hashCode();
          }
          i1 = i1 + i;
       }
       return i1;
    }
    public String toString(){
       String str = Result.constructor-impl(Azeroth2.B.k().q(this));
       if (Result.exceptionOrNull-impl(str) != null) {
          str = "";
       }
       return str;
    }
}
