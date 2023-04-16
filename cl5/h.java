package cl5.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import el5.f;
import yk5.f;
import android.util.Pair;
import java.lang.Integer;
import cl5.h$a;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.View;
import jl5.w;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView;

public class h extends PresenterV2	// class@0006f6
{
    public EmotionLongClickRecyclerView p;
    public f q;
    public EmotionPanelConfig r;

    public void h(){
       super();
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "4")) {
          return;
       }
       if (PatchProxy.applyVoid(objArray, this, oh, "5") || (this.p.getAdapter() == null || (this.p.getLayoutManager() == null || (this.p.getLayoutManager() instanceof LinearLayoutManager && this.r.isShowRecordIndex())))) {
          Pair pair = f.b().a(this.q.b());
          if (pair == null || (pair.first.intValue() >= 0 && pair.first.intValue() < this.p.getAdapter().getItemCount())) {
             this.p.getLayoutManager().scrollToPositionWithOffset(pair.first.intValue(), pair.second.intValue());
          }
       }
    label_0082 :
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.p.addOnScrollListener(new h$a(this));
       return;
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
       this.q = this.r8("EMOTION_PAGE_MODEL");
       this.r = this.r8("EMOTION_PANEL_CONFIG");
       return;
    }
}
