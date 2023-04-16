package aja.d;
import pa5.a;
import aja.j;
import java.lang.Object;
import org.json.JSONObject;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import java.lang.String;
import org.json.JSONException;

public final class d implements a	// class@00008a
{
    public final j a;

    public void d(j p0){
       this.a = p0;
    }
    public final void a(JSONObject p0,BaseFeed p1,boolean p2){
       j j = this.a.j;
       if (j instanceof HomeFollowFragment) {
          try{
             String str = (j.ki())? "1": "0";
             p0.put("is_friends_tab", str);
          }catch(org.json.JSONException e1){
             e1.printStackTrace();
          }
       }
    }
}
