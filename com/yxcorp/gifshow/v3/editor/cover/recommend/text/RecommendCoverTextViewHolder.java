package com.yxcorp.gifshow.v3.editor.cover.recommend.text.RecommendCoverTextViewHolder;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import upc.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.cover.recommend.text.RecommendCoverTextViewHolder$mTextView$2;
import msd.a;
import qrd.p;
import qrd.s;
import kotlin.Pair;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.v3.editor.cover.recommend.text.RecommendCoverTextViewHolder$a;
import android.view.View$OnClickListener;

public final class RecommendCoverTextViewHolder extends RecyclerView$ViewHolder	// class@000ece
{
    public final p a;
    public final a b;

    public void RecommendCoverTextViewHolder(a p0,View p1){
       a.p(p0, "mListener");
       a.p(p1, "itemView");
       super(p1);
       this.b = p0;
       this.a = s.c(new RecommendCoverTextViewHolder$mTextView$2(p1));
    }
    public final void a(Pair p0){
       RecommendCoverTextViewHolder recommendCov = RecommendCoverTextViewHolder.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, recommendCov, "2")) {
          return;
       }
       a.p(p0, "item");
       TextView textView = PatchProxy.apply(null, this, recommendCov, "1");
       if (textView == PatchProxyResult.class) {
          textView = this.a.getValue();
       }
       a.o(textView, "mTextView");
       textView.setText(p0.getFirst());
       this.itemView.setOnClickListener(new RecommendCoverTextViewHolder$a(this, p0));
       return;
    }
}
