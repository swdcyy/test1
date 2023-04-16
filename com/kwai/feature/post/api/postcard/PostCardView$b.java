package com.kwai.feature.post.api.postcard.PostCardView$b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.feature.post.api.postcard.PostCardView;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.List;
import lnc.a1;

public final class PostCardView$b extends RecyclerView$n	// class@001420
{
    public final PostCardView a;

    public void PostCardView$b(PostCardView p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, PostCardView$b.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       super.c(p0, p1, p2, p3);
       int childAdapter = p2.getChildAdapterPosition(p1);
       if ((this.a.c.isEmpty() ^ 0x01) && (childAdapter > 0 && childAdapter == (this.a.c.size() - 1))) {
          p0.right = a1.d(0x7f070267);
       }
    label_004e :
       return;
    }
}
