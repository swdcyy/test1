package nfd.y2;
import java.util.concurrent.Callable;
import com.yxcorp.plugin.search.utils.f0;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback;
import java.lang.reflect.Type;
import x6d.a;

public final class y2 implements Callable	// class@001e28
{
    public final f0 b;

    public void y2(f0 p0){
       this.b = p0;
    }
    public final Object call(){
       y2 tb = this.b;
       Objects.requireNonNull(tb);
       f0 uof0 = PatchProxy.apply(null, tb, f0.class, "12");
       if (uof0 != PatchProxyResult.class) {
       }else if(tb.c == null){
          tb.c = a.b(FeedNegativeFeedback.class);
       }
       uof0 = tb.c;
       return uof0;
    }
}
