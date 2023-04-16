package com.yxcorp.gifshow.dialog.kem.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.dialog.KemCheckableDialogResponse;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import x9a.k;
import x9a.y;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView$n;
import x9a.y$a;
import x9a.e0;
import com.yxcorp.gifshow.dialog.kem.d$a;
import y8c.g;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Collection;
import ekd.q;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.CheckedTextView;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import com.yxcorp.widget.selector.view.SelectShapeCheckedTextView;
import x9a.j;
import android.view.View$OnClickListener;
import x9a.i;
import com.kwai.library.widget.popup.common.c;

public class d extends PresenterV2	// class@001ab1
{
    public TextView p;
    public TextView q;
    public ImageView r;
    public SelectShapeCheckedTextView s;
    public RecyclerView t;
    public c u;
    public KemCheckableDialogResponse v;
    public d$a w;

    public void d(){
       super();
    }
    public void E8(){
       int i;
       d uod = d.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, uod, str)) {
          return;
       }
       this.p.setText(this.v.mTitle);
       if (TextUtils.x(this.v.mSubtitle)) {
          this.q.setVisibility(8);
       }else {
          this.q.setText(this.v.mSubtitle);
       }
       boolean b = true;
       int b1 = (this.v.mMinSelectItemCount <= null)? true: false;
       this.P8(b1);
       if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
          uod = this.v;
          if (uod == null || k.a != uod.mItemShape) {
             b = false;
          }
          y oy = new y(this.t);
          y oy1 = y.class;
          if (PatchProxy.isSupport(oy1)) {
             d$a obj = PatchProxy.applyOneRefs(Boolean.valueOf(b), oy, oy1, "1");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             label_0117 :
                e0 uoe0 = new e0(b);
                obj = new d$a(this);
                this.w = obj;
                if (!PatchProxy.applyVoidOneRefs(obj, uoe0, e0.class, str)) {
                   uoe0.n1("item_click_listener", obj);
                }
                d tt = this.t;
                tt.setLayoutManager(new GridLayoutManager(tt.getContext(), i));
                if (!q.f(this.v.mItemList)) {
                   uoe0.L0(this.v.mItemList);
                }
                this.t.setAdapter(uoe0);
             }
          }
          if (!PatchProxy.isSupport(oy1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), oy, oy1, "2")) {
             int i1 = 2;
             b1 = oy.c - (oy.d * 2);
             int i2 = (b)? 0x7f070484: 0x7f07048d;
             i2 = a1.d(i2);
             y b2 = oy.b;
             b1 = (b1 - (i2 * b2)) / (b2 - 1);
             int i3 = b1 / 2;
             int i4 = (b)? 0x7f070483: 0x7f07048c;
             if (b1 < a1.d(i4)) {
                oy.b = i1;
                b1 = a1.e(46.00f);
                oy.d = b1;
                y b3 = oy.b;
                i3 = (((oy.c - (b1 * 2)) - (i2 * b3)) / (b3 - 1)) / i1;
             }
             b1 = oy.d - i3;
             oy.d = b1;
             if (!PatchProxy.isSupport(oy1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(b1), Integer.valueOf(i3), oy, oy1, str)) {
                ViewGroup$MarginLayoutParams layoutParams = oy.a.getLayoutParams();
                layoutParams.leftMargin = b1;
                layoutParams.rightMargin = b1;
                oy1 = oy.e;
                if (oy1 != null) {
                   oy.a.removeItemDecoration(oy1);
                }
                y$a uoa = new y$a(oy, oy.b, i3);
                oy.e = uoa;
                oy.a.addItemDecoration(uoa);
                oy.a.invalidateItemDecorations();
             }
          }
          i = oy.b;
          goto label_0117 ;
       }
       return;
    }
    public void P8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "9")) {
          return;
       }
       this.s.setEnabled(p0);
       uod = this.s;
       KemCheckableDialogResponse mButtonTextA = (p0)? this.v.mButtonTextAfterSelect: this.v.mButtonTextBeforeSelect;
       uod.setText(mButtonTextA);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3f7d);
       this.r = m1.f(p0, 0x7f0a0785);
       this.s = m1.f(p0, 0x7f0a08fb);
       this.q = m1.f(p0, 0x7f0a3bd6);
       this.t = m1.f(p0, 0x7f0a0955);
       m1.a(p0, new j(this), R.id.confirm_btn);
       m1.a(p0, new i(this), R.id.close_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.u = this.q8(c.class);
       this.v = this.q8(KemCheckableDialogResponse.class);
       return;
    }
}
