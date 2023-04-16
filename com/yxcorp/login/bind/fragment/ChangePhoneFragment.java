package com.yxcorp.login.bind.fragment.ChangePhoneFragment;
import com.yxcorp.login.util.h$a;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment$f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import v0d.m;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment$e;
import erd.g;
import crd.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.login.util.h;
import java.util.Map;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import d1d.j;
import android.view.View$OnClickListener;
import d1d.k;
import d1d.l;
import d1d.m;
import d1d.n;
import com.yxcorp.login.bind.fragment.a;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment$a;
import android.text.TextWatcher;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment$b;
import android.text.TextUtils;
import android.content.Intent;
import com.yxcorp.login.userlogin.selectcountry.SelectCountryActivity;
import android.content.Context;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment$d;
import n3d.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import o56.a;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import java.lang.Throwable;
import h3b.b;
import q87.c;
import lnc.e;
import java.lang.StringBuilder;
import com.yxcorp.login.util.o;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment$c;

public class ChangePhoneFragment extends BaseFragment implements h$a, d	// class@001a4f
{
    public final g A;
    public final int j;
    public TextView k;
    public ImageView l;
    public TextView m;
    public EditText n;
    public TextView o;
    public EditText p;
    public TextView q;
    public TextView r;
    public View s;
    public String t;
    public int u;
    public String v;
    public String w;
    public String x;
    public int y;
    public m z;
    public static final int B;

    public void ChangePhoneFragment(){
       super();
       this.j = 1;
       this.A = new ChangePhoneFragment$f(this);
    }
    public void Hc(boolean p0){
       if (PatchProxy.isSupport(ChangePhoneFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ChangePhoneFragment.class, "9")) {
          return;
       }
       if (p0) {
          try{
             this.o.setEnabled(false);
             this.z.c(this.getActivity(), this.t, TextUtils.G(this.p).toString(), 7).compose(c.c(this.m(), FragmentEvent.DESTROY)).subscribe(this.A, new ChangePhoneFragment$e(this));
          }catch(java.security.InvalidParameterException e0){
             this.o.setEnabled(e0);
          }
          return;
       }else {
          this.o.setEnabled(true);
          return;
       }
    }
    public int M(){
       return 1;
    }
    public final boolean ch(String p0,int p1){
       if (PatchProxy.isSupport(ChangePhoneFragment.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ChangePhoneFragment.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (TextUtils.x(p0)) {
          i.a(R.style.arg_RES_7f11066a, p1);
          return true;
       }else {
          return false;
       }
    }
    public void dh(){
       if (PatchProxy.applyVoid(null, this, ChangePhoneFragment.class, "8")) {
          return;
       }
       String str = TextUtils.G(this.p).toString();
       if (!this.ch(this.t, 0x7f1008f1) && !this.ch(str, 0x7f103be4)) {
          this.n.setText("");
          this.o.setEnabled(false);
          h oh = new h();
          oh.c(this);
          oh.a(h.b(this.t, str, 4), this.getActivity());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangePhoneFragment.class, "2")) {
          return;
       }
       this.k = m1.f(p0, 0x7f0a09b7);
       this.l = m1.f(p0, 0x7f0a09b4);
       this.m = m1.f(p0, 0x7f0a2b4d);
       this.n = m1.f(p0, 0x7f0a43cc);
       this.o = m1.f(p0, 0x7f0a43db);
       this.p = m1.f(p0, 0x7f0a3001);
       this.q = m1.f(p0, 0x7f0a43d8);
       this.r = m1.f(p0, 0x7f0a43d6);
       this.s = m1.f(p0, 0x7f0a0744);
       m1.a(p0, new j(this), R.id.left_btn);
       m1.a(p0, new k(this), R.id.country_code_layout);
       m1.a(p0, new l(this), R.id.country_code_iv);
       m1.a(p0, new m(this), R.id.verify_tv);
       m1.a(p0, new n(this), R.id.clear_layout);
       m1.a(p0, new a(this), R.id.verify_phone_confirm_tv);
       m1.e(p0, new ChangePhoneFragment$a(this), R.id.phone_et);
       m1.e(p0, new ChangePhoneFragment$b(this), R.id.verify_et);
       return;
    }
    public void eh(){
       if (PatchProxy.applyVoid(null, this, ChangePhoneFragment.class, "12")) {
          return;
       }
       if (!TextUtils.isEmpty(this.p.getText()) && !TextUtils.isEmpty(this.n.getText())) {
          this.r.setEnabled(true);
       }else {
          this.r.setEnabled(false);
       }
       return;
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, ChangePhoneFragment.class, "7")) {
          return;
       }
       this.getActivity().t1(new Intent(this.getActivity(), SelectCountryActivity.class), 1, new ChangePhoneFragment$d(this));
       return;
    }
    public final void gh(int p0,String p1){
       if (PatchProxy.isSupport(ChangePhoneFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ChangePhoneFragment.class, "15")) {
          return;
       }
       int i = 0;
       if (p0 > 0) {
          this.l.setVisibility(i);
          this.k.setVisibility(i);
          this.m.setVisibility(8);
          this.l.setImageResource(p0);
          this.k.setText(p1);
       }else {
          this.l.setVisibility(8);
          this.k.setVisibility(8);
          this.m.setVisibility(i);
          this.m.setText(p1);
       }
       return;
    }
    public String o(){
       return "CHANGE_PHONE_NUMBER";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangePhoneFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.v = this.getArguments().getString("arg_verify_code");
       this.w = this.getArguments().getString("arg_phone_number");
       this.x = this.getArguments().getString("arg_country_code");
       int intx = this.getArguments().getInt("arg_country_flag_res_id");
       this.y = intx;
       this.t = this.x;
       this.u = intx;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ChangePhoneFragment.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       this.z = new m();
       View view = a.i(p1, R.layout.arg_RES_7f0d01a2);
       this.doBindView(view);
       p2.width = (int)((float)(n.z(a.B) - a1.e(38.00f)) * 0x3f19999a);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ChangePhoneFragment.class, "5")) {
          return;
       }
       this.z.a();
       super.onDestroyView();
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangePhoneFragment.class, "10")) {
          return;
       }
       this.o.setEnabled(true);
       Object[] objArray = new Object[0];
       b.C().t("ChangePhoneRiskCheck", "network error", objArray);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ChangePhoneFragment.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       e.b(p0, R.drawable.arg_RES_7f0819d9, -1, R.string.arg_RES_7f1016ae);
       this.gh(this.u, this.t);
       Object[] objArray = new Object[]{this.x+o.a(this.w)};
       this.q.setText(this.getString(R.string.arg_RES_7f1004ff, objArray));
       this.o.setOnClickListener(new ChangePhoneFragment$c(this));
       return;
    }
}
