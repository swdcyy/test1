package h33.b;
import n3d.a;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class b implements a	// class@002c1d
{
    public final y b;
    public final SlipSwitchButton c;

    public void b(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       if (p1 != -1) {
          tb.f(tc);
       }else {
          QCurrentUser.ME.setNotRecommendToQQFriend(true).commitChanges();
       }
       return;
    }
}
