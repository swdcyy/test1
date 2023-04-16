package jb1.w;
import android.view.View$OnClickListener;
import jb1.y$a;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jb1.y;
import tkd.b;
import tkd.d;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y8c.r;
import nl8.p;
import com.yxcorp.gifshow.model.BlockUser;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;

public final class w implements View$OnClickListener	// class@002b26
{
    public final y$a b;

    public void w(y$a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, y$a.class, "4")) {
       }else if(tb.k.w != null){
          d.a(-1718536792).Nl(tb.C(), ProfileStartParam.l(tb.t().mBlockedUser), 256);
       }
       return;
    }
}
