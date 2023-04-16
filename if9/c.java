package if9.c;
import if9.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;

public final class c extends a	// class@002809
{
    public MagicEmoji$MagicFace magicFace;

    public void c(MagicEmoji$MagicFace p0){
       a.p(p0, "magicFace");
       super();
       this.magicFace = p0;
    }
    public String a(){
       SimpleMagicFace mId;
       c tmagicFace = this.magicFace;
       if (tmagicFace != null) {
          mId = tmagicFace.mId;
          if (mId != null) {
          label_000b :
             return mId;
          }
       }
       mId = "";
       goto label_000b ;
    }
    public String b(){
       SimpleMagicFace mName;
       c tmagicFace = this.magicFace;
       if (tmagicFace != null) {
          mName = tmagicFace.mName;
          if (mName != null) {
          label_000b :
             return mName;
          }
       }
       mName = "";
       goto label_000b ;
    }
    public int c(){
       return 1;
    }
}
