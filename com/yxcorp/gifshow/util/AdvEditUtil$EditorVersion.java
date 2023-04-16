package com.yxcorp.gifshow.util.AdvEditUtil$EditorVersion;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AdvEditUtil$EditorVersion extends Enum	// class@001eca
{
    public final String versionName;
    public static final AdvEditUtil$EditorVersion[] $VALUES;
    public static final AdvEditUtil$EditorVersion NORMAL;
    public static final AdvEditUtil$EditorVersion V3_FULLSCREEN;

    static {
       AdvEditUtil$EditorVersion uEditorVersi = new AdvEditUtil$EditorVersion("NORMAL", 0, "normal1");
       AdvEditUtil$EditorVersion.NORMAL = uEditorVersi;
       AdvEditUtil$EditorVersion uEditorVersi1 = new AdvEditUtil$EditorVersion("V3_FULLSCREEN", 1, "fullScreen3");
       AdvEditUtil$EditorVersion.V3_FULLSCREEN = uEditorVersi1;
       AdvEditUtil$EditorVersion[] uEditorVersi2 = new AdvEditUtil$EditorVersion[]{uEditorVersi,uEditorVersi1};
       AdvEditUtil$EditorVersion.$VALUES = uEditorVersi2;
    }
    public void AdvEditUtil$EditorVersion(String p0,int p1,String p2){
       super(p0, p1);
       this.versionName = p2;
    }
    public static AdvEditUtil$EditorVersion valueOf(String p0){
       return Enum.valueOf(AdvEditUtil$EditorVersion.class, p0);
    }
    public static AdvEditUtil$EditorVersion[] values(){
       return AdvEditUtil$EditorVersion.$VALUES.clone();
    }
}
