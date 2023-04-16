package com.kwai.feature.post.api.postcard.PostCardView$d;
import erd.g;
import com.kwai.feature.post.api.postcard.PostCardView;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import k46.b;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;

public final class PostCardView$d implements g	// class@001422
{
    public final PostCardView b;

    public void PostCardView$d(PostCardView p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostCardView$d.class, "1")) {
       }else {
          String str = "PostCardView";
          if (!q.f(p0)) {
             Object[] objArray = new Object[0];
             p3.D().w(str, "combineData subscribe: mItems Size =  "+p0.size(), objArray);
             a.o(p0, "it");
             this.b.c = p0;
             p0 = this.b;
             p0.e.K0(p0.c);
             this.b.setVisibility(0);
             this.b.getMRecyclerView().setAdapter(this.b.e);
          }else {
             Object[] objArray1 = new Object[0];
             p3.D().w(str, "data is empty, hide postCard", objArray1);
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, PostCardView.class, "9")) {
                ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
                a.o(layoutParams, "this.layoutParams");
                layoutParams.height = 0;
                layoutParams.width = 0;
                p0.setVisibility(8);
             }
          }
       }
       return;
    }
}
