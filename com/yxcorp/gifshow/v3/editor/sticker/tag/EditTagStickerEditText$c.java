package com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText$c;
import android.text.InputFilter;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.Spanned;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText;
import java.util.Objects;
import ekd.k1;
import lnc.a1;
import e17.i;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText$a;
import java.lang.StringBuilder;
import kotlin.text.StringsKt__StringsKt;

public final class EditTagStickerEditText$c implements InputFilter	// class@0012af
{
    public static final EditTagStickerEditText$c a;

    static {
       EditTagStickerEditText$c.a = new EditTagStickerEditText$c();
    }
    public void EditTagStickerEditText$c(){
       super();
    }
    public final CharSequence filter(CharSequence p0,int p1,int p2,Spanned p3,int p4,int p5){
       if (PatchProxy.isSupport(EditTagStickerEditText$c.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, EditTagStickerEditText$c.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "source");
       a.p(p3, "dest");
       if (((p2 - p1) + (p3.length() - (p5 - p4))) > 9) {
          EditTagStickerEditText$a l = EditTagStickerEditText.l;
          Objects.requireNonNull(l);
          if (k1.t(EditTagStickerEditText.k) - 3000 > 0) {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f104bec));
             l.a(k1.i());
          }
       }
       if (StringsKt__StringsKt.O2(" #\n", p0, 0, 2, null)) {
          return "";
       }else {
          return null;
       }
    }
}
