package com.kwai.plugin.dva.repository.model.BroadcastReceiverInfo;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Iterator;

public class BroadcastReceiverInfo	// class@001376
{
    public final List actions;
    public final String name;
    public final String process;

    public void BroadcastReceiverInfo(String p0,String p1,List p2){
       super();
       this.name = p0;
       this.process = p1;
       this.actions = p2;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, BroadcastReceiverInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       Iterator iterator = this.actions.iterator();
       while (iterator.hasNext()) {
          obj = obj+iterator.next()+",";
       }
       Object[] objArray = new Object[]{this.name,obj};
       return String.format("{name=%s, actions=[%s]}", objArray);
    }
}
