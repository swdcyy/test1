package com.gifshow.kanim.network.FileExtension;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import ih.b;

public final class FileExtension extends Enum	// class@0015bd
{
    public final String extension;
    public static final FileExtension[] $VALUES;
    public static final FileExtension JSON;
    public static final FileExtension ZIP;

    static {
       FileExtension uFileExtensi = new FileExtension("JSON", 0, ".json");
       FileExtension.JSON = uFileExtensi;
       FileExtension uFileExtensi1 = new FileExtension("ZIP", 1, ".zip");
       FileExtension.ZIP = uFileExtensi1;
       FileExtension[] uFileExtensi2 = new FileExtension[]{uFileExtensi,uFileExtensi1};
       FileExtension.$VALUES = uFileExtensi2;
    }
    public void FileExtension(String p0,int p1,String p2){
       super(p0, p1);
       this.extension = p2;
    }
    public static FileExtension forFile(String p0){
       object oobject;
       FileExtension[] obj = PatchProxy.applyOneRefs(p0, null, FileExtension.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FileExtension.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = obj[i];
             if (p0.endsWith(oobject.extension)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             b.c("Unable to find correct extension for "+p0);
             return FileExtension.JSON;
          }
       }
       return oobject;
    }
    public static FileExtension valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileExtension.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FileExtension.class, p0);
    }
    public static FileExtension[] values(){
       Object obj = PatchProxy.apply(null, null, FileExtension.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FileExtension.$VALUES.clone();
    }
    public String tempExtension(){
       Object obj = PatchProxy.apply(null, this, FileExtension.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ".temp"+this.extension;
    }
    public String toString(){
       return this.extension;
    }
}
