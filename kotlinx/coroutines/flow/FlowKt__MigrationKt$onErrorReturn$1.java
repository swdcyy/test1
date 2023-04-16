package kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Boolean;

public final class FlowKt__MigrationKt$onErrorReturn$1 extends Lambda implements l	// class@001a6d
{
    public static final FlowKt__MigrationKt$onErrorReturn$1 INSTANCE;

    static {
       FlowKt__MigrationKt$onErrorReturn$1.INSTANCE = new FlowKt__MigrationKt$onErrorReturn$1();
    }
    public void FlowKt__MigrationKt$onErrorReturn$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Throwable p0){
       return true;
    }
}
