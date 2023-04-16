package kgd.d1;
import erd.g;
import com.yxcorp.plugin.setting.entries.holder.g0$a;
import java.lang.Object;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.setting.entries.holder.g0;
import com.yxcorp.plugin.setting.entries.holder.e0$a;
import com.yxcorp.plugin.setting.entries.holder.e0;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;

public final class d1 implements g	// class@001784
{
    public final g0$a b;
    public final boolean c;

    public void d1(g0$a p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0 = this.b;
       Objects.requireNonNull(p0);
       QCurrentUser.ME.setEnablePhotoGuest(this.c).commitChanges();
       j.d(p0.b.c.r, e0.b());
    }
}
