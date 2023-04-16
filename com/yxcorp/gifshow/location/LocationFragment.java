package com.yxcorp.gifshow.location.LocationFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.ArrayList;
import crd.a;
import com.yxcorp.gifshow.location.PostLocationPermissionHolder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import y8c.t;
import com.yxcorp.gifshow.location.LocationFragment$b;
import com.kwai.library.widget.refresh.RefreshLayout;
import g9c.d;
import qvb.i;
import com.yxcorp.gifshow.location.b;
import java.util.List;
import j2b.m;
import java.lang.Runnable;
import android.view.ViewGroup;
import g9c.a;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import ekd.j0;
import com.kuaishou.android.model.mix.Location;
import ow8.c;
import cx8.a;
import cx8.a$a;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import z8c.a;
import lnc.a1;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import o1.f;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.location.LocationFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.lifecycle.LifecycleOwner;
import brd.t;
import j2b.l;
import erd.g;
import crd.b;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import qvb.n0;
import com.yxcorp.gifshow.location.LocationFragment$c;

public class LocationFragment extends RecyclerFragment	// class@001adc
{
    public Location F;
    public String G;
    public String H;
    public boolean I;
    public String J;
    public String K;
    public boolean L;
    public boolean M;
    public b N;
    public final List O;
    public final a P;
    public final PostLocationPermissionHolder Q;
    public LocationFragment$d R;
    public static final int S;

    public void LocationFragment(){
       super();
       this.L = true;
       this.M = false;
       this.O = new ArrayList();
       this.P = new a();
       this.Q = new PostLocationPermissionHolder(true);
    }
    public static boolean Gh(){
       Object obj = PatchProxy.apply(null, null, LocationFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("disableRepublishPageRequestPOI", false);
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LocationFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LocationFragment$b uob = new LocationFragment$b(this, this.Ac(), this.ia(), this.q(), this.S1());
       return obj;
    }
    public final void Hh(){
       if (PatchProxy.applyVoid(null, this, LocationFragment.class, "12")) {
          return;
       }
       boolean b = false;
       this.N.s1(b);
       this.Ac().s();
       if (this.O.isEmpty()) {
          LocationFragment tI = this.I;
          this.I = b;
          this.a();
          this.I = tI;
       }else {
          this.Ac().post(new m(this));
       }
       return;
    }
    public void Ih(boolean p0){
       if (PatchProxy.isSupport(LocationFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LocationFragment.class, "11")) {
          return;
       }
       this.I = p0;
       if (p0 && this.O.isEmpty()) {
          this.O.addAll(this.N.Q0());
       }
       if (this.I == null) {
          LocationFragment tN = this.N;
          if (tN.B != null || !tN.getItemCount()) {
             this.h0().scrollToPosition(0);
             this.Hh();
          }
       }
       return;
    }
    public void Jh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationFragment.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("LocationFragment", "setSelectedCity\(\) "+p0, objArray);
       this.H = p0;
       this.a();
       return;
    }
    public boolean S0(){
       return false;
    }
    public boolean S1(){
       return false;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LocationFragment.class, "6")) {
          return;
       }
       if (this.getView() != null) {
          super.a();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocationFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LocationFragment.class, null);
       return objectsByTag;
    }
    public boolean i0(){
       if (this.L == null) {
          return true;
       }
       this.L = false;
       return false;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.getActivity() != null && this.getActivity().getIntent() != null) {
          Location location = j0.e(this.getActivity().getIntent(), "location");
          this.F = (c.r(location))? null: location;
       }
    label_003a :
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LocationFragment.class, "14")) {
          return;
       }
       this.Q.c();
       this.P.d();
       if (!PatchProxy.applyVoid(null, null, a.class, "5")) {
          a$a b = a.b;
          if (b != null) {
             b.c();
          }
          a.b = null;
       }
       super.onDestroyView();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocationFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       a uoa = new a(1, false, 1);
       int i = a1.d(R.dimen.arg_RES_7f0702ab);
       uoa.m(i);
       uoa.n(i);
       uoa.o(f.c(this.getResources(), R.drawable.arg_RES_7f080686, null));
       this.h0().addItemDecoration(uoa);
       this.h0().addOnScrollListener(new LocationFragment$a(this));
       this.Q.a(this);
       this.P.c(this.Q.b().skip(1).subscribe(new l(this)));
       return;
    }
    public g vh(){
       Bundle obj = PatchProxy.apply(null, this, LocationFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getArguments();
       boolean b = true;
       if (obj != null) {
          b = obj.getBoolean("show_none", b);
       }
       b uob = new b(this.F, b);
       this.N = uob;
       uob.k0();
       return this.N;
    }
    public i yh(){
       Object[] objArray = null;
       LocationFragment$c uoc = PatchProxy.apply(objArray, this, LocationFragment.class, "4");
       if (uoc != PatchProxyResult.class) {
       }else if(this.getArguments() != null){
          objArray = this.getArguments().getString("photo_task_id", "");
       }
       uoc = new LocationFragment$c(this, objArray);
       return uoc;
    }
}
