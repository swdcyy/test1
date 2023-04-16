package com.yxcorp.gifshow.camera.record.CameraActivity$a;
import k36.d;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import java.lang.Object;
import k36.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gd9.e;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import android.view.View;
import eh9.a;
import com.yxcorp.utility.n;

public class CameraActivity$a implements d	// class@001c85
{
    public final CameraActivity a;

    public void CameraActivity$a(CameraActivity p0){
       this.a = p0;
       super();
    }
    public void a(f p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity$a.class, str)) {
          return;
       }
       try{
          if (p0 != null && this.a.X0 != null) {
             String str1 = p0.c();
             e uoe = e.class;
             e obj = PatchProxy.applyOneRefs(str1, null, uoe, str);
             e uoe1 = (obj != PatchProxyResult.class)? obj: a.a.h(str1, uoe);
          label_0030 :
             if (uoe1 == null) {
                return;
             }else {
                View view = this.a.X0.d();
                obj = uoe1.mIsHidden;
                this.a.e1 = obj;
                int i = (obj != null)? 4: 0;
                n.Y(view, i, uoe1.mIsAnimated);
             }
          }
       }catch(com.google.gson.JsonSyntaxException e0){
       }
       return;
    }
}
