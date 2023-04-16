package nmd.m;
import x59.e$d;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mrd.a;

public class m implements e$d	// class@001e66
{
    public final c a;

    public void m(c p0){
       this.a = p0;
       super();
    }
    public StickerDetailInfo a(){
       Object obj = PatchProxy.apply(null, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.j.i();
    }
    public void b(StickerDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       this.a.j.onNext(p0);
       return;
    }
}
