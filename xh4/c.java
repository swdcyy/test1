package xh4.c;
import xf4.a;
import androidx.fragment.app.Fragment;
import xh4.c$a;
import xh4.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import com.kuaishou.ksmvvm.command.KSCommand;
import xh4.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import xh4.e;
import xh4.b;
import rk0.b;
import xf4.c;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailSearchBoxInfo;
import qy5.b;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import android.view.View;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import xh4.d;
import android.view.View$OnClickListener;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;
import oy5.b;

public class c extends a	// class@003766
{
    public final b A;
    public b B;
    public j t;
    public DetailSearchBoxInfo u;
    public SearchSwitcherEntryView v;
    public View w;
    public e x;
    public boolean y;
    public boolean z;

    public void c(Fragment p0){
       super(p0);
       this.A = new c$a(this);
       this.B = new c$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.J0(this.t.y.h, new a(this));
       this.J0(this.x.b, new b(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.t = c.a(this);
       this.x = ViewModelProviders.of(this.R8()).get(e.class);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       this.y = false;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       super.J8();
       c tv = this.v;
       if (tv != null) {
          tv.e();
       }
       return;
    }
    public void S8(DetailSearchBoxInfo p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "7")) {
          return;
       }
       this.u = p0;
       boolean b = true;
       if (p0 != null) {
          if (!PatchProxy.applyVoid(null, this, uoc, "8")) {
             this.v.setSearchEntryLayoutConfig(this.B);
             b uob = new b();
             uob.g(KwaiRadiusStyles.FULL);
             uob.y((float)a1.e(0x3f800000));
             uob.v(a1.a(R.color.arg_RES_7f0602c5));
             this.v.setBackground(uob.a());
             this.z = false;
             if (this.Z8()) {
                this.W8(a1.e(36.00f));
             }else {
                this.W8(a1.e(44.00f));
             }
          }
          this.X8(b);
          this.Y8(this.w, b);
       }else {
          this.X8(false);
          this.Y8(this.w, false);
          b = false;
       }
       this.t.w.setValue(Boolean.valueOf(b));
       if (!PatchProxy.applyVoid(null, this, uoc, "11")) {
          c tw = this.w;
          if (tw != null && this.v != null) {
             tw.setOnClickListener(new d(this));
          }
       }
       return;
    }
    public void V8(boolean p0){
    }
    public final void W8(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "9")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.v.getLayoutParams();
       layoutParams.height = p0;
       this.v.setLayoutParams(layoutParams);
       return;
    }
    public void X8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "10")) {
          return;
       }
       uoc = this.v;
       int i = (p0)? 0: 8;
       uoc.setVisibility(i);
       return;
    }
    public void Y8(View p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int i = (p1)? 0: 8;
       p0.setVisibility(i);
       return;
    }
    public final boolean Z8(){
       c tu = this.u;
       boolean b = (tu != null && tu.mSupportCarousel != null)? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a03d8);
       this.w = m1.f(p0, 0x7f0a376b);
       this.v.setSearchActionCallback(this.A);
       return;
    }
}
