package com.yxcorp.gifshow.detail.common.information.subscribeauthor.b;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.f;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.SubscribeAuthorGuideManager;
import e17.i;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import wkd.b;
import psb.c;
import brd.t;
import xy9.e;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.d;
import crd.b;

public final class b implements g	// class@001457
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, f.class, "4")) {
       }else {
          tb.n0("open");
          boolean b = true;
          tb.t.setManualHideSubscribeAuthor(b);
          if (SubscribeAuthorGuideManager.a(tb.t)) {
             i.a(R.style.arg_RES_7f11066a, 0x7f104b0d);
          }else if(!p0.C(a.a().a())){
             i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          }else {
             b.a(0x1e7ef171).l(tb.t.getUserId(), b).subscribe(new e(tb), d.b);
          }
       }
       return;
    }
}
