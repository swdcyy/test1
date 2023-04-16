package j8a.z;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import uw9.q3;
import java.lang.String;
import android.content.SharedPreferences;

public final class z implements g	// class@002983
{
    public final h b;

    public void z(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z tb = this.b;
       Objects.requireNonNull(tb);
       p0 = (QCurrentUser.ME.isLogined() && p0.isFollowingOrFollowRequesting())? 1: null;
       if (p0 && !q3.a.getBoolean("pyml_has_show_guide", false)) {
          tb.a9();
       }
       return;
    }
}
