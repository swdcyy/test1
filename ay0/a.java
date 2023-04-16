package ay0.a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.comments.editor.asr.LiveAsrInputRecordView;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.animation.AnimatorSet;

public class a extends AnimatorListenerAdapter	// class@0002c5
{
    public final LiveAsrInputRecordView a;

    public void a(LiveAsrInputRecordView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, a.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ASR_INPUT, "AsrAnim | onAnimationEnd");
       LiveAsrInputRecordView h = this.a.h;
       if (h != null) {
          h.removeAllListeners();
       }
       this.a.a();
       return;
    }
}
