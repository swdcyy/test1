package com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IMagicGiftResourceLoader$Type extends Enum	// class@001b54
{
    public final int reportPriority;
    public static final IMagicGiftResourceLoader$Type[] $VALUES;
    public static final IMagicGiftResourceLoader$Type FONT;
    public static final IMagicGiftResourceLoader$Type MAGIC_FACE;
    public static final IMagicGiftResourceLoader$Type SO;
    public static final IMagicGiftResourceLoader$Type UNDEFINE;
    public static final IMagicGiftResourceLoader$Type Y_MODE;

    static {
       IMagicGiftResourceLoader$Type type = new IMagicGiftResourceLoader$Type("UNDEFINE", 0, 0);
       IMagicGiftResourceLoader$Type.UNDEFINE = type;
       IMagicGiftResourceLoader$Type type1 = new IMagicGiftResourceLoader$Type("FONT", 1, 1);
       IMagicGiftResourceLoader$Type.FONT = type1;
       IMagicGiftResourceLoader$Type type2 = new IMagicGiftResourceLoader$Type("SO", 2, 2);
       IMagicGiftResourceLoader$Type.SO = type2;
       IMagicGiftResourceLoader$Type type3 = new IMagicGiftResourceLoader$Type("Y_MODE", 3, 3);
       IMagicGiftResourceLoader$Type.Y_MODE = type3;
       IMagicGiftResourceLoader$Type type4 = new IMagicGiftResourceLoader$Type("MAGIC_FACE", 4, 999);
       IMagicGiftResourceLoader$Type.MAGIC_FACE = type4;
       IMagicGiftResourceLoader$Type[] typeArray = new IMagicGiftResourceLoader$Type[]{type,type1,type2,type3,type4};
       IMagicGiftResourceLoader$Type.$VALUES = typeArray;
    }
    public void IMagicGiftResourceLoader$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.reportPriority = p2;
    }
    public static IMagicGiftResourceLoader$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IMagicGiftResourceLoader$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IMagicGiftResourceLoader$Type.class, p0);
    }
    public static IMagicGiftResourceLoader$Type[] values(){
       Object obj = PatchProxy.apply(null, null, IMagicGiftResourceLoader$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IMagicGiftResourceLoader$Type.$VALUES.clone();
    }
    public int getReportPriority(){
       return this.reportPriority;
    }
}
