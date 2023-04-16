package b53.a;
import erd.g;
import com.kuaishou.live.gzone.barrage.BarrageView;
import java.lang.Object;
import ne1.k$a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.View;
import com.kuaishou.live.gzone.barrage.BarrageTextView;
import com.kuaishou.live.common.core.component.comments.model.LiveGzoneInteractiveCommentMessage;
import android.text.SpannableStringBuilder;
import fz1.b;
import java.lang.CharSequence;
import com.lsjwzh.widget.text.FastTextView;

public final class a implements g	// class@000300
{
    public final BarrageView b;

    public void a(BarrageView p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, BarrageView.class, "6")) {
       }else if(tb.getVisibility()){
          int childCount = tb.getChildCount();
          int i = 0;
          while (i < childCount) {
             try{
                View childAt = tb.getChildAt(i);
                if (childAt instanceof BarrageTextView) {
                   int i1 = 0x7f0a15dd;
                   if (childAt.getTag(i1) != null) {
                      childAt.setText(b.a(childAt.getTag(i1), tb.r, tb.s));
                   }
                }
                i = i + 1;
             }catch(java.lang.Exception e0){
             }
          }
       }
       return;
    }
}
