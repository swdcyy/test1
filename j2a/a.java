package j2a.a;
import ok.x;
import java.lang.Object;
import j2a.b;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.config.InternalNegativeFeedbackConfig;
import java.lang.String;
import java.lang.reflect.Type;

public final class a implements x	// class@0028f3
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return a.t().getValue("feedBackEnableConfig", InternalNegativeFeedbackConfig.class, null);
    }
}
