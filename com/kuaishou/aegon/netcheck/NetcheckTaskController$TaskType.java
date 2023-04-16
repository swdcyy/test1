package com.kuaishou.aegon.netcheck.NetcheckTaskController$TaskType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NetcheckTaskController$TaskType extends Enum	// class@0007b3
{
    public String mType;
    public static final NetcheckTaskController$TaskType[] $VALUES;
    public static final NetcheckTaskController$TaskType DNS_CHECK;
    public static final NetcheckTaskController$TaskType LOCAL_NETWORK_CHECK;
    public static final NetcheckTaskController$TaskType SERVER_CHECK;

    static {
       NetcheckTaskController$TaskType taskType = new NetcheckTaskController$TaskType("SERVER_CHECK", 0, "server_check");
       NetcheckTaskController$TaskType.SERVER_CHECK = taskType;
       NetcheckTaskController$TaskType taskType1 = new NetcheckTaskController$TaskType("LOCAL_NETWORK_CHECK", 1, "local_network_check");
       NetcheckTaskController$TaskType.LOCAL_NETWORK_CHECK = taskType1;
       NetcheckTaskController$TaskType taskType2 = new NetcheckTaskController$TaskType("DNS_CHECK", 2, "dns_check");
       NetcheckTaskController$TaskType.DNS_CHECK = taskType2;
       NetcheckTaskController$TaskType[] taskTypeArra = new NetcheckTaskController$TaskType[]{taskType,taskType1,taskType2};
       NetcheckTaskController$TaskType.$VALUES = taskTypeArra;
    }
    public void NetcheckTaskController$TaskType(String p0,int p1,String p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static NetcheckTaskController$TaskType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetcheckTaskController$TaskType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NetcheckTaskController$TaskType.class, p0);
    }
    public static NetcheckTaskController$TaskType[] values(){
       Object obj = PatchProxy.apply(null, null, NetcheckTaskController$TaskType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NetcheckTaskController$TaskType.$VALUES.clone();
    }
    public String getType(){
       return this.mType;
    }
}
