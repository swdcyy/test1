package com.yxcorp.gifshow.matrix.MatrixBaseDialog;
import com.kwai.lib.BaseSpringDialogFragment;
import com.yxcorp.gifshow.matrix.MatrixBaseDialog$a;
import nsd.u;
import com.kwai.android.common.bean.Channel;
import com.yxcorp.gifshow.matrix.MatrixBaseDialog$b;
import com.yxcorp.gifshow.matrix.MatrixBaseDialog$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import com.kwai.android.common.ext.PushDataExtKt;
import java.lang.CharSequence;
import android.content.DialogInterface;
import n6b.d;
import java.util.Objects;
import n6b.c;
import java.lang.Enum;
import java.lang.System;
import m6b.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import n6b.b;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import n6b.a;
import java.lang.StringBuilder;
import com.kwai.android.common.bean.PushData;
import com.yxcorp.gifshow.util.rx.RxBus;
import o6b.b;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.matrix.MatrixBaseDialog$c;
import java.lang.Runnable;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import android.view.Window;

public abstract class MatrixBaseDialog extends BaseSpringDialogFragment	// class@001cdd
{
    public Channel e;
    public int f;
    public String g;
    public KwaiPushMsgData h;
    public int i;
    public final View$OnClickListener j;
    public final View$OnClickListener k;
    public static final MatrixBaseDialog$a l;

    static {
       MatrixBaseDialog.l = new MatrixBaseDialog$a(null);
    }
    public void MatrixBaseDialog(){
       super();
       this.e = Channel.MATRIX;
       this.f = 9;
       this.g = "";
       this.j = new MatrixBaseDialog$b(this);
       this.k = new MatrixBaseDialog$d(this);
    }
    public final Channel ah(){
       return this.e;
    }
    public final View$OnClickListener bh(){
       return this.j;
    }
    public final View$OnClickListener ch(){
       return this.k;
    }
    public final KwaiPushMsgData dh(){
       return this.h;
    }
    public final boolean eh(){
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, MatrixBaseDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getArguments();
       boolean b = false;
       if (obj == null) {
          return b;
       }
       a.o(obj, "arguments ?: return false");
       String str = obj.getString("data_json", "");
       a.o(str, "bundle.getString\(DialogConstants.KEY_DATA, \"\"\)");
       this.g = str;
       Object obj1 = PushDataExtKt.parseNotificationFleshData(str);
       if (obj1 instanceof KwaiPushMsgData) {
          objArray = obj1;
       }
       this.h = objArray;
       this.f = obj.getInt("push_style", 9);
       String str1 = obj.getString("push_channel", "");
       a.o(str1, "channelStr");
       if (!str1.length()) {
          b = 1;
       }
       Channel mATRIX = (b)? Channel.MATRIX: Channel.valueOf(str1);
       this.e = mATRIX;
       return true;
    }
    public final void fh(int p0){
       this.i = p0;
    }
    public void onDismiss(DialogInterface p0){
       d a;
       SharedPreferences$Editor uEditor;
       long l;
       Object obj = this;
       MatrixBaseDialog obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, MatrixBaseDialog.class, "4")) {
          return;
       }
       a.p(obj1, "dialog");
       super.onDismiss(p0);
       RxBus rxBus = 1;
       int b = (obj.i == rxBus)? true: false;
       a = d.a;
       MatrixBaseDialog e = obj.e;
       Objects.requireNonNull(a);
       d uod = d.class;
       String str = "channel";
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), e, a, uod, "1")) {
          a.p(e, str);
          int i = c.a[e.ordinal()];
          e = -1;
          if (i != rxBus) {
             if (i != 2) {
                if (i != 3) {
                   if (i == 4) {
                      if (!b) {
                         l = System.currentTimeMillis();
                      }
                      uEditor = a.a.edit();
                      uEditor.putLong("contactLastDislikeTimestamp", e);
                      g.a(uEditor);
                   }
                }else if(b){
                   l = System.currentTimeMillis();
                }
                uEditor = a.a.edit();
                uEditor.putLong("jPushLastDislikeTimestamp", e);
                g.a(uEditor);
             }else if(b){
                l = System.currentTimeMillis();
             }
             uEditor = a.a.edit();
             uEditor.putLong("matrixLastDislikeTimestamp", e);
             g.a(uEditor);
          }else if(b){
             l = System.currentTimeMillis();
          }
          uEditor = a.a.edit();
          uEditor.putLong("lastDislikeTimestamp", e);
          g.a(uEditor);
       }
       b a1 = b.a;
       e = obj.f;
       MatrixBaseDialog e1 = obj.e;
       Objects.requireNonNull(a1);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(e), Boolean.valueOf(b), e1, a1, b.class, "5")) {
          a.p(e1, str);
          i3 oi3 = i3.f();
          oi3.c("push_style", Integer.valueOf(e));
          String str1 = (b)? "open": "close";
          oi3.d("click_type", str1);
          b = a.e[e1.ordinal()];
          if (b != rxBus) {
             if (b != 2) {
                if (b != 3) {
                   if (b != 4) {
                      String str2 = oi3.toString();
                      a.o(str2, "json.toString\(\)");
                      a1.a(e1.name()+"_DIALOG_CLICK", str2);
                   }else {
                      str1 = oi3.toString();
                      a.o(str1, "json.toString\(\)");
                      a1.a("CONTACT_DIALOG_CLICK", str1);
                   }
                }else {
                   str1 = oi3.toString();
                   a.o(str1, "json.toString\(\)");
                   a1.a("JPUSH_DIALOG_CLICK", str1);
                }
             }else {
                str1 = oi3.toString();
                a.o(str1, "json.toString\(\)");
                a1.a("MATRIX_DIALOG_CLICK", str1);
             }
          }else {
             str1 = oi3.toString();
             a.o(str1, "json.toString\(\)");
             a1.a("GEPUSH_DIALOG_CLICK", str1);
          }
       }
       if (obj.i == null) {
          obj1 = obj.h;
          if (obj1 != null) {
             PushData pushId = obj1.pushId;
             if (pushId != null) {
                RxBus.f.b(new b(pushId));
             }
          }
       }
       return;
    }
    public void onResume(){
       long l;
       if (PatchProxy.applyVoid(null, this, MatrixBaseDialog.class, "3")) {
          return;
       }
       super.onResume();
       d a = d.a;
       MatrixBaseDialog te = this.e;
       Objects.requireNonNull(a);
       Object obj = PatchProxy.applyOneRefs(te, a, d.class, "2");
       MatrixBaseDialog$c uoc = -1;
       if (obj != PatchProxyResult.class) {
          l = obj.longValue();
       }else {
          a.p(te, "channel");
          int i = c.b[te.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 4) {
                      l = (i != 5)? 5000: a.t().b("vivoDialogShowDuration", 5000);
                   }else {
                      l = a.t().b("contactDialogShowDuration", 5000);
                   }
                }else {
                   l = a.t().b("jPushDialogShowDuration", 5000);
                }
             }else {
                l = a.t().b("matrixDialogShowDuration", uoc);
             }
          }else {
             l = a.t().b("getuiDialogShowDuration", 5000);
          }
       }
       if (l - uoc > 0) {
          BaseSpringDialogFragment tb = this.b;
          if (tb != null) {
             tb.postDelayed(new MatrixBaseDialog$c(this), l);
          }
       }
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MatrixBaseDialog.class, "5")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          objArray = dialog.getWindow();
       }
       if (objArray != null) {
          objArray.setBackgroundDrawableResource(R.color.arg_RES_7f06202f);
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, MatrixBaseDialog.class, "6")) {
          return;
       }
       super.onStop();
       this.dismissAllowingStateLoss();
       return;
    }
}
