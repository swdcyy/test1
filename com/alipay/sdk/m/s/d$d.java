package com.alipay.sdk.m.s.d$d;
import java.lang.Runnable;
import com.alipay.sdk.m.s.d;
import android.app.Activity;
import com.kuaishou.webkit.SslErrorHandler;
import java.lang.Object;
import com.alipay.sdk.m.s.d$d$a;
import android.app.AlertDialog$Builder;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog;
import android.app.Dialog;
import v6.b;
import android.content.DialogInterface$OnKeyListener;
import java.lang.String;
import u6.c;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class d$d implements Runnable	// class@000ea6
{
    public final Activity b;
    public final SslErrorHandler c;
    public final d d;

    public void d$d(d p0,Activity p1,SslErrorHandler p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       d$d$a uod$a = new d$d$a(this);
       AlertDialog$Builder uBuilder = new AlertDialog$Builder(this.b);
       boolean b = TextUtils.isEmpty(null);
       String str = "确定";
       if (!TextUtils.isEmpty(str)) {
          uBuilder.setNegativeButton(str, uod$a);
       }
       uBuilder.setTitle("安全警告");
       uBuilder.setMessage("安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。");
       AlertDialog uAlertDialog = uBuilder.create();
       uAlertDialog.setCanceledOnTouchOutside(false);
       uAlertDialog.setOnKeyListener(new b());
       uAlertDialog.show();
       return;
    }
}
