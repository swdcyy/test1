package com.yxcorp.wxapi.WXPayEntryBaseActivity$b;
import erd.g;
import com.yxcorp.wxapi.WXPayEntryBaseActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class WXPayEntryBaseActivity$b implements g	// class@0009fe
{
    public final WXPayEntryBaseActivity b;

    public void WXPayEntryBaseActivity$b(WXPayEntryBaseActivity p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WXPayEntryBaseActivity$b.class, "1")) {
       }else {
          this.b.onPayFinish(2);
       }
       return;
    }
}
