package com.yxcorp.login.bind.presenter.o0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.bind.presenter.o0$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import k17.d;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewGroup;
import g9c.a;
import java.util.List;
import com.yxcorp.login.http.response.ChangePhoneRiskResponse;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Integer;
import e1d.i1;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import e1d.j1;
import e1d.h1;
import brd.w;
import erd.c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.login.model.VerifyMethodInfo;
import java.util.Collection;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.login.bind.presenter.a$b;

public class o0 extends PresenterV2	// class@001a8f
{
    public ChangePhoneRiskResponse p;
    public a$b q;
    public RecyclerView r;
    public TextView s;
    public o0$b t;

    public void o0(){
       super();
    }
    public void E8(){
       VerifyMethodInfo verifyMethod;
       o0 oo0 = o0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo0, "3")) {
          return;
       }
       this.t = new o0$b(this);
       if (!PatchProxy.applyVoid(objArray, this, oo0, "4")) {
          this.r.setNestedScrollingEnabled(true);
          this.r.setLayoutManager(new LinearLayoutManager(this.getActivity()));
          this.r.setAdapter(this.t);
          this.r.addItemDecoration(new d(this.l8().getDrawable(R.drawable.arg_RES_7f081084)));
       }
       if (!PatchProxy.applyVoid(objArray, this, oo0, "5")) {
          this.r.setVisibility(0);
          if (!this.getActivity().isFinishing()) {
             this.t.M0();
             o0 tp = this.p;
             if (tp != null && tp.getItems() != null) {
                tp = this.t;
                List items = this.p.getItems();
                ArrayList uArrayList = PatchProxy.applyOneRefs(items, this, oo0, "6");
                if (uArrayList != PatchProxyResult.class) {
                }else {
                   uArrayList = new ArrayList();
                   if (items != null) {
                      Iterator iterator = items.iterator();
                      while (iterator.hasNext()) {
                         Integer integer = iterator.next();
                         int i = integer.intValue();
                         if (i != 11) {
                            if (i != 14) {
                               if (i != 999) {
                                  continue ;
                               }
                            }else {
                               verifyMethod = new VerifyMethodInfo();
                               verifyMethod.verifyType = integer.intValue();
                               verifyMethod.methodName = this.n8(0x7f1040eb);
                               verifyMethod.methodDesc = this.n8(0x7f1040ec);
                               uArrayList.add(verifyMethod);
                            }
                         }else {
                            verifyMethod = new VerifyMethodInfo();
                            verifyMethod.verifyType = integer.intValue();
                            verifyMethod.methodName = this.n8(0x7f1040f5);
                            verifyMethod.methodDesc = this.n8(0x7f1040ee);
                            uArrayList.add(verifyMethod);
                         }
                         z c = d.c;
                         z a = d.a;
                         t ot = t.fromCallable(new i1(this)).subscribeOn(c).observeOn(a);
                         t ot1 = t.fromCallable(new j1(this)).subscribeOn(c).observeOn(a);
                         ot = t.zip(ot, ot1, new h1(this));
                         this.X7(ot.subscribe(Functions.d(), Functions.d()));
                      }
                   }
                }
                tp.L0(uArrayList);
             }
             this.t.k0();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a43d2);
       this.s = m1.f(p0, 0x7f0a43d3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "1")) {
          return;
       }
       this.q = this.r8("CHANGE_PHONE_AUTHORIZE_SERVICE");
       this.p = this.r8("check_methods_list");
       return;
    }
}
