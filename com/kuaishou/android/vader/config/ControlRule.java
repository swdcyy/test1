package com.kuaishou.android.vader.config.ControlRule;
import java.lang.Object;
import com.kuaishou.android.vader.config.ControlAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yq.a;
import java.util.List;
import java.util.ArrayList;

public class ControlRule	// class@000f74
{
    public ControlAction action;
    public List matchingConditions;

    public void ControlRule(){
       super();
    }
    public ControlAction getAction(){
       a uoa;
       ControlRule obj = PatchProxy.apply(null, this, ControlRule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.action;
       if (obj == null) {
          uoa = new a();
       }
       return uoa;
    }
    public List getConditions(){
       ArrayList uArrayList;
       ControlRule obj = PatchProxy.apply(null, this, ControlRule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.matchingConditions;
       if (obj == null) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
}
