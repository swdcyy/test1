package com.yxcorp.gifshow.record.album.o1;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import k8c.l2;
import erd.f;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import t45.d;
import brd.z;
import k8c.i2;
import erd.a;
import k8c.m2;
import com.yxcorp.gifshow.record.album.c2;
import erd.g;
import crd.b;
import crd.a;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import k8c.j2;
import k8c.n2;
import com.yxcorp.gifshow.record.album.d2;
import k8c.k2;
import k8c.o2;
import com.yxcorp.gifshow.record.album.e2;

public final class o1 implements g	// class@001744
{
    public final long b;

    public void o1(long p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       o1 tb = this.b;
       LocalAlbumUtils$a uoa = new LocalAlbumUtils$a(p0);
       LocalAlbumUtils$a uoa1 = LocalAlbumUtils$a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(tb), uoa, uoa1, "3")) {
          uoa.b.setCancellable(new l2(uoa));
          z a = d.a;
          uoa.c.c(DraftFileManager.E().V(tb).observeOn(a).doOnTerminate(new i2(uoa)).subscribe(new m2(uoa), c2.b));
          uoa.c.c(LocalAlbumUtils.y(tb).observeOn(a).doOnTerminate(new j2(uoa)).subscribe(new n2(uoa), d2.b));
          uoa.c.c(LocalAlbumUtils.z(tb).observeOn(a).doOnTerminate(new k2(uoa)).subscribe(new o2(uoa), e2.b));
       }
       return;
    }
}
