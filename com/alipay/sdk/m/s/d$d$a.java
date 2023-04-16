package com.alipay.sdk.m.s.d$d$a;
import android.content.DialogInterface$OnClickListener;
import com.alipay.sdk.m.s.d$d;
import java.lang.Object;
import android.content.DialogInterface;
import com.kuaishou.webkit.SslErrorHandler;
import com.alipay.sdk.m.s.d;
import s6.a;
import java.lang.String;
import k6.a;
import j6.b;
import android.app.Activity;

public class d$d$a implements DialogInterface$OnClickListener	// class@000ea5
{
    public final d$d b;

    public void d$d$a(d$d p0){
       this.b = p0;
       super();
    }
    public void onClick(DialogInterface p0,int p1){
       this.b.c.cancel();
       a.h(this.b.d.g, "net", "SSLDenied", "2");
       b.c(b.a());
       this.b.b.finish();
    }
}
