package nd9.b;
import com.yxcorp.gifshow.camera.record.base.b$a;
import nd9.l;
import java.lang.Object;
import java.util.Objects;
import ke9.b;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public final class b implements b$a	// class@003134
{
    public final l a;

    public void b(l p0){
       this.a = p0;
    }
    public final Object getData(){
       b ta = this.a;
       Objects.requireNonNull(ta);
       l e = ta.E;
       MagicEmojiEntrance mMagicFaceIn = (e != null)? e.mMagicFaceInfo: null;
       return new b(mMagicFaceIn, 4);
    }
}
