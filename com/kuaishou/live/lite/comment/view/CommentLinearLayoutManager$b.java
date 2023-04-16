package com.kuaishou.live.lite.comment.view.CommentLinearLayoutManager$b;
import androidx.recyclerview.widget.o;
import com.kuaishou.live.lite.comment.view.CommentLinearLayoutManager;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import usd.q;
import android.graphics.PointF;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class CommentLinearLayoutManager$b extends o	// class@000811
{
    public final CommentLinearLayoutManager q;

    public void CommentLinearLayoutManager$b(CommentLinearLayoutManager p0,Context p1){
       a.p(p1, "context");
       this.q = p0;
       super(p1);
    }
    public final int D(int p0){
       CommentLinearLayoutManager obj;
       CommentLinearLayoutManager$b uob = CommentLinearLayoutManager$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0) {
          return 0;
       }else {
          obj = this.q.s;
          p0 = (obj == null)? super.x(p0): (p0 * 1000) / obj;
          return q.n(p0, 10);
       }
    }
    public PointF a(int p0){
       CommentLinearLayoutManager$b uob = CommentLinearLayoutManager$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.q.computeScrollVectorForPosition(p0);
    }
    public int w(int p0){
       CommentLinearLayoutManager$b uob = CommentLinearLayoutManager$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.D(p0);
    }
    public int x(int p0){
       CommentLinearLayoutManager$b uob = CommentLinearLayoutManager$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.D(p0);
    }
}
