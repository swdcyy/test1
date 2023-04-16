package com.kwai.video.videoprocessor.JpegBuilderException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public class JpegBuilderException extends Exception	// class@000c91
{
    public final int retcode;
    public final int type;

    public void JpegBuilderException(int p0){
       super("JpegBuilder", p0);
    }
    public void JpegBuilderException(int p0,int p1,String p2){
       super(p2);
       this.retcode = p1;
       this.type = p0;
    }
    public void JpegBuilderException(String p0){
       super(-1, -1, p0);
    }
    public void JpegBuilderException(String p0,int p1){
       super(p0, p1, null);
    }
    public void JpegBuilderException(String p0,int p1,int p2,String p3){
       super(p1, p2, JpegBuilderException.generateMessage(p0, p2, p3));
    }
    public void JpegBuilderException(String p0,int p1,String p2){
       super(-1, p1, JpegBuilderException.generateMessage(p0, p1, p2));
    }
    public static String generateMessage(String p0,int p1,String p2){
       if (PatchProxy.isSupport(JpegBuilderException.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, JpegBuilderException.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = p0+" failed with exit code "+p1;
       if (!TextUtils.isEmpty(p2)) {
          p0 = p0+", message: "+p2;
       }
       return p0;
    }
}
