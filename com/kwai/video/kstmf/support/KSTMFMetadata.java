package com.kwai.video.kstmf.support.KSTMFMetadata;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class KSTMFMetadata	// class@00094c
{

    public void KSTMFMetadata(){
       super();
    }
    public static String getVideoLocation(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSTMFMetadata.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSTMFMetadata.nativeGetVideoLocation(p0);
    }
    public static native String nativeGetVideoLocation(String p0);
}
