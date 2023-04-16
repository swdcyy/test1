package com.alipay.sdk.app.PayResultActivity$a;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;

public final class PayResultActivity$a implements Runnable	// class@000e91
{
    public final Activity b;

    public void PayResultActivity$a(Activity p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.finish();
    }
}
