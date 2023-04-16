package com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import y8c.t;
import com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment$a;
import java.lang.Number;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p91.m;
import com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment$c;
import java.lang.Throwable;
import bb1.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import kb1.d;
import ib1.g;
import erd.g;
import crd.b;
import eoc.f;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import lnc.b9;
import va1.b;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.TextView;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import bb1.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ib1.e;
import android.view.View$OnClickListener;
import z8c.a;
import o56.c;
import o56.a;
import android.app.Application;
import java.util.Set;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import g9c.d;
import java.util.Objects;
import g9c.d$c;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import pkd.a;
import ekd.i;
import java.lang.IllegalStateException;
import y8c.g;
import jb1.y;
import jb1.z;
import jb1.v;
import ib1.f;
import jb1.s;
import jb1.b;
import qvb.i;
import qvb.n0;
import lb1.d;
import lb1.e;
import com.kuaishou.live.common.core.component.admin.user.b;

public class LiveUserListFragment extends RecyclerFragment	// class@000f56
{
    public int F;
    public boolean G;
    public String H;
    public String I;
    public String J;
    public String K;
    public boolean L;
    public m M;
    public LiveUserListFragment$c N;
    public b O;
    public a P;
    public final ArrayList Q;
    public static final int R;

    public void LiveUserListFragment(){
       super();
       this.Q = new ArrayList();
    }
    public static LiveUserListFragment Hh(int p0,String p1,String p2,String p3,String p4,boolean p5){
       if (PatchProxy.isSupport(LiveUserListFragment.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,Boolean.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, LiveUserListFragment.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return LiveUserListFragment.Ih(p0, p1, p2, false, p3, p4, p5);
    }
    public static LiveUserListFragment Ih(int p0,String p1,String p2,boolean p3,String p4,String p5,boolean p6){
       Bundle obj;
       if (PatchProxy.isSupport(LiveUserListFragment.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Boolean.valueOf(p3),p4,p5,Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, null, LiveUserListFragment.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Bundle();
       obj.putInt("arg_mode", p0);
       obj.putString("arg_user_id", p1);
       obj.putString("arg_live_stream_id", p2);
       obj.putBoolean("arg_enter_profile_enable", p3);
       obj.putString("arg_voice_party_id", p4);
       obj.putString("arg_theater_id", p5);
       obj.putBoolean("arg_is_half_screen_admin", p6);
       LiveUserListFragment liveUserList = new LiveUserListFragment();
       liveUserList.setArguments(obj);
       return liveUserList;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveUserListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveUserListFragment$a(this, this);
    }
    public final int Gh(int p0){
       LiveUserListFragment obj;
       if (PatchProxy.isSupport(LiveUserListFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveUserListFragment.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.F;
       if (obj != null) {
          if (obj != 1) {
             if (obj == 2) {
                return 0x7f1003ba;
             }else {
                throw new IllegalArgumentException("Illegal mode :"+this.F);
             }
          }else {
             return 0x7f102521;
          }
       }else {
          return 0x7f101d12;
       }
    }
    public void Jh(m p0){
       this.M = p0;
    }
    public void Kh(LiveUserListFragment$c p0){
       this.N = p0;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(LiveUserListFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveUserListFragment.class, "11")) {
          return;
       }
       super.M1(p0, p1);
       LiveUserListFragment tF = this.F;
       if (tF != null && (tF == 1 || tF == 2)) {
          return;
       }
       throw new IllegalArgumentException("Illegal mode :"+this.F);
    }
    public void b5(a p0){
       this.P = p0;
    }
    public void dismiss(){
       e uoe;
       c uoc;
       if (PatchProxy.applyVoid(null, this, LiveUserListFragment.class, "15")) {
          return;
       }
       n.C(this.getActivity());
       if (this.getParentFragment() != null) {
          uoe = this.getParentFragment().getChildFragmentManager().beginTransaction();
          uoe.y(R.anim.arg_RES_7f01004a, 0x7f01010d);
          uoe.u(this).m();
       }else if(this.I == null && this.F == null){
          uoc = 1;
       }else {
          uoc = null;
       }
       if (uoc) {
          uoe = this.getFragmentManager().beginTransaction();
          uoe.y(R.anim.arg_RES_7f01004a, 0x7f01010d);
          uoe.u(this).m();
       }else {
          this.getActivity().finish();
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0e2d;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveUserListFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveUserListFragment.class, null);
       return objectsByTag;
    }
    public String getUrl(){
       LiveUserListFragment obj = PatchProxy.apply(null, this, LiveUserListFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       if (obj == null) {
          return "ks://live/admin";
       }
       if (obj == 1) {
          return "ks://live/kickUser";
       }
       if (obj == 2) {
          return "ks://live/blacklist";
       }
       throw new IllegalArgumentException("Illegal mode :"+this.F);
    }
    public boolean onBackPressed(){
       LiveUserListFragment obj = PatchProxy.apply(null, this, LiveUserListFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.dismiss();
       obj = this.N;
       if (obj != null) {
          obj.onDismiss();
       }
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveUserListFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       this.F = p0.getInt("arg_mode");
       this.H = p0.getString("arg_user_id");
       this.I = p0.getString("arg_live_stream_id");
       this.G = p0.getBoolean("arg_enter_profile_enable");
       this.J = p0.getString("arg_voice_party_id");
       this.K = p0.getString("arg_theater_id");
       this.L = p0.getBoolean("arg_is_half_screen_admin");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveUserListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.O = f.a(d.class, new g(this));
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveUserListFragment.class, "6")) {
          return;
       }
       b9.a(this.O);
       b.b(this.getActivity());
       this.Q.clear();
       super.onDestroyView();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i1;
       d f;
       View view1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveUserListFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       KwaiActionBar kwaiActionBa = p0.findViewById(R.id.title_root);
       p0.findViewById(R.id.title_tv).setTextColor(this.getContext().getResources().getColor(R.color.arg_RES_7f0607de));
       View view = p0.findViewById(R.id.divider);
       int i = -1;
       if (this.L != null) {
          kwaiActionBa.d(i, i, this.Gh(this.F));
          p0.setBackground(this.getContext().getResources().getDrawable(R.drawable.arg_RES_7f0810a6));
          kwaiActionBa.setBackground(null);
          ViewGroup$MarginLayoutParams layoutParams = kwaiActionBa.getLayoutParams();
          layoutParams.height = a1.e(48.00f);
          kwaiActionBa.setLayoutParams(layoutParams);
          LiveUserListFragment tM = this.M;
          ClientContent$LiveStreamPackage liveStreamPa = (tM != null)? tM.a(): null;
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, f.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ADMINISTRATOR_INFO_CARD";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u0(9, uElementPack, uContentPack);
          }
       }else if(this.G != null){
          i1 = 0x7f08068e;
       }else {
          i1 = 0x7f0819e0;
       }
       kwaiActionBa.d(i1, i, this.Gh(this.F));
       kwaiActionBa.h(new e(this));
       b.a(this.getActivity(), kwaiActionBa);
       a uoa = new a();
       int i2 = 1;
       if (this.F == null) {
          uoa.r(n.c(a.a().a(), 60.00f), 0, i2);
          uoa.q(0);
          a uoa1 = a.class;
          if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), uoa, uoa1, "3")) {
             uoa.n.add(Integer.valueOf(i2));
          }
          this.h0().setBackgroundColor(this.getContext().getResources().getColor(R.color.arg_RES_7f06006a));
          if (this.h0() instanceof CustomRecyclerView) {
             this.h0().setUnderneathColor(this.getContext().getResources().getColor(R.color.arg_RES_7f060081));
          }
       }
       if (this.F == 2) {
          View[] viewArray = new View[i2];
          viewArray[0] = view;
          n.Z(8, viewArray);
       }else {
          this.h0().addItemDecoration(uoa);
       }
       d uod = this.ia();
       Objects.requireNonNull(uod);
       d uod1 = d.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, uod, uod1, "34")) {
          for (int i3 = 0; i3 < uod.f.f(); i3++) {
             f = uod.f;
             Objects.requireNonNull(f);
             d$c uoc = d$c.class;
             if (PatchProxy.isSupport(uoc)) {
                view1 = PatchProxy.applyOneRefs(Integer.valueOf(i3), f, uoc, "4");
                if (view1 != PatchProxyResult.class) {
                }else if(i3 >= 0 && i3 < f.a.size()){
                   view1 = f.a.valueAt(i3);
                }else {
                   view1 = null;
                }
             }else {
                goto label_0188 ;
             }
             view1.setVisibility(8);
          }
          try{
             uod.p0((uod.b1() + uod.g.getItemCount()), uod.Z0());
          }catch(java.lang.Exception e8){
             if (a.a) {
                throw new IllegalStateException(e8);
             }
          }
       }
    label_01d4 :
       return;
    }
    public g vh(){
       LiveUserListFragment obj = PatchProxy.apply(null, this, LiveUserListFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       if (obj != null) {
          if (obj == 1) {
             return new z();
          }
          if (obj == 2) {
             return new y(this.G);
          }
          throw new IllegalArgumentException("Illegal mode :"+this.F);
       }else if(this.L != null){
          v ov = new v();
          ov.f = this.getActivity();
          ov.h = new f(this);
          ov.i = this.Q;
          ov.b = this.H;
          ov.c = this.J;
          ov.e = this.M;
          ov.d = this.K;
          ov.g = this.P;
          ov.a = this.I;
          return new s(ov);
       }else {
          b uob = new b(this.I, this.H, this.J, this.K, this.M);
          return obj;
       }
    }
    public i yh(){
       d uod = PatchProxy.apply(null, this, LiveUserListFragment.class, "9");
       if (uod != PatchProxyResult.class) {
       }else {
          LiveUserListFragment tF = this.F;
          if (tF != null) {
             if (tF != 1) {
                if (tF == 2) {
                   uod = new d();
                }else {
                   throw new IllegalArgumentException("Illegal mode :"+this.F);
                }
             }else {
                uod = new e(this.I);
             }
          }else {
             uod = new b(this, this.I);
          }
       }
       return uod;
    }
}
