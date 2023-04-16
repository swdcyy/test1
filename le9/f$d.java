package le9.f$d;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBoomGameListener;
import le9.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import fg6.a;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import com.google.gson.Gson;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import w3b.l;
import kotlin.jvm.internal.a;
import ne9.b;
import w46.b;
import com.google.gson.JsonObject;
import ne9.a;
import com.google.gson.JsonElement;
import java.lang.Throwable;

public final class f$d implements FaceMagicController$FaceMagicBoomGameListener	// class@002dc2
{
    public final f a;

    public void f$d(f p0){
       this.a = p0;
       super();
    }
    public void onReceivedBoomGameInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$d.class, "1")) {
          return;
       }
       this.onReceivedBoomGameInfoWithBitmap(p0, null);
       return;
    }
    public void onReceivedBoomGameInfoWithBitmap(String p0,Bitmap p1){
       Gson a;
       MagicEmoji$MagicFace magicFace1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$d.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MagicDataConveyController", "onReceivedBoomGameInfo : "+p0+" , bitmap: "+p1, objArray);
       a = a.a;
       MagicRequest magicRequest = a.h(p0, MagicRequest.class);
       int requestType = magicRequest.getRequestType();
       if (requestType != 5110) {
          if (requestType != 5600) {
             String magicFaceId = magicRequest.getMagicFaceId();
             magicFaceId = (magicFaceId == null || !magicFaceId.length())? 1: null;
             if (!magicFaceId) {
                magicFaceId = magicRequest.getMagicFaceId();
                MagicEmoji$MagicFace magicFace = this.a.g2();
                SimpleMagicFace mId = (magicFace != null)? magicFace.mId: null;
                if (!magicFaceId.equals(mId)) {
                   magicFace1 = l.i(magicRequest.getMagicFaceId(), MagicBusinessId.VIDEO, i);
                label_007f :
                   if (magicFace1 != null) {
                      a.o(magicRequest, "request");
                      this.a.h2(magicRequest, new b(p1, magicFace1));
                   }else {
                      Object[] objArray1 = new Object[i];
                      a.D().t("MagicDataConveyController", "requestMagicFaceError:"+magicRequest.getMagicFaceId(), objArray1);
                   }
                }
             }
             magicFace1 = this.a.g2();
             goto label_007f ;
          }else if(magicRequest.getRequestData() == null){
             return;
          }else {
             this.a.f2(a.c(magicRequest.getRequestData(), a.class));
          }
       }else {
          this.a.i2(magicRequest.getRequestData());
       }
       return;
    }
}
