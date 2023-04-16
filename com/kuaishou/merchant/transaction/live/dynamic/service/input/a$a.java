package com.kuaishou.merchant.transaction.live.dynamic.service.input.a$a;
import mu4.d;
import com.kuaishou.merchant.transaction.live.dynamic.service.input.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.dynamic.service.input.InputDialogModel;
import ue4.g;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import u07.t$a;
import u07.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;
import pj4.a;
import u07.w;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import mu4.c;

public class a$a implements d	// class@0007d6
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       InputDialogModel inputDialogM = g.b(p0, InputDialogModel.class);
       if (inputDialogM == null) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(inputDialogM, ta, a.class, "2")) {
          a y = ta.y;
          if (y != null) {
             FragmentActivity activity = y.getActivity();
             if (activity != null && !activity.isFinishing()) {
                t$a uoa = f.b(new t$a(activity));
                String str = (TextUtils.isEmpty(inputDialogM.mTitle))? a1.p(R.string.arg_RES_7f1033a3): inputDialogM.mTitle;
                uoa.X0(str);
                uoa.J0("", inputDialogM.mContent, new a(inputDialogM, activity));
                uoa.L0(2);
                uoa.R0(a1.p(R.string.arg_RES_7f1033c9));
                uoa.T0(a1.p(R.string.arg_RES_7f103412));
                uoa.A(true);
                uoa.v(true);
                uoa.p();
                uoa.Y(PopupInterface.a);
             }
          }
       }
       return;
    }
    public void destroy(){
       c.a(this);
    }
}
