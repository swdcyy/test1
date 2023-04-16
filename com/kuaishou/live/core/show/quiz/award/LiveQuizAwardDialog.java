package com.kuaishou.live.core.show.quiz.award.LiveQuizAwardDialog;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.core.show.quiz.model.LiveQuizAwardResponse;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import androidx.fragment.app.Fragment;
import i2b.a;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import zf2.a;
import android.view.View$OnClickListener;
import zf2.b;
import bg2.c;

public class LiveQuizAwardDialog extends LiveSafeDialogFragment implements d	// class@000e05
{
    public KwaiImageView A;
    public KwaiImageView B;
    public Group C;
    public LiveQuizAwardResponse s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public ImageView z;
    public static final int D;

    public void LiveQuizAwardDialog(LiveQuizAwardResponse p0){
       super();
       this.s = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuizAwardDialog.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a240d);
       this.u = m1.f(p0, 0x7f0a2409);
       this.v = m1.f(p0, 0x7f0a240f);
       this.w = m1.f(p0, 0x7f0a240e);
       this.x = m1.f(p0, 0x7f0a240c);
       this.A = m1.f(p0, 0x7f0a240b);
       this.y = m1.f(p0, 0x7f0a2408);
       this.z = m1.f(p0, 0x7f0a15a4);
       this.B = m1.f(p0, 0x7f0a2417);
       this.C = m1.f(p0, 0x7f0a2410);
       return;
    }
    public int getTheme(){
       return 0x7f110383;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveQuizAwardDialog.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.a(this.getContext(), 0x7f0d0d6a);
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveQuizAwardDialog.class, "4")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, LiveQuizAwardDialog.class, "5")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.gravity = 17;
             attributes.width = -2;
             attributes.height = -2;
             window.setAttributes(attributes);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveQuizAwardDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       if (!PatchProxy.applyVoid(null, this, LiveQuizAwardDialog.class, "6")) {
          this.t.setText(TextUtils.k(this.s.mQuizAwardTitle));
          this.u.setText(TextUtils.k(this.s.mQuizAwardSubtitle));
          if (this.s.mShouldShowQuizAwardContent != null) {
             this.C.setVisibility(0);
             this.v.setText(TextUtils.k(this.s.mQuizAwardAmount));
             this.w.setText(TextUtils.k(this.s.mQuizAwardUnit));
             this.x.setText(TextUtils.k(this.s.mQuizAwardTips));
          }else {
             this.C.setVisibility(8);
          }
          LiveQuizAwardResponse mQuizAwardIc = this.s.mQuizAwardIcon;
          if (TextUtils.x(mQuizAwardIc)) {
             str = (this.s.mShouldShowQuizAwardContent != null)? "/udata/pkg/kwai-client-image/live_quiz/live_live_answerwin.webp": "/udata/pkg/kwai-client-image/live_quiz/live_live_answerlose.webp";
             str = c0.a.b(str);
          }
          this.A.L(str);
          this.y.setText(TextUtils.k(this.s.mQuizAwardButtonText));
          this.y.setOnClickListener(new a(this));
          this.z.setOnClickListener(new b(this));
          c.h(this.B, 0);
       }
       return;
    }
}
