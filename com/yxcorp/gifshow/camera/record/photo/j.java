package com.yxcorp.gifshow.camera.record.photo.j;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.m;
import java.lang.Object;
import zq8.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.d;
import android.content.Context;
import java.lang.String;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import brd.t;
import com.kwai.moved.components.util.d;
import hg9.c0;
import com.yxcorp.gifshow.camera.record.photo.k;
import crd.b;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;

public final class j implements g	// class@000eb1
{
    public final m b;

    public void j(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.b != null) {
          String str = "android.permission.WRITE_EXTERNAL_STORAGE";
          if (!PermissionUtils.a(tb.e, str)) {
             tb.g2(d.b(new g(tb.e), tb.e, str).subscribe(new c0(tb), k.b));
          }
       }else {
          p0 = tb.O;
          if (p0 != null) {
             p0.p2(false, false, false);
          }
       }
       return;
    }
}
