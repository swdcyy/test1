package com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$b;
import erd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eba.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.ClearSinglePicTemplateStickerAction;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.MergeSinglePicTemplateStickerAction;
import lwc.h;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.EditorManager;
import lnc.a1;

public final class NewStickerPicTemplateProcessor$b implements a	// class@000a42
{
    public final NewStickerPicTemplateProcessor b;
    public final c c;
    public final c d;

    public void NewStickerPicTemplateProcessor$b(NewStickerPicTemplateProcessor p0,c p1,c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NewStickerPicTemplateProcessor$b.class, "1")) {
          return;
       }
       this.b.m(this.c);
       a uoa = this.c.U0();
       if (uoa != null) {
          a.o(uoa, "it");
          if (!(uoa.D() ^ 0x01)) {
             uoa = objArray;
          }
          if (uoa != null) {
             uoa.c0();
          }
       }
       this.b.l(new ClearSinglePicTemplateStickerAction());
       NewStickerPicTemplateProcessor$b tb = this.b;
       tb.l(new MergeSinglePicTemplateStickerAction(tb.d, this.d));
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, NewStickerPicTemplateProcessor.class, "8")) {
          BaseEditorFragment b = tb.f.B;
          a.o(b, "fragment.mEditorManager");
          EditorDelegate uEditorDeleg = b.m();
          uEditorDeleg.G(a1.d(R.dimen.arg_RES_7f07039a), a1.d(R.dimen.arg_RES_7f0703a1), a1.d(R.dimen.arg_RES_7f0703a1), true, false);
       }
       return;
    }
}
