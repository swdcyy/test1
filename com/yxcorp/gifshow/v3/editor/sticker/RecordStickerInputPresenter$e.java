package com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter$e;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class RecordStickerInputPresenter$e extends DecorationContainerView$e	// class@001200
{
    public final RecordStickerInputPresenter a;

    public void RecordStickerInputPresenter$e(RecordStickerInputPresenter p0){
       this.a = p0;
       super();
    }
    public void t(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecordStickerInputPresenter$e.class, "1")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.t(p0, p1);
          if (this.a.d9() && this.a.W8(p0)) {
             this.a.a9(p0);
          }
       }
       return;
    }
}
