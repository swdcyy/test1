package com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$PresenterAction$4;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$PresenterAction;
import java.lang.String;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$a;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabState$State;

public final class LiveGzoneLifeStatePage$PresenterAction$4 extends LiveGzoneLifeStatePage$PresenterAction	// class@000e17
{

    public void LiveGzoneLifeStatePage$PresenterAction$4(String p0,int p1){
       super(p0, p1, null);
    }
    public void performCallState(LiveGzoneLifeStatePage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneLifeStatePage$PresenterAction$4.class, "2")) {
          return;
       }
       p0.a();
       return;
    }
    public void performEntryAction(LiveGzoneLifeStatePage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneLifeStatePage$PresenterAction$4.class, "1")) {
          return;
       }
       p0.j();
       p0.b = LiveGzoneTabState$State.UNBIND;
       return;
    }
}