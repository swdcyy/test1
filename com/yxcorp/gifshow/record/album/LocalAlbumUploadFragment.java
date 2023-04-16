package com.yxcorp.gifshow.record.album.LocalAlbumUploadFragment;
import l8c.b;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment;
import java.util.HashSet;
import crd.a;
import m8c.e;
import com.yxcorp.gifshow.fragment.user.l;
import l8c.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Collection;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Long;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.yxcorp.gifshow.record.album.LocalAlbumUploadFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.record.album.LocalAlbumUploadFragment$b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import android.widget.RelativeLayout;
import k8c.a;
import q87.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.LocalAlbumParams$b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.album.LocalAlbumParams;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.view.ViewParent;
import java.util.Objects;
import java.util.HashMap;

public final class LocalAlbumUploadFragment extends BaseFragment implements b, d	// class@001706
{
    public final LocalAlbumListFragment j;
    public View k;
    public KwaiActionBar l;
    public TextView m;
    public View n;
    public Set o;
    public a p;
    public ProgressFragment q;
    public HashMap r;

    public void LocalAlbumUploadFragment(){
       super(null, null, null, null, 15, null);
       this.j = super();
       this.o = new HashSet();
       this.p = new a();
    }
    public void A2(e p0,l p1){
       a.f(this, p0, p1);
    }
    public void C6(e p0){
       a.k(this, p0);
    }
    public void Ef(e p0){
       a.b(this, p0);
    }
    public void F7(e p0,a p1){
       a.h(this, p0, p1);
    }
    public void G7(e p0){
       a.i(this, p0);
    }
    public void X1(e p0,l p1){
       a.j(this, p0, p1);
    }
    public void X2(e p0,int p1){
    }
    public void X4(e p0,boolean p1){
       LocalAlbumUploadFragment tn;
       if (PatchProxy.isSupport(LocalAlbumUploadFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LocalAlbumUploadFragment.class, "10")) {
          return;
       }
       a.p(p0, "project");
       if (p1) {
          this.o.add(p0);
       }else {
          this.o.remove(p0);
       }
       int i = 1;
       if (this.o.isEmpty() ^ i) {
          tn = this.n;
          if (tn != null) {
             tn.setEnabled(i);
          }
          tn = this.m;
          if (tn != null) {
             tn.setText(R.string.arg_RES_7f104d12);
          }
       }else {
          tn = this.n;
          if (tn != null) {
             tn.setEnabled(false);
          }
          tn = this.m;
          if (tn != null) {
             tn.setText("");
          }
       }
       return;
    }
    public void Z4(boolean p0,long p1){
       if (PatchProxy.isSupport(LocalAlbumUploadFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, LocalAlbumUploadFragment.class, "9")) {
          return;
       }
       this.j.mh(true);
       return;
    }
    public void b8(boolean p0){
       if (PatchProxy.isSupport(LocalAlbumUploadFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LocalAlbumUploadFragment.class, "8")) {
          return;
       }
       this.j.mh(true);
       return;
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumUploadFragment.class, "6")) {
          return;
       }
       this.p.dispose();
       this.p = new a();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumUploadFragment.class, "11")) {
          return;
       }
       this.n = m1.f(p0, 0x7f0a433d);
       this.l = m1.f(p0, 0x7f0a3f6a);
       this.m = m1.f(p0, 0x7f0a3643);
       m1.b(p0, new LocalAlbumUploadFragment$a(this), R.id.upload_button);
       m1.b(p0, new LocalAlbumUploadFragment$b(this), R.id.right_btn);
       return;
    }
    public String f8(){
       return a.a(this);
    }
    public void ic(e p0,a p1){
       a.g(this, p0, p1);
    }
    public void m6(e p0){
       a.c(this, p0);
    }
    public void mf(e p0){
       a.d(this, p0);
    }
    public void na(e p0){
       a.e(this, p0);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view;
       LocalAlbumUploadFragment tl;
       ViewParent parent;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LocalAlbumUploadFragment.class, "2");
       if (p2 != patchProxyRe) {
          return p2;
       }
       a.p(p0, "inflater");
       LocalAlbumUploadFragment tk = this.k;
       Object[] objArray = null;
       if (tk == null) {
          view = a.g(p0, R.layout.arg_RES_7f0d0ea2, p1, false);
          this.k = view;
          this.doBindView(view);
          tl = this.l;
          if (tl != null) {
             tl.q(R.string.arg_RES_7f100adc);
          }
          tl = this.l;
          if (tl != null) {
             tl.setRight(-1);
          }
          tl = this.m;
          if (tl != null) {
             tl.setText("");
          }
          Object[] objArray1 = new Object[false];
          String str = "LocalAlbumUploadFragment";
          a.D().w(str, "onCreateView view root is null", objArray1);
          if (!PatchProxy.applyVoid(objArray, this, LocalAlbumUploadFragment.class, "4")) {
             objArray1 = new Object[false];
             a.D().w(str, "addFragment", objArray1);
             if (this.getActivity() != null) {
                this.j.kh(this);
                tl = this.j;
                Bundle uBundle = PatchProxy.apply(objArray, this, LocalAlbumUploadFragment.class, "5");
                if (uBundle != patchProxyRe) {
                }else {
                   uBundle = new Bundle();
                   LocalAlbumParams$b uob = new LocalAlbumParams$b();
                   uob.b(true);
                   uob.d(true);
                   uob.d = false;
                   uob.c(PostExperimentUtils.i());
                   SerializableHook.putSerializable(uBundle, "key_intent_local_album_params", uob.a());
                }
                tl.setArguments(uBundle);
                FragmentActivity activity = this.getActivity();
                a.m(activity);
                a.o(activity, "activity!!");
                e uoe = activity.getSupportFragmentManager().beginTransaction();
                a.o(uoe, "activity!!.supportFragme¡­anager.beginTransaction\(\)");
                uoe.f(R.id.list_wrap, this.j);
                uoe.l();
             }
          }
       }else if(tk != null){
          parent = tk.getParent();
       }else {
          Object[] objArray2 = objArray;
       }
       if (parent != null) {
          tl = this.k;
          parent = (tl != null)? tl.getParent(): objArray;
          if (parent instanceof ViewGroup) {
             tl = this.k;
             if (tl != null) {
                objArray = tl.getParent();
             }
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type android.view.ViewGroup");
             objArray.removeView(this.k);
          }
       }
    label_00fc :
       return this.k;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumUploadFragment.class, "3")) {
          return;
       }
       this.ch();
       super.onDestroyView();
       if (!PatchProxy.applyVoid(null, this, LocalAlbumUploadFragment.class, "13")) {
          LocalAlbumUploadFragment tr = this.r;
          if (tr != null) {
             tr.clear();
          }
       }
       return;
    }
}
