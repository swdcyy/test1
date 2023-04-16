package com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSResourceDownloader$Status extends Enum	// class@0019f4
{
    public static final KSResourceDownloader$Status[] $VALUES;
    public static final KSResourceDownloader$Status DOWNLOADING;
    public static final KSResourceDownloader$Status FAILED;
    public static final KSResourceDownloader$Status SUCCESS;

    static {
       KSResourceDownloader$Status status = new KSResourceDownloader$Status("SUCCESS", 0);
       KSResourceDownloader$Status.SUCCESS = status;
       KSResourceDownloader$Status status1 = new KSResourceDownloader$Status("FAILED", 1);
       KSResourceDownloader$Status.FAILED = status1;
       KSResourceDownloader$Status status2 = new KSResourceDownloader$Status("DOWNLOADING", 2);
       KSResourceDownloader$Status.DOWNLOADING = status2;
       KSResourceDownloader$Status[] statusArray = new KSResourceDownloader$Status[]{status,status1,status2};
       KSResourceDownloader$Status.$VALUES = statusArray;
    }
    public void KSResourceDownloader$Status(String p0,int p1){
       super(p0, p1);
    }
    public static KSResourceDownloader$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSResourceDownloader$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSResourceDownloader$Status.class, p0);
    }
    public static KSResourceDownloader$Status[] values(){
       Object obj = PatchProxy.apply(null, null, KSResourceDownloader$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSResourceDownloader$Status.$VALUES.clone();
    }
}
