package com.yxcorp.gifshow.homepage.presenter.p;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.homepage.presenter.q;
import android.app.Activity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import y95.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Context;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import yta.g1;
import android.view.View$OnClickListener;
import o07.o;

public class p implements PopupInterface$h	// class@0017d4
{
    public final Activity b;
    public final q c;

    public void p(q p0,Activity p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       boolean b = true;
       q.t = b;
       this.c.p = b;
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putLong("show_home_feed_reco_dialog_time", System.currentTimeMillis());
       g.a(uEditor);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PERSON_RECOM_SITE_BTN";
       i3 oi3 = i3.f();
       oi3.d("person_recom_type", "");
       uElementPack.params = oi3.e();
       u1.u0(6, uElementPack, null);
       View view = p0.z();
       if (view instanceof FrameLayout) {
          int i = 0;
          if (view.getChildAt(i) instanceof LinearLayout) {
             TextView textView = new TextView(this.b);
             textView.setText(R.string.arg_RES_7f100efe);
             textView.setTextSize(i, (float)a1.d(R.dimen.arg_RES_7f070218));
             textView.setGravity(17);
             textView.setTextColor(a1.a(R.color.arg_RES_7f060949));
             textView.setCompoundDrawablesWithIntrinsicBounds(i, i, R.drawable.arg_RES_7f0809c2, i);
             textView.setIncludeFontPadding(i);
             textView.setCompoundDrawablePadding(a1.d(R.dimen.arg_RES_7f07031b));
             view.getChildAt(i).addView(textView, b);
             LinearLayout$LayoutParams layoutParams = textView.getLayoutParams();
             layoutParams.gravity = 17;
             layoutParams.width = -2;
             layoutParams.topMargin = a1.d(0x7f07028d);
             textView.setLayoutParams(layoutParams);
             textView.setOnClickListener(new g1(this.b));
          }
       }
       return;
    }
    public void H(c p0,int p1){
       p0.p = false;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
