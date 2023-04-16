package hl9.z;
import erd.o;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.CommentResponse;
import com.yxcorp.gifshow.comment.utils.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.model.mix.QSubComment;
import java.util.ArrayList;
import la6.a;

public final class z implements o	// class@0026e4
{
    public final QComment b;

    public void z(QComment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       QComment mParent = this.b.mParent;
       if (PatchProxy.applyVoidTwoRefs(mParent, p0, null, d.class, "27")) {
       }else {
          QComment mSubComment = mParent.mSubComment;
          CommentResponse mCursor = p0.mCursor;
          CommentResponse mSubComments = p0.mSubComments;
          if (mSubComments != null) {
             Iterator iterator = mSubComments.iterator();
             while (iterator.hasNext()) {
                iterator.next().mParent = mParent;
             }
          }
          if (mSubComment.mComments == null) {
             mSubComment.mComments = new ArrayList();
          }
          mSubComment.addAll(mSubComments);
          d.o(mParent);
          mSubComment.mCursor = mCursor;
          if (!a.a(mCursor)) {
             mParent.mSubCommentCount = mParent.mSubComment.mComments.size();
          }
       }
       return p0;
    }
}
