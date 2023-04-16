package gs1.f;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding;
import as1.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import v91.b;
import gs1.e;
import java.lang.Runnable;
import e93.f;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class f implements Observer	// class@002574
{
    public final LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding b;
    public final b c;

    public void f(LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, f.class, "1")) {
       }else {
          a.o(obj, "answerStartAnimEnd");
          if (obj.booleanValue() && (this.b.a().b() && this.c.a() == 1)) {
             f.k("showPublishGuideBubble", new e(this), this.b, 5000);
          }
       label_003c :
          b.e0(LiveLogTag.LIVE_LINE_PUZZLE, "tryShowGuideBubble", "answerStartAnimEnd", obj, "canConsumer", Boolean.valueOf(this.b.a().b()), "puzzleRoleType", Integer.valueOf(this.c.a()));
       }
       return;
    }
}
