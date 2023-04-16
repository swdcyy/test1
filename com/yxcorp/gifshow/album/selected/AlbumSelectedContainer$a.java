package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$a;
import j79.c;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import q79.d;
import r79.a;
import w69.k;
import android.view.View;
import p79.c;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import w69.k0;
import r79.c;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import m79.g;
import l79.m;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.animation.ObjectAnimator;

public final class AlbumSelectedContainer$a implements c	// class@001a97
{
    public final AlbumSelectedContainer a;

    public void AlbumSelectedContainer$a(AlbumSelectedContainer p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       AlbumSelectedContainer$a uoa = AlbumSelectedContainer$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       float f = 0x3f800000;
       float f1 = 0x3f666666;
       int i = 300;
       if (AlbumSelectedContainer.g(this.a).s0().m().o()) {
          uoa = this.a;
          uoa.N = p0 ^ 0x01;
          if (AlbumSelectedContainer.g(uoa).s0().m().r()) {
             c.k(this.a.B(), p0, i, f1);
             c.k(this.a.D(), p0, i, f);
             this.a.Z(p0);
          }else {
             AlbumSelectedContainer$a ta = this.a;
             AlbumSelectedContainer.c0(ta, p0, ta.H, false, false, 12, null);
             this.a.d0();
          }
          k0 ok0 = this.a.U.rh().f();
          if (ok0 != null) {
             ok0.d(this.a.N);
          }
       }else {
          c.k(this.a.B(), p0, i, f1);
          c.k(this.a.C(), p0, i, f);
       }
       return;
    }
    public void b(int p0,c p1){
       AlbumSelectedContainer$a uoa = AlbumSelectedContainer$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       a.q(p1, "item");
       AlbumSelectedContainer.g(this.a).Z0(p1);
       int i = AlbumSelectedContainer.g(this.a).d0(p1);
       int i1 = 0;
       if (this.a.U.getActivity() != null) {
          if (i != -1) {
             p0 = AlbumSelectedContainer.g(this.a).W0(i);
          }
          PublishSubject publishSubje = AlbumSelectedContainer.g(this.a).D0();
          AlbumSelectedContainer$a ta = this.a;
          AlbumAssetFragment uAlbumAssetF = ta.r();
          p0 = (uAlbumAssetF != null)? uAlbumAssetF.zh(p0): 0;
          publishSubje.onNext(ta.M(p0));
       }
       AlbumSelectedContainer.f(this.a).Y0();
       AlbumSelectedContainer.f(this.a).a1(i);
       AlbumSelectedContainer$a ta1 = this.a;
       Objects.requireNonNull(ta1);
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (!PatchProxy.isSupport(uAlbumSelect) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), ta1, uAlbumSelect, "21")) {
          RecyclerView$ViewHolder viewHolder = ta1.D().findViewHolderForAdapterPosition(i);
          int i2 = ta1.D().getWidth() / 2;
          if (viewHolder != null) {
             viewHolder = viewHolder.itemView;
             if (viewHolder != null) {
                i1 = viewHolder.getWidth() / 2;
             }
          }
          i2 = (i2 - i1) - AlbumSelectedContainer.X;
          AlbumSelectedContainer y = ta1.y;
          if (y != null) {
             y.scrollToPositionWithOffset(i, i2);
          }
       }
       this.a.d0();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer$a.class, "1")) {
          return;
       }
       AlbumSelectedContainer$a ta = this.a;
       if (ta.N != null || AlbumSelectedContainer.g(ta).s0().m().r()) {
          ta = this.a;
          ta.i(true, ta.N);
       }else {
          this.a.h(true);
       }
       return;
    }
    public void onClose(){
       Object[] tag;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumSelectedContainer$a.class, "4")) {
          return;
       }
       AlbumSelectedContainer.f(this.a).Y0();
       AlbumSelectedContainer.g(this.a).Z0(objArray);
       if (this.a.C().getTag() instanceof ObjectAnimator) {
          tag = this.a.C().getTag();
          if (!tag instanceof ObjectAnimator) {
             tag = objArray;
          }
          if (tag != null) {
             tag.cancel();
          }
       }
       View view = this.a.B();
       tag = (view != null)? view.getTag(): objArray;
       if (tag instanceof ObjectAnimator) {
          view = this.a.B();
          tag = (view != null)? view.getTag(): objArray;
          if (tag instanceof ObjectAnimator) {
             objArray = tag;
          }
          if (objArray != null) {
             objArray.cancel();
          }
       }
       if (!this.a.C().isShown()) {
          this.a.C().setVisibility(0);
          view = this.a.B();
          if (view != null) {
             view.setVisibility(0);
          }
          this.a.C().setAlpha(0x3f800000);
       }
       AlbumSelectedContainer$a ta = this.a;
       if (ta.N != null || AlbumSelectedContainer.g(ta).s0().m().r()) {
          ta = this.a;
          ta.i(0, ta.N);
       }else {
          this.a.h(0);
       }
       this.a.N = false;
       return;
    }
}
