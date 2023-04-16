package com.yxcorp.gifshow.util.ChildLockDialogUtils$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import android.widget.TextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.text.TextPaint;
import java.lang.CharSequence;
import lnc.q0;
import android.view.View$OnClickListener;
import lnc.r0;
import vj9.b;
import vj9.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.util.ChildLockDialogUtils;
import wh5.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.b;
import m01.a;
import java.lang.String;
import o07.o;

public class ChildLockDialogUtils$b implements PopupInterface$h	// class@001ed6
{
    public final TeenageModeConfig b;

    public void ChildLockDialogUtils$b(TeenageModeConfig p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       int i = 0x7f0a0945;
       TextView textView = p0.z().findViewById(i);
       int i1 = 0;
       textView.setHighlightColor(i1);
       textView.setMovementMethod(LinkMovementMethod.getInstance());
       textView = p0.z().findViewById(R.id.set_teenage_mode);
       textView.getPaint().setFakeBoldText(true);
       textView.setText(this.b.mDialogConfirmText);
       textView.setOnClickListener(new q0(this.b, p0));
       if (this.b.mMode == null) {
          i1 = true;
       }
       p0.V(i1);
       p0.X(i1);
       p0.z().findViewById(i).setMovementMethod(LinkMovementMethod.getInstance());
       p0.z().findViewById(R.id.close).setOnClickListener(new r0(p0));
       a.a().g(RequestTiming.ON_BACKGROUND).subscribe(Functions.d(), Functions.d());
       ChildLockDialogUtils.e(i1, this.b.mCanVerifyIdCard);
       a.i(true);
       RxBus.f.b(new b(true, this.b.mEnablePhotoContinue));
       p0.z().findViewById(R.id.child_lock_panel).setOnClickListener(a.b);
       return;
    }
    public void H(c p0,int p1){
       ChildLockDialogUtils.d = false;
       ChildLockDialogUtils.a = false;
       a.i(false);
       RxBus.f.b(new b(false, this.b.mEnablePhotoContinue));
       if (p1 == 2) {
          ChildLockDialogUtils.d("OTHER");
       }
       return;
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
