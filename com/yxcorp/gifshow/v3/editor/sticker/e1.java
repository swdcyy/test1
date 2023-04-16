package com.yxcorp.gifshow.v3.editor.sticker.e1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class e1 implements g	// class@001230
{
    public static final e1 b;

    static {
       e1.b = new e1();
    }
    public void e1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("StickerViewPresenter", "mStickerRequestStatusPublisher", p0);
    }
}
