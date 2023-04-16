package com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement$a;
import qvc.b;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement$a$a;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerLayout;
import android.widget.RelativeLayout;

public final class EditTagStickerElement$a implements b	// class@001226
{
    public final EditTagStickerElement a;
    public final DecorationContainerView b;

    public void EditTagStickerElement$a(EditTagStickerElement p0,DecorationContainerView p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditTagStickerElement$a.class, "1")) {
          return;
       }
       a.p(p0, "oldString");
       a.p(p1, "newString");
       if (this.a.mDecorationShowingView != null) {
          this.b();
       }else {
          this.b.post(new EditTagStickerElement$a$a(this));
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerElement$a.class, "2")) {
          return;
       }
       this.a.calculateAndUpdateDimen();
       this.b.T();
       EditTagStickerElement.access$getMStickerView$p(this.a).invalidate();
       return;
    }
}
