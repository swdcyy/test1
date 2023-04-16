package com.kuaishou.android.model.music.UploadedMusicAuditStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UploadedMusicAuditStatus extends Enum	// class@000e87
{
    public final int mValue;
    public static final UploadedMusicAuditStatus[] $VALUES;
    public static final UploadedMusicAuditStatus AUDITING;
    public static final UploadedMusicAuditStatus DENIED;
    public static final UploadedMusicAuditStatus PASSED;
    public static final UploadedMusicAuditStatus PENDING;

    static {
       UploadedMusicAuditStatus uploadedMusi = new UploadedMusicAuditStatus("PENDING", 0, 1);
       UploadedMusicAuditStatus.PENDING = uploadedMusi;
       UploadedMusicAuditStatus uploadedMusi1 = new UploadedMusicAuditStatus("AUDITING", 1, 2);
       UploadedMusicAuditStatus.AUDITING = uploadedMusi1;
       UploadedMusicAuditStatus uploadedMusi2 = new UploadedMusicAuditStatus("PASSED", 2, 3);
       UploadedMusicAuditStatus.PASSED = uploadedMusi2;
       UploadedMusicAuditStatus uploadedMusi3 = new UploadedMusicAuditStatus("DENIED", 3, 4);
       UploadedMusicAuditStatus.DENIED = uploadedMusi3;
       UploadedMusicAuditStatus[] uploadedMusi4 = new UploadedMusicAuditStatus[]{uploadedMusi,uploadedMusi1,uploadedMusi2,uploadedMusi3};
       UploadedMusicAuditStatus.$VALUES = uploadedMusi4;
    }
    public void UploadedMusicAuditStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static UploadedMusicAuditStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UploadedMusicAuditStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UploadedMusicAuditStatus.class, p0);
    }
    public static UploadedMusicAuditStatus[] values(){
       Object obj = PatchProxy.apply(null, null, UploadedMusicAuditStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UploadedMusicAuditStatus.$VALUES.clone();
    }
}
