package com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$b;
import erd.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import otc.a;

public final class StickerRanker$b implements g	// class@00120e
{
    public static final StickerRanker$b b;

    static {
       StickerRanker$b.b = new StickerRanker$b();
    }
    public void StickerRanker$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerRanker$b.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("StickerRanker", "analyzeScene success", objArray);
          StickerRanker.a(StickerRanker.i, p0);
          a.g.c();
       }
       return;
    }
}
