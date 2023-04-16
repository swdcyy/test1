package bs1.a;
import androidx.lifecycle.Observer;
import bs1.b;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.ViewController;
import hr1.a;
import jr1.a;
import cs1.b;
import as1.c;
import sq1.a;
import android.view.ViewGroup;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a implements Observer	// class@00040d
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       b a;
       a uoa;
       b b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a tb = this.b;
          a.o(p0, "it");
          int i = p0.intValue();
          Objects.requireNonNull(tb);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          b uob = b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, uob, "2")) {
             a = tb.a;
             if (a != null) {
                tb.b.o1(a);
             }
             Object[] objArray = null;
             if (i != 2) {
                uoa = PatchProxy.apply(objArray, tb, uob, "3");
                if (uoa != patchProxyRe) {
                }else {
                   uoa = new a();
                }
             }else {
                uoa = PatchProxy.apply(objArray, tb, uob, "4");
                if (uoa != patchProxyRe) {
                }else {
                   uoa = new b(tb.c, tb.d);
                }
             }
             tb.a = uoa;
             b = tb.b;
             b.E2(b.a(), uoa);
             b.d0(LiveLogTag.LIVE_LINE_PUZZLE, "LiveAudienceMultiLinePuzzleTagDataBinding.handleSwitchStatus", "puzzleLineChatStatus", Integer.valueOf(i), "currentTagViewController", tb.a);
          }
       }
       return;
    }
}
