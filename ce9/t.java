package ce9.t;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.l;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import java.util.Objects;
import s5b.b;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;

public final class t implements g	// class@0005d0
{
    public final l b;
    public final MagicBusinessId c;

    public void t(l p0,MagicBusinessId p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       b.D().E("MagicHandler", "[magicface][keypath][remote] ", "/rest/n/magicFace/page finish "+this.c+" afterResume", objArray);
       tb.j(null, p0);
    }
}
