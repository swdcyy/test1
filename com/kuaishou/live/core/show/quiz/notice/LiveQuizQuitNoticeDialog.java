package com.kuaishou.live.core.show.quiz.notice.LiveQuizQuitNoticeDialog;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
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
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import lnc.a1;
import ekd.m1;
import android.widget.TextView;
import fg2.h;
import android.view.View$OnClickListener;
import fg2.i;

public class LiveQuizQuitNoticeDialog extends LiveSafeDialogFragment	// class@000e2c
{
    public View$OnClickListener s;
    public View$OnClickListener t;
    public static final int u;

    public void LiveQuizQuitNoticeDialog(){
       super();
    }
    public int getTheme(){
       return 0x7f110384;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveQuizQuitNoticeDialog.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0d76, p1, false);
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveQuizQuitNoticeDialog.class, "3")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, LiveQuizQuitNoticeDialog.class, "4")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             dialog.getWindow().setLayout(a1.e(280.00f), a1.e(200.00f));
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveQuizQuitNoticeDialog.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.setCancelable(false);
       m1.f(p0, R.id.live_quiz_quit_positive_button).setOnClickListener(new h(this));
       m1.f(p0, R.id.live_quiz_quit_negative_button).setOnClickListener(new i(this));
       return;
    }
}
