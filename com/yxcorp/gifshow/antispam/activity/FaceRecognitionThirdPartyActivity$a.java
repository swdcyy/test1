package com.yxcorp.gifshow.antispam.activity.FaceRecognitionThirdPartyActivity$a;
import du5.g;
import com.yxcorp.gifshow.antispam.activity.FaceRecognitionThirdPartyActivity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.activity.GifshowActivity;
import du5.d;
import com.yxcorp.gifshow.antispam.activity.FaceRecognitionThirdPartyActivity$a$a;
import android.app.Activity;
import du5.c;

public class FaceRecognitionThirdPartyActivity$a implements g	// class@001b7f
{
    public final String a;
    public final FaceRecognitionThirdPartyActivity b;

    public void FaceRecognitionThirdPartyActivity$a(FaceRecognitionThirdPartyActivity p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0){
       FaceRecognitionThirdPartyActivity$a uoa = FaceRecognitionThirdPartyActivity$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       Log.g("FaceRecognitionThirdPartyActivity", "kwaiRecognitionResult = false , ErrorCode = "+p0);
       this.b.finish();
       return;
    }
    public void b(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceRecognitionThirdPartyActivity$a.class, "1")) {
          return;
       }
       p0.Dc(this.b, this.a, new FaceRecognitionThirdPartyActivity$a$a(this));
       return;
    }
}
