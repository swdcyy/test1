package com.kwai.feature.post.api.feature.memory.MemoryType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MemoryType extends Enum	// class@0013b7
{
    public static final MemoryType[] $VALUES;
    public static final MemoryType ANNUAL_ALBUM;
    public static final MemoryType ANNUAL_SUMMARY;
    public static final MemoryType OVERALL;

    static {
       MemoryType memoryType;
       MemoryType[] memoryTypeAr = new MemoryType[]{memoryType,memoryType,memoryType};
       memoryType = new MemoryType("OVERALL", 0);
       MemoryType.OVERALL = memoryType;
       memoryType = new MemoryType("ANNUAL_ALBUM", 1);
       MemoryType.ANNUAL_ALBUM = memoryType;
       memoryType = new MemoryType("ANNUAL_SUMMARY", 2);
       MemoryType.ANNUAL_SUMMARY = memoryType;
       MemoryType.$VALUES = memoryTypeAr;
    }
    public void MemoryType(String p0,int p1){
       super(p0, p1);
    }
    public static MemoryType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MemoryType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MemoryType.class, p0);
    }
    public static MemoryType[] values(){
       Object obj = PatchProxy.apply(null, null, MemoryType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MemoryType.$VALUES.clone();
    }
}
