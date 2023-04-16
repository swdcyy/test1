package b4d.a0$b;
import java.lang.Runnable;
import b4d.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.text.Regex;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.util.rx.RxBus;
import zu5.c;
import com.kwai.robust.PatchProxyResult;

public final class a0$b implements Runnable	// class@00034e
{
    public final a0 b;

    public void a0$b(a0 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a0$b.class, "1")) {
          return;
       }
       String str = new Regex("\(\\[[^]]+]\)|[ \\n]").replace(this.b.C, "");
       if (a.g(this.b.D, str)) {
          return;
       }
       this.b.D = str;
       Log.g("EmotionAtFloatPanelPresenter", "mSearchAtUserRunnable - mAtSearchText:"+this.b.C+",searchText:"+str+'.');
       RxBus f = RxBus.f;
       c uoc = PatchProxy.applyOneRefs(str, objArray, c.class, "2");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
          uoc.c = str;
       }
       f.b(uoc);
       return;
    }
}
