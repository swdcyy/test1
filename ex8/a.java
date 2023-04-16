package ex8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ex8.a$a;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ex8.d;
import androidx.lifecycle.ViewModel;
import f66.i;
import jq.a;
import q87.c;
import android.view.View;
import java.lang.StringBuilder;
import android.widget.RadioButton;
import ex8.a$c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import ex8.a$b;
import ekd.m1;
import android.view.View$OnClickListener;
import com.kwai.library.widget.button.KwaiRadioGroup;
import android.widget.TextView;

public final class a extends PresenterV2	// class@00224d
{
    public View p;
    public TextView q;
    public TextView r;
    public KwaiRadioGroup s;
    public RadioButton t;
    public RadioButton u;
    public RadioButton v;
    public RadioButton w;
    public d x;
    public boolean y;
    public final GifshowActivity z;
    public static final a$a A;

    static {
       a.A = new a$a(null);
    }
    public void a(GifshowActivity p0){
       a.p(p0, "mActivity");
       super();
       this.z = p0;
       this.y = true;
    }
    public void E8(){
       a tx1;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       ViewModel viewModel = ViewModelProviders.of(this.z).get(d.class);
       a.o(viewModel, "ViewModelProviders.of\(mA¡­BarViewModel::class.java\)");
       this.x = viewModel;
       String str = "mViewModel";
       if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          uoa = this.x;
          if (uoa == null) {
             a.S(str);
          }
          int i = uoa.p0();
          String str1 = "mWrap";
          String str2 = "ShareBarPresenter";
          int i1 = 8;
          int i2 = 0;
          if (i <= 0) {
             Object[] objArray1 = new Object[i2];
             a.b().A(str2, "initOptionView not need show option", objArray1);
             uoa = this.p;
             if (uoa == null) {
                a.S(str1);
             }
             uoa.setVisibility(i1);
          }else {
             Object[] objArray2 = new Object[i2];
             a.b().w(str2, "initOptionView show "+i, objArray2);
             a tp = this.p;
             if (tp == null) {
                a.S(str1);
             }
             tp.setVisibility(i2);
             int i3 = 1;
             int i4 = 2;
             int i5 = 3;
             if (i > i5) {
                uoa = this.u;
                if (uoa == null) {
                   a.S("mRadioButtonIndex0");
                }
                a tx = this.x;
                if (tx == null) {
                   a.S(str);
                }
                this.P8(uoa, tx.o0(i2));
                uoa = this.t;
                if (uoa == null) {
                   a.S("mRadioButtonIndex1");
                }
                tx = this.x;
                if (tx == null) {
                   a.S(str);
                }
                this.P8(uoa, tx.o0(i3));
                uoa = this.v;
                if (uoa == null) {
                   a.S("mRadioButtonIndex2");
                }
                tx1 = this.x;
                if (tx1 == null) {
                   a.S(str);
                }
                this.P8(uoa, tx1.o0(i4));
                uoa = this.w;
                if (uoa == null) {
                   a.S("mRadioButtonIndex3");
                }
                tx1 = this.x;
                if (tx1 == null) {
                   a.S(str);
                }
                this.P8(uoa, tx1.o0(i5));
             }else if(i == i5){
                uoa = this.u;
                if (uoa == null) {
                   a.S("mRadioButtonIndex0");
                }
                a tx2 = this.x;
                if (tx2 == null) {
                   a.S(str);
                }
                this.P8(uoa, tx2.o0(i2));
                uoa = this.t;
                if (uoa == null) {
                   a.S("mRadioButtonIndex1");
                }
                a tx3 = this.x;
                if (tx3 == null) {
                   a.S(str);
                }
                this.P8(uoa, tx3.o0(i3));
                uoa = this.v;
                if (uoa == null) {
                   a.S("mRadioButtonIndex2");
                }
                tx1 = this.x;
                if (tx1 == null) {
                   a.S(str);
                }
                this.P8(uoa, tx1.o0(i4));
                uoa = this.w;
                if (uoa == null) {
                   a.S("mRadioButtonIndex3");
                }
                uoa.setVisibility(i1);
             }else if(i == i4){
                uoa = this.u;
                if (uoa == null) {
                   a.S("mRadioButtonIndex0");
                }
                tp = this.x;
                if (tp == null) {
                   a.S(str);
                }
                this.P8(uoa, tp.o0(i2));
                uoa = this.t;
                if (uoa == null) {
                   a.S("mRadioButtonIndex1");
                }
                tp = this.x;
                if (tp == null) {
                   a.S(str);
                }
                this.P8(uoa, tp.o0(i3));
                uoa = this.w;
                if (uoa == null) {
                   a.S("mRadioButtonIndex3");
                }
                uoa.setVisibility(i1);
                uoa = this.v;
                if (uoa == null) {
                   a.S("mRadioButtonIndex2");
                }
                uoa.setVisibility(i1);
             }else {
                uoa = this.u;
                if (uoa == null) {
                   a.S("mRadioButtonIndex0");
                }
                tx1 = this.x;
                if (tx1 == null) {
                   a.S(str);
                }
                this.P8(uoa, tx1.o0(i2));
                uoa = this.w;
                if (uoa == null) {
                   a.S("mRadioButtonIndex3");
                }
                uoa.setVisibility(i1);
                uoa = this.t;
                if (uoa == null) {
                   a.S("mRadioButtonIndex1");
                }
                uoa.setVisibility(i1);
                uoa = this.v;
                if (uoa == null) {
                   a.S("mRadioButtonIndex2");
                }
                uoa.setVisibility(i1);
             }
          }
       }
       uoa = this.x;
       if (uoa == null) {
          a.S(str);
       }
       uoa.b.observe(this.z, new a$c(this));
       return;
    }
    public final void P8(RadioButton p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       if (p1) {
          p0.setBackgroundResource(p1);
       }else {
          p0.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       a$b uob = new a$b(this);
       View view = m1.f(p0, R.id.third_party_container);
       a.o(view, "ViewBindUtils.bindWidget¡­id.third_party_container\)");
       this.p = view;
       View view1 = m1.f(p0, R.id.share_radio_btn_0);
       a.o(view1, "ViewBindUtils.bindWidget¡­, R.id.share_radio_btn_0\)");
       this.u = view1;
       m1.a(p0, uob, R.id.share_radio_btn_0);
       view1 = m1.f(p0, R.id.share_radio_btn_1);
       a.o(view1, "ViewBindUtils.bindWidget¡­, R.id.share_radio_btn_1\)");
       this.t = view1;
       m1.a(p0, uob, R.id.share_radio_btn_1);
       view1 = m1.f(p0, R.id.share_radio_btn_2);
       a.o(view1, "ViewBindUtils.bindWidget¡­, R.id.share_radio_btn_2\)");
       this.v = view1;
       m1.a(p0, uob, R.id.share_radio_btn_2);
       view1 = m1.f(p0, R.id.share_radio_btn_3);
       a.o(view1, "ViewBindUtils.bindWidget¡­, R.id.share_radio_btn_3\)");
       this.w = view1;
       m1.a(p0, uob, R.id.share_radio_btn_3);
       View view2 = m1.f(p0, R.id.third_party_panel_radio_group);
       a.o(view2, "ViewBindUtils.bindWidget¡­_party_panel_radio_group\)");
       this.s = view2;
       view2 = m1.f(p0, R.id.third_party_title);
       a.o(view2, "ViewBindUtils.bindWidget¡­, R.id.third_party_title\)");
       this.q = view2;
       p0 = m1.f(p0, R.id.third_party_desc);
       a.o(p0, "ViewBindUtils.bindWidget¡­w, R.id.third_party_desc\)");
       this.r = p0;
       return;
    }
}
