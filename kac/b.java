package kac.b;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import hbc.a;
import dac.b;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.View;
import i2b.a;
import hac.c1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import hac.d1;
import g9c.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n7c.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n7c.b;
import lnc.a1;
import n7c.e;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.ContactsEmptyException;
import k2b.e0;
import com.yxcorp.gifshow.relation.util.b;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import com.kwai.sdk.switchconfig.a;
import eac.a;
import java.lang.reflect.Type;
import ekd.k1;
import java.util.Locale;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;

public class b extends f	// class@003094
{
    public b l;
    public final View m;
    public final View n;
    public final boolean o;
    public PresenterV2 p;
    public a q;
    public View r;
    public boolean s;
    public View t;
    public View u;
    public View v;

    public void b(RecyclerFragment p0,a p1,boolean p2,b p3){
       super(p0);
       this.l = p3;
       this.q = p1;
       View view = a.a(p0.getContext(), R.layout.arg_RES_7f0d160d);
       this.m = view;
       View view1 = a.a(p0.getContext(), R.layout.arg_RES_7f0d160e);
       this.n = view1;
       this.r = a.a(p0.getContext(), 0x7f0d0215);
       c1 uoc1 = new c1();
       uoc1.f(view1);
       Object[] objArray = new Object[]{p1};
       uoc1.i(objArray);
       d1 uod1 = new d1();
       this.p = uod1;
       uod1.f(view);
       this.o = p2;
       this.g.ia().l1(this.e);
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.g.ia().l1(this.r);
       return;
    }
    public void i(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       this.x();
       GifshowActivity obj = PatchProxy.apply(objArray, objArray, c.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!c.g()){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          this.a.K(this.n);
       }else {
          this.v = a.i(this.a, 0x7f0d0401);
          obj = this.g.getActivity();
          if (obj != null) {
             b.a(this.v, obj, "TAG_FROM_CONTACT");
          }
          e.a(this.g, this.v.findViewById(R.id.contact_guide_no_pymk_layout), a1.e(312.00f), false);
          this.a.K(this.v);
       }
       return;
    }
    public void k(boolean p0,Throwable p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       int i = 1;
       uob = (!p1 instanceof KwaiException || (p1.getErrorCode() == -1 || p1 instanceof ContactsEmptyException))? 1: null;
       if (uob) {
          if (this.o != null) {
             this.f();
             if (c.f()) {
                b tl = this.l;
                if (tl != null && !tl.e()) {
                   View view = b.a(this.a, this.u, this.l, 85, this.g);
                   this.t = view;
                   float f = (c.d())? 0x42f00000: 200.00f;
                   view.setPadding(0, a1.e(f), 0, 0);
                   this.a.K(this.t);
                }
             }
             Object[] objArray = new Object[i];
             objArray[0] = this.q;
             this.p.i(objArray);
             this.a.K(this.m);
          }else {
             this.i();
          }
       }else {
          this.f();
          super.k(p0, p1);
       }
       return;
    }
    public void p(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          return;
       }
       b = this.g instanceof ExploreFriendContactFragment;
       this.s = b;
       if (b) {
          return;
       }
       a value = a.t().getValue("contactListBottomTips", a.class, objArray);
       if (value != null) {
          if (k1.f()) {
             String str = (Locale.getDefault().getCountry()).toUpperCase();
             value = (str.contains("TW") || str.contains("HK"))? value.mHK: value.mZh;
             objArray = value;
          }else {
             objArray = value.mEn;
          }
       }
       if (TextUtils.x(objArray)) {
          this.r.findViewById(R.id.contact_footer_tips).setText(R.string.arg_RES_7f1038e9);
       }else {
          this.r.findViewById(R.id.contact_footer_tips).setText(objArray);
       }
       if (!this.g.ia().T0(this.r)) {
          this.g.ia().L0(this.r);
       }
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       super.x();
       return;
    }
}
