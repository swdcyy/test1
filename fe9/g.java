package fe9.g;
import erd.g;
import fe9.h;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import r5b.e;

public final class g implements g	// class@002309
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && !PatchProxy.applyVoid(null, tb, h.class, "11")) {
          e.d(tb.b.mMagicFaceInfo, 3);
       }
       return;
    }
}
