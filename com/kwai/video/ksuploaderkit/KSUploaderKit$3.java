package com.kwai.video.ksuploaderkit.KSUploaderKit$3;
import com.kwai.video.ksuploaderkit.apicenter.IApiManagerListener;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.video.ksuploaderkit.utils.KitUtils$State;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;

public class KSUploaderKit$3 implements IApiManagerListener	// class@000962
{
    public final KSUploaderKit this$0;

    public void KSUploaderKit$3(KSUploaderKit p0){
       this.this$0 = p0;
       super();
    }
    public void onFinished(boolean p0,int p1,String p2){
       if (PatchProxy.isSupport(KSUploaderKit$3.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, KSUploaderKit$3.class, "1")) {
          return;
       }
       KSUploaderKit$3 tthis$0 = this.this$0;
       tthis$0.mState = KitUtils$State.Finish;
       KSUploaderKitCommon$Status success = (p0)? KSUploaderKitCommon$Status.Success: KSUploaderKitCommon$Status.Fail;
       tthis$0.postCompletedListener(success, p1, p2);
       return;
    }
}
