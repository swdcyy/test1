package led.b;
import led.f;
import y8c.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.result.SubTabItem;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import e7d.a;
import com.yxcorp.plugin.search.SearchSource;
import gbd.u;
import e7d.h;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zf6.j;
import android.widget.TextView;
import android.text.TextPaint;
import nfd.t0;
import zf6.k;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.PorterDuff$Mode;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import led.a;
import android.view.View$OnClickListener;
import ucd.n;

public class b extends f	// class@001c1a
{
    public KwaiImageView x;

    public void b(g p0){
       super(p0);
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uob, "6") && !q.f(this.q.mCoverUrls)) {
          this.x.P(this.q.mCoverUrls);
       }
       return;
    }
    public void V8(SubTabItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       super.V8(p0);
       this.v.Ac().setRefreshing(false);
       f tv = this.v;
       tv.ei(tv.b1.f(), SearchSource.SEARCH_RELATED_TAB, p0.mRequestId);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       u ou = this.u.F();
       if (ou == null) {
          return;
       }
       if (this.q != null && ou.a() == this.q) {
          this.Y8();
          this.m8().setEnabled(false);
       }else {
          this.a9();
          this.m8().setEnabled(true);
       }
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.m8().setSelected(true);
       f tp = this.p;
       tp.setTextColor(j.d(tp, R.color.arg_RES_7f06161f));
       this.p.getPaint().setFakeBoldText(true);
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       f tp = this.p;
       tp.setPadding(tp.getPaddingLeft(), t0.d, this.p.getPaddingRight(), t0.h);
       if (k.d()) {
          this.x.setColorFilter(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061c10), PorterDuff$Mode.SRC_ATOP);
       }
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.m8().setSelected(false);
       f tp = this.p;
       tp.setTextColor(j.d(tp, R.color.arg_RES_7f0607cf));
       this.p.getPaint().setFakeBoldText(false);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3c67);
       this.x = m1.f(p0, 0x7f0a3c86);
       this.P8(this.m8(), new a(this));
       return;
    }
}
