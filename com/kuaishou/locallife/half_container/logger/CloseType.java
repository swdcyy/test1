package com.kuaishou.locallife.half_container.logger.CloseType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CloseType extends Enum	// class@001495
{
    public final int type;
    public static final CloseType[] $VALUES;
    public static final CloseType BACK_KEY;
    public static final CloseType CLICK_MASK;
    public static final CloseType RN_ERROR;
    public static final CloseType SLIDE_BACK;
    public static final CloseType SLIDE_DOWN;
    public static final CloseType URL_ERROR;

    static {
       CloseType uCloseType;
       CloseType uCloseType1;
       CloseType[] uCloseTypeAr = new CloseType[]{uCloseType,uCloseType,uCloseType,uCloseType1,uCloseType1,uCloseType1};
       uCloseType = new CloseType("SLIDE_DOWN", 0, 4);
       CloseType.SLIDE_DOWN = uCloseType;
       uCloseType = new CloseType("CLICK_MASK", 1, 5);
       CloseType.CLICK_MASK = uCloseType;
       uCloseType = new CloseType("SLIDE_BACK", 2, 6);
       CloseType.SLIDE_BACK = uCloseType;
       uCloseType1 = new CloseType("RN_ERROR", 3, 7);
       CloseType.RN_ERROR = uCloseType1;
       uCloseType1 = new CloseType("URL_ERROR", 4, 9);
       CloseType.URL_ERROR = uCloseType1;
       uCloseType1 = new CloseType("BACK_KEY", 5, 10);
       CloseType.BACK_KEY = uCloseType1;
       CloseType.$VALUES = uCloseTypeAr;
    }
    public void CloseType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static CloseType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CloseType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CloseType.class, p0);
    }
    public static CloseType[] values(){
       Object obj = PatchProxy.apply(null, null, CloseType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CloseType.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
