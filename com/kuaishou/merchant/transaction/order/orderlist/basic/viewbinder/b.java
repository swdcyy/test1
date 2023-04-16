package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.b;
import rk0.b;
import androidx.fragment.app.Fragment;
import yk4.f;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.SearchStateLogic;
import com.kwai.feature.component.widget.SearchEditorLayout;
import iy5.e;
import ml4.a;
import yk4.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import com.kwai.feature.component.widget.SearchEditorLayout$c;
import android.view.View;
import android.widget.FrameLayout;
import com.kwai.framework.plugin.PluginManager;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import ekd.m1;
import android.widget.EditText;
import android.widget.ImageView;
import java.util.Objects;
import java.lang.Boolean;
import android.widget.TextView;
import android.content.Context;
import yk4.g;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.order.orderlist.search.model.SearchParams;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.c;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.b$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.b$c;

public abstract class b extends b	// class@000866
{
    public a s;
    public SearchEditorLayout t;
    public EditText u;
    public SearchEditorLayout$c v;
    public d w;

    public void b(Fragment p0){
       super(p0);
       this.v = new f(this);
       this.w = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (!this.a9()) {
          SearchStateLogic searchStateL = this.t.getSearchStateLogic();
          this.J0(this.s.c, new e(this, searchStateL.b(), searchStateL));
       }
       return;
    }
    public void F8(){
       int color;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       this.s = this.S8();
       int i = 0x7f0a367d;
       if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
          this.t.setEditorActionListener(this.v);
          if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
             this.t.findViewById(R.id.fl_editor_right_area).setVisibility(8);
          }
          this.Z8();
          SearchStateLogic searchStateL = this.t.getSearchStateLogic();
          e uoe = searchStateL.b();
          PluginManager.H.J(this.t.getResources(), 1);
          uoe.i(0);
          uoe.j = 0x7f081749;
          uoe.a = false;
          uoe.k(1);
          searchStateL.g();
          searchStateL.l = this.w;
          RelativeLayout relativeLayo = this.t.findViewById(i);
          RelativeLayout$LayoutParams layoutParams1 = relativeLayo.getLayoutParams();
          layoutParams1.leftMargin = a1.d(0x7f070329);
          layoutParams1.topMargin = 0;
          layoutParams1.rightMargin = a1.d(0x7f070271);
          relativeLayo.setLayoutParams(layoutParams1);
          EditText uEditText = m1.f(this.t, R.id.search_editor);
          this.u = uEditText;
          uEditText.setGravity(16);
          this.t.findViewById(R.id.iv_search_hint_icon).setImageResource(R.drawable.arg_RES_7f081725);
          b tt = this.t;
          Objects.requireNonNull(tt);
          if (!PatchProxy.isSupport(SearchEditorLayout.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, tt, SearchEditorLayout.class, "28")) {
             Resources resources = tt.getResources();
             tt.b.setBackgroundColor(tt.d(1, resources.getColor(R.color.arg_RES_7f06060a), resources.getColor(R.color.arg_RES_7f06018d)));
             tt.f.setTextColor(tt.d(1, resources.getColor(R.color.arg_RES_7f0601be), resources.getColor(R.color.arg_RES_7f0601cb)));
             tt.i.setBackgroundResource(tt.d(1, R.drawable.arg_RES_7f081ea9, 0x7f081ea8));
             tt.g.setImageResource(tt.d(1, R.drawable.arg_RES_7f080e7f, 0x7f080e7e));
             tt.e.setTextColor(tt.d(1, resources.getColor(R.color.arg_RES_7f060778), resources.getColor(R.color.arg_RES_7f0601cb)));
             tt.e.setHintTextColor(tt.d(1, resources.getColor(R.color.arg_RES_7f06077b), resources.getColor(R.color.arg_RES_7f060186)));
             color = resources.getColor(R.color.arg_RES_7f06077b);
             tt.d.setTextColor(tt.d(1, color, resources.getColor(R.color.arg_RES_7f060186)));
          }
       }
       if (this.b9() && !PatchProxy.applyVoid(objArray, this, uob, "9")) {
          View view = new View(this.R8().getContext());
          view.setBackgroundColor(a1.a(R.color.arg_RES_7f062057));
          view.setOnClickListener(new g(this));
          RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -1);
          layoutParams.addRule(0, R.id.iv_clear_button);
          layoutParams.addRule(1, R.id.iv_search_hint_icon);
          this.t.findViewById(i).addView(view, layoutParams);
       }
       return;
    }
    public abstract a S8();
    public String V8(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.s.c.getValue() == null) {
          return "";
       }
       return TextUtils.k(this.s.c.getValue().mHintText);
    }
    public void W8(String p0){
    }
    public void X8(){
    }
    public void Y8(View p0){
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       b tt = this.t;
       Objects.requireNonNull(tt);
       if (!PatchProxy.isSupport(SearchEditorLayout.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, tt, SearchEditorLayout.class, "9")) {
          SearchEditorLayout f = tt.f;
          if (f != null) {
             f.setVisibility(8);
          }
       }
       return;
    }
    public boolean a9(){
       return false;
    }
    public boolean b9(){
       return this instanceof c;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a2f18);
       m1.b(p0, new b$b(this), R.id.order_header_back_img);
       m1.b(this.t, new b$c(this), R.id.iv_clear_button);
       return;
    }
}
