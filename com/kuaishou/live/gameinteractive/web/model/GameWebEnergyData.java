package com.kuaishou.live.gameinteractive.web.model.GameWebEnergyData;
import com.kwai.yoda.function.FunctionResultParams;
import njd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class GameWebEnergyData extends FunctionResultParams	// class@001c1b
{
    public long balance;

    public void GameWebEnergyData(){
       super();
    }
    public static GameWebEnergyData error(a p0){
       GameWebEnergyData obj = PatchProxy.applyOneRefs(p0, null, GameWebEnergyData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GameWebEnergyData();
       if (p0 != null) {
          obj.mMessage = p0.c();
          obj.mResult = p0.b();
       }else {
          obj.mResult = -1;
          obj.mMessage = "";
       }
       return obj;
    }
}
