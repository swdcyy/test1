package com.yxcorp.gifshow.album.home.AlbumListFragment;
import com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import com.yxcorp.gifshow.album.home.AlbumListFragment$c;
import nsd.u;
import dc7.i;
import com.yxcorp.gifshow.album.home.AlbumListFragment$a;
import com.yxcorp.gifshow.album.home.AlbumListFragment$albumAssetViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import ga9.b;
import com.kwai.robust.PatchProxyResult;
import q79.d;
import r79.a;
import ga9.c;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumListFragmentViewBinder;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import kotlin.TypeCastException;
import brd.t;
import k79.f;
import com.yxcorp.gifshow.album.home.AlbumListFragment$d;
import erd.g;
import g79.a;
import w69.p0;
import brd.z;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.album.home.AlbumListFragment$e;
import crd.b;
import com.yxcorp.utility.Log;
import android.view.View;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.album.home.AlbumListFragment$f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.album.home.AlbumListFragment$g;

public final class AlbumListFragment extends AlbumBaseFragment	// class@001a08
{
    public IAlbumMainFragment$c i;
    public AlbumListFragment$a j;
    public final p k;
    public HashMap l;
    public static final AlbumListFragment$c m;

    static {
       AlbumListFragment.m = new AlbumListFragment$c(null);
    }
    public void AlbumListFragment(){
       super(null, 1, null);
       this.j = new AlbumListFragment$a(this);
       this.k = s.c(new AlbumListFragment$albumAssetViewModel$2(this));
    }
    public void Vg(){
       if (PatchProxy.applyVoid(null, this, AlbumListFragment.class, "12")) {
          return;
       }
       AlbumListFragment tl = this.l;
       if (tl != null) {
          tl.clear();
       }
       return;
    }
    public b Wg(){
       AbsAlbumListFragmentViewBinder uAbsAlbumLis = PatchProxy.apply(null, this, AlbumListFragment.class, "6");
       if (uAbsAlbumLis != PatchProxyResult.class) {
       }else {
          uAbsAlbumLis = c.b(this.ch().s0().n(), AbsAlbumListFragmentViewBinder.class, this, 0, 4, null);
       }
       return uAbsAlbumLis;
    }
    public b Yg(){
       return this.dh();
    }
    public ViewModel Zg(){
       Object obj = PatchProxy.apply(null, this, AlbumListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.ch();
    }
    public final d ch(){
       Object obj = PatchProxy.apply(null, this, AlbumListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public AbsAlbumListFragmentViewBinder dh(){
       b obj = PatchProxy.apply(null, this, AlbumListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Xg();
       if (obj != null) {
          return obj;
       }
       throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.viewbinder.AbsAlbumListFragmentViewBinder");
    }
    public final void eh(){
       if (PatchProxy.applyVoid(null, this, AlbumListFragment.class, "3")) {
          return;
       }
       d v = this.ch().v;
       if (v != null) {
          v.j().doOnNext(new AlbumListFragment$d(this)).observeOn(a.c.i().b()).subscribe(Functions.d(), AlbumListFragment$e.b);
       }
       return;
    }
    public void onBindClickEvent(){
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AlbumListFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       Log.g("AlbumListFragmentTAG", "onDestroy");
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.Vg();
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumListFragment.class, "2")) {
          return;
       }
       a.q(p0, "view");
       super.onViewCreated(p0, p1);
       Log.g("AlbumListFragmentTAG", "onViewCreated");
       RecyclerView recyclerView = this.dh().j();
       if (recyclerView != null) {
          AbsAlbumListFragmentViewBinder b = this.dh().b;
          if (b == null) {
             b = new LinearLayoutManager(this.getContext());
          }
          recyclerView.setLayoutManager(b);
       }
       recyclerView = this.dh().j();
       if (recyclerView != null) {
          recyclerView.setAdapter(this.j);
       }
       this.eh();
       this.ch().t0().observe(this, new AlbumListFragment$f(this));
       this.ch().z0().observe(this, new AlbumListFragment$g(this));
       return;
    }
}
