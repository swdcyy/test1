package nca.a;
import java.lang.Object;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import gq.a;
import q87.c;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.util.PostExperimentUtils;

public final class a	// class@00312e
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final boolean a(PostWorkInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "postWorkInfo");
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditPublishTestCaseRecordUtils", "checkValidPostWork", objArray);
       UploadInfo uploadInfo = p0.getUploadInfo();
       if (uploadInfo != null && (uploadInfo.isUseFakeUploader() == true && PostExperimentUtils.l())) {
          i = true;
       }
    label_003b :
       return i;
    }
}
