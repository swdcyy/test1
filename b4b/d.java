package b4b.d;
import ekd.q$b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.String;

public final class d implements q$b	// class@00035e
{
    public final MagicEmoji$MagicFace a;

    public void d(MagicEmoji$MagicFace p0){
       this.a = p0;
    }
    public final boolean a(Object p0){
       return ((p0.mId).equals(this.a.mId) ^ 0x01);
    }
}
