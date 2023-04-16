package com.yxcorp.gifshow.util.n0;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.StringBuilder;
import qrd.i;
import java.lang.CharSequence;
import android.app.AlertDialog$Builder;
import android.content.Context;
import lnc.q6;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import com.yxcorp.gifshow.util.ExceptionHorizontalScrollView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import qrd.l1;
import android.widget.Button;
import android.app.AlertDialog;
import lnc.k7;
import android.view.View$OnClickListener;
import lnc.j7;

public final class n0 implements Runnable	// class@001f8f
{
    public final String b;
    public final String c;
    public final Throwable d;

    public void n0(String p0,String p1,Throwable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       String str;
       n0 on0 = this;
       n0 b = on0.b;
       n0 c = on0.c;
       n0 d = on0.d;
       Activity uActivity = ActivityContext.g().e();
       if (uActivity == null) {
       }else if(QCurrentUser.me() == null){
          str = "unknown";
       }else {
          str = QCurrentUser.me().getId();
       }
       String str1 = ("uid: "+str+" "+b+"\n"+c+"\n"+d.toString()+"\n"+i.i(d)).replace(",", "\n");
       AlertDialog$Builder uBuilder = new AlertDialog$Builder(uActivity);
       Objects.requireNonNull(q6.a);
       a.p(uActivity, "context");
       a.p("请联系开发, 已捕获异常", "title");
       a.p(str1, "content");
       a.p("发送至kim", "postButtonText");
       LinearLayout linearLayout = new LinearLayout(uActivity);
       linearLayout.setBackgroundResource(R.drawable.arg_RES_7f080785);
       linearLayout.setGravity(1);
       linearLayout.setOrientation(1);
       linearLayout.setPadding(0, a1.d(R.dimen.arg_RES_7f0701ee), 0, 0);
       linearLayout.setLayoutParams(new ViewGroup$LayoutParams(a1.d(R.dimen.arg_RES_7f0702ed), -2));
       TextView textView = new TextView(uActivity);
       textView.setGravity(3);
       textView.setTextColor(a1.a(R.color.arg_RES_7f0606f4));
       textView.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070f73));
       textView.setText("请联系开发, 已捕获异常");
       textView.setPadding(a1.d(R.dimen.arg_RES_7f0701ee), 0, a1.d(R.dimen.arg_RES_7f0701ee), a1.d(R.dimen.arg_RES_7f070215));
       linearLayout.addView(textView, new LinearLayout$LayoutParams(-1, -2));
       ExceptionHorizontalScrollView uExceptionHo = new ExceptionHorizontalScrollView(uActivity);
       uExceptionHo.setScrollBarSize(a1.d(R.dimen.arg_RES_7f07030a));
       uExceptionHo.setScrollBarStyle(0);
       uExceptionHo.setPadding(a1.d(R.dimen.arg_RES_7f070225), 0, 0, 0);
       ScrollView scrollView = new ScrollView(uActivity);
       scrollView.setScrollBarStyle(0);
       TextView textView1 = new TextView(uActivity);
       textView1.setGravity(3);
       textView1.setPadding(a1.d(R.dimen.arg_RES_7f0701ee), 0, a1.d(R.dimen.arg_RES_7f070295), 0);
       textView1.setIncludeFontPadding(0);
       textView1.setText(str1);
       textView1.setTextColor(a1.a(R.color.arg_RES_7f061c8e));
       textView1.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070f73));
       scrollView.addView(textView1);
       uExceptionHo.addView(scrollView, new LinearLayout$LayoutParams(-1, a1.d(R.dimen.arg_RES_7f07031c)));
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, -1);
       layoutParams.topMargin = a1.d(0x7f070215);
       linearLayout.addView(uExceptionHo, layoutParams);
       LinearLayout linearLayout1 = new LinearLayout(uActivity);
       linearLayout1.setOrientation(0);
       Button uButton = new Button(uActivity);
       uButton.setId(R.id.cancel_button);
       uButton.setBackgroundResource(R.drawable.arg_RES_7f080790);
       uButton.setGravity(17);
       uButton.setPadding(a1.d(R.dimen.arg_RES_7f0702ac), 0, a1.d(R.dimen.arg_RES_7f0702ac), 0);
       uButton.setSingleLine(true);
       uButton.setText("取消");
       uButton.setTextColor(a1.a(R.color.arg_RES_7f061c8e));
       uButton.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070f73));
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(0, -1);
       layoutParams1.weight = 0x3f800000;
       linearLayout1.addView(uButton, layoutParams1);
       View view = new View(uActivity);
       view.setBackgroundResource(R.color.arg_RES_7f06098c);
       linearLayout1.addView(view, new LinearLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f0702ac), -1));
       uButton = new Button(uActivity);
       uButton.setId(R.id.post_button);
       uButton.setBackgroundResource(R.drawable.arg_RES_7f080790);
       uButton.setGravity(17);
       uButton.setPadding(a1.d(R.dimen.arg_RES_7f0702ac), 0, a1.d(R.dimen.arg_RES_7f0702ac), 0);
       uButton.setSingleLine(true);
       uButton.setText("发送至kim");
       uButton.setTextColor(a1.a(R.color.arg_RES_7f061c8e));
       uButton.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070f73));
       LinearLayout$LayoutParams layoutParams2 = new LinearLayout$LayoutParams(0, -1);
       layoutParams2.weight = 0x3f800000;
       linearLayout1.addView(uButton, layoutParams2);
       linearLayout.addView(linearLayout1, new LinearLayout$LayoutParams(-1, a1.d(R.dimen.arg_RES_7f070319)));
       TextView textView2 = linearLayout.findViewById(R.id.cancel_button);
       TextView textView3 = linearLayout.findViewById(R.id.post_button);
       uBuilder.setView(linearLayout);
       AlertDialog uAlertDialog = uBuilder.create();
       uAlertDialog.show();
       textView3.setOnClickListener(new k7(str1, uAlertDialog));
       textView2.setOnClickListener(new j7(uAlertDialog));
       return;
    }
}
