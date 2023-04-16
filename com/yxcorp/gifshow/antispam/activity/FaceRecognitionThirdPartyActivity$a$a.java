package com.yxcorp.gifshow.antispam.activity.FaceRecognitionThirdPartyActivity$a$a;
import du5.c;
import com.yxcorp.gifshow.antispam.activity.FaceRecognitionThirdPartyActivity$a;
import java.lang.Object;
import java.util.HashMap;
import du5.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Integer;
import java.lang.StringBuilder;

public class FaceRecognitionThirdPartyActivity$a$a implements c	// class@001b7e
{
    public final FaceRecognitionThirdPartyActivity$a a;

    public void FaceRecognitionThirdPartyActivity$a$a(FaceRecognitionThirdPartyActivity$a p0){
       this.a = p0;
       super();
    }
    public void c(HashMap p0){
       b.b(this, p0);
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FaceRecognitionThirdPartyActivity$a$a.class, "1")) {
          return;
       }
       Log.g("FaceRecognitionThirdPartyActivity", "kwaiRecognitionResult = true");
       this.a.b.finish();
       return;
    }
    public void onFailed(int p0){
       FaceRecognitionThirdPartyActivity$a$a uoa$a = FaceRecognitionThirdPartyActivity$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa$a, "2")) {
          return;
       }
       Log.g("FaceRecognitionThirdPartyActivity", "kwaiRecognitionResult = false , ErrorCode = "+p0);
       this.a.b.finish();
       return;
    }
}
