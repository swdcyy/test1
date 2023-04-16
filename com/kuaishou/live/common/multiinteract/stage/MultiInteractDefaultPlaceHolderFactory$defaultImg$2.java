package com.kuaishou.live.common.multiinteract.stage.MultiInteractDefaultPlaceHolderFactory$defaultImg$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap$Config;

public final class MultiInteractDefaultPlaceHolderFactory$defaultImg$2 extends Lambda implements a	// class@0017ff
{
    public final int $defaultColor;

    public void MultiInteractDefaultPlaceHolderFactory$defaultImg$2(int p0){
       this.$defaultColor = p0;
       super(0);
    }
    public final Bitmap invoke(){
       Bitmap obj = PatchProxy.apply(null, this, MultiInteractDefaultPlaceHolderFactory$defaultImg$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Bitmap.createBitmap(100, 100, Bitmap$Config.ARGB_8888);
       obj.eraseColor(this.$defaultColor);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
