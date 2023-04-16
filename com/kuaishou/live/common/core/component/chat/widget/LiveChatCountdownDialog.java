package com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog$DialogMode;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import crd.b;
import lnc.b9;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import lnc.a1;
import android.widget.TextView;
import java.lang.CharSequence;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.kuaishou.live.common.core.component.chat.widget.a;
import erd.o;
import t45.d;
import brd.z;
import he1.a;
import erd.g;

public class LiveChatCountdownDialog extends KwaiDialogFragment	// class@001055
{
    public LiveChatCountdownDialog$DialogMode p;
    public LiveChatCountdownDialog$a q;
    public b r;
    public TextView s;
    public static final int t;

    public void LiveChatCountdownDialog(LiveChatCountdownDialog$DialogMode p0,LiveChatCountdownDialog$a p1){
       super();
       this.p = p0;
       this.q = p1;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveChatCountdownDialog.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0aaa, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveChatCountdownDialog.class, "4")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.r);
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveChatCountdownDialog.class, "1")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, LiveChatCountdownDialog.class, "5")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             window.setBackgroundDrawable(new ColorDrawable(0));
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.gravity = 17;
             attributes.width = a1.d(0x7f07027e);
             window.setAttributes(attributes);
             window.setDimAmount(0);
             window.setWindowAnimations(R.style.arg_RES_7f11059d);
             dialog.setCancelable(0);
             dialog.setCanceledOnTouchOutside(0);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveChatCountdownDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.s = p0.findViewById(0x7f0a1b09);
       TextView textView = p0.findViewById(R.id.live_chat_countdown_hint_text_view);
       LiveChatCountdownDialog tp = this.p;
       if (tp == LiveChatCountdownDialog$DialogMode.ANCHOR) {
          str = a1.p(R.string.arg_RES_7f101df1);
       }else if(tp == LiveChatCountdownDialog$DialogMode.AUDIENCE){
          str = a1.p(R.string.arg_RES_7f101de4);
       }else {
          str = null;
       }
       textView.setText(str);
       if (!PatchProxy.applyVoid(null, this, LiveChatCountdownDialog.class, "6")) {
          b9.a(this.r);
          this.r = t.interval(0, 1, TimeUnit.SECONDS).take(4).map(a.b).observeOn(d.a).subscribe(new a(this));
       }
       return;
    }
}
