package com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement$a;
import qvc.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement$a$a;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement$a$b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerLayout;
import android.widget.RelativeLayout;

public final class NewTagStickerElement$a implements b	// class@000a84
{
    public final NewTagStickerElement a;

    public void NewTagStickerElement$a(NewTagStickerElement p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NewTagStickerElement$a.class, "1")) {
          return;
       }
       a.p(p0, "oldString");
       a.p(p1, "newString");
       NewTagStickerElement$a ta = this.a;
       if (ta.mDecorationShowingView != null) {
          this.b();
       }else {
          ta.getContainerView().post(new NewTagStickerElement$a$a(this));
       }
       if (a.g(p1, p0) ^ 0x01) {
          this.a.getContainerView().post(new NewTagStickerElement$a$b(this, p1));
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, NewTagStickerElement$a.class, "2")) {
          return;
       }
       NewTagStickerElement.calculateAndUpdateDimen$default(this.a, false, 1, null);
       this.a.getContainerView().T();
       NewTagStickerElement.access$getMStickerView$p(this.a).invalidate();
       return;
    }
}
