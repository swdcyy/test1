package com.kwai.video.player.kwai_player.FileUtils$FileState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FileUtils$FileState extends Enum	// class@000b2d
{
    public String tag;
    public static final FileUtils$FileState[] $VALUES;
    public static final FileUtils$FileState FState_Dir;
    public static final FileUtils$FileState FState_File;
    public static final FileUtils$FileState FState_None;
    public static final FileUtils$FileState FState_Other;

    static {
       FileUtils$FileState uFileState = new FileUtils$FileState("FState_Dir", 0, "I am director!");
       FileUtils$FileState.FState_Dir = uFileState;
       FileUtils$FileState uFileState1 = new FileUtils$FileState("FState_File", 1, "I am file!");
       FileUtils$FileState.FState_File = uFileState1;
       FileUtils$FileState uFileState2 = new FileUtils$FileState("FState_None", 2, "I am a ghost!");
       FileUtils$FileState.FState_None = uFileState2;
       FileUtils$FileState uFileState3 = new FileUtils$FileState("FState_Other", 3, "I am not human!");
       FileUtils$FileState.FState_Other = uFileState3;
       FileUtils$FileState[] uFileStateAr = new FileUtils$FileState[]{uFileState,uFileState1,uFileState2,uFileState3};
       FileUtils$FileState.$VALUES = uFileStateAr;
    }
    public void FileUtils$FileState(String p0,int p1,String p2){
       super(p0, p1);
       this.tag = p2;
    }
    public static FileUtils$FileState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils$FileState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FileUtils$FileState.class, p0);
    }
    public static FileUtils$FileState[] values(){
       Object obj = PatchProxy.apply(null, null, FileUtils$FileState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FileUtils$FileState.$VALUES.clone();
    }
    public String getTag(){
       return this.tag;
    }
    public String toString(){
       return this.tag;
    }
}
