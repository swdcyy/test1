package com.kuaishou.live.core.show.topic.audience.u$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.core.show.topic.audience.u;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailHeaderView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Math;
import android.widget.TextView;

public class u$a extends RecyclerView$r	// class@00121c
{
    public final u a;

    public void u$a(u p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(u$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, u$a.class, "1")) {
          return;
       }
       u$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, u.class, "5")) {
          View childAt = ta.r.getChildAt(0);
          if (childAt instanceof LiveAudienceTopicDetailHeaderView) {
             float f = 0x3f000000;
             if (!ta.r.i0()) {
                p2 = childAt.getHeight();
                int i = Math.abs(childAt.getTop());
                int i1 = p2 * 2;
                if (i > (i1 / 3)) {
                   ta.p.setAlpha(0x3f800000);
                   ta.q.setAlpha(0x3f800000);
                   childAt.setAlpha(f);
                }else {
                   float f1 = (float)(i * 3) / (float)i1;
                   ta.p.setAlpha(f1);
                   ta.q.setAlpha(f1);
                   childAt.setAlpha((((float)(i * -3) / (float)(p2 * 4)) + 0x3f800000));
                }
             }else {
                ta.p.setAlpha(0x3f800000);
                ta.q.setAlpha(0x3f800000);
                childAt.setAlpha(f);
             }
          }
       }
       return;
    }
}
