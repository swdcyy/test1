package dnc.e2;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.o1;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.Object;
import q2b.h$b;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadDetailPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import k2b.u1;

public final class e2 implements Runnable	// class@002298
{
    public final o1 b;
    public final UploadInfo c;
    public final String d;
    public final String e;
    public final long f;
    public final float g;
    public final ClientEvent$ResultPackage h;

    public void e2(o1 p0,UploadInfo p1,String p2,String p3,long p4,float p5,ClientEvent$ResultPackage p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void run(){
       e2 tb = this.b;
       e2 tc = this.c;
       h$b uob = h$b.d(8, tb.d(tc));
       ClientTaskDetail$UploadDetailPackage uploadDetail = tb.b(this.d, this.e, tc, this.f);
       uploadDetail.completedLength = (long)this.g;
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.uploadDetailPackage = uploadDetail;
       uob.r(tc.getSessionId());
       uob.s(taskDetailPa);
       uob.q(this.h);
       u1.r0(uob);
    }
}
