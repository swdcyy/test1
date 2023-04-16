package com.kuaishou.android.vader.config.LogPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LogPolicy extends Enum	// class@000713
{
    public static final LogPolicy[] $VALUES;
    public static final LogPolicy DELAY;
    public static final LogPolicy DISCARD;
    public static final LogPolicy NORMAL;

    static {
       LogPolicy logPolicy = new LogPolicy("NORMAL", 0);
       LogPolicy.NORMAL = logPolicy;
       LogPolicy logPolicy1 = new LogPolicy("DELAY", 1);
       LogPolicy.DELAY = logPolicy1;
       LogPolicy logPolicy2 = new LogPolicy("DISCARD", 2);
       LogPolicy.DISCARD = logPolicy2;
       LogPolicy[] logPolicyArr = new LogPolicy[]{logPolicy,logPolicy1,logPolicy2};
       LogPolicy.$VALUES = logPolicyArr;
    }
    public void LogPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static LogPolicy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LogPolicy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LogPolicy.class, p0);
    }
    public static LogPolicy[] values(){
       Object obj = PatchProxy.apply(null, null, LogPolicy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LogPolicy.$VALUES.clone();
    }
}
