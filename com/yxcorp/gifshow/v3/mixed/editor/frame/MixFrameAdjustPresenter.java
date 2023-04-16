package com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.mixed.model.b;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.mixed.editor.frame.b;
import dwc.c;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustInfo;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustPresenter$1;
import android.content.Context;
import com.yxcorp.utility.n;
import java.util.Iterator;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import ekd.m1;

public class MixFrameAdjustPresenter extends PresenterV2	// class@00154c
{
    public RecyclerView p;
    public b q;
    public b r;
    public static final int s;
    public static final int t;

    static {
       MixFrameAdjustPresenter.s = a1.d(0x7f0702c8);
       MixFrameAdjustPresenter.t = a1.e(16.00f);
    }
    public void MixFrameAdjustPresenter(){
       super();
    }
    public void E8(){
       MixFrameAdjustPresenter mixFrameAdju = MixFrameAdjustPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, mixFrameAdju, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity);
       this.q = ViewModelProviders.of(activity).get(b.class);
       if (this.r == null) {
          this.r = new b();
       }
       this.r.g = new c(this);
       MixFrameAdjustPresenter tq = this.q;
       tq.z0(tq.t.getValue(), this.r.Q0());
       MixFrameAdjustPresenter$1 u1 = new MixFrameAdjustPresenter$1(this, this.getContext(), 0, 0);
       int s = MixFrameAdjustPresenter.s;
       if (this.getActivity() != null) {
          s = n.k(this.getActivity());
          Iterator iterator = this.r.Q0().iterator();
          int i = 0;
          while (iterator.hasNext()) {
             i = i + iterator.next().mIconWidth;
          }
          s = ((s - i) - (MixFrameAdjustPresenter.t * 2)) / (this.r.getItemCount() - 1);
       }
       b uob = new b(0, MixFrameAdjustPresenter.t, s);
       this.p.removeItemDecoration(uob);
       this.p.addItemDecoration(uob);
       this.p.setLayoutManager(u1);
       this.p.setAdapter(this.r);
       if (!PatchProxy.applyVoid(objArray, this, mixFrameAdju, "3")) {
          ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
          layoutParams.topMargin = a1.d(0x7f07027a);
          layoutParams.bottomMargin = a1.d(0x7f070329);
          this.p.setLayoutParams(layoutParams);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixFrameAdjustPresenter.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0ff6);
       return;
    }
}
