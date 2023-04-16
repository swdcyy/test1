package com.kuaishou.live.core.show.conditionredpacket.logger.SourceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SourceType extends Enum	// class@000ab1
{
    public final int sourceType;
    public static final SourceType[] $VALUES;
    public static final SourceType ANCHORD_BUTTON_SOURCE_TYPE;
    public static final SourceType ANCHOR_ENTRY_SOURCE_TYPE;
    public static final SourceType AUDIENCE_BUTTON_SOURCE_TYPE;
    public static final SourceType AUDIENCE_ENTRY_SOURCE_TYPE;
    public static final SourceType DEFAULT;

    static {
       SourceType sourceType;
       SourceType[] sourceTypeAr = new SourceType[]{sourceType,sourceType,sourceType,sourceType,sourceType};
       sourceType = new SourceType("DEFAULT", 0, 0);
       SourceType.DEFAULT = sourceType;
       sourceType = new SourceType("ANCHOR_ENTRY_SOURCE_TYPE", 1, 1);
       SourceType.ANCHOR_ENTRY_SOURCE_TYPE = sourceType;
       sourceType = new SourceType("AUDIENCE_ENTRY_SOURCE_TYPE", 2, 2);
       SourceType.AUDIENCE_ENTRY_SOURCE_TYPE = sourceType;
       sourceType = new SourceType("ANCHORD_BUTTON_SOURCE_TYPE", 3, 1);
       SourceType.ANCHORD_BUTTON_SOURCE_TYPE = sourceType;
       sourceType = new SourceType("AUDIENCE_BUTTON_SOURCE_TYPE", 4, 2);
       SourceType.AUDIENCE_BUTTON_SOURCE_TYPE = sourceType;
       SourceType.$VALUES = sourceTypeAr;
    }
    public void SourceType(String p0,int p1,int p2){
       super(p0, p1);
       this.sourceType = p2;
    }
    public static SourceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SourceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SourceType.class, p0);
    }
    public static SourceType[] values(){
       Object obj = PatchProxy.apply(null, null, SourceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SourceType.$VALUES.clone();
    }
    public final int getSourceType(){
       return this.sourceType;
    }
}
