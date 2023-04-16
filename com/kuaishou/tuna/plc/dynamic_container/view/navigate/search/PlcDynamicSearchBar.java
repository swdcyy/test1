package com.kuaishou.tuna.plc.dynamic_container.view.navigate.search.PlcDynamicSearchBar;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.util.ArrayList;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.search.PlcDynamicSearchBar$mTimer$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.search.PlcDynamicSearchBar$mContentSearchClickLnr$2;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.search.PlcDynamicSearchBar$mSearchBtnClickLnr$2;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.search.PlcDynamicSearchBar$mShowNext$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.search.PlcDynamicSearchBar$mContentSearchClickLnr$2$a;
import android.view.View$OnClickListener;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.search.PlcDynamicSearchBar$mSearchBtnClickLnr$2$a;
import py4.a;
import android.widget.ViewSwitcher$ViewFactory;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.search.PlcDynamicSearchBar$b;
import lnc.a1;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;
import com.kwai.library.widget.icon.KwaiIconView;
import java.lang.Integer;
import java.util.Collection;
import java.util.List;
import py4.b;
import java.lang.CharSequence;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.search.PlcDynamicSearchBar$a;
import com.kwai.robust.PatchProxyResult;
import my4.c;

public final class PlcDynamicSearchBar extends FrameLayout	// class@001018
{
    public LinearLayout b;
    public ViewSwitcher c;
    public TextView d;
    public PlcDynamicSearchBar$a e;
    public PlcDynamicTitleConfig f;
    public List g;
    public int h;
    public b i;
    public boolean j;
    public final p k;
    public final p l;
    public final p m;
    public final a n;
    public HashMap o;

    public void PlcDynamicSearchBar(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void PlcDynamicSearchBar(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void PlcDynamicSearchBar(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.g = new ArrayList();
       this.k = s.c(PlcDynamicSearchBar$mTimer$2.INSTANCE);
       this.l = s.c(new PlcDynamicSearchBar$mContentSearchClickLnr$2(this));
       this.m = s.c(new PlcDynamicSearchBar$mSearchBtnClickLnr$2(this));
       this.n = new PlcDynamicSearchBar$mShowNext$1(this);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcDynamicSearchBar.class, "5")) {
       }else {
          View view = a.l(this, R.layout.arg_RES_7f0d1684, true, 0);
          a.o(view, "KwaiLayoutInflater.infla¡­ode.UI_MODE_DEFAULT\n    \)");
          LinearLayout linearLayout = view.findViewById(R.id.ll_search_root);
          this.b = linearLayout;
          TextView textView = (linearLayout != null)? linearLayout.findViewById(R.id.tv_search_btn): objArray;
          this.d = textView;
          PlcDynamicSearchBar tb = this.b;
          if (tb != null) {
             objArray = tb.findViewById(0x7f0a454b);
          }
          this.c = objArray;
          tb = this.b;
          if (tb != null) {
             tb.setOnClickListener(this.getMContentSearchClickLnr());
          }
          tb = this.d;
          if (tb != null) {
             tb.setOnClickListener(this.getMSearchBtnClickLnr());
          }
          tb = this.c;
          if (tb != null) {
             tb.setFactory(new a(this));
          }
       }
       return;
    }
    public final void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicSearchBar.class, "9")) {
          return;
       }
       p0 = p0.getTag();
       if (!p0 instanceof PlcDynamicSearchBar$b) {
          p0 = null;
       }
       if (p0 != null) {
          TextView textView = p0.a();
          PlcDynamicSearchBar$b b = p0.b;
          int i = a1.a(R.color.arg_RES_7f061d96);
          int i1 = 1;
          if (PlcDynamicUtils.n(this.f)) {
             i = a1.a(R.color.arg_RES_7f061dc4);
             i1 = 2;
          }
          if (b != null) {
             b.c(R.drawable.arg_RES_7f08063d, i1);
          }
          if (textView != null) {
             textView.setTextColor(i);
          }
       }
       return;
    }
    public final void b(int p0){
       if (PatchProxy.isSupport(PlcDynamicSearchBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PlcDynamicSearchBar.class, "13")) {
          return;
       }
       PlcDynamicSearchBar tc = this.c;
       PlcDynamicSearchBar plcDynamicSe = null;
       if (tc != null) {
          View nextView = tc.getNextView();
          if (nextView != null) {
             tc = nextView.getTag();
          label_0028 :
             if (!tc instanceof PlcDynamicSearchBar$b) {
                tc = plcDynamicSe;
             }
             TextView textView = (tc != null)? tc.a(): plcDynamicSe;
             if ((this.g.isEmpty() ^ 0x01) && this.g.size() >= p0) {
                p0 = p0 % this.g.size();
                b uob = this.g.get(p0);
                this.h = p0;
                this.i = uob;
                if (textView != null) {
                   textView.setText(uob.a());
                }
             }else {
                this.h = 0;
                this.i = plcDynamicSe;
             }
             PlcDynamicSearchBar tc1 = this.c;
             if (tc1 != null) {
                tc1.showNext();
             }
             tc1 = this.e;
             if (tc1 != null) {
                tc1.b(this.i);
             }
             return;
          }
       }
       tc = plcDynamicSe;
       goto label_0028 ;
    }
    public final b getCurSearchInfo(){
       return this.i;
    }
    public final PlcDynamicSearchBar$mContentSearchClickLnr$2$a getMContentSearchClickLnr(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicSearchBar.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public final PlcDynamicSearchBar$mSearchBtnClickLnr$2$a getMSearchBtnClickLnr(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicSearchBar.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
    public final c getMTimer(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicSearchBar.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final void setOnSearchBarStatusChangeListener(PlcDynamicSearchBar$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicSearchBar.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.e = p0;
       return;
    }
}
