package com.yxcorp.gifshow.dialog.kem.f$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.dialog.kem.f;
import com.yxcorp.gifshow.model.response.dialog.KemCommonAgreementDialogResponse;
import android.app.Activity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ImageView;
import x9a.n;
import android.view.View$OnClickListener;
import android.widget.CheckBox;
import x9a.o;
import android.widget.CompoundButton$OnCheckedChangeListener;
import x9a.m;
import com.yxcorp.gifshow.dialog.kem.e;
import android.widget.TextView;
import java.lang.CharSequence;
import x9a.l;
import i89.d;
import i89.c;
import brd.t;
import crd.b;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import x9a.d0;
import x9a.j0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;
import e17.i;
import o07.o;

public class f$a implements PopupInterface$h	// class@001ab3
{
    public final KemCommonAgreementDialogResponse b;
    public final Activity c;
    public final f d;

    public void f$a(f p0,KemCommonAgreementDialogResponse p1,Activity p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       p0.z().findViewById(R.id.close).setOnClickListener(new n(this.b, p0));
       CheckBox uCheckBox = p0.z().findViewById(R.id.check_verify);
       uCheckBox.setOnCheckedChangeListener(new o(this.b));
       p0.z().findViewById(R.id.check_layout).setOnClickListener(new m(uCheckBox));
       p0.z().findViewById(R.id.positive).setOnClickListener(new e(this.b, uCheckBox, p0));
       p0.z().findViewById(R.id.check_des).setText(this.b.mCheckContent1);
       TextView textView = p0.z().findViewById(R.id.check_link);
       textView.setText(this.b.mCheckContent2);
       textView.setOnClickListener(new l(this.c, this.b));
       c.a().dialogReport(this.b.mReportName).subscribe();
       KemCommonAgreementDialogResponse kemCommonAgr = this.d.b();
       if (!PatchProxy.applyVoidOneRefs(kemCommonAgr, null, j0.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "REWARD_AGREEMENT_DIALOG";
          uElementPack.params = j0.g(kemCommonAgr, 97).e();
          u1.u0(4, uElementPack, j0.b(kemCommonAgr));
       }
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, f$a.class, "2")) {
          return;
       }
       if (p1 == 2 || p1 == 3) {
          f$a tb = this.b;
          j0.j(tb, tb.mCloseToast);
          i.d(R.style.arg_RES_7f11066a, this.d.b().mCloseToast);
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
