package com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$PostConstructEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WorkspaceConstructor$PostConstructEvent extends Enum	// class@000d3b
{
    public static final WorkspaceConstructor$PostConstructEvent[] $VALUES;
    public static final WorkspaceConstructor$PostConstructEvent KARAOKE;
    public static final WorkspaceConstructor$PostConstructEvent LYRIC;

    static {
       WorkspaceConstructor$PostConstructEvent postConstruc = new WorkspaceConstructor$PostConstructEvent("LYRIC", 0);
       WorkspaceConstructor$PostConstructEvent.LYRIC = postConstruc;
       WorkspaceConstructor$PostConstructEvent postConstruc1 = new WorkspaceConstructor$PostConstructEvent("KARAOKE", 1);
       WorkspaceConstructor$PostConstructEvent.KARAOKE = postConstruc1;
       WorkspaceConstructor$PostConstructEvent[] postConstruc2 = new WorkspaceConstructor$PostConstructEvent[]{postConstruc,postConstruc1};
       WorkspaceConstructor$PostConstructEvent.$VALUES = postConstruc2;
    }
    public void WorkspaceConstructor$PostConstructEvent(String p0,int p1){
       super(p0, p1);
    }
    public static WorkspaceConstructor$PostConstructEvent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WorkspaceConstructor$PostConstructEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WorkspaceConstructor$PostConstructEvent.class, p0);
    }
    public static WorkspaceConstructor$PostConstructEvent[] values(){
       Object obj = PatchProxy.apply(null, null, WorkspaceConstructor$PostConstructEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WorkspaceConstructor$PostConstructEvent.$VALUES.clone();
    }
}
