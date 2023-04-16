package fe9.d;
import erd.g;
import fe9.f;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class d implements g	// class@002306
{
    public final f b;
    public final MagicEmoji$MagicFace c;

    public void d(f p0,MagicEmoji$MagicFace p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.x(tc);
       }
       return;
    }
}
