package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.i;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import android.widget.ProgressBar;
import brd.a0;
import com.yxcorp.gifshow.v3.editor.sticker.f0;
import rtc.e;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.h;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class f implements View$OnClickListener	// class@0012a0
{
    public final i b;

    public void f(i p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, i.class, "5")) {
       }else {
          tb.X7(f0.i(tb.t, objArray).R(new e(tb), h.b));
       }
       return;
    }
}
