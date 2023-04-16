package com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment;
import com.kuaishou.gifshow.kuaishan.ui.preview.b$a;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.gifshow.kuaishan.ui.preview.c;
import androidx.fragment.app.Fragment;
import r90.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.text.TextPaint;
import r90.c;
import android.view.View$OnTouchListener;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.kwai.robust.PatchProxyResult;
import r90.i;
import java.util.Map;
import java.util.HashMap;
import androidx.viewpager.widget.ViewPager$i;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import r90.c0;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import u80.e;
import w46.b;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.DialogFragment;
import r90.a;
import android.content.DialogInterface$OnDismissListener;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import e17.i;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment$b;
import android.widget.FrameLayout;
import java.lang.Boolean;
import android.view.ViewGroup;
import u79.o;
import u79.a;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$b;
import com.kuaishou.gifshow.kuaishan.model.UITemplatePreviewItem;
import com.kuaishou.gifshow.kuaishan.ui.preview.f;
import t90.j;
import java.lang.Integer;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Objects;
import r90.r;
import java.util.ArrayList;
import r90.r$a;
import java.lang.Runnable;
import ekd.k1;
import crd.a;
import java.lang.System;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.kuaishou.gifshow.kuaishan.widget.KSVerticalViewPager;
import android.view.ViewTreeObserver;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import h3.a;
import com.kuaishou.gifshow.kuaishan.ui.preview.b;

public abstract class BaseTemplatePreviewFragment extends BaseFragment implements b$a, g	// class@001ada
{
    public ProgressFragment A;
    public t B;
    public final View$OnClickListener C;
    public PresenterV2 j;
    public c0 k;
    public BaseFragment l;
    public KwaiActionBar m;
    public KSVerticalViewPager n;
    public View o;
    public TextView p;
    public ViewGroup q;
    public KwaiEmptyStateView r;
    public View s;
    public TextView t;
    public ProgressBar u;
    public b v;
    public final c w;
    public boolean x;
    public int y;
    public boolean z;
    public static final int D;

    public void BaseTemplatePreviewFragment(){
       super();
       this.l = this;
       this.w = new c(this);
       this.y = 0;
       this.z = false;
       this.C = new b(this);
    }
    public void F5(){
       if (PatchProxy.applyVoid(null, this, BaseTemplatePreviewFragment.class, "18")) {
          return;
       }
       this.ih();
       return;
    }
    public abstract void L();
    public void ch(){
       if (PatchProxy.applyVoid(null, this, BaseTemplatePreviewFragment.class, "13")) {
          return;
       }
       this.t.setVisibility(0);
       this.t.getPaint().setFakeBoldText(true);
       this.t.setClickable(0);
       this.t.setOnTouchListener(new c(this));
       this.t.setOnClickListener(new BaseTemplatePreviewFragment$c(this));
       return;
    }
    public void dh(){
       if (PatchProxy.applyVoid(null, this, BaseTemplatePreviewFragment.class, "16")) {
          return;
       }
       BaseTemplatePreviewFragment tA = this.A;
       if (tA != null) {
          tA.dismiss();
          this.A = null;
       }
       return;
    }
    public abstract void eh();
    public abstract void fh();
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseTemplatePreviewFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, BaseTemplatePreviewFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(BaseTemplatePreviewFragment.class, new i());
       }else {
          obj.put(BaseTemplatePreviewFragment.class, null);
       }
       return obj;
    }
    public abstract ViewPager$i gh();
    public void hh(){
       if (PatchProxy.applyVoid(null, this, BaseTemplatePreviewFragment.class, "10")) {
          return;
       }
       if (this.getView() == null) {
          return;
       }
       this.j = new PresenterV2();
       c0 uoc0 = new c0();
       this.k = uoc0;
       this.j.U7(uoc0);
       this.j.f(this.getView());
       Object[] objArray = new Object[]{this};
       this.j.i(objArray);
       this.z = true;
       return;
    }
    public abstract void ih();
    public abstract void jh();
    public void kh(){
       if (PatchProxy.applyVoid(null, this, BaseTemplatePreviewFragment.class, "14")) {
          return;
       }
       BaseTemplatePreviewFragment tt = this.t;
       if (tt != null && this.u != null) {
          tt.setText(a1.p(R.string.arg_RES_7f101bd5));
          this.u.setProgress(0);
          this.t.setClickable(true);
       }
       return;
    }
    public void lh(){
       if (PatchProxy.applyVoid(null, this, BaseTemplatePreviewFragment.class, "15")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity == null) {
          Object[] objArray = new Object[0];
          e.D().t("BaseTemplatePreviewFragment", "showProgressDialog: wrong activity is null", objArray);
          return;
       }else {
          this.dh();
          ProgressFragment progressFrag = new ProgressFragment();
          this.A = progressFrag;
          progressFrag.show(activity.getSupportFragmentManager(), "ks_template_load");
          this.A.setCancelable(true);
          this.A.k0(new a(this));
          return;
       }
    }
    public void mh(){
       if (PatchProxy.applyVoid(null, this, BaseTemplatePreviewFragment.class, "11")) {
          return;
       }
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       uoa.p(new BaseTemplatePreviewFragment$b(this));
       uoa.a(this.r);
       this.r.setVisibility(0);
       this.dh();
       return;
    }
    public void nh(boolean p0){
       Object[] objArray1;
       if (PatchProxy.isSupport(BaseTemplatePreviewFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseTemplatePreviewFragment.class, "12")) {
          return;
       }
       int i = 0;
       this.q.setVisibility(i);
       this.kh();
       if (p0) {
          ClientEvent$ElementPackage obj = null;
          UITemplatePreviewItem uITemplatePr = (this.w.C() instanceof c$b)? this.w.C().A(): obj;
          if (uITemplatePr != null) {
             f b = this.w.C().b;
             BaseTemplatePreviewFragment tl = this.l;
             UITemplatePreviewItem mTemplateId = uITemplatePr.mTemplateId;
             UITemplatePreviewItem mName = uITemplatePr.mName;
             UITemplatePreviewItem mGroupId = uITemplatePr.mGroupId;
             uITemplatePr = uITemplatePr.mGroupName;
             j oj = j.class;
             if (PatchProxy.isSupport(oj)) {
                Object[] objArray = new Object[]{tl,mTemplateId,mName,mGroupId,uITemplatePr,Integer.valueOf(b)};
                if (!PatchProxy.applyVoid(objArray, obj, oj, "8")) {
                }
             }else {
             }
          }
       }
    label_00d0 :
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, BaseTemplatePreviewFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       e.D().w("BaseTemplatePreviewFragment", "onBackPressed: mLoadingDialog="+this.A, objArray);
       if (this.A != null) {
          return 0;
       }
       this.L();
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseTemplatePreviewFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       e.D().w("BaseTemplatePreviewFragment", "onCreate: savedInstanceState="+p0, objArray);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BaseTemplatePreviewFragment.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return p0.inflate(0x7f0d15be, null);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, BaseTemplatePreviewFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       e.D().s("BaseTemplatePreviewFragment", "onDestroyView\(\) called", objArray);
       BaseTemplatePreviewFragment tj = this.j;
       if (tj != null) {
          if (this.z != null) {
             tj.unbind();
             this.z = false;
          }
          this.j.destroy();
          this.j = null;
       }
       this.dh();
       tj = this.w;
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoid(null, tj, c.class, "4")) {
          c l = tj.l;
          if (l != null && !PatchProxy.applyVoid(null, l, r.class, "5")) {
             l.c.clear();
             r f = l.f;
             Objects.requireNonNull(f);
             if (!PatchProxy.applyVoid(null, f, r$a.class, "2")) {
                k1.m(f);
                f.c = null;
                f.d = -1;
             }
             l.e.clear();
             l.d = -1;
          }
          tj.n.dispose();
          c.o = false;
          tj.z();
       }
       this.m = null;
       this.n = null;
       this.q = null;
       this.t = null;
       this.u = null;
       this.s = null;
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, BaseTemplatePreviewFragment.class, "7")) {
          return;
       }
       super.onPause();
       Object[] objArray = new Object[0];
       e.D().s("BaseTemplatePreviewFragment", "onPause", objArray);
       this.w.E();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, BaseTemplatePreviewFragment.class, "6")) {
          return;
       }
       super.onResume();
       Object[] objArray = new Object[0];
       e.D().s("BaseTemplatePreviewFragment", "onResume", objArray);
       this.w.F();
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseTemplatePreviewFragment.class, "1")) {
          return;
       }
       super.onSaveInstanceState(p0);
       Object[] objArray = new Object[0];
       e.D().w("BaseTemplatePreviewFragment", "onSaveInstanceState: outState="+p0, objArray);
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseTemplatePreviewFragment.class, "5")) {
          return;
       }
       super.onStart();
       Object[] objArray1 = new Object[0];
       e.D().s("BaseTemplatePreviewFragment", "onStart", objArray1);
       BaseTemplatePreviewFragment tw = this.w;
       Objects.requireNonNull(tw);
       if (!PatchProxy.applyVoid(objArray, tw, c.class, "2")) {
          tw.g = System.currentTimeMillis();
       }
       return;
    }
    public void onStop(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseTemplatePreviewFragment.class, "8")) {
          return;
       }
       super.onStop();
       Object[] objArray1 = new Object[0];
       e.D().s("BaseTemplatePreviewFragment", "onStop", objArray1);
       BaseTemplatePreviewFragment tw = this.w;
       Objects.requireNonNull(tw);
       if (!PatchProxy.applyVoid(objArray, tw, c.class, "3")) {
          c uoc = null;
          if (tw.g - uoc > 0) {
             uoc = System.currentTimeMillis() - tw.g;
          }
          c uoc1 = uoc;
          o oo = tw.C();
          if (oo instanceof c$b) {
             c i = tw.i;
             if (i instanceof e0) {
                j.i(i, oo.S, oo.T, oo.U, oo.V, tw.f, uoc1);
             }
          }
       }
    label_005e :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseTemplatePreviewFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.m = p0.findViewById(0x7f0a3f6a);
       this.n = p0.findViewById(0x7f0a444e);
       ViewGroup viewGroup = p0.findViewById(R.id.bottom_area);
       this.q = viewGroup;
       viewGroup.setVisibility(4);
       this.t = p0.findViewById(0x7f0a10fb);
       this.u = p0.findViewById(0x7f0a10fc);
       this.r = p0.findViewById(0x7f0a0d35);
       View view = p0.findViewById(R.id.main_info);
       this.s = view;
       view.setVisibility(4);
       this.r.q(3);
       this.p = p0.findViewById(0x7f0a3643);
       this.n.getViewTreeObserver().addOnGlobalLayoutListener(new BaseTemplatePreviewFragment$a(this));
       this.m.h(this.C);
       this.n.setOffscreenPageLimit(1);
       this.n.setAdapter(this.w);
       if (this.gh() != null) {
          this.n.b(this.gh());
       }
       b uob = new b(this.n, this);
       this.v = uob;
       view.k = uob;
       this.ch();
       return;
    }
}
