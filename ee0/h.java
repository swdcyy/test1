package ee0.h;
import ok.x;
import com.kuaishou.growth.pendant.core.manager.LogSampleRateManagerImpl;
import java.lang.Object;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.growth.pendant.core.manager.g;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import java.util.Collections;
import java.lang.String;

public final class h implements x	// class@0020f7
{
    public final LogSampleRateManagerImpl b;

    public void h(LogSampleRateManagerImpl p0){
       this.b = p0;
    }
    public final Object get(){
       h tb = this.b;
       Objects.requireNonNull(tb);
       return a.t().getValue("pendantLogSample", new g(tb).getType(), Collections.emptyMap());
    }
}
