package com.kwai.feature.api.qrcode.model.ScanParam$a;
import java.lang.Object;
import com.kwai.feature.api.qrcode.model.ScanParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;

public class ScanParam$a	// class@001076
{
    public String a;
    public String b;
    public boolean c;
    public List d;
    public boolean e;

    public void ScanParam$a(){
       super();
    }
    public ScanParam a(){
       ScanParam obj = PatchProxy.apply(null, this, ScanParam$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ScanParam();
       obj.mScanPageSource = TextUtils.I(this.a);
       obj.mActivityType = TextUtils.I(this.b);
       obj.mIsNeedCallBack = this.c;
       obj.mIsForceCloseScanPage = this.e;
       obj.mTargetHandlerActionList = this.d;
       return obj;
    }
    public ScanParam$a b(String p0){
       this.a = p0;
       return this;
    }
}
