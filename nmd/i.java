package nmd.i;
import ekd.q$b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import lnc.s6;

public final class i implements q$b	// class@001e5d
{
    public final c a;
    public final boolean b;
    public final boolean c;

    public void i(c p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean a(Object p0){
       i tb = this.b;
       i tc = this.c;
       boolean b = false;
       if (!h1.d(this.a.k.getType()) || (p0.mStickerResourceType != 2 && (p0.mStickerType != -3 || (s6.o() && (p0.mStickerType != -4 || s6.p()))))) {
          if (tb == null) {
             StickerDetailInfo mStickerType = p0.mStickerType;
             if (mStickerType == -1 || (mStickerType != -4 && mStickerType != -3)) {
             }
          }else if(tc == null && p0.mStickerType == -2){
             p0.updateAnimatedOnPanel();
             b = true;
          }
       }
    label_004b :
       return b;
    }
}
