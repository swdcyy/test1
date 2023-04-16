package com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$PModuleSubBiz;
import oc9.t;
import android.app.Activity;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;

public abstract class RecordPModuleRegister$a	// class@001c93
{

    public void RecordPModuleRegister$a(){
       super();
    }
    public void a(CameraBaseFragment p0,RecordPModuleRegister$PModuleSubBiz p1){
    }
    public void b(CameraBaseFragment p0,RecordPModuleRegister$PModuleSubBiz p1){
    }
    public abstract t c(CameraBaseFragment p0,RecordPModuleRegister$PModuleSubBiz p1);
    public boolean d(Activity p0){
       return true;
    }
    public void e(Activity p0){
    }
    public void f(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordPModuleRegister$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("RecordPModuleRegister", "parseScheme\(\) called", objArray);
       return;
    }
}
