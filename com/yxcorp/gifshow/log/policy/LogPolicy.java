package com.yxcorp.gifshow.log.policy.LogPolicy;
import java.lang.Enum;
import com.yxcorp.gifshow.log.policy.LogPolicy$Save;
import com.yxcorp.gifshow.log.policy.LogPolicy$Upload;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LogPolicy extends Enum	// class@001b27
{
    public LogPolicy$Save mSavePolicy;
    public LogPolicy$Upload mUploadPolicy;
    public static final LogPolicy[] $VALUES;
    public static final LogPolicy DEFAULT;
    public static final LogPolicy DELAY;
    public static final LogPolicy DROP;
    public static final LogPolicy NORMAL;

    static {
       LogPolicy$Save dEFAULT = LogPolicy$Save.DEFAULT;
       LogPolicy logPolicy = new LogPolicy("DEFAULT", 0, dEFAULT, LogPolicy$Upload.NORMAL);
       LogPolicy.DEFAULT = logPolicy;
       LogPolicy logPolicy1 = new LogPolicy("NORMAL", 1, dEFAULT, LogPolicy$Upload.ALL);
       LogPolicy.NORMAL = logPolicy1;
       LogPolicy$Upload nONE = LogPolicy$Upload.NONE;
       LogPolicy logPolicy2 = new LogPolicy("DELAY", 2, LogPolicy$Save.DELAY, nONE);
       LogPolicy.DELAY = logPolicy2;
       LogPolicy logPolicy3 = new LogPolicy("DROP", 3, LogPolicy$Save.DROP, nONE);
       LogPolicy.DROP = logPolicy3;
       LogPolicy[] logPolicyArr = new LogPolicy[]{logPolicy,logPolicy1,logPolicy2,logPolicy3};
       LogPolicy.$VALUES = logPolicyArr;
    }
    public void LogPolicy(String p0,int p1,LogPolicy$Save p2,LogPolicy$Upload p3){
       super(p0, p1);
       this.mSavePolicy = p2;
       this.mUploadPolicy = p3;
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
    public LogPolicy$Save getSavePolicy(){
       return this.mSavePolicy;
    }
    public LogPolicy$Upload getUploadPolicy(){
       return this.mUploadPolicy;
    }
}
