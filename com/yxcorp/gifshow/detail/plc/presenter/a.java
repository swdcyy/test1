package com.yxcorp.gifshow.detail.plc.presenter.a;
import erd.g;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;
import com.yxcorp.gifshow.tuna.plc.StartTunaDownloadEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f4a.f;
import f4a.g;
import o4a.d;
import z1.a;
import brd.y;

public final class a implements g	// class@001697
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "17")) {
       }else if(!TextUtils.n(tb.K.getDownloadUrl(), p0.mDownloadUrl)){
          if (tb.W.b != null) {
             tb.R8(4);
          }
          p0 = new g(true, new d(tb));
          p0.c = true;
          tb.C.onNext(p0);
       }
       return;
    }
}
