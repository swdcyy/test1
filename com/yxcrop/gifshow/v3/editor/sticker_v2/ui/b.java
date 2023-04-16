package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.b;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import brd.t;
import nmd.l;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;

public final class b implements o	// class@000aa3
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (p0.isStickerNeedDecodeDimension() || p0.isStickerNeedLoadInfoJson())? t.fromCallable(new l(p0)).subscribeOn(d.c): t.just(p0);
       return p0;
    }
}
