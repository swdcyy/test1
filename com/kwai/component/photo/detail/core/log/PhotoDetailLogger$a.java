package com.kwai.component.photo.detail.core.log.PhotoDetailLogger$a;
import lnc.cb;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import lnc.a1;
import mc6.w;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.media.AudioManager;
import com.kwai.component.photo.detail.core.log.PhotoDetailLoggerFieldProvider;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class PhotoDetailLogger$a extends cb	// class@000a25
{
    public final PhotoDetailLogger c;

    public void PhotoDetailLogger$a(PhotoDetailLogger p0,PhotoDetailLogger p1){
       this.c = p0;
       super(p1);
    }
    public void a(){
       int i;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, PhotoDetailLogger$a.class, str)) {
          return;
       }
       PhotoDetailLogger photoDetailL = this.b();
       if (photoDetailL == null) {
          return;
       }
       try{
          photoDetailL = photoDetailL.mProvider;
          Context uContext = a1.c();
          Object obj = PatchProxy.applyOneRefs(uContext, objArray, w.class, str);
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             w.a = uContext.getSystemService("audio").getStreamVolume(3);
             i = w.a;
          }
          photoDetailL.setPlaySoundVolume(i);
       }catch(java.lang.NullPointerException e0){
          ExceptionHandler.handleCaughtException(e0);
       }
       return;
    }
}
