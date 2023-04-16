package com.frog.engine.FrogActivity$b;
import com.frog.engine.FrogCommonListener;
import com.frog.engine.FrogActivity;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.frog.engine.view.vconsole.FrogVConsoleView;
import org.json.JSONArray;
import com.frog.engine.view.vconsole.VConsoleEnum;
import com.frog.engine.jsobject.FrogLoggerObject;
import java.util.Map;

public class FrogActivity$b implements FrogCommonListener	// class@0014e6
{
    public final FrogActivity a;

    public void FrogActivity$b(FrogActivity p0){
       this.a = p0;
       super();
    }
    public void onJSException(String p0,int p1,int p2,String p3,String p4){
       FrogActivity$b uob = FrogActivity$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       this.a.mVConsole.appendError(p0, p1, p2, p3, p4);
       return;
    }
    public void onLog(String p0,JSONArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogActivity$b.class, "2")) {
          return;
       }
       p1.toString();
       this.a.mVConsole.appendArray(p1, VConsoleEnum.parse(p0));
       return;
    }
    public void onReport(FrogLoggerObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogActivity$b.class, "3")) {
          return;
       }
       p0.toString();
       return;
    }
    public void onReportPerformanceWithKey(String p0,Map p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogActivity$b.class, "4");
    }
    public boolean useConsoleMode(){
       return true;
    }
}
