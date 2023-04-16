package com.kwai.component.tabs.panel.h$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.tabs.panel.h;
import com.kwai.component.tabs.panel.h$b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import android.widget.LinearLayout;
import java.lang.Boolean;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.CharSequence;
import java.lang.Long;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import lnc.a1;
import com.kwai.component.tabs.panel.TabsPanelConfig;
import bh5.e;
import java.lang.Integer;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import bh5.d;
import android.widget.TextView;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;

public class h$b extends PresenterV2	// class@000b81
{
    public LinearLayout p;
    public List q;
    public TabsPanelHostFragment r;
    public TabsPanelConfig s;
    public View$OnClickListener t;
    public View$OnClickListener u;
    public h v;

    public void h$b(h p0){
       super();
       this.u = new h$b$a(this);
       this.v = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "2")) {
          return;
       }
       this.R8().setOnClickListener(this.u);
       return;
    }
    public int P8(){
       Object obj = PatchProxy.apply(null, this, h$b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.q.indexOf(this.v);
    }
    public View R8(){
       int i = this.P8();
       if (i >= 0 && this.p.getChildCount() > i) {
          return this.p.getChildAt(i);
       }
       return null;
    }
    public boolean S8(){
       Object obj = PatchProxy.apply(null, this, h$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.q.size() != b) {
          b = false;
       }
       return b;
    }
    public boolean V8(){
       Object obj = PatchProxy.apply(null, this, h$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.r.s2() != null && this.r.s2().getCurrentItem() == this.P8())? true: false;
       return b;
    }
    public void W8(long p0,CharSequence p1){
       h$b uob = h$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uob, "6")) {
          return;
       }
       this.X8(p0, null, p1);
       return;
    }
    public void X8(long p0,CharSequence p1,CharSequence p2){
       SpannableStringBuilder spannableStr;
       if (PatchProxy.isSupport(h$b.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, h$b.class, "7")) {
          return;
       }
       if (this.S8() && !TextUtils.x(p1)) {
          this.Z8(p0+""+p1);
       }else {
          h$b uob = null;
          if (p0 - uob <= 0) {
             p0 = uob;
          }
          int i = a1.e(2.00f);
          TabsPanelConfig n = this.s.n;
          if (PatchProxy.isSupport(e.class)) {
             spannableStr = PatchProxy.applyFourRefs(p2, Long.valueOf(p0), Integer.valueOf(i), Long.valueOf(n), null, e.class, "5");
             if (spannableStr != PatchProxyResult.class) {
             label_00b2 :
                this.Z8(spannableStr);
             }
          }
          String str = (p0 - n >= 0)? TextUtils.N(p0): String.valueOf(p0);
          spannableStr = new SpannableStringBuilder();
          spannableStr.append(p2);
          spannableStr.append(str);
          spannableStr.setSpan(new RelativeSizeSpan(0x3f5c28f6), p2.length(), spannableStr.length(), 18);
          spannableStr.setSpan(new d(i), p2.length(), spannableStr.length(), 18);
          goto label_00b2 ;
       }
       return;
    }
    public void Y8(View$OnClickListener p0){
       this.t = p0;
    }
    public final void Z8(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "10")) {
          return;
       }
       if (this.R8() instanceof TextView) {
          this.R8().setText(p0);
       }
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "4")) {
          return;
       }
       if (this.r.s2() != null && this.P8() >= 0) {
          this.r.s2().setCurrentItem(this.P8());
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "1")) {
          return;
       }
       this.p = this.q8(LinearLayout.class);
       this.q = this.q8(List.class);
       this.r = this.q8(TabsPanelHostFragment.class);
       this.s = this.r8("COMMENT_PANEL_PANEL_CONFIG");
       return;
    }
}
