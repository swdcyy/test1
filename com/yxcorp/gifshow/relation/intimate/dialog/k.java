package com.yxcorp.gifshow.relation.intimate.dialog.k;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.relation.intimate.dialog.j;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import tyc.i2;
import java.lang.Integer;
import tyc.j2;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.relation.intimate.dialog.s;
import java.util.ArrayList;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import im8.c;
import java.lang.Float;
import java.util.Collection;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import abc.r;
import erd.g;
import crd.b;
import brd.t;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.library.widget.button.SlipSwitchButton;
import abc.s;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import com.yxcorp.gifshow.relation.intimate.dialog.k$a;
import com.yxcorp.gifshow.widget.m;
import wkd.b;
import com.kwai.user.base.intimate.b;
import java.util.Objects;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.model.IntimateRelationInfo;
import ekd.q;
import cbc.a;

public abstract class k extends e	// class@0018f6
{
    public final PublishSubject m;
    public int n;
    public int o;
    public SlipSwitchButton p;
    public List q;
    public final x r;

    public void k(GifshowActivity p0,IntimateRelationDialogParams p1,PopupInterface$h p2){
       super(p0, p1, p2);
       this.m = PublishSubject.g();
       this.r = Suppliers.a(j.b);
       e ti = this.i;
       p1 = ti.mIntimateType;
       if (p1 > null) {
       }else {
          p1 = ti.mCurrentIntimateType;
       }
       this.o = p1;
       this.n = p1;
       return;
    }
    public abstract void A();
    public abstract void B();
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.z() && this.y())? true: false;
       return b;
    }
    public int f(){
       return 0x7f0d0643;
    }
    public void p(View p0){
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok, "1")) {
          return;
       }
       boolean b = false;
       this.k(p0, b);
       if (!PatchProxy.applyVoidOneRefs(p0, this, ok, "2")) {
          RecyclerView recyclerView = m1.f(p0, R.id.relation_rv);
          recyclerView.setLayoutManager(new GridLayoutManager(this.g, 3));
          i2 oi2 = new i2(this.r.get().intValue(), 0, 0, this.r.get().intValue(), 0, 0, null);
          recyclerView.addItemDecoration(v3);
          ArrayList uArrayList = PatchProxy.apply(null, this, ok, "4");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             uArrayList = new ArrayList();
             uArrayList.add(new c("INTIMATE_DIALOG_BUNDLE", this.i));
             uArrayList.add(new c("INTIMATE_DIALOG_SELECT_RELATION_SUBJECT", this.m));
             uArrayList.add(new c("INTIMATE_DIALOG_SELECT_RELATION_SCALE", Float.valueOf((((float)((n.k(this.g) - (this.r.get().intValue() * 2)) - a1.e(38.00f)) / 3.00f) / (float)a1.d(R.dimen.arg_RES_7f070473)))));
             uArrayList.add(new c("INTIMATE_DIALOG_CURRENT_RELATION_TYPE", Integer.valueOf(this.i.mCurrentIntimateType)));
             uArrayList.add(new c("INTIMATE_DIALOG_DEFAULT_RELATION_TYPE", Integer.valueOf(this.o)));
          }
          s os = new s(uArrayList);
          os.L0(this.q);
          recyclerView.setAdapter(os);
          this.m.subscribe(new r(this, os));
       }
       IntimateRelationDialogParams mTitle = (!TextUtils.x(this.i.mTitle))? this.i.mTitle: a1.p(R.string.arg_RES_7f104611);
       this.o(p0, mTitle);
       if (!TextUtils.x(this.i.mSubTitle)) {
          this.n(p0, this.i.mSubTitle);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, ok, "3")) {
          SlipSwitchButton slipSwitchBu = m1.f(p0, R.id.switch_btn);
          this.p = slipSwitchBu;
          slipSwitchBu.g(this.k, true, b);
          this.p.setOnSwitchChangeListener2(new s(this));
       }
       this.i(p0, new k$a(this));
       this.B();
       return;
    }
    public boolean y(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, k.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = b.a(0x40193068);
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.apply(objArray, obj, b.class, "3");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          Iterator iterator = obj.a().iterator();
          while (iterator.hasNext()) {
             IntimateRelationInfo intimateRela = iterator.next();
             if (intimateRela.mIsUsing != null) {
                uArrayList.add(intimateRela);
             }
          }
       }
       this.q = uArrayList;
       if (q.f(uArrayList)) {
          a.a("show dialog failed: no meta info");
          this.d();
          return false;
       }else {
          return true;
       }
    }
    public abstract boolean z();
}
