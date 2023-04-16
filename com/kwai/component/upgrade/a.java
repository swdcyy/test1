package com.kwai.component.upgrade.a;
import zjd.a;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.FragmentActivity;
import android.widget.TextView;
import java.lang.Object;
import bkd.b;
import java.lang.Throwable;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.component.upgrade.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import o56.a;
import ekd.p0;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import ai5.a;
import u07.u;
import dj2.b;
import u07.f;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.component.upgrade.f;
import e17.i;
import android.graphics.drawable.Drawable;

public final class a implements a	// class@000bfc
{
    public final ProgressFragment a;
    public final FragmentActivity b;
    public final TextView c;

    public void a(ProgressFragment p0,FragmentActivity p1,TextView p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(b p0,Throwable p1){
       a tb = this.b;
       a tc = this.c;
       this.a.dismiss();
       if (p1 != null) {
          ExceptionHandler.handleException(tb, p1);
       }else {
          d obj = null;
          if (p0.a != null) {
             if (!PatchProxy.applyVoidOneRefs(p0, obj, b.class, "2")) {
                Activity uActivity = ActivityContext.g().e();
                if (uActivity instanceof FragmentActivity) {
                   if (p0.A(a.B) && !p0.F(a.B)) {
                      obj = new d(uActivity);
                      obj.b1(KwaiDialogOption.e);
                      obj.W0(R.string.arg_RES_7f104f89);
                      obj.S0(R.string.arg_RES_7f104f88);
                      obj.Q0(R.string.arg_RES_7f104f87);
                      obj.u0(new a(p0));
                      obj.t0(b.b);
                      f.e(obj).X();
                   }else {
                      f.f(p0, true);
                   }
                }
             }
          }else {
             i.a(R.style.arg_RES_7f11066a, 0x7f103989);
             if (tc != null) {
                tc.setCompoundDrawables(obj, obj, obj, obj);
             }
          }
       }
       return;
    }
}
