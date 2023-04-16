package ee9.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class c	// class@002124
{
    public boolean a;
    public final MagicEmoji$MagicFace b;
    public final int c;
    public final boolean d;
    public final MagicEmojiEntrance e;

    public void c(MagicEmoji$MagicFace p0,int p1,boolean p2,MagicEmojiEntrance p3){
       a.p(p0, "magicFace");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final boolean a(){
       return this.d;
    }
    public final MagicEmojiEntrance b(){
       return this.e;
    }
}
