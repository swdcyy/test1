package com.kuaishou.tuna_core.button.TunaButton$Companion$jumpUrl$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import java.lang.Object;
import java.lang.String;

public final class TunaButton$Companion$jumpUrl$1 extends Lambda implements a	// class@00108e
{
    public final JumpUrlModel $model;

    public void TunaButton$Companion$jumpUrl$1(JumpUrlModel p0){
       this.$model = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       JumpUrlModel mUrl;
       TunaButton$Companion$jumpUrl$1 t$model = this.$model;
       if (t$model != null) {
          mUrl = t$model.mUrl;
          if (mUrl != null) {
          label_000b :
             return mUrl;
          }
       }
       mUrl = "model or url is null";
       goto label_000b ;
    }
}
