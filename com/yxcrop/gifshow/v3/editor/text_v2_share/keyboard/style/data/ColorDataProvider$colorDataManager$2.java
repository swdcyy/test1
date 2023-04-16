package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.data.ColorDataProvider$colorDataManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ColorDataProvider$colorDataManager$2 extends Lambda implements a	// class@000bb1
{
    public static final ColorDataProvider$colorDataManager$2 INSTANCE;

    static {
       ColorDataProvider$colorDataManager$2.INSTANCE = new ColorDataProvider$colorDataManager$2();
    }
    public void ColorDataProvider$colorDataManager$2(){
       super(0);
    }
    public final TextStyleDataManager invoke(){
       Object obj = PatchProxy.apply(null, this, ColorDataProvider$colorDataManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TextStyleDataManager();
    }
    public Object invoke(){
       return this.invoke();
    }
}
