package com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerEditText;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerEditText$a;
import nsd.u;
import android.content.Context;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditTagStickerElementData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.graphics.Rect;
import java.lang.Integer;
import java.lang.Boolean;
import android.widget.EditText;
import android.view.View;

public final class NewTagStickerEditText extends EditTagStickerEditText	// class@000a81
{
    public final NewTagStickerElementData m;
    public HashMap n;
    public static final NewTagStickerEditText$a o;

    static {
       NewTagStickerEditText.o = new NewTagStickerEditText$a(null);
    }
    public void NewTagStickerEditText(Context p0,NewTagStickerElementData p1){
       a.p(p0, "context");
       String str = "elementData";
       a.p(p1, str);
       NewTagStickerEditText$a o = NewTagStickerEditText.o;
       Objects.requireNonNull(o);
       EditTagStickerElementData uEditTagStic = PatchProxy.applyOneRefs(p1, o, NewTagStickerEditText$a.class, "1");
       if (uEditTagStic != PatchProxyResult.class) {
       }else {
          a.p(p1, str);
          uEditTagStic = new EditTagStickerElementData(p1.S0());
          uEditTagStic.a(p1);
          uEditTagStic.K = p1.Q;
       }
       super(p0, uEditTagStic);
       this.m = p1;
       return;
    }
    public final NewTagStickerElementData getElementData(){
       return this.m;
    }
    public boolean requestFocus(int p0,Rect p1){
       if (PatchProxy.isSupport(NewTagStickerEditText.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, NewTagStickerEditText.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.setCursorVisible(true);
       this.setFocusable(true);
       this.setFocusableInTouchMode(true);
       return super.requestFocus(p0, p1);
    }
}
