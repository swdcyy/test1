package g14.e;
import android.app.Activity;
import java.lang.String;
import com.google.gson.JsonObject;
import g14.a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;

public interface abstract e	// class@002974
{

    boolean a(Activity p0,String p1,JsonObject p2,a p3,User p4,BaseFeed p5);
    String getLiveId();
}
