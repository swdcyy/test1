package com.yxcorp.gifshow.camera.record.tab.CameraTab$7;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import android.app.Application;
import mm6.c;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Intent;
import pi9.c;
import tkd.b;
import tkd.d;
import hb0.b;

public final class CameraTab$7 extends CameraTab	// class@000f40
{

    public void CameraTab$7(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public int getItemViewId(){
       return 0x7f0d0195;
    }
    public String getTabText(){
       Object obj = PatchProxy.apply(null, this, CameraTab$7.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a().getString(0x7f104d5c);
    }
    public int getTagStubId(){
       return 0x7f0a3fbb;
    }
    public int getTextViewId(){
       return 0x7f0a3fba;
    }
    public c newFragment(){
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, this, CameraTab$7.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ActivityContext.g().e();
       if (obj == null) {
          return objArray;
       }
       return d.a(0x338f144a).uz(c.b(obj.getIntent(), true));
    }
    public boolean supportLastUsedTabTabId(){
       return false;
    }
}
