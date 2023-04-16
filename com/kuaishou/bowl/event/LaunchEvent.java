package com.kuaishou.bowl.event.LaunchEvent;
import java.lang.Object;
import com.kuaishou.bowl.event.LaunchEvent$DynamicType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.bowl.event.LaunchEvent$a;
import java.lang.Enum;
import com.kuaishou.bowl.event.LaunchEvent$DataModel;
import mv.a;
import mv.f;
import com.google.gson.Gson;

public class LaunchEvent	// class@0011ff
{

    public void LaunchEvent(){
       super();
    }
    public static void a(LaunchEvent$DynamicType p0){
       LaunchEvent$DataModel uDataModel1;
       LaunchEvent$DataModel uDataModel = null;
       if (PatchProxy.applyVoidOneRefs(p0, uDataModel, LaunchEvent.class, "1")) {
          return;
       }
       int i = LaunchEvent$a.a[p0.ordinal()];
       Gson gson = 1;
       if (i != gson) {
          if (i != 2) {
             if (i != 3) {
             label_0036 :
                if (uDataModel != null) {
                   a.a().g().report("merchant_launch", new Gson().q(uDataModel));
                }
                return;
             }else {
                uDataModel1 = new LaunchEvent$DataModel(uDataModel);
                uDataModel1.livedy = gson;
             }
          }else {
             uDataModel1 = new LaunchEvent$DataModel(uDataModel);
             uDataModel1.link = gson;
          }
       }else {
          uDataModel1 = new LaunchEvent$DataModel(uDataModel);
          uDataModel1.era = gson;
       }
       uDataModel = uDataModel1;
       goto label_0036 ;
    }
}
