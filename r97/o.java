package r97.o;
import java.lang.Object;
import r97.o$a;
import r97.c$b;
import java.lang.String;
import com.google.gson.JsonObject;

public abstract class o	// class@002348
{

    public void o(){
       super();
    }
    public static o$a builder(){
       c$b uob = new c$b();
       uob.c("NATIVE");
       uob.g(false);
       uob.f(false);
       uob.h(0x3f800000);
       uob.j("");
       return uob;
    }
    public abstract String container();
    public abstract JsonObject feedLogCtx();
    public abstract String h5ExtraAttr();
    public abstract boolean needEncrypt();
    public abstract boolean realtime();
    public abstract float sampleRatio();
    public abstract String sdkName();
    public abstract String subBiz();
    public abstract o$a toBuilder();
}
