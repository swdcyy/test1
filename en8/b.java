package en8.b;
import com.stage.LiveLoadingStage;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Enum;

public final class b	// class@002217
{

    public static final LiveLoadingStage a(LiveLoadingStage p0){
       a.p(p0, "$this$nextStage");
       int i = p0.ordinal() + 1;
       if (i >= LiveLoadingStage.values().length) {
          return null;
       }
       return LiveLoadingStage.values()[i];
    }
}
