package com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog;
import com.kwai.lib.BaseSpringDialogFragment;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import zsd.u;
import java.lang.StringBuilder;
import com.google.gson.JsonElement;
import com.kwai.android.common.ext.PushDataExtKt;
import com.google.gson.JsonObject;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.widget.ImageView;
import com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog$a;
import java.lang.Runnable;
import java.lang.Exception;
import com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog$c;
import android.content.DialogInterface;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.common.bean.PushData;
import java.lang.NullPointerException;
import android.content.Context;
import com.kwai.android.common.utils.ContextProvider;
import android.os.Vibrator;
import androidx.fragment.app.DialogFragment;

public final class PushFragmentDialog extends BaseSpringDialogFragment	// class@001643
{
    public View e;
    public TextView f;
    public TextView g;
    public TextView h;
    public KwaiImageView i;
    public View j;
    public boolean k;
    public final int l;

    public void PushFragmentDialog(){
       super();
       this.l = 0x7f0d10ce;
    }
    public static final KwaiImageView ah(PushFragmentDialog p0){
       p0 = p0.i;
       if (p0 == null) {
          a.S("imageView");
       }
       return p0;
    }
    public void Vg(){
       if (PatchProxy.applyVoid(null, this, PushFragmentDialog.class, "1")) {
          return;
       }
       View view = this.Ug(R.id.notification_push_dialog_close);
       a.m(view);
       this.e = view;
       view = this.Ug(R.id.notification_push_dialog_name);
       a.m(view);
       this.f = view;
       view = this.Ug(R.id.notification_push_dialog_title);
       a.m(view);
       this.g = view;
       view = this.Ug(R.id.notification_push_dialog_body);
       a.m(view);
       this.h = view;
       view = this.Ug(R.id.notification_push_dialog_image);
       a.m(view);
       this.i = view;
       view = this.Ug(R.id.notification_push_dialog_forward);
       a.m(view);
       this.j = view;
       return;
    }
    public int Wg(){
       return this.l;
    }
    public void Xg(){
       PushFragmentDialog tg;
       String str = "QCurrentUser.ME";
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PushFragmentDialog.class, "2")) {
          return;
       }
       int b = false;
       this.k = b;
       try{
          if (this.getArguments() == null) {
             this.dismissAllowingStateLoss();
             return;
          }else {
             Bundle arguments = this.getArguments();
             a.m(arguments);
             a.o(arguments, "arguments!!");
             this.Yg(0x3f4ccccd);
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, str);
             String name = mE.getName();
             PushFragmentDialog pushFragment = (name == null || u.S1(name))? 1: null;
             if (!pushFragment) {
                pushFragment = this.f;
                if (pushFragment == null) {
                   a.S("nameTextView");
                }
                QCurrentUser mE1 = QCurrentUser.ME;
                a.o(mE1, str);
                pushFragment.setText('@'+mE1.getName());
             }
             str = arguments.getString("data_json");
             if (str != null) {
                JsonElement jsonElement = PushDataExtKt.toJson(str);
                if (jsonElement != null) {
                   objArray = jsonElement.r();
                }
             }
             if (objArray != null) {
                tg = this.g;
                if (tg == null) {
                   a.S("titleTextView");
                }
                JsonElement jsonElement1 = objArray.e0("title");
                a.o(jsonElement1, "dataJson.get\(PushData.TITLE\)");
                tg.setText(jsonElement1.w());
                tg = this.h;
                if (tg == null) {
                   a.S("bodyTextView");
                }
                JsonElement jsonElement2 = objArray.e0("body");
                a.o(jsonElement2, "dataJson.get\(PushData.BODY\)");
                tg.setText(jsonElement2.w());
             }else {
                this.dismissAllowingStateLoss();
             }
             str = arguments.getString("bigImageUri");
             Resources resources = this.getResources();
             a.o(resources, "this.resources");
             Configuration configuratio = resources.getConfiguration();
             a.o(configuratio, "this.resources.configuration");
             configuratio = configuratio.orientation;
             PushFragmentDialog$a uoa = 2;
             if (configuratio == uoa) {
                this.Yg(0.40f);
             }
             String str1 = (str != null)? str: "";
             if (u.S1(str1) || configuratio == uoa) {
                tg = this.i;
                if (tg == null) {
                   a.S("imageView");
                }
                tg.setVisibility(8);
             }else {
                PushFragmentDialog ti = this.i;
                if (ti == null) {
                   a.S("imageView");
                }
                ti.setVisibility(b);
                b = arguments.getInt("width");
                int intx = arguments.getInt("height");
                PushFragmentDialog ti1 = this.i;
                if (ti1 == null) {
                   a.S("imageView");
                }
                ti1.post(new PushFragmentDialog$a(this, intx, b, str));
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public void Zg(){
       if (PatchProxy.applyVoid(null, this, PushFragmentDialog.class, "3")) {
          return;
       }
       PushFragmentDialog te = this.e;
       if (te == null) {
          a.S("closeBtn");
       }
       te.setOnClickListener(new PushFragmentDialog$b(this));
       te = this.j;
       if (te == null) {
          a.S("haveSeeView");
       }
       te.setOnClickListener(new PushFragmentDialog$c(this));
       return;
    }
    public int getTheme(){
       return 0x7f1102b9;
    }
    public void onDismiss(DialogInterface p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, PushFragmentDialog.class, "5")) {
          return;
       }
       a.p(p0, "dialog");
       super.onDismiss(p0);
       if (this.k == null) {
          if (this.getArguments() != null) {
             Bundle arguments = this.getArguments();
             a.m(arguments);
             a.o(arguments, "arguments!!");
             String str = arguments.getString("data_json");
             a.m(str);
             a.o(str, "bundle.getString\(\"data_json\"\)!!");
             Object obj = PushDataExtKt.parseNotificationFleshData(str);
             if (obj != null) {
                str1 = arguments.getString("push_channel");
                a.m(str1);
                a.o(str1, "bundle.getString\(\"push_channel\"\)!!");
                PushLogger.a().j(Channel.valueOf(str1), obj, "dialog close without landing page", -999);
             }else {
                throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData");
             }
          }
          str1 = ContextProvider.getContext().getSystemService("vibrator");
          if (str1 != null) {
             str1.cancel();
          }else {
             throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
          }
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, PushFragmentDialog.class, "4")) {
          return;
       }
       try{
          super.onStop();
          this.dismissAllowingStateLoss();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
