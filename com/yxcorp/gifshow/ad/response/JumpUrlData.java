package com.yxcorp.gifshow.ad.response.JumpUrlData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.JumpUrlData$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JumpUrlData implements Serializable	// class@0017dc
{
    public String redirectUrl;
    public static final JumpUrlData$a Companion;
    public static final long serialVersionUID;

    static {
       JumpUrlData.Companion = new JumpUrlData$a(null);
    }
    public void JumpUrlData(){
       super(null, 1, null);
    }
    public void JumpUrlData(String p0){
       a.p(p0, "redirectUrl");
       super();
       this.redirectUrl = p0;
    }
    public void JumpUrlData(String p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = "";
       }
       super(p0);
       return;
    }
    public static JumpUrlData copy$default(JumpUrlData p0,String p1,int p2,Object p3){
       JumpUrlData redirectUrl;
       if (p2 & 0x01) {
          redirectUrl = p0.redirectUrl;
       }
       return p0.copy(redirectUrl);
    }
    public final String component1(){
       return this.redirectUrl;
    }
    public final JumpUrlData copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JumpUrlData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "redirectUrl");
       return new JumpUrlData(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JumpUrlData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JumpUrlData && a.g(this.redirectUrl, p0.redirectUrl))) {
          return true;
       }
       return false;
    }
    public final String getRedirectUrl(){
       return this.redirectUrl;
    }
    public int hashCode(){
       JumpUrlData obj = PatchProxy.apply(null, this, JumpUrlData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.redirectUrl;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setRedirectUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JumpUrlData.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.redirectUrl = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JumpUrlData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JumpUrlData\(redirectUrl="+this.redirectUrl+"\)";
    }
}
