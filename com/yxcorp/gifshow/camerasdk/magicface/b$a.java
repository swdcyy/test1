package com.yxcorp.gifshow.camerasdk.magicface.b$a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBoomGameListener;
import com.yxcorp.gifshow.camerasdk.magicface.b;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;

public class b$a implements FaceMagicController$FaceMagicBoomGameListener	// class@001035
{
    public final ILiveImageHelper$a a;
    public final b b;

    public void b$a(b p0,ILiveImageHelper$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onReceivedBoomGameInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.a.onReceivedBoomGameInfo(p0);
       return;
    }
    public void onReceivedBoomGameInfoWithBitmap(String p0,Bitmap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "2")) {
          return;
       }
       this.a.onReceivedBoomGameInfoWithBitmap(p0, p1);
       return;
    }
}
