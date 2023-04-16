package b4b.f;
import ekd.q$b;
import java.util.Set;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;

public final class f implements q$b	// class@000360
{
    public final Set a;

    public void f(Set p0){
       this.a = p0;
    }
    public final boolean a(Object p0){
       return (this.a.contains(p0.mId) ^ 0x01);
    }
}
