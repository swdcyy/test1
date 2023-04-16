package com.yxcrop.gifshow.v3.editor.decoration_v2.ui.pic.PictureFakeView$paint$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PictureFakeView$paint$2 extends Lambda implements a	// class@000a38
{
    public static final PictureFakeView$paint$2 INSTANCE;

    static {
       PictureFakeView$paint$2.INSTANCE = new PictureFakeView$paint$2();
    }
    public void PictureFakeView$paint$2(){
       super(0);
    }
    public final Paint invoke(){
       Object obj = PatchProxy.apply(null, this, PictureFakeView$paint$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Paint();
    }
    public Object invoke(){
       return this.invoke();
    }
}
