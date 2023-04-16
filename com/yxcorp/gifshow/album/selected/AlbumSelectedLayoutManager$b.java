package com.yxcorp.gifshow.album.selected.AlbumSelectedLayoutManager$b;
import androidx.recyclerview.widget.o;
import com.yxcorp.gifshow.album.selected.AlbumSelectedLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.graphics.PointF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.util.DisplayMetrics;
import java.lang.Number;
import kotlin.jvm.internal.a;

public final class AlbumSelectedLayoutManager$b extends o	// class@001abe
{
    public final AlbumSelectedLayoutManager q;
    public final RecyclerView r;

    public void AlbumSelectedLayoutManager$b(AlbumSelectedLayoutManager p0,RecyclerView p1,Context p2){
       this.q = p0;
       this.r = p1;
       super(p2);
    }
    public PointF a(int p0){
       AlbumSelectedLayoutManager$b uob = AlbumSelectedLayoutManager$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.q.computeScrollVectorForPosition(p0);
    }
    public float v(DisplayMetrics p0){
       float f;
       AlbumSelectedLayoutManager obj = PatchProxy.applyOneRefs(p0, this, AlbumSelectedLayoutManager$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       a.q(p0, "displayMetrics");
       super.v(p0);
       obj = this.q.r;
       if (!obj) {
          f = super.v(p0);
       }
       return f;
    }
}
