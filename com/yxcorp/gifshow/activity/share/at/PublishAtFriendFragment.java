package com.yxcorp.gifshow.activity.share.at.PublishAtFriendFragment;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendDefaultFragment;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendSearchFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ag6.a;
import java.util.Objects;
import lw8.a;
import java.lang.CharSequence;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import qvb.i;
import mrd.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class PublishAtFriendFragment extends LazyInitSupportedFragment	// class@001372
{
    public boolean s;
    public final PublishAtFriendDefaultFragment t;
    public final PublishAtFriendSearchFragment u;
    public boolean v;
    public String w;

    public void PublishAtFriendFragment(){
       super();
       this.t = new PublishAtFriendDefaultFragment();
       this.u = new PublishAtFriendSearchFragment();
       this.w = "";
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PublishAtFriendFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d1288, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­layout, container, false\)");
       return view;
    }
    public final void mh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PublishAtFriendFragment.class, "7")) {
          return;
       }
       String str = "searchKey";
       a.p(p0, str);
       this.w = p0;
       if (this.v != null) {
          PublishAtFriendFragment tu = this.u;
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoidOneRefs(p0, tu, PublishAtFriendSearchFragment.class, "4")) {
             a.p(p0, "keyWord");
             tu.H = p0;
             tu.K.u1(p0);
          }
          String str1 = (!p0.length())? 1: null;
          int i = 0x7f0a3310;
          Object[] objArray = null;
          if (str1) {
             if (!PatchProxy.applyVoid(objArray, this, PublishAtFriendFragment.class, "10")) {
                if (!this.t.getId()) {
                   e uoe = this.getChildFragmentManager().beginTransaction();
                   uoe.f(i, this.t);
                   uoe.m();
                }
                if (this.t.isHidden()) {
                   this.getChildFragmentManager().beginTransaction().E(this.t).m();
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, PublishAtFriendFragment.class, "11") && !this.u.isHidden()) {
                this.getChildFragmentManager().beginTransaction().s(this.u).m();
             }
             PublishAtFriendFragment tu1 = this.u;
             Objects.requireNonNull(tu1);
             if (!PatchProxy.applyVoid(objArray, tu1, PublishAtFriendSearchFragment.class, "5")) {
                tu1.K.M0().k0();
             }
          }else if(!PatchProxy.applyVoid(objArray, this, PublishAtFriendFragment.class, "9") && !this.t.isHidden()){
             this.getChildFragmentManager().beginTransaction().s(this.t).m();
          }
          if (!PatchProxy.applyVoid(objArray, this, PublishAtFriendFragment.class, "12")) {
             if (!this.u.getId()) {
                e uoe1 = this.getChildFragmentManager().beginTransaction();
                uoe1.f(i, this.u);
                uoe1.m();
             }
             if (this.u.isHidden()) {
                this.getChildFragmentManager().beginTransaction().E(this.u).m();
             }
          }
          tu = this.u;
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoidOneRefs(p0, tu, PublishAtFriendSearchFragment.class, "6")) {
             a.p(p0, str);
             PublishAtFriendSearchFragment g = tu.G;
             if (g != null) {
                g.clear();
             }
             tu.F.onNext(p0);
             tu.a();
          }
       }
    label_013f :
       return;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PublishAtFriendFragment.class, "4")) {
          return;
       }
       a.p(p0, "context");
       super.onAttach(p0);
       this.v = true;
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PublishAtFriendFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       this.v = false;
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PublishAtFriendFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       this.getChildFragmentManager().beginTransaction().u(this.t).u(this.u).m();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PublishAtFriendFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.f(R.id.publish_at_friend_frame, this.t);
       uoe.m();
       this.mh(this.w);
       return;
    }
}
