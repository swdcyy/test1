package com.yxcorp.gifshow.camera.record.sidebar.g$a;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import com.yxcorp.gifshow.camera.record.sidebar.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.View;
import java.lang.Integer;

public class g$a implements PreLoader$InflateListener	// class@000f16
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void onFallback(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("RecordSideBarController", "getOrWait, onFallback:"+p0, objArray);
       return;
    }
    public void onFinish(int p0,View p1){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("RecordSideBarController", "getOrWait, onFinish:"+p0+" view:"+p1, objArray);
       return;
    }
    public void onStart(int p0){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("RecordSideBarController", "getOrWait, onStart:"+p0, objArray);
       return;
    }
}
