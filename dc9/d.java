package dc9.d;
import ok.o;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import ac9.g;
import java.lang.String;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class d implements o	// class@0020b8
{
    public final MagicEmoji$MagicFace b;

    public void d(MagicEmoji$MagicFace p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       return TextUtils.n(p0.getTemplateId(), this.b.mId);
    }
}
