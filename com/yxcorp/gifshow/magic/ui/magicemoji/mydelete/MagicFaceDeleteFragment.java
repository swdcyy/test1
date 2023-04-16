package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.MagicFaceDeleteFragment;
import ml8.d;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;
import v4b.m;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import s5b.b;
import q87.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.c;
import java.util.ArrayList;
import c4b.f;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.DeleteTopTitlePresenter$DeleteTopTitleItem;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.ToDeleteMagicFace;
import lnc.a1;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$c;
import androidx.recyclerview.widget.GridLayoutManager;
import v4b.i;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import g9c.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment;

public class MagicFaceDeleteFragment extends BaseFragment implements d, g	// class@001bd2
{
    public e j;
    public BaseFragment k;
    public c l;
    public RecyclerView m;
    public PresenterV2 n;

    public void MagicFaceDeleteFragment(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceDeleteFragment.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       FragmentActivity activity = this.k.getActivity();
       if (activity != null) {
          p0.setPadding(0, n.A(activity), 0, 0);
       }
       this.m = p0.findViewById(0x7f0a0a87);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicFaceDeleteFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MagicFaceDeleteFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MagicFaceDeleteFragment.class, new m());
       }else {
          obj.put(MagicFaceDeleteFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceDeleteFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.k = this;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicFaceDeleteFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d1031, p1, false);
       this.doBindView(view);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MagicFaceDeleteFragment.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicFaceDeleteFragment", "onDestroyView", objArray);
       super.onDestroyView();
       MagicFaceDeleteFragment tj = this.j;
       if (tj != null) {
          tj.Z0();
          this.j.Q1();
       }
       tj = this.m;
       if (tj != null) {
          tj.setAdapter(null);
       }
       tj = this.n;
       if (tj != null) {
          tj.unbind();
          this.n.destroy();
          this.n = null;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i;
       int i1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicFaceDeleteFragment.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicFaceDeleteFragment", "onViewCreated", objArray);
       super.onViewCreated(p0, p1);
       this.l = new c();
       if (!PatchProxy.applyVoid(null, this, MagicFaceDeleteFragment.class, "6") && this.m != null) {
          ArrayList uArrayList = new ArrayList();
          f h = f.b().h;
          if (!q.f(h)) {
             i = h.size();
             uArrayList.add(new DeleteTopTitlePresenter$DeleteTopTitleItem(1, "collect_title"));
             uArrayList.addAll(ToDeleteMagicFace.transMagicFaceList(h, 1));
          }else {
             i = 0;
          }
          h = f.b().i;
          if (!q.f(h)) {
             i1 = h.size();
             int i2 = 2;
             uArrayList.add(new DeleteTopTitlePresenter$DeleteTopTitleItem(i2, "history_title"));
             uArrayList.addAll(ToDeleteMagicFace.transMagicFaceList(h, i2));
          }else {
             i1 = 0;
          }
          MagicFaceAdapter$a uoa = MagicFaceAdapter.H1();
          uoa.d(this.m);
          uoa.j = true;
          uoa.e(this.l);
          this.j = new e(uoa, i, i1);
          GridLayoutManager gridLayoutMa = new GridLayoutManager(this.getActivity(), 5);
          gridLayoutMa.m1(new i(this));
          this.m.setLayoutManager(gridLayoutMa);
          this.m.setAdapter(this.j);
          this.j.W0(uArrayList);
          MagicFaceFragment.eh(this.m, a1.d(R.dimen.arg_RES_7f070a69), 0, 1);
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.n = presenterV2;
       presenterV2.U7(this.l);
       this.n.f(p0);
       Object[] objArray1 = new Object[]{this};
       this.n.i(objArray1);
       return;
    }
}
