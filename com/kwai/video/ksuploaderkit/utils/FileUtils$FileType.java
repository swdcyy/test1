package com.kwai.video.ksuploaderkit.utils.FileUtils$FileType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FileUtils$FileType extends Enum	// class@0009dc
{
    public static final FileUtils$FileType[] $VALUES;
    public static final FileUtils$FileType Image;
    public static final FileUtils$FileType Unknown;
    public static final FileUtils$FileType Video;

    static {
       FileUtils$FileType uFileType = new FileUtils$FileType("Unknown", 0);
       FileUtils$FileType.Unknown = uFileType;
       FileUtils$FileType uFileType1 = new FileUtils$FileType("Video", 1);
       FileUtils$FileType.Video = uFileType1;
       FileUtils$FileType uFileType2 = new FileUtils$FileType("Image", 2);
       FileUtils$FileType.Image = uFileType2;
       FileUtils$FileType[] uFileTypeArr = new FileUtils$FileType[]{uFileType,uFileType1,uFileType2};
       FileUtils$FileType.$VALUES = uFileTypeArr;
    }
    public void FileUtils$FileType(String p0,int p1){
       super(p0, p1);
    }
    public static FileUtils$FileType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtils$FileType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FileUtils$FileType.class, p0);
    }
    public static FileUtils$FileType[] values(){
       Object obj = PatchProxy.apply(null, null, FileUtils$FileType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FileUtils$FileType.$VALUES.clone();
    }
}
