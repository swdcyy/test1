package com.yxcorp.gifshow.media.util.c$a;
import java.lang.Object;
import android.content.Context;
import android.graphics.Bitmap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.video.videoprocessor.JpegBuilder;

public class c$a	// class@001d1f
{

    public void c$a(){
       super();
    }
    public static void a(Context p0,Bitmap p1,int p2,int p3,int p4,String p5,boolean p6){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
             return;
          }
       }
       JpegBuilder.compressBitmapToJpeg(p0, p1, p2, p3, p4, p5, p6);
       return;
    }
}
