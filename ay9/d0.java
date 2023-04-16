package ay9.d0;
import com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper$a;
import java.lang.Object;
import android.view.View;
import com.kuaishou.android.model.mix.TagItem;
import com.kwai.framework.model.feed.BaseFeed;
import ay9.h0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import com.yxcorp.gifshow.rich.RichTextTagUtil;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.l0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class d0 implements PhotoCommonHashTagHelper$a	// class@0002f0
{
    public static final d0 a;

    static {
       d0.a = new d0();
    }
    public void d0(){
       super();
    }
    public final void a(View p0,TagItem p1,BaseFeed p2){
       if (p1 == null || (!TextUtils.x(p1.mTag) && p2 != null)) {
          String str = RichTextTagUtil.a(p1.mTag);
          if (!TextUtils.x(str)) {
             u1.u(3, l0.c(""), l0.b(str));
          }
       }
       return;
    }
}
