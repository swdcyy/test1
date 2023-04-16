package com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment;
import hka.a;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import g9c.a;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.View;
import ekd.m1;
import android.widget.ScrollView;
import com.nex3z.flowlayout.FlowContainerView;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout;
import com.kwai.library.widget.specific.misc.LoadingView;
import java.lang.Boolean;
import android.content.Context;
import android.os.IBinder;
import com.yxcorp.utility.n;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$b;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout$b;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$i;
import cb1.c;
import cb1.b;
import brd.t;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$d;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$e;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.b9;
import va1.b;
import ekd.i;

public class LiveSensitiveWordsFragment extends BaseFragment implements a, d	// class@000f4e
{
    public boolean j;
    public final RecyclerView$i k;
    public View l;
    public KwaiActionBar m;
    public ScrollView n;
    public LoadingView o;
    public SensitiveWordInputLayout p;
    public FlowContainerView q;
    public TextView r;
    public g s;
    public b t;

    public void LiveSensitiveWordsFragment(){
       super();
       this.k = new LiveSensitiveWordsFragment$a(this);
    }
    public String ch(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveSensitiveWordsFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getArguments() != null) {
          objArray = this.getArguments().getString("authorId");
       }
       return objArray;
    }
    public void dh(){
       if (PatchProxy.applyVoid(null, this, LiveSensitiveWordsFragment.class, "6")) {
          return;
       }
       if (this.s.getItemCount() > 0) {
          this.r.setText(R.string.arg_RES_7f100d9f);
       }else {
          this.r.setText("");
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSensitiveWordsFragment.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3881);
       this.n = m1.f(p0, 0x7f0a3754);
       this.q = m1.f(p0, 0x7f0a3cd6);
       this.p = m1.f(p0, 0x7f0a13ff);
       this.o = m1.f(p0, 0x7f0a2921);
       return;
    }
    public boolean onBackPressed(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, LiveSensitiveWordsFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveSensitiveWordsFragment.class, "9")) {
          n.E(this.l.getContext(), this.l.getWindowToken());
          if (this.getParentFragment() != null) {
             obj = this.getParentFragment().getChildFragmentManager().beginTransaction();
             obj.y(R.anim.arg_RES_7f010105, 0x7f01010d);
             obj.u(this).m();
          }else {
             this.getActivity().finish();
          }
       }
       return true;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveSensitiveWordsFragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d14b4, p1, false);
       this.l = view;
       this.doBindView(view);
       this.m = this.l.findViewById(0x7f0a3f6a);
       this.l.findViewById(R.id.title_tv).setTextColor(this.getContext().getResources().getColor(R.color.arg_RES_7f0607de));
       this.m.d(-1, -1, R.string.arg_RES_7f1003c6);
       this.m.setBackground(null);
       this.l.setBackground(this.getContext().getResources().getDrawable(R.drawable.arg_RES_7f0810a5));
       ViewGroup$MarginLayoutParams layoutParams = this.m.getLayoutParams();
       layoutParams.height = a1.e(48.00f);
       this.m.setLayoutParams(layoutParams);
       this.p.setInputListener(new LiveSensitiveWordsFragment$b(this));
       LiveSensitiveWordsFragment$c uoc = new LiveSensitiveWordsFragment$c(this);
       this.s = uoc;
       this.q.setAdapter(uoc);
       this.dh();
       this.s.F0(this.k);
       this.p.setEnabled(false);
       this.t = b.b().n(this.ch()).subscribe(new LiveSensitiveWordsFragment$d(this), new LiveSensitiveWordsFragment$e(this, this.getActivity()));
       this.getActivity().F2(this);
       return this.l;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveSensitiveWordsFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       this.s.I0(this.k);
       this.getActivity().l3(this);
       b9.a(this.t);
       n.C(this.getActivity());
       b.b(this.getActivity());
       if (this.j != null) {
          i.a(this.getActivity(), 0, 0);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSensitiveWordsFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       b.a(this.getActivity(), p0.findViewById(R.id.title_root));
       return;
    }
}
