package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.util.ClearSheetOperation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClearSheetOperation extends Enum	// class@000b00
{
    public static final ClearSheetOperation[] $VALUES;
    public static final ClearSheetOperation CLEAR_ALL;

    static {
       ClearSheetOperation uClearSheetO1;
       ClearSheetOperation[] uClearSheetO = new ClearSheetOperation[]{uClearSheetO1};
       uClearSheetO1 = new ClearSheetOperation("CLEAR_ALL", 0);
       ClearSheetOperation.CLEAR_ALL = uClearSheetO1;
       ClearSheetOperation.$VALUES = uClearSheetO;
    }
    public void ClearSheetOperation(String p0,int p1){
       super(p0, p1);
    }
    public static ClearSheetOperation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClearSheetOperation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClearSheetOperation.class, p0);
    }
    public static ClearSheetOperation[] values(){
       Object obj = PatchProxy.apply(null, null, ClearSheetOperation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClearSheetOperation.$VALUES.clone();
    }
}
