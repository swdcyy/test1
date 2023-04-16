package com.kwai.feature.api.danmaku.model.DanmakuShowType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DanmakuShowType extends Enum	// class@000e7f
{
    public final int type;
    public static final DanmakuShowType[] $VALUES;
    public static final DanmakuShowType WISH;

    static {
       DanmakuShowType uDanmakuShow1;
       DanmakuShowType[] uDanmakuShow = new DanmakuShowType[]{uDanmakuShow1};
       uDanmakuShow1 = new DanmakuShowType("WISH", 0, 1);
       DanmakuShowType.WISH = uDanmakuShow1;
       DanmakuShowType.$VALUES = uDanmakuShow;
    }
    public void DanmakuShowType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static DanmakuShowType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DanmakuShowType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DanmakuShowType.class, p0);
    }
    public static DanmakuShowType[] values(){
       Object obj = PatchProxy.apply(null, null, DanmakuShowType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuShowType.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
