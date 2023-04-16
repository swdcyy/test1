package com.kuaishou.live.common.core.basic.widget.AlphaGradientHelper$paint$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.basic.widget.AlphaGradientHelper;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import android.view.View;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;

public final class AlphaGradientHelper$paint$2 extends Lambda implements a	// class@000f02
{
    public final AlphaGradientHelper this$0;

    public void AlphaGradientHelper$paint$2(AlphaGradientHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final Paint invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, AlphaGradientHelper$paint$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Build$VERSION.SDK_INT >= 23) {
          this.this$0.b.setLayerType(2, objArray);
          objArray = new Paint();
          LinearGradient linearGradie = new LinearGradient(0, 0, 0, 100.00f, 0xff000000, 0, Shader$TileMode.CLAMP);
          objArray.setShader(obj);
          objArray.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
