package com.yxcorp.gifshow.init.module.b1;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import qfc.a;
import java.lang.String;
import q87.c;
import java.io.File;
import java.lang.StringBuilder;
import qkd.b;

public final class b1 implements Runnable	// class@0019b3
{
    public static final b1 b;

    static {
       b1.b = new b1();
    }
    public void b1(){
       super();
    }
    public final void run(){
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().s("MagicEmojiResourceHelper", "deleteOldResourceFile", objArray);
       String[] stringArray = new String[]{"mmu","ycnn_face_detect","ylab","face_3d_resource","magic_face_3d_resource"};
       String str = MagicEmojiResourceHelper.g();
       while (i < 5) {
          File uFile = new File(str+stringArray[i]);
          if (uFile.exists()) {
             b.q(uFile);
          }
          i = i + 1;
       }
       return;
    }
}
