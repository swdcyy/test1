package com.yxcorp.gifshow.camera.record.RecordPModuleRegister$PModuleSubBiz;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RecordPModuleRegister$PModuleSubBiz extends Enum	// class@001c92
{
    public static final RecordPModuleRegister$PModuleSubBiz[] $VALUES;
    public static final RecordPModuleRegister$PModuleSubBiz BIZ_COVER_SPECIFICATION;
    public static final RecordPModuleRegister$PModuleSubBiz BIZ_MAGIC_FACE_DOWNLOAD;
    public static final RecordPModuleRegister$PModuleSubBiz BIZ_MAGIC_FACE_GUIDE;
    public static final RecordPModuleRegister$PModuleSubBiz BIZ_MAGIC_GUIDE_SAMPLE;
    public static final RecordPModuleRegister$PModuleSubBiz BIZ_MAGIC_MAIN;

    static {
       RecordPModuleRegister$PModuleSubBiz pModuleSubBi = new RecordPModuleRegister$PModuleSubBiz("BIZ_MAGIC_MAIN", 0);
       RecordPModuleRegister$PModuleSubBiz.BIZ_MAGIC_MAIN = pModuleSubBi;
       RecordPModuleRegister$PModuleSubBiz pModuleSubBi1 = new RecordPModuleRegister$PModuleSubBiz("BIZ_MAGIC_FACE_GUIDE", 1);
       RecordPModuleRegister$PModuleSubBiz.BIZ_MAGIC_FACE_GUIDE = pModuleSubBi1;
       RecordPModuleRegister$PModuleSubBiz pModuleSubBi2 = new RecordPModuleRegister$PModuleSubBiz("BIZ_MAGIC_FACE_DOWNLOAD", 2);
       RecordPModuleRegister$PModuleSubBiz.BIZ_MAGIC_FACE_DOWNLOAD = pModuleSubBi2;
       RecordPModuleRegister$PModuleSubBiz pModuleSubBi3 = new RecordPModuleRegister$PModuleSubBiz("BIZ_MAGIC_GUIDE_SAMPLE", 3);
       RecordPModuleRegister$PModuleSubBiz.BIZ_MAGIC_GUIDE_SAMPLE = pModuleSubBi3;
       RecordPModuleRegister$PModuleSubBiz pModuleSubBi4 = new RecordPModuleRegister$PModuleSubBiz("BIZ_COVER_SPECIFICATION", 4);
       RecordPModuleRegister$PModuleSubBiz.BIZ_COVER_SPECIFICATION = pModuleSubBi4;
       RecordPModuleRegister$PModuleSubBiz[] pModuleSubBi5 = new RecordPModuleRegister$PModuleSubBiz[]{pModuleSubBi,pModuleSubBi1,pModuleSubBi2,pModuleSubBi3,pModuleSubBi4};
       RecordPModuleRegister$PModuleSubBiz.$VALUES = pModuleSubBi5;
    }
    public void RecordPModuleRegister$PModuleSubBiz(String p0,int p1){
       super(p0, p1);
    }
    public static RecordPModuleRegister$PModuleSubBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordPModuleRegister$PModuleSubBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RecordPModuleRegister$PModuleSubBiz.class, p0);
    }
    public static RecordPModuleRegister$PModuleSubBiz[] values(){
       Object obj = PatchProxy.apply(null, null, RecordPModuleRegister$PModuleSubBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordPModuleRegister$PModuleSubBiz.$VALUES.clone();
    }
}
