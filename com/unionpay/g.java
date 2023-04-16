package com.unionpay.g;
import android.content.DialogInterface$OnClickListener;
import com.unionpay.f;
import java.lang.Object;
import android.content.DialogInterface;
import com.unionpay.UPPayWapActivity;
import java.lang.String;

public final class g implements DialogInterface$OnClickListener	// class@000ff9
{
    public final f a;

    public void g(f p0){
       this.a = p0;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       UPPayWapActivity.a(this.a.a, "cancel", null);
    }
}
