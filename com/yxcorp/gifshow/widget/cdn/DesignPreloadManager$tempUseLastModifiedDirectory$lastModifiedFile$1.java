package com.yxcorp.gifshow.widget.cdn.DesignPreloadManager$tempUseLastModifiedDirectory$lastModifiedFile$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.io.File;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class DesignPreloadManager$tempUseLastModifiedDirectory$lastModifiedFile$1 extends Lambda implements l	// class@00195f
{
    public static final DesignPreloadManager$tempUseLastModifiedDirectory$lastModifiedFile$1 INSTANCE;

    static {
       DesignPreloadManager$tempUseLastModifiedDirectory$lastModifiedFile$1.INSTANCE = new DesignPreloadManager$tempUseLastModifiedDirectory$lastModifiedFile$1();
    }
    public void DesignPreloadManager$tempUseLastModifiedDirectory$lastModifiedFile$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(File p0){
       a.o(p0, "it");
       boolean b = true;
       if (p0.isDirectory()) {
          File[] uFileArray = p0.listFiles();
          if (uFileArray != null) {
             uFileArray = (!uFileArray.length)? 1: 0;
             if (!uFileArray) {
                uFileArray = 0;
             label_001f :
                if (!uFileArray) {
                label_0023 :
                   return b;
                }
             }
          }
          uFileArray = 1;
          goto label_001f ;
       }
       b = false;
       goto label_0023 ;
    }
}
