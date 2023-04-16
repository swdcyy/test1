package com.kuaishou.live.gzone.treasurebox.presenter.z;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.presenter.w;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab$TabType;

public class z implements g	// class@001ca4
{
    public final w b;

    public void z(w p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
       }else if(p0 == LiveGzoneTab$TabType.CHAT.mTypeValue){
          this.b.a9();
       }
       return;
    }
}
