package ce9.u;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.l;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import java.util.Objects;
import s5b.b;
import java.lang.String;

public final class u implements g	// class@0005d1
{
    public final l b;
    public final MagicEmojiEntrance c;

    public void u(l p0,MagicEmojiEntrance p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       b.D().E("MagicHandler", "[magicface][keypath][remote] ", "/rest/n/magicFace/page finish onMagicEntranceDataCallback", objArray);
       tb.j(this.c, p0);
    }
}
