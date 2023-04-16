package mg.z0;
import pm6.e$b;
import r16.f;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusParams;
import f55.g;
import java.lang.Object;
import pm6.g;
import java.util.List;
import og.l;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.util.Collection;
import ekd.q;
import android.os.Bundle;
import w46.b;
import q46.r;
import java.util.Iterator;
import r26.a;
import com.kwai.feature.post.api.feature.bridge.JsVideoResumeDataResult;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.feature.post.bridge.j;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.Exception;
import com.kwai.plugin.dva.work.c$c;
import sj7.d;

public class z0 implements e$b	// class@002682
{
    public final f a;
    public final Activity b;
    public final JsVideoUploadStatusParams c;
    public final g d;

    public void z0(f p0,Activity p1,JsVideoUploadStatusParams p2,g p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public boolean c(){
       return g.a(this);
    }
    public void j(List p0){
       JsVideoResumeDataResult jsVideoResum;
       z0 ta = this.a;
       z0 tb = this.b;
       z0 tc = this.c;
       z0 td = this.d;
       Object[] objArray = new Object[0];
       String str = "JsPublishFun";
       l.D().w(str, "resumeVideoUpload: ", objArray);
       PostStatus[] postStatusAr = new PostStatus[]{PostStatus.UPLOAD_FAILED};
       List list = ta.T0(postStatusAr);
       if (q.f(list)) {
          td.a(2, "resume error", new Bundle());
       }else if(tb == null){
          Object[] objArray1 = new Object[0];
          l.D().t(str, "resumeVideoUpload: activity is null", objArray1);
       }else {
          r or = r.b(tb, ta);
          Iterator iterator = tc.mTaskIdList.iterator();
          while (iterator.hasNext()) {
             str = iterator.next();
             Iterator iterator1 = list.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   a uoa = iterator1.next();
                   if ((uoa.getSessionId()).equals(str)) {
                      td.onSuccess(new JsVideoResumeDataResult(1, "", str));
                      if (!TextUtils.x(uoa.getUploadInfo().getFilePath())) {
                         ta.o1(uoa.getId(), 0, 1);
                         j.a(or, str, td);
                      }
                      jsVideoResum = 1;
                   }
                }else {
                   jsVideoResum = null;
                }
                if (!jsVideoResum) {
                   Bundle uBundle = new Bundle();
                   SerializableHook.putSerializable(uBundle, "bundle_result", new JsVideoResumeDataResult(2, "÷ÿ ‘ ß∞‹", str));
                   td.a(2, "", uBundle);
                }else {
                   continue ;
                }
             }
          }
       }
       return;
    }
    public void onFailed(Exception p0){
       this.d.a(2, "so download error", new Bundle());
    }
    public void onProgress(float p0){
       g.c(this, p0);
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       this.j(p0);
    }
}
