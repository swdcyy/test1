package bl5.k;
import al5.a;
import uk5.a;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import bl5.k$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import el5.f;
import yk5.f;
import android.util.Pair;
import java.lang.Integer;
import bl5.j;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.ImageView;
import android.view.View;
import jl5.w;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView;
import io.reactivex.subjects.PublishSubject;

public class k extends a	// class@0004dd
{
    public EmotionLongClickRecyclerView p;
    public ImageView q;
    public int[] r;
    public f s;
    public EmotionPanelConfig t;
    public PublishSubject u;
    public static final int v;
    public static final int w;

    static {
       int a;
       int d = a.d;
       a = a.a;
       k.v = (((d - a) / 2) + a) + a1.d(0x7f07031b);
       k.w = ((d - a) / 2) + ((a * 2) / 3);
    }
    public void k(){
       super();
       int[] ointArray = new int[2];
       this.r = ointArray;
    }
    public void E8(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "3")) {
          return;
       }
       this.p.getViewTreeObserver().addOnGlobalLayoutListener(new k$a(this));
       if (PatchProxy.applyVoid(objArray, this, ok, "4") || (this.p.getAdapter() == null || (this.p.getLayoutManager() == null || (this.p.getLayoutManager() instanceof LinearLayoutManager && this.t.isShowRecordIndex())))) {
          Pair pair = f.b().a(this.s.b());
          if (pair == null || (pair.first.intValue() >= 0 && pair.first.intValue() < this.p.getAdapter().getItemCount())) {
             this.p.getLayoutManager().scrollToPositionWithOffset(pair.first.intValue(), pair.second.intValue());
          }
       }
    label_0090 :
       this.X7(this.u.subscribe(new j(this), Functions.d()));
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       k tt = this.t;
       if (tt != null && !tt.isShowEmojiPageDel()) {
          return;
       }
       this.q.getLocationOnScreen(this.r);
       int childCount = this.p.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.p.getChildAt(i);
          int[] ointArray = new int[2];
          childAt.getLocationOnScreen(ointArray);
          int i1 = ointArray[0] + a.d;
          k tr = this.r;
          if (i1 >= tr[0]) {
             i1 = 1;
             if (ointArray[i1] < tr[i1]) {
                int i2 = tr[i1] - ointArray[i1];
                int v = k.v;
                float f = 0x3f800000;
                if (i2 >= v) {
                   childAt.setAlpha(f);
                }else {
                   int w = k.w;
                   if (i2 > w) {
                      i2 = w - i2;
                      float f1 = (float)i2 * f;
                      w = w - v;
                      f1 = f1 / (float)w;
                      childAt.setAlpha(f1);
                   }else {
                      childAt.setAlpha(0);
                   }
                }
             }else {
                childAt.setAlpha(0);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.p = w.a(p0, 0x7f0a34da);
       this.q = w.a(p0, 0x7f0a0a80);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.s = this.r8("EMOTION_PAGE_MODEL");
       this.t = this.r8("EMOTION_PANEL_CONFIG");
       this.u = this.t8("EMOTION_PAGE_RESET_TOP_SUBJECT");
       return;
    }
}
