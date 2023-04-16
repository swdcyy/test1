package com.yxcorp.gifshow.detail.view.CommentGuessView$a;
import ek9.n1;
import com.yxcorp.gifshow.detail.view.CommentGuessView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.yxcorp.gifshow.detail.view.CommentGuessView$b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.model.comment.CommentGuessSearch;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class CommentGuessView$a extends n1	// class@001a3b
{
    public final CommentGuessView f;

    public void CommentGuessView$a(CommentGuessView p0){
       this.f = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentGuessView$a.class, "1")) {
          return;
       }
       CommentGuessView$a tf = this.f;
       if (tf.d != null) {
          CommentGuessView e = tf.e;
          if (e != null) {
             e.onReportClickEvent("SEARCH_KEYWORD_COMMENT", tf.f);
             tf = this.f;
             e = tf.e;
             CommentGuessView d = tf.d;
             Objects.requireNonNull(tf);
             CommentGuessSearch uCommentGues = PatchProxy.applyOneRefs(d, tf, CommentGuessView.class, "4");
             if (uCommentGues != PatchProxyResult.class) {
             }else if(!TextUtils.x(d.mSearchWordUrl)){
                uCommentGues = d.mSearchWordUrl;
             }else {
                uCommentGues = "kwai://search?keyword="+d.mQueryName+"&source=search_entrance_comment_trending";
             }
             e.a(uCommentGues);
          }
       }
       return;
    }
}
