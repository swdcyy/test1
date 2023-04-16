package og.a;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$ImageCompressConfig;
import java.lang.Object;
import java.lang.String;
import crd.b;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.yxcorp.gifshow.media.model.MessageEncodeConfig;
import q46.l;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import b26.b$a;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasProgressResult;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasStartResult$Data;
import f55.g;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasStartResult;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$UploadTokenNeededParams;
import java.util.concurrent.atomic.AtomicReference;
import brd.t;
import com.feature.post.bridge.util.UploadTokenHelper;
import og.a$d;
import java.util.Objects;
import og.c1;
import java.util.concurrent.Callable;
import io.reactivex.g;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import og.a$e;
import erd.o;

public final class a	// class@00278f
{
    public static final ConcurrentHashMap a;
    public static final JsSelectMixMediasParams$ImageCompressConfig b;
    public static final JsSelectMixMediasParams$ImageCompressConfig c;
    public static final a d;

    static {
       a.d = new a();
       a.a = new ConcurrentHashMap();
       JsSelectMixMediasParams$ImageCompressConfig imageCompres = new JsSelectMixMediasParams$ImageCompressConfig();
       imageCompres.mMaxHeight = 640;
       imageCompres.mMaxWidth = 640;
       imageCompres.mMaxFileSize = 0x80000;
       a.b = imageCompres;
       imageCompres = new JsSelectMixMediasParams$ImageCompressConfig();
       imageCompres.mMaxHeight = 2160;
       imageCompres.mMaxWidth = 2160;
       imageCompres.mMaxFileSize = 0xa00000;
       a.c = imageCompres;
    }
    public void a(){
       super();
    }
    public static final JsSelectMixMediasParams$ImageCompressConfig a(a p0){
       return a.c;
    }
    public static final JsSelectMixMediasParams$ImageCompressConfig b(a p0){
       return a.b;
    }
    public final void c(String p0,b p1){
       a.p(p0, "id");
       a.p(p1, "dispose");
       a.a.put(p0, p1);
    }
    public final void d(String p0){
       ConcurrentHashMap a;
       a.p(p0, "id");
       a = a.a;
       b uob = a.get(p0);
       if (uob != null) {
          uob.dispose();
       }
       a.remove(p0);
       return;
    }
    public final MessageEncodeConfig e(MessageEncodeConfig p0){
       if (p0 != null) {
       }else {
          p0 = l.d();
          a.o(p0, "PostPreferenceUtils.getMessageEncodeConfig\(\)");
       }
       return p0;
    }
    public final JsSelectMixMediasProgressResult f(JsSelectMixMediasResultBase p0,b$a p1){
       JsSelectMixMediasProgressResult jsSelectMixM = new JsSelectMixMediasProgressResult();
       jsSelectMixM.copyFrom(p0);
       jsSelectMixM.mProgress = p1.b * 0x3f000000;
       return jsSelectMixM;
    }
    public final void g(JsSelectMixMediasResultBase p0,JsSelectMixMediasStartResult$Data p1,g p2){
       JsSelectMixMediasStartResult jsSelectMixM = new JsSelectMixMediasStartResult();
       jsSelectMixM.copyFrom(p0);
       jsSelectMixM.mData = p1;
       p2.onSuccess(jsSelectMixM);
    }
    public final t h(JsSelectMixMediasParams$UploadTokenNeededParams p0,JsSelectMixMediasResultBase p1,AtomicReference p2,AtomicReference p3){
       a$d uod = new a$d(p0, p2);
       Objects.requireNonNull(UploadTokenHelper.a);
       a.p(uod, "function");
       t ot = t.create(new c1(uod)).subscribeOn(b.c()).observeOn(a.c());
       a.o(ot, "Observable.create<ApplyT¡­dSchedulers.mainThread\(\)\)");
       return ot.concatMap(new a$e(p3, p2, p1));
    }
}
