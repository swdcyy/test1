package com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CameraScrollTabViewGroupV2$d	// class@000f34
{
    public int a;
    public int b;

    public void CameraScrollTabViewGroupV2$d(){
       super();
       this.a = -1;
       this.b = -1;
       this.a = -1;
       this.b = -1;
    }
    public void CameraScrollTabViewGroupV2$d(int p0,int p1){
       super();
       this.a = -1;
       this.b = -1;
       this.a = p0;
       this.b = p1;
    }
    public void a(CameraScrollTabViewGroupV2$d p0){
       this.a = p0.a;
       this.b = p0.b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CameraScrollTabViewGroupV2$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SelectIndex{itemIndex="+this.a+", childIndex="+this.b+'}';
    }
}
