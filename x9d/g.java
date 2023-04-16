package x9d.g;
import ucd.n;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.Typeface;
import android.view.View;
import nfd.o3;
import android.view.ViewStub;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.widget.FrameLayout;
import java.lang.Throwable;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import x9d.g$a;
import android.view.View$OnClickListener;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.entity.SearchItem;

public class g extends n	// class@00435d
{
    public RecyclerView p;
    public ViewStub q;
    public KwaiEmptyStateView r;
    public ViewStub s;
    public KwaiEmptyStateView t;
    public KwaiLoadingView u;
    public View v;
    public SearchItem w;
    public BaseFragment x;

    public void g(){
       super();
    }
    public static void b9(TextView p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, og, "8")) {
          return;
       }
       if (p1) {
          p0.setSelected(true);
          p0.setTextColor(ContextCompat.getColor(p0.getContext(), R.color.arg_RES_7f0607de));
          p0.setTypeface(Typeface.DEFAULT_BOLD);
          p0.setBackgroundResource(R.drawable.arg_RES_7f082498);
       }else {
          p0.setSelected(false);
          p0.setTypeface(Typeface.DEFAULT);
          p0.setTextColor(ContextCompat.getColor(p0.getContext(), R.color.arg_RES_7f0607cf));
          p0.setBackgroundResource(R.drawable.arg_RES_7f082499);
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       o3.H(this.u, 8);
       return;
    }
    public void W8(){
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       if (this.t == null) {
          this.t = this.s.inflate();
       }
       this.t.setVisibility(0);
       this.t.d(0);
       this.t.g(R.string.arg_RES_7f104489);
       o3.H(this.v, 4);
       o3.H(this.r, 8);
       return;
    }
    public void Y8(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "7")) {
          return;
       }
       if (this.r == null) {
          this.r = this.q.inflate();
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.p(new g$a(this));
          uoa.a(this.r);
       }
       this.r.setVisibility(0);
       this.r.setRetryBtnVisibility(0);
       o3.H(this.u, 8);
       o3.H(this.v, 4);
       o3.H(this.r, 0);
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       o3.H(this.v, 4);
       o3.H(this.r, 8);
       o3.H(this.t, 8);
       o3.H(this.u, 0);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       o3.H(this.v, 0);
       o3.H(this.r, 8);
       o3.H(this.t, 8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a06d2);
       this.u = m1.f(p0, 0x7f0a37aa);
       this.q = m1.f(p0, 0x7f0a3787);
       this.s = m1.f(p0, 0x7f0a3786);
       this.v = m1.f(p0, 0x7f0a34e0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.x = this.r8("FRAGMENT");
       this.w = this.q8(SearchItem.class);
       return;
    }
}
