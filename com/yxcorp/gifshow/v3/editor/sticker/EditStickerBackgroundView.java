package com.yxcorp.gifshow.v3.editor.sticker.EditStickerBackgroundView;
import android.view.View;
import itc.t;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;

public final class EditStickerBackgroundView extends View	// class@0011fb
{
    public final String b;
    public final t c;
    public HashMap d;

    public void EditStickerBackgroundView(t p0,Context p1){
       a.p(p0, "mBackgroundPainter");
       a.p(p1, "context");
       super(p1);
       this.c = p0;
       this.b = "EditTagStickerBackgroundView";
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditStickerBackgroundView.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       super.draw(p0);
       Object[] objArray = new Object[0];
       a.D().w(this.b, "draw", objArray);
       this.c.a(p0);
       return;
    }
}
