package com.yxcorp.gifshow.init.module.t;
import tz6.a;
import java.lang.Object;
import com.kwai.library.widget.gray.inter.KwaiGrayLogEvent;
import java.lang.String;
import com.yxcorp.gifshow.init.module.DesignWidgetInitModule;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.init.module.DesignWidgetInitModule$1;
import java.lang.Enum;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.u1;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class t implements a	// class@0019db
{
    public static final t a;

    static {
       t.a = new t();
    }
    public void t(){
       super();
    }
    public final void a(KwaiGrayLogEvent p0,String p1){
       String str;
       boolean q = DesignWidgetInitModule.q;
       try{
          q = a.t().d("grayEventLogSample", false);
          int i = DesignWidgetInitModule$1.a[p0.ordinal()];
          if (i != 1) {
             if (i != 2) {
                str = (i != 3)? null: "GRAYPAPE_SUCCESS";
             }else {
                str = "GRAYPAPE_START";
             }
          }else {
             str = "GRAYPAPE_ENTER";
          }
          if (str == null || !q) {
          }else {
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("pageIdentity", p1);
             jsonObject.c0("eventType", str);
             u1.R("KWAI_GRAYPAGE_STATISTICS", jsonObject.toString(), 23);
          }
       }catch(java.lang.Exception e0){
          Log.d("appGrayConfigInit", "IKwaiGrayLogEvent Exception:kwaiGrayLogEvent="+p0.name()+"£¬pageIdentity="+p1);
       }
       return;
    }
}
