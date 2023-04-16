package com.yxcorp.gifshow.log.policy.LogPolicy$Save;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LogPolicy$Save extends Enum	// class@001b25
{
    public static final LogPolicy$Save[] $VALUES;
    public static final LogPolicy$Save DEFAULT;
    public static final LogPolicy$Save DELAY;
    public static final LogPolicy$Save DROP;

    static {
       LogPolicy$Save save = new LogPolicy$Save("DEFAULT", 0);
       LogPolicy$Save.DEFAULT = save;
       LogPolicy$Save save1 = new LogPolicy$Save("DELAY", 1);
       LogPolicy$Save.DELAY = save1;
       LogPolicy$Save save2 = new LogPolicy$Save("DROP", 2);
       LogPolicy$Save.DROP = save2;
       LogPolicy$Save[] saveArray = new LogPolicy$Save[]{save,save1,save2};
       LogPolicy$Save.$VALUES = saveArray;
    }
    public void LogPolicy$Save(String p0,int p1){
       super(p0, p1);
    }
    public static LogPolicy$Save valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LogPolicy$Save.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LogPolicy$Save.class, p0);
    }
    public static LogPolicy$Save[] values(){
       Object obj = PatchProxy.apply(null, null, LogPolicy$Save.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LogPolicy$Save.$VALUES.clone();
    }
}
