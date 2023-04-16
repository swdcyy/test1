package k9a.c$c;
import ok.h;
import k9a.c;
import java.lang.Object;
import com.yxcorp.gifshow.model.config.ActivityInfo;

public class c$c implements h	// class@002c20
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       if (p0 != null) {
          ActivityInfo mTagType = p0.mTagType;
          if (mTagType == null || mTagType == 1) {
             p0 = p0.mKeyword;
          label_000f :
             return p0;
          }
       }
       p0 = null;
       goto label_000f ;
    }
}
