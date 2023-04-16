package ayc.c;
import io.reactivex.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.graphics.Bitmap;
import java.lang.Object;
import brd.v;
import android.content.Context;
import java.lang.String;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.lang.Integer;
import brd.g;
import java.io.File;
import android.os.Environment;
import o56.a;
import qkd.b;
import java.lang.StringBuilder;
import java.lang.System;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.content.Intent;
import android.net.Uri;
import ekd.w0;
import android.app.Activity;

public final class c implements g	// class@000305
{
    public final GifshowActivity b;
    public final Bitmap c;

    public void c(GifshowActivity p0,Bitmap p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       boolean b;
       c tb = this.b;
       c tc = this.c;
       if (!PermissionUtils.a(tb, "android.permission.WRITE_EXTERNAL_STORAGE")) {
          p0.onNext(Integer.valueOf(401));
       }else if(tc == null){
          p0.onNext(Integer.valueOf(412));
       }else {
          File uFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), a.w);
          if (!b.R(uFile)) {
             uFile.mkdirs();
          }
          File uFile1 = new File(uFile.getAbsolutePath(), "kwai_save_image_"+System.currentTimeMillis()+".jpg");
          BitmapUtil.M(tc, uFile1.getPath(), 100);
          b = uFile1.exists();
          if (b) {
             Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
             intent.setData(w0.c(uFile1));
             tb.sendBroadcast(intent);
          }
          int i = (b)? 1: 441;
          p0.onNext(Integer.valueOf(i));
       }
       p0.onComplete();
       return;
    }
}
