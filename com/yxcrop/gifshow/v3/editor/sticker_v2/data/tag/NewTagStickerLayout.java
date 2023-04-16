package com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerLayout;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerLayout;
import android.content.Context;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerEditText;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditTagStickerElementData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import android.text.Spannable;
import android.text.Selection;

public final class NewTagStickerLayout extends EditTagStickerLayout	// class@000a89
{
    public final NewTagStickerEditText f;
    public HashMap g;

    public void NewTagStickerLayout(Context p0,NewTagStickerEditText p1){
       a.p(p0, "context");
       a.p(p1, "editText");
       super(p0, new EditTagStickerEditText(p0, p1.getEditTagStickerElementData()));
       this.f = p1;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, NewTagStickerLayout.class, "1")) {
          return;
       }
       Selection.removeSelection(this.getMEditText().getText());
       return;
    }
    public final NewTagStickerEditText getEditText(){
       return this.f;
    }
}
