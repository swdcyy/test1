package og.a$d;
import java.util.concurrent.Callable;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$UploadTokenNeededParams;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import com.feature.post.bridge.util.UploadTokenHelper;
import java.io.File;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.feature.post.bridge.util.UploadTokenHelper$a;

public final class a$d implements Callable	// class@00278b
{
    public final JsSelectMixMediasParams$UploadTokenNeededParams b;
    public final AtomicReference c;

    public void a$d(JsSelectMixMediasParams$UploadTokenNeededParams p0,AtomicReference p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       a$d tb = this.b;
       File uFile = new File(this.c.get());
       Objects.requireNonNull(UploadTokenHelper.a);
       a.p(tb, "inputParams");
       a.p(uFile, "file");
       UploadTokenHelper$a uoa = new UploadTokenHelper$a(uFile);
       JsSelectMixMediasParams$UploadTokenNeededParams mUploadToken = tb.mUploadTokenApi;
       a.o(mUploadToken, "inputParams.mUploadTokenApi");
       a.p(mUploadToken, "<set-?>");
       uoa.a = mUploadToken;
       mUploadToken = tb.mAppId;
       a.o(mUploadToken, "inputParams.mAppId");
       a.p(mUploadToken, "<set-?>");
       uoa.b = mUploadToken;
       mUploadToken = tb.mSid;
       a.o(mUploadToken, "inputParams.mSid");
       a.p(mUploadToken, "<set-?>");
       uoa.c = mUploadToken;
       mUploadToken = tb.mSubBiz;
       a.o(mUploadToken, "inputParams.mSubBiz");
       a.p(mUploadToken, "<set-?>");
       uoa.d = mUploadToken;
       mUploadToken = tb.mToken;
       a.o(mUploadToken, "inputParams.mToken");
       a.p(mUploadToken, "<set-?>");
       uoa.e = mUploadToken;
       mUploadToken = tb.mTarget;
       a.o(mUploadToken, "inputParams.mTarget");
       a.p(mUploadToken, "<set-?>");
       uoa.f = mUploadToken;
       uoa.g = tb.mTargetType;
       uoa.h = tb.mPublicGroup;
       JsSelectMixMediasParams$UploadTokenNeededParams mUserId = tb.mUserId;
       if (mUserId != null) {
       }else {
          mUserId = "";
       }
       a.p(mUserId, "<set-?>");
       uoa.i = mUserId;
       return uoa;
    }
}
