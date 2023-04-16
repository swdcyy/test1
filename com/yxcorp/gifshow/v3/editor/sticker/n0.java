package com.yxcorp.gifshow.v3.editor.sticker.n0;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import brd.t;
import itc.g2;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;

public final class n0 implements o	// class@001278
{
    public static final n0 b;

    static {
       n0.b = new n0();
    }
    public void n0(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (p0.isStickerNeedDecodeDimension() || p0.isStickerNeedLoadInfoJson())? t.fromCallable(new g2(p0)).subscribeOn(d.c): t.just(p0);
       return p0;
    }
}
