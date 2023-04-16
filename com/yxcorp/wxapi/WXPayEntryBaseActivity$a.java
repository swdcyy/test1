package com.yxcorp.wxapi.WXPayEntryBaseActivity$a;
import erd.g;
import com.yxcorp.wxapi.WXPayEntryBaseActivity;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.WalletResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class WXPayEntryBaseActivity$a implements g	// class@0009fd
{
    public final WXPayEntryBaseActivity b;

    public void WXPayEntryBaseActivity$a(WXPayEntryBaseActivity p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WXPayEntryBaseActivity$a.class, "1")) {
       }else {
          this.b.onPayFinish(1);
       }
       return;
    }
}
