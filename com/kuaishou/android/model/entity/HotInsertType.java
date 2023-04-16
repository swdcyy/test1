package com.kuaishou.android.model.entity.HotInsertType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HotInsertType extends Enum	// class@000ac7
{
    public final int mType;
    public static final HotInsertType[] $VALUES;
    public static final HotInsertType FOLLOW_RECOMMEND;
    public static final HotInsertType INTEREST_TAG;

    static {
       HotInsertType hotInsertTyp = new HotInsertType("FOLLOW_RECOMMEND", 0, 1);
       HotInsertType.FOLLOW_RECOMMEND = hotInsertTyp;
       HotInsertType hotInsertTyp1 = new HotInsertType("INTEREST_TAG", 1, 2);
       HotInsertType.INTEREST_TAG = hotInsertTyp1;
       HotInsertType[] hotInsertTyp2 = new HotInsertType[]{hotInsertTyp,hotInsertTyp1};
       HotInsertType.$VALUES = hotInsertTyp2;
    }
    public void HotInsertType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static HotInsertType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HotInsertType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HotInsertType.class, p0);
    }
    public static HotInsertType[] values(){
       Object obj = PatchProxy.apply(null, null, HotInsertType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HotInsertType.$VALUES.clone();
    }
}
