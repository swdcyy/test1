package com.yxcorp.gifshow.media.watermark.VideoWatermarkTask;
import t6b.b;
import java.io.File;
import java.lang.String;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import java.util.Locale;
import ra6.a;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.media.watermark.VideoWatermarkTask$a;
import qkd.c;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.yxcorp.gifshow.util.BitmapUtil;

public class VideoWatermarkTask implements b	// class@001d2a
{
    public String a;
    public final User b;
    public File c;
    public File d;
    public int e;
    public boolean f;
    public boolean g;
    public String h;
    public boolean i;
    public String j;
    public EditorSdk2V2$VideoEditorProject k;
    public ExportTaskNoQueueing l;
    public VideoWatermarkTask$a m;
    public d n;

    public void VideoWatermarkTask(File p0,int p1,boolean p2,boolean p3,String p4,String p5,User p6){
       File uFile;
       if (PatchProxy.isSupport(VideoWatermarkTask.class)) {
          uFile = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p2), Boolean.valueOf(p3), null, VideoWatermarkTask.class, "1");
          if (uFile != PatchProxyResult.class) {
          label_0071 :
             super();
             this.a = "VideoWatermarkTask";
             this.m = new VideoWatermarkTask$a();
             this.c = p0;
             this.d = uFile;
             this.e = p1;
             this.f = p2;
             this.g = p3;
             this.h = p4;
             this.b = p6;
             this.j = p5;
             return;
          }
       }
       File uFile1 = b.a(-1504323719).o();
       StringBuilder str = p0.getName();
       String str1 = (p3)? "watermark": "no_watermark";
       str = str+str1;
       str1 = (p2)? "square": "";
       uFile = new File(uFile1, str+str1+a.c().getCountry()+(TextUtils.q(p0.getAbsolutePath())).toLowerCase());
       goto label_0071 ;
    }
    public static File b(){
       File obj = PatchProxy.apply(null, null, VideoWatermarkTask.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(b.a(-1504323719).o(), "no_watermark_bmp.png");
       if (!obj.getParentFile().exists()) {
          obj.getParentFile().mkdirs();
       }
       if (obj.exists()) {
          c.f(obj.getAbsolutePath());
       }
       Bitmap uBitmap = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
       Canvas uCanvas = new Canvas(uBitmap);
       int i = 0;
       try{
          uCanvas.drawColor(i);
          BitmapUtil.Q(uBitmap, obj.getAbsolutePath(), 100);
          return e0;
       }catch(java.io.IOException e0){
       }
    }
    public boolean a(int p0,int p1){
       return this.i;
    }
}
