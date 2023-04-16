package com.kwai.framework.krn.init.preload.c$b;
import f55.g;
import com.kwai.framework.krn.init.preload.c;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import c96.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.krn.init.preload.a;

public class c$b implements g	// class@001602
{
    public final LaunchModel b;
    public final c c;

    public void c$b(c p0,LaunchModel p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(c$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, c$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("KrnNetwork", "KrnPreRequest getValueBybridge Error: "+p1, objArray);
       a.M().c0(-1002, this.b.a(), "ActionÎª3Ê±£¬BridgeCenter.invoke Error£º"+p1);
       c$b tc = this.c;
       tc.b = null;
       tc.w();
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       c$b tc = this.c;
       tc.b = p0;
       tc.w();
       return;
    }
}
