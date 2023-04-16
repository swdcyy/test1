package com.kwai.widget.customer.mediapreview.widget.KwaiSnappyLinearLayoutManager$a;
import androidx.recyclerview.widget.o;
import com.kwai.widget.customer.mediapreview.widget.KwaiSnappyLinearLayoutManager;
import android.content.Context;
import android.graphics.PointF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.LinearLayoutManager;

public class KwaiSnappyLinearLayoutManager$a extends o	// class@00114c
{
    public final KwaiSnappyLinearLayoutManager q;

    public void KwaiSnappyLinearLayoutManager$a(KwaiSnappyLinearLayoutManager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public int B(){
       return 1;
    }
    public PointF a(int p0){
       KwaiSnappyLinearLayoutManager$a uoa = KwaiSnappyLinearLayoutManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.q.computeScrollVectorForPosition(p0);
    }
    public int z(){
       return 1;
    }
}
