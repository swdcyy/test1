package com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumAssetFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumAssetFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewParent;
import o79.i;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumEmptyView;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumAssetFragmentViewBinder$a;
import android.view.View$OnClickListener;
import q79.d;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumAssetFragmentViewBinder$b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumAssetFragmentViewBinder$observeLifeCycle$1;

public final class PotentialAlbumAssetFragmentViewBinder extends DefaultAlbumAssetFragmentViewBinder	// class@001cc4
{
    public Boolean j;
    public Observer k;
    public PotentialAlbumEmptyView l;
    public View m;
    public boolean n;
    public d o;
    public DefaultLifecycleObserver p;
    public boolean q;
    public boolean r;

    public void PotentialAlbumAssetFragmentViewBinder(Fragment p0){
       a.p(p0, "fragment");
       super(p0);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PotentialAlbumAssetFragmentViewBinder.class, "3")) {
          return;
       }
       a.p(p0, "rootView");
       super.e(p0);
       FragmentActivity activity = this.j().getActivity();
       activity = (activity != null)? activity.findViewById(R.id.picked_layout): null;
       this.m = activity;
       this.r = true;
       this.y();
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       ViewParent obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PotentialAlbumAssetFragmentViewBinder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       View view = super.f(p0, p1, p2);
       ViewGroup viewGroup = view.findViewById(R.id.no_file_layout);
       a.o(viewGroup, "noFileLayout");
       obj = viewGroup.getParent();
       if (obj instanceof ViewGroup) {
          View view1 = i.o(p0, R.layout.arg_RES_7f0d1193, obj, false);
          Objects.requireNonNull(view1, "null cannot be cast to non-null type com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumEmptyView");
          this.l = view1;
          obj.removeView(viewGroup);
          obj.addView(this.l);
          viewGroup.setId(-1);
          PotentialAlbumAssetFragmentViewBinder tl = this.l;
          if (tl != null) {
             tl.setNoFileLayout(viewGroup);
          }
          tl = this.l;
          if (tl != null) {
             view1 = tl.findViewById(R.id.potential_permission_btn);
             if (view1 != null) {
                view1.setOnClickListener(PotentialAlbumAssetFragmentViewBinder$a.b);
             }
          }
       }
    label_006a :
       return view;
    }
    public boolean g(d p0){
       PotentialAlbumAssetFragmentViewBinder$b obj = PatchProxy.applyOneRefs(p0, this, PotentialAlbumAssetFragmentViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.k != null) {
          return false;
       }
       this.q = false;
       obj = new PotentialAlbumAssetFragmentViewBinder$b(this);
       this.k = obj;
       if (p0 != null) {
          LiveData liveData = p0.C0();
          if (liveData != null) {
             liveData.observe(this.j(), obj);
          }
       }
       this.o = p0;
       if (p0 != null && p0.K0(this.j().getActivity())) {
          this.j = Boolean.TRUE;
       }
       this.y();
       return false;
    }
    public void onDestroy(){
       PotentialAlbumAssetFragmentViewBinder to;
       if (PatchProxy.applyVoid(null, this, PotentialAlbumAssetFragmentViewBinder.class, "2")) {
          return;
       }
       super.onDestroy();
       PotentialAlbumAssetFragmentViewBinder tk = this.k;
       if (tk != null) {
          to = this.o;
          if (to != null) {
             LiveData liveData = to.C0();
             if (liveData != null) {
                liveData.removeObserver(tk);
             }
          }
       }
       this.k = null;
       this.o = null;
       this.j = null;
       if (this.p != null) {
          to = this.p;
          a.m(to);
          this.j().getLifecycle().removeObserver(to);
          this.p = null;
       }
       this.r = false;
       return;
    }
    public final void y(){
       PotentialAlbumAssetFragmentViewBinder tl;
       PotentialAlbumEmptyView c;
       PotentialAlbumEmptyView b2;
       PotentialAlbumAssetFragmentViewBinder potentialAlb = PotentialAlbumAssetFragmentViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, potentialAlb, "5")) {
          return;
       }
       if (this.r != null && this.o != null) {
          PotentialAlbumAssetFragmentViewBinder tj = this.j;
          Boolean uBoolean = null;
          if (tj != null) {
             tl = this.l;
             if (tl != null) {
                boolean b = tj.booleanValue();
                if (!PatchProxy.isSupport(PotentialAlbumEmptyView.class) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tl, PotentialAlbumEmptyView.class, "3") && !a.g(Boolean.valueOf(b), tl.d))) {
                   tl.d = Boolean.valueOf(b);
                   int i = 8;
                   if (b) {
                      c = tl.c;
                      if (c != null) {
                         c.setVisibility(i);
                      }
                      b2 = tl.b;
                      if (b2 != null) {
                         b2.setVisibility(uBoolean);
                      }
                   }else {
                      c = tl.b;
                      if (c != null) {
                         c.setVisibility(i);
                      }
                      b2 = tl.c;
                      if (b2 != null) {
                         b2.setVisibility(uBoolean);
                      }
                   }
                }
             }
          }
          boolean b1 = (tj != null)? tj.booleanValue(): false;
          if (!PatchProxy.isSupport(potentialAlb) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), this, potentialAlb, "6")) {
             if (!b1) {
                PotentialAlbumAssetFragmentViewBinder tm = this.m;
                if (tm != null && !tm.getVisibility()) {
                   PotentialAlbumAssetFragmentViewBinder tm1 = this.m;
                   if (tm1 != null) {
                      tm1.setVisibility(4);
                   }
                   this.n = true;
                }
             }
             if (b1 && this.n != null) {
                this.n = uBoolean;
                tl = this.m;
                if (tl != null) {
                   tl.setVisibility(uBoolean);
                }
             }
          }
       label_00b0 :
          if (a.g(tj, Boolean.FALSE) && (!PatchProxy.applyVoid(objArray, this, potentialAlb, "7") && this.p == null)) {
             this.p = new PotentialAlbumAssetFragmentViewBinder$observeLifeCycle$1(this);
             PotentialAlbumAssetFragmentViewBinder tp = this.p;
             a.m(tp);
             this.j().getLifecycle().addObserver(tp);
          }
       }
    label_00dd :
       return;
    }
}
