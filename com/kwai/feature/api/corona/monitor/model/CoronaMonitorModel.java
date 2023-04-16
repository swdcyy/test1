package com.kwai.feature.api.corona.monitor.model.CoronaMonitorModel;
import com.kwai.feature.api.corona.monitor.model.CoronaMonitorModel$a;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import nsd.u;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;

public final class CoronaMonitorModel	// class@000e1d
{
    public final String biz;
    public Map common;
    public final String eventId;
    public final Map msg;
    public final String subBiz;
    public final String tag;

    public void CoronaMonitorModel(CoronaMonitorModel$a p0){
       super();
       String str = p0.b();
       int i = 0;
       str = (str == null || !str.length())? 1: null;
       if (str) {
          str = "DEFAULT_EVENT_ID";
       }else {
          str = p0.b();
          a.m(str);
       }
       this.eventId = str;
       str = p0.a();
       str = (str == null || !str.length())? 1: null;
       if (str) {
          str = "DEFAULT_BIZ";
       }else {
          str = p0.a();
          a.m(str);
       }
       this.biz = str;
       this.subBiz = p0.b;
       str = p0.c();
       if (str == null || !str.length()) {
          i = 1;
       }
       if (i) {
          str = "";
       }else {
          str = p0.c();
          a.m(str);
       }
       this.tag = str;
       this.msg = p0.d;
       this.common = p0.f;
       return;
    }
    public void CoronaMonitorModel(CoronaMonitorModel$a p0,u p1){
       super(p0);
    }
    public final String getBiz(){
       return this.biz;
    }
    public final Map getCommon(){
       return this.common;
    }
    public final String getEventId(){
       return this.eventId;
    }
    public final Map getMsg(){
       return this.msg;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public final String getTag(){
       return this.tag;
    }
    public final void setCommon(Map p0){
       this.common = p0;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, CoronaMonitorModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.q(this);
       a.o(obj, "Gsons.KWAI_GSON.toJson\(this\)");
       return obj;
    }
}
