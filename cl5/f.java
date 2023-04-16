package cl5.f;
import al5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cl5.f$a;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView$c;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView;
import android.view.View;
import jl5.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yk5.f;
import xk5.c;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import java.lang.Integer;

public class f extends a	// class@0006f3
{
    public EmotionLongClickRecyclerView p;
    public CommonEmotionPopupWindow q;
    public float r;
    public f s;
    public c t;
    public EmotionPanelConfig u;
    public int v;

    public void f(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.p.setOnLongClickPreviewListener(new f$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.p = w.a(p0, 0x7f0a34da);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.s = this.r8("EMOTION_PAGE_MODEL");
       this.t = this.t8("EMOTION_INTERACT_CALLBACK");
       this.u = this.r8("EMOTION_PANEL_CONFIG");
       this.v = this.r8("EMOTION_PANEL_WIDTH").intValue();
       return;
    }
}
