package com.yxcorp.gifshow.v3.editor.sticker.w0;
import erd.g;
import com.yxcorp.gifshow.v3.editor.sticker.y0;
import lwc.h;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.sticker.e;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import itc.y2;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Runnable;
import uld.j;

public final class w0 implements g	// class@0012dc
{
    public final y0 b;
    public final h c;

    public void w0(y0 p0,h p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       w0 tb = this.b;
       Objects.requireNonNull(tb);
       j.a(p0.intValue(), tb.G, tb.D.z(), new y2(tb), tb.getActivity(), this.c);
    }
}
