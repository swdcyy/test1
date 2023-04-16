package com.yxcorp.gifshow.fansgroup.OpenCommentPanelEvent$FROM;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class OpenCommentPanelEvent$FROM extends Enum	// class@000e8e
{
    public static final OpenCommentPanelEvent$FROM[] $VALUES;
    public static final OpenCommentPanelEvent$FROM FULL_FANS_GROUP;
    public static final OpenCommentPanelEvent$FROM HALF_FANS_GROUP;

    static {
       OpenCommentPanelEvent$FROM uFROM = new OpenCommentPanelEvent$FROM("HALF_FANS_GROUP", 0);
       OpenCommentPanelEvent$FROM.HALF_FANS_GROUP = uFROM;
       OpenCommentPanelEvent$FROM uFROM1 = new OpenCommentPanelEvent$FROM("FULL_FANS_GROUP", 1);
       OpenCommentPanelEvent$FROM.FULL_FANS_GROUP = uFROM1;
       OpenCommentPanelEvent$FROM[] uFROMArray = new OpenCommentPanelEvent$FROM[]{uFROM,uFROM1};
       OpenCommentPanelEvent$FROM.$VALUES = uFROMArray;
    }
    public void OpenCommentPanelEvent$FROM(String p0,int p1){
       super(p0, p1);
    }
    public static OpenCommentPanelEvent$FROM valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, OpenCommentPanelEvent$FROM.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(OpenCommentPanelEvent$FROM.class, p0);
    }
    public static OpenCommentPanelEvent$FROM[] values(){
       Object obj = PatchProxy.apply(null, null, OpenCommentPanelEvent$FROM.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return OpenCommentPanelEvent$FROM.$VALUES.clone();
    }
}
