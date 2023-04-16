package hh4.d;
import ei4.k;
import androidx.fragment.app.Fragment;
import hh4.d$a;
import hh4.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v04.a;
import jh4.j;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.merchant.transaction.base.page2.TransactionViewPager2;
import ah4.a;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import ok0.i;
import hh4.e;
import hh4.b;
import androidx.lifecycle.Observer;
import ok0.n;
import androidx.viewpager2.widget.ViewPager2$h;
import zf4.b;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import rk0.b;
import vf4.a;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse$HeadInfo;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.base.logger.ItemShowDelegate$ShowState;
import vs5.e;
import org.greenrobot.eventbus.a;
import de4.c;
import java.util.List;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import androidx.collection.ArrayMap;
import nh4.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kg4.a;
import java.lang.StringBuilder;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import g9c.a;
import android.view.View;
import ekd.m1;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.bottomsheet.widget.DetailPanelViewPager2;
import android.widget.FrameLayout$LayoutParams;
import androidx.fragment.app.FragmentActivity;
import android.view.WindowManager;
import android.app.Activity;
import android.view.Display;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import xf4.c;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;

public abstract class d extends k	// class@002bb2
{
    public TextView A;
    public e B;
    public final ViewPager2$h C;
    public final b D;
    public j x;
    public DetailPanelViewPager2 y;
    public j z;

    public void d(Fragment p0){
       super(p0);
       this.C = new d$a(this);
       this.D = new c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       super.E8();
       j oj = this.W8();
       this.z = oj;
       this.y.setAdapter(oj);
       a tu = this.u;
       this.z.x = tu;
       this.q1(this.A, tu.k);
       this.J0(this.B.l, new b(this));
       this.y.f(this.C);
       this.Z8(this.u.i);
       this.x.p0("sku", this.D);
       a uoa = a.q0(this.R8());
       tu = this.u.d;
       boolean b = true;
       if (tu == null || tu.mPreviewType != b) {
          b = false;
       }
       Objects.requireNonNull(uoa);
       tu = a.class;
       if (!PatchProxy.isSupport(tu) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uoa, tu, "4")) {
          uoa.d = Boolean.valueOf(b);
       }
       return;
    }
    public void G3(ItemShowDelegate$ShowState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.G3(p0);
       if (p0 == ItemShowDelegate$ShowState.ENTER_SHOW) {
          a uoa = a.q0(this.R8());
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(null, uoa, a.class, "7") && uoa.r0()) {
             a.d().k(new e(uoa.p0()));
          }
       }
       return;
    }
    public void J8(){
       TransactionViewPager2 d;
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       super.J8();
       d ty = this.y;
       d tC = this.C;
       Objects.requireNonNull(ty);
       if (!PatchProxy.applyVoidOneRefs(tC, ty, TransactionViewPager2.class, "35")) {
          d = ty.d;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidOneRefs(tC, d, c.class, "2")) {
             d.a.remove(tC);
          }
       }
       this.x.z0("sku", this.D);
       return;
    }
    public void V8(){
       ArrayMap uArrayMap;
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "9")) {
          return;
       }
       j m = this.x.m;
       int i = this.u.b();
       if (PatchProxy.isSupport(uod)) {
          uArrayMap = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uod, "10");
          if (uArrayMap != PatchProxyResult.class) {
          label_006c :
             m.K(3, "HEAD_MODULES", uArrayMap);
             return;
          }
       }
       uArrayMap = new ArrayMap();
       uArrayMap.put("module_name", "HEAD");
       uArrayMap.put("location", String.valueOf(this.u.b));
       uArrayMap.put("show_index", String.valueOf(i));
       i = (TextUtils.x(this.u.f))? 1: 2;
       uArrayMap.put("show_type", String.valueOf(i));
       goto label_006c ;
    }
    public abstract j W8();
    public void X8(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "6")) {
          return;
       }
       a tu = this.u;
       tu.i = p0;
       tu.k.setValue((this.u.b() + 1)+"/"+this.u.h);
       return;
    }
    public abstract void Y8(SkuInfo p0);
    public void Z8(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "4")) {
          return;
       }
       if (p0 < this.u.g.size()) {
          this.y.h(p0, false);
       }
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       this.b9(false);
       return;
    }
    public void b9(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "8")) {
          return;
       }
       if (!p0 && this.u.g.equals(this.z.Q0())) {
          return;
       }
       this.z.W0(this.u.g);
       this.z.k0();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.A = m1.f(p0, 0x7f0a3847);
       DetailPanelViewPager2 uDetailPanel = m1.f(p0, R.id.self_detail_header_banner_vp);
       this.y = uDetailPanel;
       uDetailPanel.setLayoutParams(new FrameLayout$LayoutParams(-1, this.P8().getWindowManager().getDefaultDisplay().getWidth()));
       this.x = c.a(this);
       this.B = ViewModelProviders.of(this.R8()).get(e.class);
       return;
    }
}
