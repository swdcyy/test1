package com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BaseEditor$EditorShowMode extends Enum	// class@000d8d
{
    public final int mValue;
    public static final BaseEditor$EditorShowMode[] $VALUES;
    public static final BaseEditor$EditorShowMode SHOW_BACKGROUND;
    public static final BaseEditor$EditorShowMode SHOW_FOREGROUND;

    static {
       BaseEditor$EditorShowMode uEditorShowM = new BaseEditor$EditorShowMode("SHOW_FOREGROUND", 0, 1);
       BaseEditor$EditorShowMode.SHOW_FOREGROUND = uEditorShowM;
       BaseEditor$EditorShowMode uEditorShowM1 = new BaseEditor$EditorShowMode("SHOW_BACKGROUND", 1, 2);
       BaseEditor$EditorShowMode.SHOW_BACKGROUND = uEditorShowM1;
       BaseEditor$EditorShowMode[] uEditorShowM2 = new BaseEditor$EditorShowMode[]{uEditorShowM,uEditorShowM1};
       BaseEditor$EditorShowMode.$VALUES = uEditorShowM2;
    }
    public void BaseEditor$EditorShowMode(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static BaseEditor$EditorShowMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BaseEditor$EditorShowMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BaseEditor$EditorShowMode.class, p0);
    }
    public static BaseEditor$EditorShowMode[] values(){
       Object obj = PatchProxy.apply(null, null, BaseEditor$EditorShowMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BaseEditor$EditorShowMode.$VALUES.clone();
    }
}
