package com.kuaishou.commercial.p;
import android.content.DialogInterface$OnDismissListener;
import android.app.Activity;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.Window;
import cw.z;
import lnc.c3$a;
import lnc.c3;

public final class p implements DialogInterface$OnDismissListener	// class@001510
{
    public final Activity b;
    public final DialogInterface$OnDismissListener c;

    public void p(Activity p0,DialogInterface$OnDismissListener p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onDismiss(DialogInterface p0){
       this.b.getWindow().setSoftInputMode(0);
       c3.c(this.c, new z(p0));
    }
}
