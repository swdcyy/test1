package com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText$b;
import android.text.TextWatcher;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.jvm.internal.a;
import android.text.TextPaint;
import android.widget.EditText;
import stc.b;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditTagStickerElementData;
import kotlin.Pair;
import stc.b$a;
import java.lang.Number;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import qvc.b;

public final class EditTagStickerEditText$b implements TextWatcher	// class@0012ae
{
    public final EditTagStickerEditText b;

    public void EditTagStickerEditText$b(EditTagStickerEditText p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(EditTagStickerEditText$b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, EditTagStickerEditText$b.class, "1")) {
          return;
       }
       String str = String.valueOf(this.b.getText());
       if (a.g(str, this.b.e) ^ 0x01) {
          TextPaint paint = this.b.getPaint();
          a.o(paint, "paint");
          float textSize = paint.getTextSize();
          TextPaint paint1 = this.b.getPaint();
          a.o(paint1, "paint");
          Pair pair = b.e.c(str, (int)this.b.getEditTagStickerElementData().K, paint1, this.b.getLineSpacingMultiplier(), this.b.getLineSpacingExtra());
          String first = pair.getFirst();
          this.b.getEditTagStickerElementData().K(pair.getSecond().floatValue());
          EditTagStickerElementData editTagStick = this.b.getEditTagStickerElementData();
          String first1 = pair.getFirst();
          Objects.requireNonNull(editTagStick);
          if (!PatchProxy.applyVoidOneRefs(first1, editTagStick, EditTagStickerElementData.class, "4")) {
             a.p(first1, "<set-?>");
             editTagStick.L = first1;
          }
          this.b.d(first);
          if (a.g(first, this.b.e) ^ 0x01) {
             Iterator iterator = this.b.f.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(this.b.e, str);
             }
             str.e = first;
          }
          TextPaint paint2 = this.b.getPaint();
          a.o(paint2, "paint");
          paint2.setTextSize(textSize);
       }
       return;
    }
}
