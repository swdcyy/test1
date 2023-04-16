package com.kwai.framework.config.heartbeat.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.framework.config.heartbeat.a;
import ok.x;
import java.lang.Object;
import a66.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import ob6.p;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.a0;
import com.kwai.framework.config.heartbeat.b;
import com.kwai.framework.config.heartbeat.c;
import erd.g;
import crd.b;
import com.kwai.framework.config.heartbeat.g;
import java.lang.Integer;
import e66.c;
import java.lang.StringBuilder;
import q87.c;

public class d extends ConfigAutoParseJsonConsumer	// class@001503
{

    public void d(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
       }else {
          int i = 0x36463d96;
          if (b.a(i).getVersion() < p0.mKeyConfigVersion) {
             b.a(i).h(RequestTiming.DEFAULT, p0.mUpdatedKeyConfigKey).R(b.b, c.b);
          }
          if (p0.mNextRequestIntervalMs != null) {
             g og = g.b();
             int i1 = p0.mNextRequestIntervalMs.intValue();
             g og1 = g.class;
             _monitor_enter(og);
             if (PatchProxy.isSupport(og1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), og, og1, "4")) {
                _monitor_exit(og);
             }else if(og.c == i1){
                _monitor_exit(og);
             }else {
                Object[] objArray = new Object[0];
                c.C().s("Heartbeat", "Heartbeat nextRequestIntervalMs is changed: oldValue: "+og.c+", newValue: "+i1, objArray);
                og.c = i1;
                og.f();
                Object[] objArray1 = new Object[0];
                c.C().s("Heartbeat", "Timer is stopped. Heartbeat being is reset", objArray1);
                og.c((long)og.c, RequestTiming.DEFAULT);
                _monitor_exit(og);
             }
          }
       }
       return;
    }
}
