package com.yxcorp.gifshow.v3.editor.cover.recommend.text.RecommendCoverTextViewHolder$mTextView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RecommendCoverTextViewHolder$mTextView$2 extends Lambda implements a	// class@000ecd
{
    public final View $itemView;

    public void RecommendCoverTextViewHolder$mTextView$2(View p0){
       this.$itemView = p0;
       super(0);
    }
    public final TextView invoke(){
       Object obj = PatchProxy.apply(null, this, RecommendCoverTextViewHolder$mTextView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$itemView.findViewById(0x7f0a0a09);
    }
    public Object invoke(){
       return this.invoke();
    }
}
