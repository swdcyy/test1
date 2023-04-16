package com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment$c;
import sfc.a;
import com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import u07.t$a;
import android.app.Activity;
import y1d.o4;
import u07.u;
import w07.i;
import w07.l;
import com.yxcorp.login.userlogin.fragment.k;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;

public class QRCodeLoginFragment$c extends a	// class@001b3e
{
    public final ProgressFragment c;
    public final QRCodeLoginFragment d;

    public void QRCodeLoginFragment$c(QRCodeLoginFragment p0,ProgressFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, QRCodeLoginFragment$c.class, "1")) {
          return;
       }
       this.c.dismiss();
       if (p0 instanceof KwaiException) {
          QRCodeLoginFragment$c td = this.d;
          String obj = p0;
          Objects.requireNonNull(td);
          t$a obj1 = PatchProxy.applyOneRefs(obj, td, QRCodeLoginFragment.class, "5");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else {
             obj = obj.getMessage();
             if (obj.getErrorCode() == 0x34faa) {
                if (TextUtils.isEmpty(obj)) {
                   obj = td.getString(R.string.arg_RES_7f1043e2);
                }
                if (td.getActivity() != null) {
                   obj1 = new t$a(td.getActivity());
                   obj1.z0(obj);
                   obj1.Q0(R.string.cancel);
                   obj1.S0(R.string.arg_RES_7f1040ae);
                   obj1.u0(new o4(td));
                   obj1.a0(new i());
                   obj1.a0(new k(td));
                   obj1.z(true);
                   obj1.L(new PopupInterface$g(R.layout.arg_RES_7f0d02f0));
                   obj1.X();
                }
                b = true;
             }else {
                b = false;
             }
          }
          if (!b) {
             this.d.eh(p0.getMessage());
          }
       }else {
          super.b(p0);
       }
       return;
    }
}
