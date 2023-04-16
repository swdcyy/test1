package com.kuaishou.pagedy.manager.EventHandler;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.kuaishou.pagedy.manager.EventHandler$EventData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import nv.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import yz7.e;
import com.kuaishou.pagedy.b;
import java.lang.StringBuilder;
import java.lang.Exception;

public class EventHandler	// class@000a8d
{

    public void EventHandler(){
       super();
    }
    public final void a(Fragment p0,EventHandler$EventData p1,int p2){
       if (PatchProxy.isSupport(EventHandler.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, EventHandler.class, "2")) {
          return;
       }
       EventHandler$EventData data = p1.data;
       if (data == null) {
          c.f("EventHandler refreshPage failed, event data is null");
          return;
       }else if(TextUtils.isEmpty(data)){
          return;
       }else {
          try{
             Map map = e.a(p1.data, Map.class);
             if (map == null) {
                return;
             }else {
                String str = map.get("instanceId");
                map = map.get("params");
                if (!p2) {
                   b.o(p0, str, map);
                }else {
                   b.n(p0, str, map);
                }
             }
          }catch(java.lang.Exception e8){
             c.b("EventHandler refreshPage error: "+e8.getMessage());
          }
          return;
       }
    }
}
