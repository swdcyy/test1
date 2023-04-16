package com.yxcorp.login.model.AccountRiskParams;
import java.io.Serializable;
import com.yxcorp.login.model.AccountRiskParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;

public final class AccountRiskParams implements Serializable	// class@001af2
{
    public String platform;
    public int type;
    public String ztToken;
    public String ztType;
    public static final AccountRiskParams$a Companion;

    static {
       AccountRiskParams.Companion = new AccountRiskParams$a(null);
    }
    public void AccountRiskParams(){
       super(0, 1, null);
    }
    public void AccountRiskParams(int p0){
       super();
       this.type = p0;
       this.platform = "";
       this.ztType = "";
       this.ztToken = "";
    }
    public void AccountRiskParams(int p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = -1;
       }
       super(p0);
       return;
    }
    public final String getPlatform(){
       return this.platform;
    }
    public final int getType(){
       return this.type;
    }
    public final String getZtToken(){
       return this.ztToken;
    }
    public final String getZtType(){
       return this.ztType;
    }
    public final boolean isDoubleCheck(){
       AccountRiskParams obj = PatchProxy.apply(null, this, AccountRiskParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       obj = (this.ztType.length() > 0)? 1: null;
       if (!obj) {
          obj = (this.ztToken.length() > 0)? 1: 0;
          if (!obj) {
             b = false;
          }
       }
       return b;
    }
    public final void setPlatform(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccountRiskParams.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.platform = p0;
       return;
    }
    public final void setType(int p0){
       this.type = p0;
    }
    public final void setZtToken(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccountRiskParams.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.ztToken = p0;
       return;
    }
    public final void setZtType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccountRiskParams.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.ztType = p0;
       return;
    }
}
