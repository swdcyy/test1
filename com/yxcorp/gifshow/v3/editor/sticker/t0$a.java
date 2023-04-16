package com.yxcorp.gifshow.v3.editor.sticker.t0$a;
import x59.e$d;
import com.yxcorp.gifshow.v3.editor.sticker.t0;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mrd.a;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import itc.x2;

public class t0$a implements e$d	// class@0012a9
{
    public final t0 a;

    public void t0$a(t0 p0){
       this.a = p0;
       super();
    }
    public StickerDetailInfo a(){
       Object obj = PatchProxy.apply(null, this, t0$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.F.i();
    }
    public void b(StickerDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t0$a.class, "1")) {
          return;
       }
       t0 g = this.a.G;
       if (g != null) {
          x2.c(g.Qh(), p0);
       }
       this.a.F.onNext(p0);
       return;
    }
}
