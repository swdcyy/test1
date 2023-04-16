package al5.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import android.widget.ImageView;
import al5.b;
import android.view.View$OnClickListener;
import java.util.List;
import yk5.a;
import java.util.Collection;
import vk5.d;
import al5.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import al5.e$a;
import androidx.recyclerview.widget.RecyclerView$n;
import al5.d;
import erd.g;
import crd.b;
import brd.t;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import al5.e$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import jl5.w;
import io.reactivex.subjects.PublishSubject;
import xk5.c;

public class e extends PresenterV2	// class@0000d0
{
    public EmotionPanelConfig p;
    public a q;
    public PublishSubject r;
    public PublishSubject s;
    public c t;
    public RecyclerView u;
    public ImageView v;
    public LinearLayoutManager w;
    public d x;
    public int y;
    public List z;

    public void e(){
       super();
       this.z = new ArrayList();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tp = this.p;
       int i = 0;
       if (tp != null && tp.isShowPackageBarClose()) {
          this.v.setVisibility(i);
          this.v.setOnClickListener(new b(this));
       }
       this.z.clear();
       this.z.addAll(this.q.b());
       tp = this.x;
       if (tp == null) {
          d uod = new d(this.z, this.p.isEnableGIFSearchTAB());
          this.x = uod;
          uod.g = new c(this);
          this.q.e = uod;
          LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext(), i, i);
          this.w = linearLayout;
          this.u.setLayoutManager(linearLayout);
          this.u.setAdapter(this.x);
          this.u.addItemDecoration(new e$a(this));
       }else {
          tp.J0(this.z);
       }
       this.X7(this.r.subscribe(new d(this)));
       this.u.getViewTreeObserver().addOnGlobalLayoutListener(new e$b(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.u = w.a(p0, 0x7f0a0cef);
       this.v = w.a(p0, 0x7f0a0789);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("EMOTION_PANEL_CONFIG");
       this.q = this.r8("EMOTION_PAGE_MODEL_PROVIDER");
       this.r = this.r8("EMOTION_PAGE_CHOOSE_TO_TAB_SUBJECT");
       this.s = this.r8("EMOTION_PAGE_CHOOSE_TO_VIEW_SUBJECT");
       this.t = this.t8("EMOTION_INTERACT_CALLBACK");
       return;
    }
}
