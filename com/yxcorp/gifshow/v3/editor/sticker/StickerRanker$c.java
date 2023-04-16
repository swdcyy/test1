package com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import w46.b;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import otc.a;

public final class StickerRanker$c implements g	// class@00120f
{
    public static final StickerRanker$c b;

    static {
       StickerRanker$c.b = new StickerRanker$c();
    }
    public void StickerRanker$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerRanker$c.class, "1")) {
       }else {
          a.D().e("StickerRanker", "analyzeScene failed", p0);
          StickerRanker.a(StickerRanker.i, "");
          a.g.c();
       }
       return;
    }
}
