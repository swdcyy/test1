package dnc.d2;
import java.lang.Object;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LocalMusicPackage;
import java.lang.Long;
import java.io.File;
import q2b.h$b;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadDetailPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import k2b.u1;
import java.lang.Throwable;
import java.lang.StringBuilder;
import android.util.Log;
import com.yxcorp.utility.TextUtils;

public class d2	// class@002294
{

    public void d2(){
       super();
    }
    public final ClientContent$ContentPackage a(LocalMusicUploadInfo p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, d2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$LocalMusicPackage localMusicPa = new ClientContent$LocalMusicPackage();
       localMusicPa.album = p0.getAlbum();
       localMusicPa.artist = p0.getArtistName();
       localMusicPa.duration = p0.getDuration();
       localMusicPa.filePath = p0.getFilePath();
       localMusicPa.fileSize = p0.getSize();
       localMusicPa.title = p0.getMusicName();
       obj.localMusicPackage = localMusicPa;
       return obj;
    }
    public void b(String p0,String p1,long p2,LocalMusicUploadInfo p3){
       if (PatchProxy.isSupport(d2.class) && PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), p3, this, d2.class, "4")) {
          return;
       }
       long l = new File(p3.getFilePath()).length();
       h$b uob = h$b.d(9, 606);
       ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
       uploadDetail.fileLength = l;
       uploadDetail.host = p0;
       uploadDetail.ip = p1;
       uploadDetail.completedLength = (long)((float)l * p3.getProgress());
       uploadDetail.fileType = 2;
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.domain = 3;
       resultPackag.timeCost = System.currentTimeMillis() - p2;
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.uploadDetailPackage = uploadDetail;
       uob.r(p3.getSessionId());
       uob.h(this.a(p3));
       uob.s(taskDetailPa);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public void c(String p0,String p1,long p2,LocalMusicUploadInfo p3,Throwable p4){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       d2 uod2 = d2.class;
       int i = 3;
       if (PatchProxy.isSupport(uod2)) {
          Object[] objArray = new Object[]{oobject,oobject1,Long.valueOf(p2),oobject2,p4};
          if (PatchProxy.applyVoid(objArray, this, uod2, "2")) {
             return;
          }
       }
       long l = new File(p3.getFilePath()).length();
       h$b uob = h$b.d(8, 606);
       ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
       uploadDetail.completedLength = (long)(p3.getProgress() * (float)l);
       uploadDetail.fileLength = l;
       uploadDetail.host = oobject;
       uploadDetail.fileType = 2;
       uploadDetail.ip = oobject1;
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.domain = i;
       resultPackag.timeCost = System.currentTimeMillis() - p2;
       resultPackag.message = TextUtils.k(p4.getClass().getName()+":"+Log.getStackTraceString(p4));
       resultPackag.code = 0;
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.uploadDetailPackage = uploadDetail;
       uob.r(p3.getSessionId());
       uob.h(this.a(oobject2));
       uob.s(taskDetailPa);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
}
