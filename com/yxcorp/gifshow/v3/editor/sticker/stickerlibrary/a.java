package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.d;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import x59.e$d;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.v3.editor.sticker.f0;
import android.widget.ProgressBar;
import brd.a0;
import rtc.a;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a implements View$OnClickListener	// class@00129a
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, d.class, "4")) {
       }else {
          d v = tb.v;
          if (v != null) {
             v.b(tb.t);
          }
          if (!q.f(tb.t.mResourceUrls) && !f0.n(tb.t)) {
             tb.x.setVisibility(0);
             tb.P8(true);
          }else {
             tb.X7(f0.i(tb.t, tb.x).R(new a(tb), c.b));
          }
       }
       return;
    }
}
