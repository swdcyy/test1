package com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$edit$model$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Comparable;

public final class GrowthTestLayout$Companion$SubTitleScope$edit$model$1 extends Lambda implements a	// class@001551
{
    public final GrowthTestLayout$Companion$a $handler;

    public void GrowthTestLayout$Companion$SubTitleScope$edit$model$1(GrowthTestLayout$Companion$a p0){
       this.$handler = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String str;
       Comparable obj = PatchProxy.apply(null, this, GrowthTestLayout$Companion$SubTitleScope$edit$model$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$handler.b();
       if (obj != null) {
          str = obj.toString();
          if (str != null) {
          label_0023 :
             return str;
          }
       }
       str = "";
       goto label_0023 ;
    }
}
