package com.yxcorp.gifshow.widget.cdn.DesignPreloadManager$a$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.cdn.DesignPreloadManager$a$a;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.widget.cdn.DesignPreloadManager;
import java.util.Objects;
import java.lang.StringBuilder;
import java.io.File;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import kotlin.io.FilesKt__UtilsKt;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import zyc.d;

public final class DesignPreloadManager$a$a$a implements Runnable	// class@00195b
{
    public final DesignPreloadManager$a$a b;
    public final String c;

    public void DesignPreloadManager$a$a$a(DesignPreloadManager$a$a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       int i;
       DesignPreloadManager$a$a$a tb = this.b;
       DesignPreloadManager$a$a f = tb.f;
       DesignPreloadManager$a$a g = tb.g;
       DesignPreloadManager$a$a$a tc = this.c;
       Objects.requireNonNull(DesignPreloadManager.c);
       Log.g("design_cdn#manager", "cleanOldFiles: "+f.getAbsolutePath()+" ext: "+g+" current: "+tc);
       File[] uFileArray = f.listFiles();
       if (uFileArray != null) {
          i = (!uFileArray.length)? 1: 0;
          if (!i) {
             i = 0;
          label_004b :
             if (!i) {
                i = uFileArray.length;
                int i1 = 0;
                while (i1 < i) {
                   object oobject = uFileArray[i1];
                   a.o(oobject, "file");
                   if (oobject.isDirectory() && !a.g(FilesKt__UtilsKt.a0(oobject), g)) {
                      int i2 = 2;
                      if (!StringsKt__StringsKt.O2(FilesKt__UtilsKt.a0(oobject), "_folder_", false, i2, null)) {
                         if (tc != null) {
                            String absolutePath = oobject.getAbsolutePath();
                            a.o(absolutePath, "file.absolutePath");
                            if (StringsKt__StringsKt.O2(tc, absolutePath, false, i2, null) != true) {
                            }
                         }else {
                         }
                      }
                   }
                label_00a4 :
                   i1 = i1 + 1;
                }
             }
             return;
          }
       }
       i = 1;
       goto label_004b ;
    }
}
