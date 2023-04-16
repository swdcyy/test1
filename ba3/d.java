package ba3.d;
import ck5.r;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.widget.EmojiTextView;
import java.lang.CharSequence;
import android.widget.TextView;

public final class d implements r	// class@000340
{
    public final SimpleCommentMessageViewController a;

    public void d(SimpleCommentMessageViewController p0){
       this.a = p0;
       super();
    }
    public void onInitSuccess(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.a.m+" setupEmojiSupport on init done");
       SimpleCommentMessageViewController.Y2(this.a).setText(SimpleCommentMessageViewController.Y2(this.a).getText());
       return;
    }
}
