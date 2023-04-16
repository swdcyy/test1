package com.kwai.component.photo.reduce.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ag5.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$RoastFeedBack;
import java.lang.CharSequence;
import android.widget.TextView;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.kwai.component.photo.reduce.q$a;
import o07.d$a;
import o07.d;
import android.widget.EditText;
import com.kwai.library.widget.popup.common.f;
import android.text.InputFilter;
import android.text.InputFilter$LengthFilter;
import com.kwai.component.photo.reduce.q$b;
import android.text.TextWatcher;
import yf5.z2;
import android.content.DialogInterface$OnCancelListener;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.View;
import ekd.m1;
import com.kwai.component.photo.reduce.p;
import android.view.View$OnClickListener;
import yf5.a3;
import com.kwai.component.photo.reduce.PhotoReduceRoastPopup;
import java.lang.Integer;

public class q extends PresenterV2	// class@000b04
{
    public final int A;
    public Window B;
    public d$a C;
    public View p;
    public EditText q;
    public TextView r;
    public TextView s;
    public TextView t;
    public PhotoReduceRoastPopup u;
    public QPhoto v;
    public int w;
    public FeedNegativeFeedback$NegativeReason x;
    public View$OnClickListener y;
    public final long z;

    public void q(){
       super();
       this.z = 100;
       this.A = 100;
    }
    public void E8(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, q.class, str)) {
          return;
       }
       q tv = this.v;
       q tx = this.x;
       if (!PatchProxy.applyVoidTwoRefs(tv, tx, objArray, c.class, str)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_ROAST_DIALOG";
          uElementPack.params = c.b(tv, tx).e();
          u1.u0(6, uElementPack, objArray);
       }
       this.r.setText(this.x.mRoast.mContent);
       this.s.setText("0/100");
       this.B = this.u.getDialog().getWindow();
       q$a uoa = new q$a(this);
       this.C = uoa;
       d.b(this.B, uoa);
       f.I(this.q, 100);
       InputFilter[] inputFilterA = new InputFilter[]{new InputFilter$LengthFilter(100)};
       this.q.setFilters(inputFilterA);
       this.q.addTextChangedListener(new q$b(this));
       this.u.oh(new z2(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "4")) {
          return;
       }
       d.c(this.B, this.C);
       f.w();
       this.u.oh(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a330e);
       this.q = m1.f(p0, 0x7f0a0ca8);
       this.p = m1.f(p0, 0x7f0a0945);
       this.s = m1.f(p0, 0x7f0a178e);
       this.r = m1.f(p0, 0x7f0a3f2c);
       m1.a(p0, new p(this), R.id.publish);
       m1.a(p0, new a3(this), R.id.close);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.u = this.r8("FRAGMENT");
       this.v = this.q8(QPhoto.class);
       this.w = this.r8("SOURCE").intValue();
       this.x = this.r8("PHOTO_REDUCE_FIRST_REASON");
       this.y = this.s8(View$OnClickListener.class);
       return;
    }
}
