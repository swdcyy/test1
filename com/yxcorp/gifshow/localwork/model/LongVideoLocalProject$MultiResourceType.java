package com.yxcorp.gifshow.localwork.model.LongVideoLocalProject$MultiResourceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LongVideoLocalProject$MultiResourceType extends Enum	// class@001ad1
{
    public String mPrefix;
    public static final LongVideoLocalProject$MultiResourceType[] $VALUES;
    public static final LongVideoLocalProject$MultiResourceType LONG_VIDEO;

    static {
       LongVideoLocalProject$MultiResourceType multiResourc = new LongVideoLocalProject$MultiResourceType("LONG_VIDEO", 0, "kwai_lv_");
       LongVideoLocalProject$MultiResourceType.LONG_VIDEO = multiResourc;
       LongVideoLocalProject$MultiResourceType[] multiResourc1 = new LongVideoLocalProject$MultiResourceType[]{multiResourc};
       LongVideoLocalProject$MultiResourceType.$VALUES = multiResourc1;
    }
    public void LongVideoLocalProject$MultiResourceType(String p0,int p1,String p2){
       super(p0, p1);
       this.mPrefix = p2;
    }
    public static LongVideoLocalProject$MultiResourceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LongVideoLocalProject$MultiResourceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LongVideoLocalProject$MultiResourceType.class, p0);
    }
    public static LongVideoLocalProject$MultiResourceType[] values(){
       Object obj = PatchProxy.apply(null, null, LongVideoLocalProject$MultiResourceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LongVideoLocalProject$MultiResourceType.$VALUES.clone();
    }
}
