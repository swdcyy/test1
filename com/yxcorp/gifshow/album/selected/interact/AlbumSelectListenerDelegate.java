package com.yxcorp.gifshow.album.selected.interact.AlbumSelectListenerDelegate;
import m79.e;
import m79.d;
import java.lang.Object;
import com.yxcorp.gifshow.album.selected.interact.AlbumSelectListenerDelegate$selectListeners$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Integer;
import java.util.Iterator;
import java.lang.Iterable;
import r79.c;
import com.kwai.robust.PatchProxyResult;

public final class AlbumSelectListenerDelegate implements e, d	// class@001ac4
{
    public final p b;

    public void AlbumSelectListenerDelegate(){
       super();
       this.b = s.c(AlbumSelectListenerDelegate$selectListeners$2.INSTANCE);
    }
    public void G(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectListenerDelegate.class, "2")) {
          return;
       }
       a.q(p0, "listener");
       this.e().add(p0);
       return;
    }
    public void a(int p0,int p1){
       AlbumSelectListenerDelegate uAlbumSelect = AlbumSelectListenerDelegate.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAlbumSelect, "7")) {
          return;
       }
       Iterator iterator = this.e().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void a0(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectListenerDelegate.class, "3")) {
          return;
       }
       a.q(p0, "listener");
       this.e().remove(p0);
       return;
    }
    public void b(c p0,int p1){
       AlbumSelectListenerDelegate uAlbumSelect = AlbumSelectListenerDelegate.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAlbumSelect, "6")) {
          return;
       }
       a.q(p0, "data");
       Iterator iterator = this.e().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1);
       }
       return;
    }
    public void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectListenerDelegate.class, "5")) {
          return;
       }
       a.q(p0, "data");
       Iterator iterator = this.e().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectListenerDelegate.class, "8")) {
          return;
       }
       Iterator iterator = this.e().iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       return;
    }
    public final List e(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectListenerDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public void j0(){
       if (PatchProxy.applyVoid(null, this, AlbumSelectListenerDelegate.class, "4")) {
          return;
       }
       this.e().clear();
       return;
    }
}
