package ic9.t;
import erd.g;
import ic9.w;
import java.lang.Object;
import ic9.b;
import java.util.Objects;
import java.util.List;
import java.lang.String;
import ic9.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public final class t implements g	// class@002682
{
    public final w b;

    public void t(w p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       String str = "sample";
       if (tb.t(p0.a, str) != null && tb.t(p0.a, "magicface") == null) {
          QPhoto qPhoto = new QPhoto(tb.t(p0.a, str).b());
          if (!q.f(qPhoto.getMagicFaces())) {
             MagicEmoji$MagicFace magicFace = qPhoto.getMagicFaces().get(0).toMagicFace();
             a uoa = new a(magicFace.mId, magicFace, "magicface", true, 4);
             p0.a.add(tb);
             p0.c.add(tb);
          }
       }
       return;
    }
}
