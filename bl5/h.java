package bl5.h;
import al5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bl5.h$a;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView$c;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView;
import androidx.fragment.app.CommitSafeDialogFragment;
import java.lang.Exception;
import android.view.View;
import jl5.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;

public class h extends a	// class@0004d8
{
    public EmotionLongClickRecyclerView p;
    public EmojiPopupWindow q;
    public float r;
    public float s;
    public EmotionPanelConfig t;

    public void h(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.p.setOnLongClickPreviewListener(new h$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       this.S8();
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       h tq = this.q;
       if (tq != null) {
          try{
             tq.dismiss();
             this.q = null;
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.p = w.a(p0, 0x7f0a34da);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.t = this.r8("EMOTION_PANEL_CONFIG");
       return;
    }
}
