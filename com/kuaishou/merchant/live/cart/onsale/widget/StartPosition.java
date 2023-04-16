package com.kuaishou.merchant.live.cart.onsale.widget.StartPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class StartPosition extends Enum	// class@0019c3
{
    public static final StartPosition[] $VALUES;
    public static final StartPosition LEFT_START;
    public static final StartPosition RIGHT_START;

    static {
       StartPosition startPositio1;
       StartPosition[] startPositio = new StartPosition[]{startPositio1,startPositio1};
       startPositio1 = new StartPosition("LEFT_START", 0);
       StartPosition.LEFT_START = startPositio1;
       startPositio1 = new StartPosition("RIGHT_START", 1);
       StartPosition.RIGHT_START = startPositio1;
       StartPosition.$VALUES = startPositio;
    }
    public void StartPosition(String p0,int p1){
       super(p0, p1);
    }
    public static StartPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StartPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(StartPosition.class, p0);
    }
    public static StartPosition[] values(){
       Object obj = PatchProxy.apply(null, null, StartPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StartPosition.$VALUES.clone();
    }
}
