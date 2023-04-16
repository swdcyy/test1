package com.kwai.framework.initmodule.VideoModelInitModule;
import com.kwai.framework.init.a;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.initmodule.VideoModelInitModule$b;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import android.content.Context;
import f3b.t;
import e66.c;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import java.lang.CharSequence;
import com.kwai.framework.initmodule.VideoModelInitModule$a;
import com.kwai.video.ksmodelmanager.ModelSDKConfig;
import com.kwai.video.ksmodelmanager.ModelSDK;

public class VideoModelInitModule extends a	// class@00157e
{

    public void VideoModelInitModule(){
       super();
    }
    public int f0(){
       return 18;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoModelInitModule.class, "2")) {
          return;
       }
       e.g(new VideoModelInitModule$b(this), "ModelSDK downloadAll model");
       return;
    }
    public boolean l0(){
       String obj = PatchProxy.apply(null, this, VideoModelInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = t.a(a.b());
       Object[] objArray = new Object[0];
       c.C().w("ModelSDK", "Soc Name:"+obj, objArray);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add("Kirin 990");
       uArrayList.add("Kirin 985");
       uArrayList.add("Kirin 810");
       uArrayList.add("Kirin 820");
       uArrayList.add("Kirin 9000");
       int i = 0;
       while (true) {
          if (i >= uArrayList.size()) {
             return 0;
          }
          if (obj.contains(uArrayList.get(i))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       Object[] objArray1 = new Object[0];
       c.C().w("ModelSDK", "Support hiai", objArray1);
       return true;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, VideoModelInitModule.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("VideoModelInitModule", "execute", objArray);
       ModelSDK.initSDK(new VideoModelInitModule$a(this));
       return;
    }
    public boolean n0(){
       String obj = PatchProxy.apply(null, this, VideoModelInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = t.a(a.b());
       ArrayList uArrayList = new ArrayList();
       uArrayList.add("MT6983");
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 >= uArrayList.size()) {
             return i;
          }
          if (obj.contains(uArrayList.get(i1))) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       Object[] objArray = new Object[i];
       c.C().w("ModelSDK", "Support mtk", objArray);
       return true;
    }
}
