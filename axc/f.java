package axc.f;
import com.yxcorp.gifshow.widget.trimvideo.AdvHorizontalScroller$b;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.HorizontalScrollView;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import com.yxcorp.gifshow.widget.adv.ITimelineView$b;
import java.lang.Math;
import android.graphics.Canvas;
import android.widget.LinearLayout;

public class f implements AdvHorizontalScroller$b	// class@0002e8
{
    public final EditorTimeLineView a;

    public void f(EditorTimeLineView p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, f.class, "2")) {
          return;
       }
       f ta = this.a;
       ta.t = ta.getScrollX();
       this.a.m(false);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       EditorTimeLineView j = this.a.j;
       if (j != null) {
          ITimelineView$d g = j.g;
          if (g != null && !g.a()) {
             f ta = this.a;
             EditorTimeLineView uEditorTimeL = null;
             if (ta.j.o - uEditorTimeL > 0) {
                f ta1 = this.a;
                if (!((float)ta.getScrollX() % (ta1.j.o * (float)ta1.m)) - uEditorTimeL) {
                   ta1 = this.a;
                   if ((float)ta1.getScrollX() - (ta1.j.o * (float)ta1.m)) {
                   label_0077 :
                      ta = this.a;
                      if (ta.t != ta.getScrollX()) {
                         this.a.m(true);
                      }
                      return;
                   }
                }
                ta1 = this.a;
                ta1 = this.a;
                ta1.j((double)(int)((float)Math.round(((float)this.a.getScrollX() / (ta1.j.o * (float)ta1.m))) * ta1.j.o), false);
                return;
             }else {
                goto label_0077 ;
             }
          }else {
             goto label_0077 ;
          }
       }else {
          goto label_0077 ;
       }
    }
    public void c(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.a.g.invalidate();
       return;
    }
}
