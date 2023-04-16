package com.yxcorp.gifshow.share.widget.ForwardGridFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridFragment$a;
import nsd.u;
import android.widget.LinearLayout;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.l1;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.List;
import com.yxcorp.gifshow.share.widget.ForwardPageFragment;
import xz6.d;
import java.util.Collection;
import android.widget.ListAdapter;
import android.widget.GridView;
import com.yxcorp.gifshow.share.widget.ForwardGridFragment$adaptScreenOrientation$$inlined$apply$lambda$1;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.share.widget.ForwardGridFragment$b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.share.widget.ForwardGridFragment$c;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.KwaiDialogFragment;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import com.yxcorp.gifshow.share.widget.ForwardGridFragment$d;
import android.view.View$OnClickListener;
import ekd.f;

public final class ForwardGridFragment extends BottomSheetFragment	// class@001cbd
{
    public ViewPager A;
    public LinearLayout B;
    public int C;
    public List D;
    public p E;
    public q F;
    public t G;
    public View z;
    public static final ForwardGridFragment$a H;

    static {
       ForwardGridFragment.H = new ForwardGridFragment$a(null);
    }
    public void ForwardGridFragment(){
       super();
    }
    public static final LinearLayout Ih(ForwardGridFragment p0){
       p0 = p0.B;
       if (p0 == null) {
          a.S("pageIndicator");
       }
       return p0;
    }
    public final void Jh(){
       int i4;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, ForwardGridFragment.class, "7")) {
          return;
       }
       int i = (l1.a())? 6: 4;
       int i1 = (l1.a())? 1: 2;
       ForwardGridFragment b = obj.B;
       if (b == null) {
          a.S("pageIndicator");
       }
       b.removeAllViews();
       ArrayList uArrayList = new ArrayList();
       ForwardGridFragment d = obj.D;
       if (d != null) {
          Ref$IntRef intRef = new Ref$IntRef();
          intRef.element = 0;
          while (intRef.element < d.size()) {
             ForwardPageFragment uForwardPage = new ForwardPageFragment();
             Ref$IntRef element = intRef.element;
             int i2 = i * i1;
             int i3 = element + i2;
             i3 = (i3 > d.size())? d.size(): intRef.element + i2;
             List list = d.subList(element, i3);
             if (!PatchProxy.applyVoidOneRefs(list, uForwardPage, ForwardPageFragment.class, "1")) {
                uForwardPage.c.c();
                if (list != null) {
                   uForwardPage.c.b(list);
                }
                ForwardPageFragment b2 = uForwardPage.b;
                if (b2 != null) {
                   b2.setAdapter(uForwardPage.c);
                }
             }
             ForwardGridFragment$adaptScreenOrientation$$inlined$apply$lambda$1 uoadaptScree = v5;
             ForwardGridFragment$adaptScreenOrientation$$inlined$apply$lambda$1 uoadaptScree1 = v5;
             ForwardPageFragment uForwardPage1 = uForwardPage;
             uoadaptScree = new ForwardGridFragment$adaptScreenOrientation$$inlined$apply$lambda$1(uForwardPage, this, d, intRef, i, i1);
             uForwardPage1.d = uoadaptScree1;
             uForwardPage1.e = obj.F;
             uArrayList.add(uForwardPage1);
             b = obj.B;
             if (b == null) {
                a.S("pageIndicator");
             }
             ForwardGridFragment b1 = obj.B;
             if (b1 == null) {
                a.S("pageIndicator");
             }
             b.addView(a.i(b1, R.layout.arg_RES_7f0d0861));
             i4 = intRef.element + i2;
             intRef.element = i4;
             uForwardPage1 = null;
          }
          b = obj.B;
          if (b == null) {
             a.S("pageIndicator");
          }
          View childAt = b.getChildAt(0);
          if (childAt != null) {
             childAt.setBackgroundResource(R.drawable.arg_RES_7f081a4d);
          }
          b = obj.B;
          if (b == null) {
             a.S("pageIndicator");
          }
          int i5 = (uArrayList.size() > 1)? 0: 8;
          b.setVisibility(i5);
          b = obj.z;
          if (b == null) {
             a.S("divider");
          }
          ForwardGridFragment b3 = obj.B;
          if (b3 == null) {
             a.S("pageIndicator");
          }
          int i6 = (!b3.getVisibility())? 8: 0;
          b.setVisibility(i6);
          b = obj.A;
          String str = "viewPager";
          if (b == null) {
             a.S(str);
          }
          c childFragmen = this.getChildFragmentManager();
          a.o(childFragmen, "childFragmentManager");
          b.setAdapter(new ForwardGridFragment$b(childFragmen, uArrayList));
          b = obj.A;
          if (b == null) {
             a.S(str);
          }
          b.addOnPageChangeListener(new ForwardGridFragment$c(obj));
          i4 = Math.min(i1, (int)Math.ceil(((double)d.size() / (double)i)));
          b3 = obj.A;
          if (b3 == null) {
             a.S(str);
          }
          b3.getLayoutParams().height = obj.C * i4;
       }
       return;
    }
    public final boolean Kh(){
       Object obj = PatchProxy.apply(null, this, ForwardGridFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.D != null) {
          return true;
       }
       this.dismissAllowingStateLoss();
       return false;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       Dialog dialog = this.getDialog();
       Window window = (dialog != null)? dialog.getWindow(): null;
       if (window != null) {
          window.setWindowAnimations(R.style.arg_RES_7f1103db);
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridFragment.class, "5")) {
          return;
       }
       a.p(p0, "newConfig");
       super.onConfigurationChanged(p0);
       if (!this.Kh()) {
          return;
       }
       this.Jh();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ForwardGridFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d047e, p1, false);
       View view1 = view.findViewById(R.id.pager);
       a.o(view1, "rootView.findViewById\(R.id.pager\)");
       this.A = view1;
       view1 = view.findViewById(R.id.indicator_divider);
       a.o(view1, "rootView.findViewById\(R.id.indicator_divider\)");
       this.z = view1;
       view1 = view.findViewById(R.id.page_indicator);
       a.o(view1, "rootView.findViewById\(R.id.page_indicator\)");
       this.B = view1;
       ForwardGridFragment tA = this.A;
       if (tA == null) {
          a.S("viewPager");
       }
       this.C = tA.getLayoutParams().height;
       view.findViewById(R.id.cancel_button).setOnClickListener(new ForwardGridFragment$d(this));
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ForwardGridFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       if (!this.Kh()) {
          return;
       }
       this.Jh();
       f.f(p0);
       return;
    }
}
