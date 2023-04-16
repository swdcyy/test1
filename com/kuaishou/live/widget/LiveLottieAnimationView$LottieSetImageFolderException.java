package com.kuaishou.live.widget.LiveLottieAnimationView$LottieSetImageFolderException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveLottieAnimationView$LottieSetImageFolderException extends Exception	// class@00101a
{
    public static final long serialVersionUID = 0x1a946256bc3fff18;

    public void LiveLottieAnimationView$LottieSetImageFolderException(String p0,Exception p1){
       super(p0, p1);
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, LiveLottieAnimationView$LottieSetImageFolderException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.getCause() != null)? " caused by: "+this.getCause().toString(): "";
       return super.toString()+obj;
    }
}
