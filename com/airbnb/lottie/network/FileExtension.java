package com.airbnb.lottie.network.FileExtension;
import java.lang.Enum;
import java.lang.String;
import java.lang.StringBuilder;
import w4.d;
import java.lang.Class;
import java.lang.Object;

public final class FileExtension extends Enum	// class@000dd8
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
       FileExtension[] uFileExtensi = FileExtension.values();
       int len = uFileExtensi.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = uFileExtensi[i];
             if (p0.endsWith(oobject.extension)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             d.c("Unable to find correct extension for "+p0);
             return FileExtension.JSON;
          }
       }
       return oobject;
    }
    public static FileExtension valueOf(String p0){
       return Enum.valueOf(FileExtension.class, p0);
    }
    public static FileExtension[] values(){
       return FileExtension.$VALUES.clone();
    }
    public String tempExtension(){
       return ".temp"+this.extension;
    }
    public String toString(){
       return this.extension;
    }
}
