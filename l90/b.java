package l90.b;
import erd.g;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import i26.a;

public final class b implements g	// class@00252e
{
    public final MutableLiveData b;

    public void b(MutableLiveData p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       PostUtils.D("KuaiShanPluginImpl", "launchKuaiShanByTemplateId failed", p0);
       this.b.setValue(new a(-1, p0));
    }
}
