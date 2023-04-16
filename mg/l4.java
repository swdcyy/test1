package mg.l4;
import io.reactivex.g;
import com.feature.post.bridge.jsmodel.JsSaveImageParams;
import android.app.Activity;
import java.lang.Object;
import brd.v;
import java.lang.Integer;
import brd.g;
import java.lang.String;
import android.util.Base64;
import java.io.File;
import android.os.Environment;
import o56.a;
import qkd.b;
import java.lang.StringBuilder;
import java.lang.System;
import qkd.c;
import android.content.Intent;
import android.net.Uri;
import ekd.w0;

public final class l4 implements g	// class@002634
{
    public final JsSaveImageParams b;
    public final Activity c;

    public void l4(JsSaveImageParams p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       int b;
       l4 tb = this.b;
       l4 tc = this.c;
       Integer integer = Integer.valueOf(412);
       if (p0 == null) {
          p0.onNext(integer);
       }else {
          byte[] uobyteArray = Base64.decode(tb.base64String, 0);
          if (uobyteArray == null) {
             p0.onNext(integer);
          }else {
             File uFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), a.w);
             if (!b.R(uFile)) {
                uFile.mkdirs();
             }
             File uFile1 = new File(uFile.getAbsolutePath(), "kwai_save_image_"+System.currentTimeMillis()+".jpg");
             b = c.p(uobyteArray, uFile1);
             if (b) {
                Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                intent.setData(w0.c(uFile1));
                tc.sendBroadcast(intent);
             }
             b = (b)? 1: 441;
             p0.onNext(Integer.valueOf(b));
          }
          p0.onComplete();
       }
       return;
    }
}
