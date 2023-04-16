package com.kwai.framework.krn.bridges.viewmanager.KrnSwitchButtonManager;
import com.facebook.react.uimanager.SimpleViewManager;
import ze.n0;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.String;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;
import android.view.View;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import o86.a;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.util.Map;
import vd.d$b;
import vd.d;
import java.lang.Boolean;

public class KrnSwitchButtonManager extends SimpleViewManager	// class@0015de
{

    public void KrnSwitchButtonManager(){
       super();
    }
    public static void lambda$createViewInstance$0(n0 p0,SlipSwitchButton p1,boolean p2){
       if (p1.d()) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putBoolean("isOn", p2);
          p0.getJSModule(RCTEventEmitter.class).receiveEvent(p1.getId(), "onValueChange", writableMap);
       }
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public SlipSwitchButton createViewInstance(n0 p0){
       SlipSwitchButton obj = PatchProxy.applyOneRefs(p0, this, KrnSwitchButtonManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SlipSwitchButton(p0);
       obj.h(R.drawable.arg_RES_7f081f93, 0x7f081f91, R.drawable.arg_RES_7f081f87);
       obj.setOnSwitchChangeListener(new a(p0));
       return obj;
    }
    public Map getExportedCustomBubblingEventTypeConstants(){
       d$b obj = PatchProxy.apply(null, this, KrnSwitchButtonManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a();
       obj.b("onValueChange", d.d("phasedRegistrationNames", d.d("bubbled", "onValueChange")));
       return obj.a();
    }
    public String getName(){
       return "RCTSlipSwitchButton";
    }
    public void setSwitch(SlipSwitchButton p0,boolean p1){
       KrnSwitchButtonManager krnSwitchBut = KrnSwitchButtonManager.class;
       if (PatchProxy.isSupport(krnSwitchBut) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, krnSwitchBut, "3")) {
          return;
       }
       p0.setSwitch(p1);
       return;
    }
}
