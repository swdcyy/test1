package com.ks.ksuploader.KSUploader$KSUploaderEventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploader$KSUploaderEventType extends Enum	// class@00075d
{
    public static final KSUploader$KSUploaderEventType[] $VALUES;
    public static final KSUploader$KSUploaderEventType KSUploaderEventType_COMPLETE;
    public static final KSUploader$KSUploaderEventType KSUploaderEventType_PROGRESS;

    static {
       KSUploader$KSUploaderEventType kSUploaderEv = new KSUploader$KSUploaderEventType("KSUploaderEventType_PROGRESS", 0);
       KSUploader$KSUploaderEventType.KSUploaderEventType_PROGRESS = kSUploaderEv;
       KSUploader$KSUploaderEventType kSUploaderEv1 = new KSUploader$KSUploaderEventType("KSUploaderEventType_COMPLETE", 1);
       KSUploader$KSUploaderEventType.KSUploaderEventType_COMPLETE = kSUploaderEv1;
       KSUploader$KSUploaderEventType[] kSUploaderEv2 = new KSUploader$KSUploaderEventType[]{kSUploaderEv,kSUploaderEv1};
       KSUploader$KSUploaderEventType.$VALUES = kSUploaderEv2;
    }
    public void KSUploader$KSUploaderEventType(String p0,int p1){
       super(p0, p1);
    }
    public static KSUploader$KSUploaderEventType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploader$KSUploaderEventType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploader$KSUploaderEventType.class, p0);
    }
    public static KSUploader$KSUploaderEventType[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploader$KSUploaderEventType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploader$KSUploaderEventType.$VALUES.clone();
    }
}
