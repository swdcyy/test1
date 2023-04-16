package com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DownloadTask$DownloadTaskType extends Enum	// class@0011b0
{
    public String mName;
    public static final DownloadTask$DownloadTaskType[] $VALUES;
    public static final DownloadTask$DownloadTaskType ENQUEUE;
    public static final DownloadTask$DownloadTaskType IMMEDIATE;
    public static final DownloadTask$DownloadTaskType INIT_DOWNLOAD;
    public static final DownloadTask$DownloadTaskType PRE_DOWNLOAD;

    static {
       DownloadTask$DownloadTaskType uDownloadTas = new DownloadTask$DownloadTaskType("IMMEDIATE", 0, "IMMEDIATE");
       DownloadTask$DownloadTaskType.IMMEDIATE = uDownloadTas;
       DownloadTask$DownloadTaskType uDownloadTas1 = new DownloadTask$DownloadTaskType("PRE_DOWNLOAD", 1, "PRE_DOWNLOAD");
       DownloadTask$DownloadTaskType.PRE_DOWNLOAD = uDownloadTas1;
       DownloadTask$DownloadTaskType uDownloadTas2 = new DownloadTask$DownloadTaskType("ENQUEUE", 2, "ENQUEUE");
       DownloadTask$DownloadTaskType.ENQUEUE = uDownloadTas2;
       DownloadTask$DownloadTaskType uDownloadTas3 = new DownloadTask$DownloadTaskType("INIT_DOWNLOAD", 3, "INIT_DOWNLOAD");
       DownloadTask$DownloadTaskType.INIT_DOWNLOAD = uDownloadTas3;
       DownloadTask$DownloadTaskType[] uDownloadTas4 = new DownloadTask$DownloadTaskType[]{uDownloadTas,uDownloadTas1,uDownloadTas2,uDownloadTas3};
       DownloadTask$DownloadTaskType.$VALUES = uDownloadTas4;
    }
    public void DownloadTask$DownloadTaskType(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static DownloadTask$DownloadTaskType nameOf(String p0){
       object oobject;
       DownloadTask$DownloadTaskType[] obj = PatchProxy.applyOneRefs(p0, null, DownloadTask$DownloadTaskType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = DownloadTask$DownloadTaskType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = obj[i];
          if ((oobject.mName).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static DownloadTask$DownloadTaskType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DownloadTask$DownloadTaskType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DownloadTask$DownloadTaskType.class, p0);
    }
    public static DownloadTask$DownloadTaskType[] values(){
       Object obj = PatchProxy.apply(null, null, DownloadTask$DownloadTaskType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DownloadTask$DownloadTaskType.$VALUES.clone();
    }
}
