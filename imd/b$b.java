package imd.b$b;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.InteractStickerInfo;

public final class b$b implements h	// class@001021
{
    public static final b$b b;

    static {
       b$b.b = new b$b();
    }
    public void b$b(){
       super();
    }
    public Object apply(Object p0){
       if (p0 != null) {
          p0 = p0.mInteractStickerInfo;
          if (p0 != null) {
             p0 = p0.challengeId;
             if (p0 != null) {
             label_000f :
                return p0;
             }
          }
       }
       p0 = "0";
       goto label_000f ;
    }
}
