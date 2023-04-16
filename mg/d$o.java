package mg.d$o;
import erd.o;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.feature.post.api.feature.bridge.JsSaveTempImagesParams;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.File;
import qkd.b;
import java.lang.StringBuilder;
import java.util.UUID;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.content.Context;
import com.yxcorp.gifshow.media.util.c;
import og.l;
import q87.c;
import java.lang.IllegalArgumentException;

public final class d$o implements o	// class@0025e9
{
    public final Ref$ObjectRef b;
    public final JsSaveTempImagesParams c;

    public void d$o(Ref$ObjectRef p0,JsSaveTempImagesParams p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       File uFile;
       String str1;
       boolean b;
       Object obj = p0;
       a.p(obj, "it");
       p0 = this.b.element;
       a.m(p0);
       JsSaveTempImagesParams isPng = this.c.isPng;
       if (!p0.isDirectory()) {
          p0.mkdirs();
       }
       String str = (isPng != null)? ".png": ".jpg";
       if (isPng != null) {
          uFile = b.a0(p0);
          str1 = "FileUtils.newPngFile\(sameTempPicDir\)";
       }else {
          uFile = b.Z(p0);
          str1 = "FileUtils.newJpgFile\(sameTempPicDir\)";
       }
       File uFile1 = uFile;
       a.o(uFile1, str1);
       File uFile2 = new File(p0.getAbsolutePath(), "tmp_"+UUID.randomUUID().toString()+str);
       if (isPng != null) {
          BitmapUtil.O(obj, uFile1.getAbsolutePath(), 100);
          if (!obj.isRecycled()) {
             obj.recycle();
          }
       }else {
          c.c(null, obj, obj.getWidth(), obj.getHeight(), 85, uFile1.getAbsolutePath(), true, true);
       }
       b = b.k0(uFile1, uFile2);
       Object[] objArray = new Object[0];
       l.D().w("JsEditFun", "saveBitmapToFile renameSuccess: "+b+", path = "+uFile2.getAbsolutePath(), objArray);
       if (b) {
          b = uFile2.getAbsolutePath();
          a.o(b, "targetFile.absolutePath");
          return b;
       }else {
          throw new IllegalArgumentException("base64ToBitmap : renameSuccess = "+b);
       }
    }
}
