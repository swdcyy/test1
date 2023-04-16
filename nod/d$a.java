package nod.d$a;
import pb9.q;
import nod.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import voc.n;
import com.yxcrop.gifshow.v3.editor.text_v2.action.RecoTextFetchActionV3;
import kotlin.jvm.internal.a;
import xvc.b;

public final class d$a implements q	// class@001e9b
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public final void a(String p0,long p1){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3", "mFrameUploadResultListener sessionId:"+p0+", editDelayMs:"+p1, objArray);
       a.o(p0, "sessionId");
       this.a.T().t0(new RecoTextFetchActionV3(p0, p1));
       return;
    }
}
