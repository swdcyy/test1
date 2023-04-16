package b4b.c;
import ekd.q$b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.String;

public final class c implements q$b	// class@00035d
{
    public final MagicEmoji$MagicFace a;

    public void c(MagicEmoji$MagicFace p0){
       this.a = p0;
    }
    public final boolean a(Object p0){
       return ((p0.mId).equals(this.a.mId) ^ 0x01);
    }
}
