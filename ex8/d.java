package ex8.d;
import xw8.p0$c;
import androidx.lifecycle.ViewModel;
import ex8.d$a;
import nsd.u;
import ex8.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import com.yxcorp.gifshow.activity.share.model.PublishPageShareOption;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class d extends ViewModel implements p0$c	// class@002252
{
    public MutableLiveData b;
    public final b c;
    public static final d$a d;

    static {
       d.d = new d$a(null);
    }
    public void d(b p0){
       a.p(p0, "mRepo");
       super();
       this.c = p0;
       this.b = new MutableLiveData();
       int i = p0.b().indexOf(p0.a());
       if (i != -1) {
          Object[] objArray = new Object[0];
          a.b().w("ShareBarViewModel", "init index: "+i, objArray);
          this.b.setValue(Integer.valueOf(i));
       }
       return;
    }
    public void e1(UploadRequest$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       String str = "builder";
       a.p(p0, str);
       d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, b.class, "4")) {
          a.p(p0, str);
          p0.mShareOption = tc.b.getKwaiOp();
       }
       return;
    }
    public final int o0(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.c.b().get(p0).getIconResId();
    }
    public final int p0(){
       Object obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.b().size();
    }
}
