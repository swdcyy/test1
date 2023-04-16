package com.kwai.feature.post.api.feature.memory.MemorySceneType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MemorySceneType extends Enum	// class@0013b5
{
    public final String sceneName;
    public static final MemorySceneType[] $VALUES;
    public static final MemorySceneType AICUT_LOADING;
    public static final MemorySceneType ALBUM_LOADING;
    public static final MemorySceneType EDIT;
    public static final MemorySceneType PREVIEW;

    static {
       MemorySceneType memorySceneT1;
       MemorySceneType[] memorySceneT = new MemorySceneType[]{memorySceneT1,memorySceneT1,memorySceneT1,memorySceneT1};
       memorySceneT1 = new MemorySceneType("ALBUM_LOADING", 0, "memoryLoading");
       MemorySceneType.ALBUM_LOADING = memorySceneT1;
       memorySceneT1 = new MemorySceneType("AICUT_LOADING", 1, "aiCutLoading");
       MemorySceneType.AICUT_LOADING = memorySceneT1;
       memorySceneT1 = new MemorySceneType("PREVIEW", 2, "localTemplatePage");
       MemorySceneType.PREVIEW = memorySceneT1;
       memorySceneT1 = new MemorySceneType("EDIT", 3, "edit");
       MemorySceneType.EDIT = memorySceneT1;
       MemorySceneType.$VALUES = memorySceneT;
    }
    public void MemorySceneType(String p0,int p1,String p2){
       super(p0, p1);
       this.sceneName = p2;
    }
    public static MemorySceneType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MemorySceneType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MemorySceneType.class, p0);
    }
    public static MemorySceneType[] values(){
       Object obj = PatchProxy.apply(null, null, MemorySceneType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MemorySceneType.$VALUES.clone();
    }
    public final String getSceneName(){
       return this.sceneName;
    }
}
