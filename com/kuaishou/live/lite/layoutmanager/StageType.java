package com.kuaishou.live.lite.layoutmanager.StageType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class StageType extends Enum	// class@0009e6
{
    public static final StageType[] $VALUES;
    public static final StageType MultiChat;
    public static final StageType MultiLine;
    public static final StageType None;
    public static final StageType PK;
    public static final StageType Show;
    public static final StageType VoiceParty;

    static {
       StageType stageType;
       StageType[] stageTypeArr = new StageType[]{stageType,stageType,stageType,stageType,stageType,stageType};
       stageType = new StageType("None", 0);
       StageType.None = stageType;
       stageType = new StageType("Show", 1);
       StageType.Show = stageType;
       stageType = new StageType("PK", 2);
       StageType.PK = stageType;
       stageType = new StageType("MultiChat", 3);
       StageType.MultiChat = stageType;
       stageType = new StageType("MultiLine", 4);
       StageType.MultiLine = stageType;
       stageType = new StageType("VoiceParty", 5);
       StageType.VoiceParty = stageType;
       StageType.$VALUES = stageTypeArr;
    }
    public void StageType(String p0,int p1){
       super(p0, p1);
    }
    public static StageType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StageType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(StageType.class, p0);
    }
    public static StageType[] values(){
       Object obj = PatchProxy.apply(null, null, StageType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StageType.$VALUES.clone();
    }
}
