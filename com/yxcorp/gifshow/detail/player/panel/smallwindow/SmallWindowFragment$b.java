package com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowFragment$b;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.e;
import java.util.Map;
import java.util.HashMap;

public final class SmallWindowFragment$b implements g	// class@001635
{
    public t b;
    public o c;
    public s d;

    public void SmallWindowFragment$b(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SmallWindowFragment$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, SmallWindowFragment$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(SmallWindowFragment$b.class, new e());
       }else {
          obj.put(SmallWindowFragment$b.class, null);
       }
       return obj;
    }
}
