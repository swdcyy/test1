package com.yxcorp.gifshow.v3.editor.sticker.d1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class d1 implements g	// class@00121f
{
    public static final d1 b;

    static {
       d1.b = new d1();
    }
    public void d1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("StickerViewPresenter", "mSelectStickerPublisher", p0);
    }
}
