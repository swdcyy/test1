package bmd.c;
import t36.f$a;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements f$a	// class@00027c
{
    public final StickerDetailInfo a;

    public void c(StickerDetailInfo p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          p0.b(this.a);
       }
       return;
    }
}
