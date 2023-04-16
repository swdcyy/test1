package com.yxcrop.gifshow.v3.editor.decoration_v2.ui.pic.PictureFakeView$rect$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.graphics.Rect;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PictureFakeView$rect$2 extends Lambda implements a	// class@000a39
{
    public static final PictureFakeView$rect$2 INSTANCE;

    static {
       PictureFakeView$rect$2.INSTANCE = new PictureFakeView$rect$2();
    }
    public void PictureFakeView$rect$2(){
       super(0);
    }
    public final Rect invoke(){
       Object obj = PatchProxy.apply(null, this, PictureFakeView$rect$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Rect();
    }
    public Object invoke(){
       return this.invoke();
    }
}
