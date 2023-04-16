package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$f;
import erd.g;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import java.lang.Object;
import java.lang.Long;
import y8c.g;
import g9c.a;
import id5.v;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$PageAutoScrollLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import kotlin.jvm.internal.a;
import u2.i;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class SlideHorizontalAtlasPlayer$f implements g	// class@0008b9
{
    public final SlideHorizontalAtlasPlayer b;

    public void SlideHorizontalAtlasPlayer$f(SlideHorizontalAtlasPlayer p0){
       this.b = p0;
       super();
    }
    public final void a(Long p0){
       Object[] objArray;
       SlideHorizontalAtlasPlayer$f tb = this.b;
       tb.Q((long)(tb.b * (float)1000));
       tb = this.b;
       tb.setCurrentPosition((tb.getCurrentPosition() + 1));
       String str = "SlideAtlasRecyclerView";
       if (this.b.getCurrentPosition() < this.b.getAtlasAdapter().getItemCount()) {
          objArray = new Object[0];
          v.C().w(str, "autoScroll: 下一张 "+this.b.getCurrentPosition(), objArray);
          SlideHorizontalAtlasPlayer$f tb1 = this.b;
          this.b.getManager().smoothScrollToPosition(tb1, tb1.mState, tb1.getCurrentPosition());
       }else {
          SlideHorizontalAtlasPlayer i = this.b.i;
          if (i != null) {
             a.m(i);
             i.a();
          }
          this.b.setCurrentPosition(0);
          objArray = new Object[0];
          v.C().w(str, "autoScroll: 定位到首张 "+this.b.getCurrentPosition(), objArray);
          this.b.getManager().scrollToPosition(0);
       }
       SlideHorizontalAtlasPlayer.J(this.b, 0, 1, null);
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
