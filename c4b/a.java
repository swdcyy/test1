package c4b.a;
import ok.o;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class a implements o	// class@0004ab
{
    public final MagicEmoji$MagicFace b;

    public void a(MagicEmoji$MagicFace p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       return TextUtils.equals(this.b.mId, p0.mId);
    }
}
