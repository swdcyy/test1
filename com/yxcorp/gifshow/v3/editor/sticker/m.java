package com.yxcorp.gifshow.v3.editor.sticker.m;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class m implements g	// class@00126b
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("SinglePicStickerEditPresenter", "getPhotoSizeUpdatePublishSubject", p0);
    }
}
