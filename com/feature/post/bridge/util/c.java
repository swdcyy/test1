package com.feature.post.bridge.util.c;
import java.lang.Runnable;
import java.lang.String;
import com.feature.post.bridge.util.d$b;
import java.lang.Object;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import og.l;
import q87.c;
import og.s;
import ekd.k1;
import og.t;
import java.lang.StringBuilder;
import og.u;

public final class c implements Runnable	// class@0014cb
{
    public final String b;
    public final d$b c;

    public void c(String p0,d$b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       Object[] objArray;
       c tc = this.c;
       Bitmap uBitmap = BitmapUtil.s(this.b);
       int i = 0;
       String str = "PostMediaHelper";
       if (uBitmap == null) {
          objArray = new Object[i];
          l.D().w(str, "cover file is not ready and decodeFile get null result", objArray);
          k1.o(new s(tc));
       }else {
          uBitmap = BitmapUtil.o(uBitmap, 96, 96);
          if (uBitmap == null) {
             objArray = new Object[i];
             l.D().w(str, "crop coverImg fail and crop get null result", objArray);
             k1.o(new t(tc));
          }else {
             k1.o(new u(tc, "data:image/jpg;base64,"+BitmapUtil.d(uBitmap)));
          }
       }
       return;
    }
}
