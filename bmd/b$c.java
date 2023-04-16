package bmd.b$c;
import erd.g;
import bmd.b;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.System;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import java.util.Map;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c$a;
import t36.f;
import bmd.c;
import t36.f$a;

public final class b$c implements g	// class@000279
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          this.b.Y();
          b$c tb = this.b;
          a.o(p0, "info");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "10")) {
             if ((System.currentTimeMillis() - tb.y) - tb.u < 0) {
                Object[] objArray = new Object[0];
                a.D().A("StickerEditorV2", "notifyAddSticker: too frequent, return", objArray);
                tb.y = System.currentTimeMillis();
             }else {
                EditorDelegate uEditorDeleg = tb.i();
                a.o(uEditorDeleg, "delegate");
                f.p0(uEditorDeleg.u(), c$a.class).s0(new c(p0));
                tb.y = System.currentTimeMillis();
             }
          }
       }
       return;
    }
}
