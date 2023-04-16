package com.kuaishou.live.gameinteractive.web.model.GameWebTokenData;
import com.kwai.yoda.function.FunctionResultParams;
import njd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class GameWebTokenData extends FunctionResultParams	// class@001c21
{
    public String token;

    public void GameWebTokenData(){
       super();
    }
    public static GameWebTokenData error(a p0){
       GameWebTokenData obj = PatchProxy.applyOneRefs(p0, null, GameWebTokenData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GameWebTokenData();
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
