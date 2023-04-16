package com.unionpay.h;
import android.content.DialogInterface$OnClickListener;
import com.unionpay.f;
import java.lang.Object;
import android.content.DialogInterface;
import com.unionpay.UPPayWapActivity;
import android.app.AlertDialog;

public final class h implements DialogInterface$OnClickListener	// class@000ffa
{
    public final f a;

    public void h(f p0){
       this.a = p0;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       UPPayWapActivity.a(this.a.a).dismiss();
    }
}
