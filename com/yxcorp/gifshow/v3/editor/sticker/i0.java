package com.yxcorp.gifshow.v3.editor.sticker.i0;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import brd.t;
import itc.x1;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;

public final class i0 implements o	// class@001256
{
    public static final i0 b;

    static {
       i0.b = new i0();
    }
    public void i0(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (p0.isStickerNeedDecodeDimension() || p0.isStickerNeedLoadInfoJson())? t.fromCallable(new x1(p0)).subscribeOn(d.c): t.just(p0);
       return p0;
    }
}
