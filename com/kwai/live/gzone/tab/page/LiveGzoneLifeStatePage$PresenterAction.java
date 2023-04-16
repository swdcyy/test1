package com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$PresenterAction;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$b;
import java.lang.Enum;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$PresenterAction$1;
import java.lang.String;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$PresenterAction$2;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$PresenterAction$3;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$PresenterAction$4;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$PresenterAction$5;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage$a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabState$State;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class LiveGzoneLifeStatePage$PresenterAction extends Enum implements LiveGzoneLifeStatePage$b	// class@000e19
{
    public static final LiveGzoneLifeStatePage$PresenterAction[] $VALUES;
    public static final LiveGzoneLifeStatePage$PresenterAction ACTION_BIND;
    public static final LiveGzoneLifeStatePage$PresenterAction ACTION_CREATE;
    public static final LiveGzoneLifeStatePage$PresenterAction ACTION_DESTROY;
    public static final LiveGzoneLifeStatePage$PresenterAction ACTION_INIT;
    public static final LiveGzoneLifeStatePage$PresenterAction ACTION_UNBIND;

    static {
       LiveGzoneLifeStatePage$PresenterAction$1 presenterAct = new LiveGzoneLifeStatePage$PresenterAction$1("ACTION_INIT", 0);
       LiveGzoneLifeStatePage$PresenterAction.ACTION_INIT = presenterAct;
       LiveGzoneLifeStatePage$PresenterAction$2 presenterAct1 = new LiveGzoneLifeStatePage$PresenterAction$2("ACTION_CREATE", 1);
       LiveGzoneLifeStatePage$PresenterAction.ACTION_CREATE = presenterAct1;
       LiveGzoneLifeStatePage$PresenterAction$3 presenterAct2 = new LiveGzoneLifeStatePage$PresenterAction$3("ACTION_BIND", 2);
       LiveGzoneLifeStatePage$PresenterAction.ACTION_BIND = presenterAct2;
       LiveGzoneLifeStatePage$PresenterAction$4 presenterAct3 = new LiveGzoneLifeStatePage$PresenterAction$4("ACTION_UNBIND", 3);
       LiveGzoneLifeStatePage$PresenterAction.ACTION_UNBIND = presenterAct3;
       LiveGzoneLifeStatePage$PresenterAction$5 presenterAct4 = new LiveGzoneLifeStatePage$PresenterAction$5("ACTION_DESTROY", 4);
       LiveGzoneLifeStatePage$PresenterAction.ACTION_DESTROY = presenterAct4;
       LiveGzoneLifeStatePage$PresenterAction[] presenterAct5 = new LiveGzoneLifeStatePage$PresenterAction[]{presenterAct,presenterAct1,presenterAct2,presenterAct3,presenterAct4};
       LiveGzoneLifeStatePage$PresenterAction.$VALUES = presenterAct5;
    }
    public void LiveGzoneLifeStatePage$PresenterAction(String p0,int p1){
       super(p0, p1);
    }
    public void LiveGzoneLifeStatePage$PresenterAction(String p0,int p1,LiveGzoneLifeStatePage$a p2){
       super(p0, p1);
    }
    public static LiveGzoneLifeStatePage$PresenterAction fromState(LiveGzoneTabState$State p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneLifeStatePage$PresenterAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = LiveGzoneLifeStatePage$a.a[p0.ordinal()];
       if (i == 1) {
          return LiveGzoneLifeStatePage$PresenterAction.ACTION_INIT;
       }
       if (i == 2) {
          return LiveGzoneLifeStatePage$PresenterAction.ACTION_CREATE;
       }
       if (i == 3) {
          return LiveGzoneLifeStatePage$PresenterAction.ACTION_BIND;
       }
       if (i == 4) {
          return LiveGzoneLifeStatePage$PresenterAction.ACTION_UNBIND;
       }
       if (i != 5) {
          return null;
       }
       return LiveGzoneLifeStatePage$PresenterAction.ACTION_DESTROY;
    }
    public static LiveGzoneLifeStatePage$PresenterAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneLifeStatePage$PresenterAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneLifeStatePage$PresenterAction.class, p0);
    }
    public static LiveGzoneLifeStatePage$PresenterAction[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneLifeStatePage$PresenterAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneLifeStatePage$PresenterAction.$VALUES.clone();
    }
}
