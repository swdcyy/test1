package a1d.h0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a1d.p1$a;
import w0d.g;
import mrd.c;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import lnc.a1;
import nfc.k;
import ekd.p1;
import a1d.e0;
import erd.g;
import crd.b;
import brd.t;
import a1d.f0;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import a1d.g0;
import a1d.d0;
import brd.w;
import erd.c;
import io.reactivex.internal.functions.Functions;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.method.MovementMethod;
import g9c.a;
import com.yxcorp.login.http.response.AuthInfoResponse$AgreementInfo;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ekd.m1;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import a1d.b0;
import android.view.View$OnClickListener;

public class h0 extends PresenterV2	// class@000029
{
    public SizeAdjustableTextView p;
    public a$c q;
    public KwaiImageView r;
    public AuthInfoResponse$AgreementInfo s;
    public Boolean t;
    public p1$a u;
    public g v;
    public c w;

    public void h0(p1$a p0,g p1,c p2){
       super();
       this.t = Boolean.FALSE;
       this.u = p0;
       this.v = p1;
       this.w = p2;
    }
    public void E8(){
       h0 oh0 = h0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh0, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh0, "4")) {
          View[] viewArray = new View[]{this.r};
          int i = 0;
          n.Z(i, viewArray);
          this.S8();
       }
       k.a(this.r, a1.d(R.dimen.arg_RES_7f070271));
       p1.c(this.r, 80, 80, 80, 80);
       oh0 = this.w;
       if (oh0 != null) {
          oh0.subscribe(new e0(this));
       }
       z c = d.c;
       z a = d.a;
       t ot = t.fromCallable(new f0(this)).subscribeOn(c).observeOn(a);
       t ot1 = t.fromCallable(new g0(this)).subscribeOn(c).observeOn(a);
       ot = t.zip(ot, ot1, new d0(this));
       this.X7(ot.subscribe(Functions.d(), Functions.d()));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "12")) {
          return;
       }
       this.v = null;
       this.p.setText("");
       this.p.setMovementMethod(null);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "10")) {
          return;
       }
       h0 ts = this.s;
       this.v.e2(this.u.P0(this.s), ts.mAgreementId, ts.isRequired, this.t.booleanValue());
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "8")) {
          return;
       }
       this.t = Boolean.valueOf((this.t.booleanValue() ^ 0x01));
       this.P8();
       this.S8();
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "9")) {
          return;
       }
       h0 tr = this.r;
       int i = (this.t.booleanValue())? 0x7f080484: 0x7f080481;
       tr.setPlaceHolderImage(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a330c);
       this.r = m1.f(p0, 0x7f0a3307);
       m1.a(p0, new b0(this), R.id.protocol_checkbox);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.s = this.q8(AuthInfoResponse$AgreementInfo.class);
       return;
    }
}
