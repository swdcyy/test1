package jgd.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.view.View;
import k2b.e0;
import java.lang.String;
import java.lang.Boolean;
import sgd.b;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import tac.b;

public final class a implements View$OnClickListener	// class@0016dd
{
    public final GifshowActivity b;

    public void a(GifshowActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       b.e(tb, "REMOVED_FRIENDS", null);
       b.a(-1578665399).e(tb);
    }
}
