package com.unionpay.c;
import android.view.View$OnClickListener;
import com.unionpay.UPPayWapActivity;
import java.lang.Object;
import android.view.View;
import android.app.Activity;

public final class c implements View$OnClickListener	// class@000ff5
{
    public final UPPayWapActivity a;

    public void c(UPPayWapActivity p0){
       this.a = p0;
       super();
    }
    public final void onClick(View p0){
       this.a.finish();
    }
}
