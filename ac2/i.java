package ac2.i;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import android.view.View;
import yb2.i;
import com.kwai.framework.model.user.UserProfile;
import lu7.f;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import p91.m;

public final class i implements View$OnClickListener	// class@0000b3
{
    public final c b;
    public final User c;

    public void i(c p0,User p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       this.b.v.a.w0(f.o(this.c), LiveStreamClickType.LUCKY_STAR, 0, true, 108);
    }
}
