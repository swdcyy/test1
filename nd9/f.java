package nd9.f;
import erd.g;
import nd9.l;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import com.yxcorp.gifshow.camera.record.base.d;
import pc9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import j8c.a;
import java.lang.String;
import w46.b;

public final class f implements g	// class@00313c
{
    public final l b;

    public void f(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       RxBus.f.b(new MagicEmojiEntrance());
       tb.d.m(new a(false, 1));
       a.D().e("face_cover", "getEntranceInfo", p0);
    }
}
