package og.h0;
import erd.g;
import com.feature.post.bridge.util.PostVideoHelper$d;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Objects;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import lnc.a1;
import q87.c;

public final class h0 implements g	// class@0027a7
{
    public final PostVideoHelper$d b;

    public void h0(PostVideoHelper$d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h0 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       l.D().w("PostVideoHelper", "onMagicFaceFinishLoad diff is "+a1.o(tb.a), objArray);
       PostVideoHelper$d b = tb.b;
       if (b > 0) {
          tb.mMagicFaceTimeCost = a1.o(b);
       }
       return;
    }
}
