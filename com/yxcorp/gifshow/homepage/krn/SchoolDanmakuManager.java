package com.yxcorp.gifshow.homepage.krn.SchoolDanmakuManager;
import com.facebook.react.uimanager.SimpleViewManager;
import ze.n0;
import android.view.View;
import com.yxcorp.gifshow.homepage.krn.SchoolDanmakuView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import java.lang.Integer;
import java.util.Objects;

public class SchoolDanmakuManager extends SimpleViewManager	// class@001762
{

    public void SchoolDanmakuManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public SchoolDanmakuView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SchoolDanmakuManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SchoolDanmakuView(p0);
    }
    public String getName(){
       return "RnSchoolDanmakuView";
    }
    public void setSchoolId(SchoolDanmakuView p0,int p1){
       SchoolDanmakuManager schoolDanmak = SchoolDanmakuManager.class;
       if (PatchProxy.isSupport(schoolDanmak) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, schoolDanmak, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(SchoolDanmakuView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), p0, SchoolDanmakuView.class, "2")) {
          p0.f = p1;
          p0.z();
       }
       return;
    }
}
