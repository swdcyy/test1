package gnd.d;
import u2.f;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class d implements f	// class@000f54
{
    public final SubtitleTextAdapter a;
    public final List b;

    public void d(SubtitleTextAdapter p0,List p1){
       a.p(p0, "mAdapter");
       a.p(p1, "mList");
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(int p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "3")) {
          return;
       }
       SubtitleTextAdapter.N0(this.a, this.b, 0, 0, 6, null);
       return;
    }
    public void b(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, d.class, "1")) {
          return;
       }
       d ta = this.a;
       p2 = this.b.get(p0);
       Objects.requireNonNull(ta);
       SubtitleTextAdapter subtitleText = SubtitleTextAdapter.class;
       if (!PatchProxy.isSupport(subtitleText) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p2, ta, subtitleText, "8")) {
          a.p(p2, "textElementData");
          ta.g.remove(p0);
          ta.g.add(p0, p2);
          ta.l0(p0);
       }
       return;
    }
    public void c(int p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "2")) {
          return;
       }
       SubtitleTextAdapter.N0(this.a, this.b, 0, 0, 6, null);
       return;
    }
    public void d(int p0,int p1){
    }
}
