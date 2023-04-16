package com.yxcorp.gifshow.album.home.AlbumAssetFragment$l;
import com.yxcorp.gifshow.album.widget.UserTouchRecyclerView$a;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import o79.m;
import android.os.SystemClock;
import java.lang.Math;
import o79.m$a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import q79.d;
import java.util.List;
import java.util.Collection;
import r79.a;
import w69.k;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$l$a;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.lang.System;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import w69.f;

public final class AlbumAssetFragment$l implements UserTouchRecyclerView$a	// class@0019e0
{
    public long a;
    public long b;
    public long c;
    public long d;
    public final AlbumAssetFragment e;

    public void AlbumAssetFragment$l(AlbumAssetFragment p0){
       this.e = p0;
       super();
       this.b = 300;
       this.d = 300;
    }
    public void a(boolean p0,int p1,int p2){
       m this;
       if (PatchProxy.isSupport(AlbumAssetFragment$l.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, AlbumAssetFragment$l.class, "1")) {
          return;
       }
       AlbumAssetFragment v = this.e.V;
       Objects.requireNonNull(v);
       m om = m.class;
       if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), v, om, "1")) {
          v.e = v.e + p2;
          p2 = v.d + 1;
          v.d = p2;
          if (p2 >= v.c) {
             long l = SystemClock.uptimeMillis();
             m e = v.e;
             if (e != null) {
                this = v.f;
                if (this > 0 && l - this > 0) {
                   e = (int)((long)(e * 1000) / (l - this));
                   if (!PatchProxy.isSupport(om) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(e), v, om, "2") && e != v.g)) {
                      v.g = e;
                      if (v.h != null) {
                         if (Math.abs(e) < v.b) {
                            v.h = false;
                            om = v.i;
                            if (om != null) {
                               om.b();
                            }
                         }
                      }else if(Math.abs(e) > v.a){
                         v.h = true;
                         om = v.i;
                         if (om != null) {
                            om.a();
                         }
                      }
                   }
                }
             }
             v.e = 0;
             v.d = 0;
             v.f = l;
          }
       }
       return;
    }
    public void b(boolean p0,int p1){
       Fragment parentFragme;
       AlbumFragment uAlbumFragme1;
       AlbumAssetFragment$l ol = AlbumAssetFragment$l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, ol, "2")) {
          return;
       }
       String str = "AlbumAssetFragment";
       Log.b(str, "fromUser "+p0+" newState "+p1);
       List list = this.e.rh().m();
       if (list != null) {
          int i = 1;
          if ((list.isEmpty() ^ i) == i && (p0 && this.e.rh().s0().m().r())) {
             int i1 = 0;
             AlbumFragment uAlbumFragme = null;
             if (!p1) {
                AlbumAssetFragment$l te = this.e;
                AlbumAssetFragment v = te.V;
                v.d = i1;
                v.e = i1;
                v.f = 0;
                v.g = i1;
                parentFragme = te.getParentFragment();
                parentFragme = (parentFragme != null)? parentFragme.getParentFragment(): uAlbumFragme;
                if (parentFragme instanceof AlbumFragment) {
                   uAlbumFragme = parentFragme;
                }
                if (uAlbumFragme != null) {
                   RecyclerView recyclerView = this.e.qh().q();
                   if (recyclerView != null) {
                      recyclerView.postDelayed(new AlbumAssetFragment$l$a(uAlbumFragme, this), 300);
                   }
                }
             }else {
                RecyclerView recyclerView1 = this.e.qh().q();
                boolean b = (recyclerView1 != null)? recyclerView1.canScrollVertically(-1): false;
                RecyclerView recyclerView2 = this.e.qh().q();
                if (recyclerView2 != null) {
                   i1 = recyclerView2.canScrollVertically(i);
                }
                if ((System.currentTimeMillis() - this.c) - this.d >= 0 && (!b || !i1)) {
                   return;
                }else {
                   parentFragme = this.e.getParentFragment();
                   parentFragme = (parentFragme != null)? parentFragme.getParentFragment(): uAlbumFragme;
                   if (parentFragme instanceof AlbumFragment) {
                      uAlbumFragme = parentFragme;
                   }
                   if (uAlbumFragme != null) {
                      this.a = System.currentTimeMillis();
                      this.c = System.currentTimeMillis();
                      Log.b(str, "onScrollStateChanged hide container");
                      AlbumSelectedContainer uAlbumSelect = uAlbumFragme.wh();
                      if (uAlbumSelect != null) {
                         AlbumSelectedContainer.b0(uAlbumSelect, false, false, false, false, 450, 12, null);
                      }
                   }
                }
             }
          }
       }
    label_0113 :
       if (this.e.rh().s0().d().c()) {
          this.e.Eh();
       }
       return;
    }
}
