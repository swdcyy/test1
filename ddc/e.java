package ddc.e;
import erd.g;
import com.yxcorp.gifshow.reminder.friend.data.a;
import java.lang.Object;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e implements g	// class@002190
{
    public final a b;

    public void e(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          this.b.m2(p0);
       }
       return;
    }
}
