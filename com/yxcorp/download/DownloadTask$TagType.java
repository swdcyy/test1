package com.yxcorp.download.DownloadTask$TagType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DownloadTask$TagType extends Enum	// class@0011b1
{
    public int type;
    public static final DownloadTask$TagType[] $VALUES;
    public static final DownloadTask$TagType TAG1;
    public static final DownloadTask$TagType TAG2;
    public static final DownloadTask$TagType TAG3;
    public static final DownloadTask$TagType TAG4;
    public static final DownloadTask$TagType TAG5;
    public static final DownloadTask$TagType TAG6;
    public static final DownloadTask$TagType TAG7;
    public static final DownloadTask$TagType TAG8;
    public static final DownloadTask$TagType TAG9;
    public static final DownloadTask$TagType TAG_DEFAULT;

    static {
       DownloadTask$TagType tagType = new DownloadTask$TagType("TAG_DEFAULT", 0, 0);
       DownloadTask$TagType.TAG_DEFAULT = tagType;
       DownloadTask$TagType tagType1 = new DownloadTask$TagType("TAG1", 1, 1);
       DownloadTask$TagType.TAG1 = tagType1;
       DownloadTask$TagType tagType2 = new DownloadTask$TagType("TAG2", 2, 2);
       DownloadTask$TagType.TAG2 = tagType2;
       DownloadTask$TagType tagType3 = new DownloadTask$TagType("TAG3", 3, 3);
       DownloadTask$TagType.TAG3 = tagType3;
       DownloadTask$TagType tagType4 = new DownloadTask$TagType("TAG4", 4, 4);
       DownloadTask$TagType.TAG4 = tagType4;
       DownloadTask$TagType tagType5 = new DownloadTask$TagType("TAG5", 5, 5);
       DownloadTask$TagType.TAG5 = tagType5;
       DownloadTask$TagType tagType6 = new DownloadTask$TagType("TAG6", 6, 6);
       DownloadTask$TagType.TAG6 = tagType6;
       DownloadTask$TagType tagType7 = new DownloadTask$TagType("TAG7", 7, 7);
       DownloadTask$TagType.TAG7 = tagType7;
       DownloadTask$TagType tagType8 = new DownloadTask$TagType("TAG8", 8, 8);
       DownloadTask$TagType.TAG8 = tagType8;
       DownloadTask$TagType tagType9 = new DownloadTask$TagType("TAG9", 9, 9);
       DownloadTask$TagType.TAG9 = tagType9;
       DownloadTask$TagType[] tagTypeArray = new DownloadTask$TagType[10];
       tagTypeArray[0] = tagType;
       tagTypeArray[1] = tagType1;
       tagTypeArray[2] = tagType2;
       tagTypeArray[3] = tagType3;
       tagTypeArray[4] = tagType4;
       tagTypeArray[5] = tagType5;
       tagTypeArray[6] = tagType6;
       tagTypeArray[7] = tagType7;
       tagTypeArray[8] = tagType8;
       tagTypeArray[9] = tagType9;
       DownloadTask$TagType.$VALUES = tagTypeArray;
    }
    public void DownloadTask$TagType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static DownloadTask$TagType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DownloadTask$TagType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DownloadTask$TagType.class, p0);
    }
    public static DownloadTask$TagType[] values(){
       Object obj = PatchProxy.apply(null, null, DownloadTask$TagType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DownloadTask$TagType.$VALUES.clone();
    }
}
