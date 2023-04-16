package com.yxcorp.gifshow.detail.common.rightactionbar.more.b$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b;
import java.lang.Object;
import android.view.View;
import uf5.c0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import java.util.Objects;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import brd.t;
import cjd.e;
import erd.o;
import uf5.b0;
import sfc.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import cda.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import qa9.s;
import tkd.b;
import tkd.d;
import gx5.d;
import uf5.z;
import android.content.Context;
import z1.a;
import uf5.a0;

public final class b$d implements View$OnClickListener	// class@0014b2
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       c0 uoc01;
       b$d tb;
       b uob = b.class;
       c0 uoc0 = c0.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, str)) {
          return;
       }
       int i = 0x330163e;
       if (w.F0(b.R8(this.b).mEntity)) {
          uoc01 = b.S8(this.b);
          Objects.requireNonNull(uoc01);
          if (!PatchProxy.applyVoid(null, uoc01, uoc0, "2")) {
             b.a(i).topPhotoSingleReplace(uoc01.a.getPhotoId(), 0).map(new e()).subscribe(new b0(uoc01), new a());
          }
          RxBus.f.b(new f(b.R8(this.b), 5));
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, uob, "12")) {
             tb.W8("cancel_top");
          }
          s.b(b.P8(this.b));
       }else {
          uoc01 = b.S8(this.b);
          Objects.requireNonNull(uoc01);
          if (!PatchProxy.applyVoid(null, uoc01, uoc0, str) && !d.a(-1188553266).Od(uoc01.a.getPhotoId(), uoc01.b, new z(uoc01))) {
             b.a(i).topPhotoSingleReplace(uoc01.a.getPhotoId(), 1).map(new e()).subscribe(new a0(uoc01), new a());
          }
          RxBus.f.b(new f(b.R8(this.b), 5));
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, uob, "11")) {
             tb.W8("set_top");
          }
          s.b(b.P8(this.b));
       }
       return;
    }
}
