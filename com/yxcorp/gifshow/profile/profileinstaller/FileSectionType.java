package com.yxcorp.gifshow.profile.profileinstaller.FileSectionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class FileSectionType extends Enum	// class@00159e
{
    public final long mValue;
    public static final FileSectionType[] $VALUES;
    public static final FileSectionType AGGREGATION_COUNT;
    public static final FileSectionType CLASSES;
    public static final FileSectionType DEX_FILES;
    public static final FileSectionType EXTRA_DESCRIPTORS;
    public static final FileSectionType METHODS;

    static {
       FileSectionType uFileSection = new FileSectionType("DEX_FILES", 0, 0);
       FileSectionType.DEX_FILES = uFileSection;
       FileSectionType uFileSection1 = new FileSectionType("EXTRA_DESCRIPTORS", 1, 1);
       FileSectionType.EXTRA_DESCRIPTORS = uFileSection1;
       FileSectionType uFileSection2 = new FileSectionType("CLASSES", 2, 2);
       FileSectionType.CLASSES = uFileSection2;
       FileSectionType uFileSection3 = new FileSectionType("METHODS", 3, 3);
       FileSectionType.METHODS = uFileSection3;
       FileSectionType uFileSection4 = new FileSectionType("AGGREGATION_COUNT", 4, 4);
       FileSectionType.AGGREGATION_COUNT = uFileSection4;
       FileSectionType[] uFileSection5 = new FileSectionType[]{uFileSection,uFileSection1,uFileSection2,uFileSection3,uFileSection4};
       FileSectionType.$VALUES = uFileSection5;
    }
    public void FileSectionType(String p0,int p1,long p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static FileSectionType fromValue(long p0){
       FileSectionType[] obj;
       FileSectionType uFileSection = FileSectionType.class;
       if (PatchProxy.isSupport(uFileSection)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uFileSection, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = FileSectionType.values();
       int i = 0;
       while (true) {
          if (i >= obj.length) {
             throw new IllegalArgumentException("Unsupported FileSection Type "+p0);
          }
          if (!obj[i].getValue() - p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return obj[i];
    }
    public static FileSectionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileSectionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FileSectionType.class, p0);
    }
    public static FileSectionType[] values(){
       Object obj = PatchProxy.apply(null, null, FileSectionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FileSectionType.$VALUES.clone();
    }
    public long getValue(){
       return this.mValue;
    }
}
