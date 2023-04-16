package com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView$LottieSetImageFolderException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveKidLottieAnimationView$LottieSetImageFolderException extends Exception	// class@000905
{
    public static final long serialVersionUID = 0x1a946256bc3fff18;

    public void LiveKidLottieAnimationView$LottieSetImageFolderException(String p0,Exception p1){
       super(p0, p1);
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, LiveKidLottieAnimationView$LottieSetImageFolderException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.getCause() != null)? " caused by: "+this.getCause().toString(): "";
       return super.toString()+obj;
    }
}
