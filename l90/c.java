package l90.c;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Integer;
import u80.d;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import i26.a;
import tkd.b;
import tkd.d;
import u80.j;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;

public final class c implements g	// class@00252f
{
    public final GifshowActivity b;
    public final MutableLiveData c;

    public void c(GifshowActivity p0,MutableLiveData p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a uoa;
       c tb = this.b;
       c tc = this.c;
       int i = p0.getFirst().intValue();
       p0 = p0.getSecond();
       if (i == 100) {
          if (p0 == null) {
             p0 = new IllegalStateException("launchKuaiShanByTemplateId: progress is 100 but project is null");
             PostUtils.D("KuaiShanPluginImpl", "launchKuaiShanByTemplateId failed", p0);
             uoa = new a(-1, p0);
          }else {
             d.a(-215111236).pC(tb, p0, null, false);
             uoa = new a(i, null);
          }
       }else {
          uoa = new a(i, null);
       }
       tc.setValue(uoa);
       return;
    }
}
