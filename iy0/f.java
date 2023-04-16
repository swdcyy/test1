package iy0.f;
import erd.g;
import iy0.g;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import com.kuaishou.live.core.show.comments.sendcomment.LiveCommentHotWords;
import java.util.Collection;
import ekd.q;
import iy0.c;
import ekd.q$b;
import java.util.List;

public final class f implements g	// class@0029b8
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       tb.P8();
       LiveUserStatusResponse mLiveComment = p0.mLiveCommentHotWords;
       if (mLiveComment != null && !q.f(mLiveComment.mCommentHotWords)) {
          q.c(p0.mLiveCommentHotWords.mCommentHotWords, c.a);
          tb.S8(p0.mLiveCommentHotWords.mCommentHotWords);
          tb.R8();
       }
       return;
    }
}
