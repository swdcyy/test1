package com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionDialogFragment;
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
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import va1.n0;
import lnc.a1;
import gg2.d;
import com.kuaishou.live.core.show.quiz.question.a;
import gg2.k;
import com.kuaishou.live.core.show.quiz.question.g;
import com.kuaishou.live.core.show.quiz.question.f;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.show.quiz.question.c;
import com.kuaishou.live.core.show.quiz.question.LiveQuizDialogType;
import eg2.b;
import dg2.d;
import com.kuaishou.live.core.show.quiz.manager.j;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import bg2.a;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class LiveQuizQuestionDialogFragment extends LiveSafeDialogFragment	// class@000e37
{
    public PresenterV2 s;
    public c t;
    public static final int u;

    public void LiveQuizQuestionDialogFragment(){
       super();
    }
    public int getTheme(){
       return 0x7f110384;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveQuizQuestionDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0d75, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveQuizQuestionDialogFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.s.destroy();
       this.s = null;
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveQuizQuestionDialogFragment.class, "7")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null && dialog.getWindow() != null) {
          dialog.setCancelable(false);
          dialog.setCanceledOnTouchOutside(false);
          Window window = dialog.getWindow();
          window.setBackgroundDrawable(new ColorDrawable(false));
          WindowManager$LayoutParams attributes = window.getAttributes();
          attributes.gravity = 17;
          attributes.width = n0.f() - a1.e(38.00f);
          window.setAttributes(attributes);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       ClientContent$ContentPackage uContentPack;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveQuizQuestionDialogFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       boolean b = false;
       this.setCancelable(b);
       Object[] objArray = null;
       int i = 1;
       if (!PatchProxy.applyVoid(objArray, this, LiveQuizQuestionDialogFragment.class, "4") && this.s == null) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.s = presenterV2;
          presenterV2.U7(new d());
          this.s.U7(new a());
          this.s.U7(new k());
          this.s.U7(new g());
          this.s.U7(new f());
          this.s.f(this.getView());
          Object[] objArray2 = new Object[i];
          objArray2[b] = this.t;
          this.s.i(objArray2);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveQuizQuestionDialogFragment.class, "5")) {
          LiveQuizQuestionDialogFragment tt = this.t;
          c f = tt.f;
          if (f == LiveQuizDialogType.USER_QUESTIONING) {
             f = 1;
          }else if(f == LiveQuizDialogType.USER_RESULT_RIGHT){
             f = 7;
          }else if(f == LiveQuizDialogType.USER_RESULT_WRONG){
             f = 8;
          }else {
             f = null;
          }
          int i1 = 2;
       label_0095 :
          if (f) {
             f = tt.c;
             String str = String.valueOf(tt.g.a);
             boolean b1 = (this.t.m.e().g != null)? true: false;
             ClientContent$LiveStreamPackage liveStreamPa = this.t.a.a();
             if (PatchProxy.isSupport(a.class)) {
                Object[] objArray1 = new Object[]{Integer.valueOf(i1),f,str,Boolean.valueOf(b1),liveStreamPa};
                if (!PatchProxy.applyVoid(objArray1, objArray, a.class, "14")) {
                }
             }else {
             }
          }
          i1 = 1;
          goto label_0095 ;
       }
    label_0122 :
       return;
    }
}
