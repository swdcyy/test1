package com.kuaishou.live.core.show.wishlist.e;
import com.kuaishou.live.core.show.wishlist.d$c;
import com.kuaishou.live.core.show.wishlist.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import nn2.y1;
import w51.a;
import java.util.Set;
import nn2.a;
import com.kwai.robust.PatchProxyResult;
import nn2.v1;
import android.view.ViewGroup;
import java.lang.Integer;
import java.lang.Boolean;
import yn2.b;
import java.lang.Iterable;
import qk.m;
import nn2.g0;
import ok.o;
import com.google.common.base.Optional;

public class e implements d$c	// class@0012d8
{
    public final d a;

    public void e(d p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       d w = this.a.w;
       if (w != null) {
          w.Q();
       }else {
          b.Z(LiveLogTag.WISH_LIST, "[LiveAudienceWishListPresenter] [showWishListFragment]mLiveAudienceWishListPendentController is null ");
       }
       return;
    }
    public void c(y1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       if (a.O()) {
          return;
       }
       this.a.z.add(p0);
       return;
    }
    public a d(){
       d obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.O()) {
          return null;
       }
       obj = this.a.w;
       if (obj != null) {
          return obj.s();
       }
       return null;
    }
    public void e(y1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       if (a.O()) {
          return;
       }
       this.a.z.remove(p0);
       return;
    }
    public ViewGroup f(){
       d obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.O()) {
          return null;
       }
       obj = this.a.w;
       if (obj == null) {
          return null;
       }
       return obj.f;
    }
    public boolean g(int p0){
       d obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (a.O()) {
          return b;
       }else {
          obj = this.a.v;
          if (obj == null) {
             return b;
          }else {
             return m.s(obj.a).r(new g0(p0)).isPresent();
          }
       }
    }
}
