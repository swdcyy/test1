package com.yxcorp.gifshow.camera.record.album.c;
import erd.g;
import com.yxcorp.gifshow.camera.record.album.o;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x79.e;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import brd.t;
import t45.d;
import brd.z;
import sb9.k;
import com.yxcorp.gifshow.camera.record.album.h;
import crd.b;
import com.yxcorp.gifshow.camera.record.base.d;

public final class c implements g	// class@001cb2
{
    public final o b;

    public void c(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, o.class, "20")) {
       }else if(tb.A != null){
          tb.Y1(e.f().h(a.a().a(), tb.k2(), 1, "post_camera_album").observeOn(d.a).subscribe(new k(tb), h.b));
       }
       return;
    }
}
