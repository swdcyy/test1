package com.yxcorp.gifshow.camera.record.CameraActivity$b;
import k36.d;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import java.lang.Object;
import k36.f;
import com.kwai.robust.PatchProxyResult;
import gd9.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Integer;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import eh9.a;
import eh9.n;
import eh9.l;

public class CameraActivity$b implements d	// class@001c86
{
    public final CameraActivity a;

    public void CameraActivity$b(CameraActivity p0){
       this.a = p0;
       super();
    }
    public void a(f p0){
       int i;
       Object[] objArray;
       n on;
       CameraActivity$b ta;
       c mTab;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraActivity$b.class, str)) {
          return;
       }
       if (this.a.b3() && p0 != null) {
          String str1 = p0.c();
          Object obj = null;
          Object obj1 = PatchProxy.applyOneRefs(str1, obj, uoc, str);
          if (obj1 != patchProxyRe) {
          }else {
             try{
                obj1 = a.a.h(str1, uoc);
             }catch(com.google.gson.JsonSyntaxException e0){
                obj1 = obj;
             }
          }
       }
    label_00f1 :
       return;
    }
}
