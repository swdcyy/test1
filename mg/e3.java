package mg.e3;
import erd.g;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsRetryInjectUploadParams;
import f55.g;
import java.lang.Object;
import b26.b;
import og.a;
import java.util.Objects;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import java.util.concurrent.atomic.AtomicReference;
import pm6.e;
import java.util.List;
import brd.t;
import t45.d;
import brd.z;
import og.d;
import erd.o;
import og.e;
import og.f;
import og.g;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$UploadTokenNeededParams;
import brd.w;
import og.a$b;
import og.a$c;
import og.a$a;
import erd.a;
import crd.b;

public final class e3 implements g	// class@0025f5
{
    public final Activity b;
    public final JsRetryInjectUploadParams c;
    public final g d;

    public void e3(Activity p0,JsRetryInjectUploadParams p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       e3 tb = this.b;
       e3 tc = this.c;
       e3 td = this.d;
       a d = a.d;
       Objects.requireNonNull(d);
       a.p(p0, "plugin");
       a.p(tb, "activity");
       a.p(tc, "params");
       a.p(td, "callback");
       JsSelectMixMediasResultBase mTaskId = tc.mTaskId;
       a.o(mTaskId, "params.mTaskId");
       d.d(mTaskId);
       AtomicReference uAtomicRefer = new AtomicReference();
       AtomicReference uAtomicRefer1 = new AtomicReference();
       uAtomicRefer1.set(tc.mFilePath);
       JsRetryInjectUploadParams mUploadToken = tc.mUploadTokenNeededParams;
       a.o(mUploadToken, "params.mUploadTokenNeededParams");
       p0 = e.e(e.a, "").subscribeOn(d.c).flatMap(new d(p0, tb, tc)).doOnNext(new e(tc, td)).concatMap(new f(p0, tb, tc)).map(new g(uAtomicRefer1, tc)).concatWith(d.h(mUploadToken, tc, uAtomicRefer1, uAtomicRefer)).subscribe(new a$b(td), new a$c(td, tc), new a$a(td, tc, uAtomicRefer));
       a.o(p0, "PostDynamicSOUtils.rxAsy¡­dResultFileUri\)\n        \)");
       JsSelectMixMediasResultBase mTaskId1 = tc.mTaskId;
       a.o(mTaskId1, "params.mTaskId");
       d.c(mTaskId1, p0);
    }
}
