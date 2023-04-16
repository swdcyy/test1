package com.yxcorp.gifshow.util.ChildLockDialogUtils$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.util.ChildLockDialogUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import java.util.List;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import lnc.j0;
import android.view.View$OnClickListener;
import vj9.b;
import vj9.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import wh5.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.b;
import com.yxcorp.gifshow.util.g;
import java.lang.String;
import o07.o;

public class ChildLockDialogUtils$c implements PopupInterface$h	// class@001ed7
{
    public final TeenageModeConfig b;

    public void ChildLockDialogUtils$c(TeenageModeConfig p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       ChildLockDialogUtils$c tb = this.b;
       ViewStub viewStub = p0.z().findViewById(R.id.info_stub);
       boolean b = false;
       ViewGroup$MarginLayoutParams marginLayout = (tb.mDialogNewContentVersion == 2)? 1: null;
       int i = (marginLayout)? 0x7f0d1180: 0x7f0d117f;
       viewStub.setLayoutResource(i);
       View view = viewStub.inflate();
       i = 0x7f0a38a2;
       if (marginLayout) {
          marginLayout = view.getLayoutParams();
          marginLayout.topMargin = a1.d(0x7f0702e2);
          view.setLayoutParams(marginLayout);
          view = p0.z().findViewById(i);
          marginLayout = view.getLayoutParams();
          marginLayout.topMargin = a1.d(0x7f0702da);
          view.setLayoutParams(marginLayout);
          view = p0.z().findViewById(R.id.positive);
          marginLayout = view.getLayoutParams();
          marginLayout.topMargin = a1.d(0x7f0702b8);
          view.setLayoutParams(marginLayout);
       }
       TeenageModeConfig dialogNewCon = tb.dialogNewContent;
       if (dialogNewCon != null && dialogNewCon.size() >= 4) {
          ChildLockDialogUtils.c(p0, tb);
       }
       TextView textView = p0.z().findViewById(i);
       textView.getPaint().setFakeBoldText(true);
       textView.setText(tb.mDialogConfirmText);
       textView.setOnClickListener(new j0(tb, p0));
       if (tb.mMode == null) {
          b = true;
       }
       p0.V(b);
       p0.X(b);
       a.a().g(RequestTiming.ON_BACKGROUND).subscribe(Functions.d(), Functions.d());
       ChildLockDialogUtils.e(b, tb.mCanVerifyIdCard);
       a.i(true);
       RxBus.f.b(new b(true, tb.mEnablePhotoContinue));
       p0.z().findViewById(R.id.child_lock_panel).setOnClickListener(g.b);
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
