package com.unionpay.f;
import android.view.View$OnClickListener;
import com.unionpay.UPPayWapActivity;
import java.lang.Object;
import android.view.View;
import android.app.AlertDialog$Builder;
import android.content.Context;
import android.app.AlertDialog;
import com.unionpay.utils.k;
import java.lang.CharSequence;
import com.unionpay.g;
import android.content.DialogInterface$OnClickListener;
import com.unionpay.h;

public final class f implements View$OnClickListener	// class@000ff8
{
    public final UPPayWapActivity a;

    public void f(UPPayWapActivity p0){
       this.a = p0;
       super();
    }
    public final void onClick(View p0){
       AlertDialog$Builder uBuilder = new AlertDialog$Builder(this.a);
       UPPayWapActivity.a(this.a, uBuilder.create());
       uBuilder.setMessage(k.a().a);
       uBuilder.setTitle(k.a().d);
       uBuilder.setPositiveButton(k.a().b, new g(this));
       uBuilder.setNegativeButton(k.a().c, new h(this));
       uBuilder.create().show();
    }
}
