package ced.s;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.plugin.search.result.hashtag.presenters.h;
import java.lang.String;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.yxcorp.plugin.search.result.hashtag.presenters.b;

public class s extends AnimatorListenerAdapter	// class@00057d
{
    public final String a;
    public final h b;

    public void s(h p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.b.Y8();
       s tb = this.b;
       tb.R8(this.a, tb.G, tb.D, "HEAD_COLLECT_BUTTON");
       return;
    }
}
