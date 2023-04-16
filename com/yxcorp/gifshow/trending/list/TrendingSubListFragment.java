package com.yxcorp.gifshow.trending.list.TrendingSubListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import tkc.i;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.trending.list.TrendingSubListFragment$a;
import java.util.List;
import ykc.a0;
import java.util.Map;
import java.lang.Boolean;
import qvb.a;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.entity.TrendingListRequestInfo;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import zkc.n;
import im8.c;
import androidx.recyclerview.widget.RecyclerView;
import lnc.a1;
import android.view.ViewGroup;
import y8c.g;
import com.yxcorp.gifshow.trending.list.TrendingListAdapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import qvb.i;

public class TrendingSubListFragment extends RecyclerFragment	// class@001db0
{
    public i F;
    public PresenterV2 G;
    public PublishSubject H;
    public PublishSubject I;
    public TrendingListAdapter J;
    public boolean K;
    public a L;
    public Map M;
    public PublishSubject N;
    public c O;
    public TrendingListRequestInfo P;
    public c Q;

    public void TrendingSubListFragment(){
       super();
       this.F = new i();
       this.K = false;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, TrendingSubListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TrendingSubListFragment$a(this, this);
    }
    public boolean S1(){
       return false;
    }
    public List fg(){
       Object obj = PatchProxy.apply(null, this, TrendingSubListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.fg();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TrendingSubListFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, TrendingSubListFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(TrendingSubListFragment.class, new a0());
       }else {
          obj.put(TrendingSubListFragment.class, null);
       }
       return obj;
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, TrendingSubListFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.i0() && !this.F.getCount())? true: false;
       return b;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TrendingSubListFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.P == null) {
          TrendingListRequestInfo serializable = SerializableHook.getSerializable(this.getArguments(), "TRENDING_LIST_REQUEST_INFO");
          this.P = serializable;
          if (serializable != null) {
             this.F.l2(serializable);
          }
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TrendingSubListFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       TrendingSubListFragment tG = this.G;
       if (tG != null) {
          tG.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TrendingSubListFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, TrendingSubListFragment.class, "3")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.G = presenterV2;
          presenterV2.f(this.getView());
          this.G.U7(new n(this.M));
          Object[] objArray = new Object[]{new c("FRAGMENT", this),this};
          this.G.i(objArray);
       }
       if (this.K == null) {
          this.h0().setClipToPadding(false);
          this.h0().setPadding(false, false, false, a1.e(64.50f));
       }
       return;
    }
    public g vh(){
       TrendingListAdapter obj = PatchProxy.apply(null, this, TrendingSubListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TrendingListAdapter();
       this.J = obj;
       obj.w = this.H;
       obj.y = this.Q;
       obj.x = this.I;
       if (this.K != null) {
          obj.z = true;
          obj.B = this.L;
          obj.A = this.M;
          obj.C = this.N;
       }
       return obj;
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, TrendingSubListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LinearLayoutManager(this.getContext());
    }
    public i yh(){
       return this.F;
    }
}
