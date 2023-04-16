package com.kwai.feature.api.router.social.myqrcode.model.MyQRCodeParam$a;
import java.lang.Object;
import com.kwai.feature.api.router.social.myqrcode.model.MyQRCodeParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;

public class MyQRCodeParam$a	// class@001078
{
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;

    public void MyQRCodeParam$a(){
       super();
    }
    public MyQRCodeParam a(){
       MyQRCodeParam obj = PatchProxy.apply(null, this, MyQRCodeParam$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MyQRCodeParam();
       obj.mFromTag = TextUtils.I(this.a);
       obj.mExtraInfo = TextUtils.I(this.b);
       obj.mActionBarTitle = TextUtils.I(this.c);
       obj.mCardDesc = TextUtils.I(this.d);
       obj.mHideScanBtn = this.e;
       return obj;
    }
    public MyQRCodeParam$a b(String p0){
       this.a = p0;
       return this;
    }
}
