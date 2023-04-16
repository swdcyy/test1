package bed.i;
import erd.g;
import bed.y;
import java.lang.String;
import java.lang.Object;
import hn6.c;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import nm6.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;

public final class i implements g	// class@00040e
{
    public final y b;
    public final String c;
    public final String d;

    public void i(y p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       i td = this.d;
       y a = tb.a;
       TagInfo mInitiatorPh = tb.b.mInitiatorPhoto;
       d uod = new d();
       uod.p(true);
       uod.m(true);
       Bundle uBundle = PatchProxy.applyTwoRefs(tc, td, tb, y.class, "9");
       if (uBundle != PatchProxyResult.class) {
       }else {
          uBundle = new Bundle();
          String str = tb.k();
          if (!TextUtils.x(str)) {
             uBundle.putString("activity", str);
          }
          if (tc != null) {
             uBundle.putString("tag", tc);
          }
          if (!TextUtils.x(tb.h)) {
             uBundle.putString("photo_task_id", tb.h);
          }
          if (!TextUtils.x(td)) {
             uBundle.putString("topicSource", td);
          }
       }
       uod.n(uBundle);
       p0.vd(a, mInitiatorPh, uod);
       return;
    }
}
