package ce9.d0;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import s5b.b;
import java.lang.String;
import w46.b;
import j4b.i;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.List;
import m4b.c;

public final class d0 implements g	// class@0005bb
{
    public final l b;

    public void d0(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       b.D().e("MagicHandler", "get first magicface page failed", p0);
       tb.p.D(new i(null, null, null));
    }
}
