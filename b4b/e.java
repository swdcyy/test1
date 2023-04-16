package b4b.e;
import ekd.q$b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class e implements q$b	// class@00035f
{
    public final MagicEmoji$MagicFace a;

    public void e(MagicEmoji$MagicFace p0){
       this.a = p0;
    }
    public final boolean a(Object p0){
       e ta = this.a;
       boolean b = (!(p0.mId).equals(ta.mId) || !TextUtils.n(p0.mChildId, ta.mChildId))? true: false;
       return b;
    }
}
