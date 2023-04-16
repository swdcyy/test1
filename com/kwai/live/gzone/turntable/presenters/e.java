package com.kwai.live.gzone.turntable.presenters.e;
import erd.g;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneAudienceTurntableWelfareTaskPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e implements g	// class@000e61
{
    public final LiveGzoneAudienceTurntableWelfareTaskPresenter b;

    public void e(LiveGzoneAudienceTurntableWelfareTaskPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else if(p0.booleanValue()){
          this.b.P8();
       }
       return;
    }
}
