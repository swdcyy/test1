package com.kwai.video.clipkit.ClipImportHandler$ImportType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClipImportHandler$ImportType extends Enum	// class@001a28
{
    public static final ClipImportHandler$ImportType[] $VALUES;
    public static final ClipImportHandler$ImportType ALL_IMAGE;
    public static final ClipImportHandler$ImportType NOT_ALL_IMAGE;
    public static final ClipImportHandler$ImportType NOT_CHECK;

    static {
       ClipImportHandler$ImportType importType = new ClipImportHandler$ImportType("NOT_CHECK", 0);
       ClipImportHandler$ImportType.NOT_CHECK = importType;
       ClipImportHandler$ImportType importType1 = new ClipImportHandler$ImportType("ALL_IMAGE", 1);
       ClipImportHandler$ImportType.ALL_IMAGE = importType1;
       ClipImportHandler$ImportType importType2 = new ClipImportHandler$ImportType("NOT_ALL_IMAGE", 2);
       ClipImportHandler$ImportType.NOT_ALL_IMAGE = importType2;
       ClipImportHandler$ImportType[] importTypeAr = new ClipImportHandler$ImportType[]{importType,importType1,importType2};
       ClipImportHandler$ImportType.$VALUES = importTypeAr;
    }
    public void ClipImportHandler$ImportType(String p0,int p1){
       super(p0, p1);
    }
    public static ClipImportHandler$ImportType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipImportHandler$ImportType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClipImportHandler$ImportType.class, p0);
    }
    public static ClipImportHandler$ImportType[] values(){
       Object obj = PatchProxy.apply(null, null, ClipImportHandler$ImportType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipImportHandler$ImportType.$VALUES.clone();
    }
}
