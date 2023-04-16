package com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import hka.l;
import lnc.g2$a;
import gka.o;
import y8c.q;
import d9c.b;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import c9c.a;
import io.reactivex.subjects.PublishSubject;
import s2b.d;
import com.kwai.library.widget.refresh.RefreshLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c9c.d;
import y8c.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b9c.u;
import brd.t;
import java.lang.Throwable;
import qvb.q;
import qvb.p;
import hka.j;
import com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment;
import qvb.i;
import y8c.p;
import y8c.c;
import java.lang.Boolean;
import java.util.Objects;
import c9c.c;
import androidx.fragment.app.Fragment;
import b9c.y;
import java.util.List;
import y8c.g;
import b9c.l;
import java.util.Map;
import java.util.HashMap;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment$a;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment$b;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import java.lang.Integer;
import lnc.g2;
import androidx.fragment.app.FragmentActivity;
import java.lang.Number;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import c9c.b;
import b9c.d;
import lkd.b;
import c9c.e;
import b9c.e;
import g9c.a;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;

public abstract class RecyclerDialogFragment extends BaseDialogFragment implements l, g2$a, o, q, b, g	// class@0017a9
{
    public d p;
    public c q;
    public b r;
    public e s;
    public g2 t;
    public final a u;
    public final PublishSubject v;
    public final d w;
    public RecyclerDialogFragment$b x;
    public RecyclerDialogFragment$a y;

    public void RecyclerDialogFragment(){
       super();
       this.u = new a();
       this.v = PublishSubject.g();
       this.w = new d();
    }
    public RefreshLayout Ac(){
       Object obj = PatchProxy.apply(null, this, RecyclerDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.a();
    }
    public t Ah(){
       return null;
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, RecyclerDialogFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(RecyclerDialogFragment.class, "14");
       return u.b(this, false);
    }
    public t I5(){
       return this.v;
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public boolean N5(){
       return true;
    }
    public boolean S0(){
       return j.d(this);
    }
    public boolean S1(){
       return (this instanceof LiveCustomerServiceSizeFragment ^ 0x01);
    }
    public i Y7(){
       return p.a(this);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, RecyclerDialogFragment.class, "17")) {
          return;
       }
       RecyclerDialogFragment tp = this.p;
       if (tp != null) {
          tp.b();
       }
       return;
    }
    public boolean b6(){
       return true;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, RecyclerDialogFragment.class, "20")) {
          return;
       }
       this.v.onNext(new c(2, this));
       return;
    }
    public boolean c1(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       RecyclerDialogFragment obj = PatchProxy.apply(objArray, this, RecyclerDialogFragment.class, "22");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.q;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, c.class, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!obj.g.getParentFragment() instanceof y || obj.g.getParentFragment().t() == obj.g){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public int f(){
       return 0;
    }
    public List fg(){
       Object obj = PatchProxy.apply(null, this, RecyclerDialogFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u.a(this);
    }
    public g g7(){
       Object obj = PatchProxy.apply(null, this, RecyclerDialogFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.b();
    }
    public int getLayoutResId(){
       return 0x7f0d00f4;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecyclerDialogFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, RecyclerDialogFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(RecyclerDialogFragment.class, new l());
       }else {
          obj.put(RecyclerDialogFragment.class, null);
       }
       return obj;
    }
    public RecyclerView h0(){
       Object obj = PatchProxy.apply(null, this, RecyclerDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.c;
    }
    public boolean i0(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       RecyclerDialogFragment obj = PatchProxy.apply(objArray, this, RecyclerDialogFragment.class, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.p;
       boolean b = true;
       if (obj == null) {
          return b;
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, d.class, "1");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(!obj.b.getParentFragment() instanceof y || obj.b.getParentFragment().t() == obj.b){
          b = 0;
       }
       b1 = b;
       return b1;
    }
    public boolean kb(){
       return true;
    }
    public boolean n5(){
       return j.e(this);
    }
    public void onActivityCreated(Bundle p0){
       int i5;
       RecyclerDialogFragment$a uoa = RecyclerDialogFragment$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerDialogFragment.class, "8")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.th()) {
          Window window = (this.getDialog() == null)? null: this.getDialog().getWindow();
          RecyclerDialogFragment tx = this.x;
          Objects.requireNonNull(tx);
          int i = 0;
          int i1 = -1;
          if (!PatchProxy.applyVoidOneRefs(window, tx, RecyclerDialogFragment$b.class, "1") && window != null) {
             int i4 = -2;
             if (tx.b != null) {
                i5 = -2;
             }else {
                i5 = tx.c;
                if (i5 == null) {
                   i5 = n.j(tx.i);
                }
             }
             if (tx.d == null) {
                i4 = tx.e;
                if (i4 == null) {
                   i4 = -1;
                }
             }
             window.setLayout(i4, i5);
             window.setGravity(17);
             if (tx.h == null) {
                window.setBackgroundDrawable(new ColorDrawable(i));
                window.setDimAmount(0);
             }
          }
       label_006f :
          if (this.th()) {
             if (this.y == null) {
                this.y = new RecyclerDialogFragment$a(this);
             }
             RecyclerDialogFragment ty = this.y;
             Objects.requireNonNull(ty);
             if (!PatchProxy.applyVoidOneRefs(p0, ty, uoa, "1") && p0 != null) {
                ty.a = p0.getBoolean("SLIDE_WIDTH_ORIENTATION");
             }
             RecyclerDialogFragment ty1 = this.y;
             Dialog dialog = this.getDialog();
             Objects.requireNonNull(ty1);
             if (!PatchProxy.applyVoidOneRefs(dialog, ty1, uoa, "3") && dialog != null) {
                Window window1 = dialog.getWindow();
                if (window1 != null) {
                   int i2 = 81;
                   window1.setGravity(i2);
                   if (dialog.getOwnerActivity() != null) {
                      i1 = dialog.getOwnerActivity().getRequestedOrientation();
                   }
                   if (!i1 || i1 == 6) {
                      i = 1;
                   }
                   int i3 = (ty1.a != null)? 0x7f1103e2: 0x7f1103bf;
                   window1.setWindowAnimations(i3);
                   if (ty1.a != null && i) {
                      i2 = 21;
                   }
                   window1.setGravity(i2);
                }
             }
          }
       }
    label_00e3 :
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(RecyclerDialogFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, RecyclerDialogFragment.class, "12")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       this.u.a(this, p0, p1, p2);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerDialogFragment.class, "6")) {
          return;
       }
       super.onCreate(p0);
       this.t = new g2(this, this);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       int i;
       RecyclerDialogFragment$b uob = RecyclerDialogFragment$b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, RecyclerDialogFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.th()) {
          return super.onCreateDialog(p0);
       }
       if (this.x == null) {
          this.x = new RecyclerDialogFragment$b(this, this.getActivity());
       }
       this.setCancelable(true);
       RecyclerDialogFragment tx = this.x;
       Objects.requireNonNull(tx);
       Object obj1 = PatchProxy.apply(null, tx, uob, "3");
       if (obj1 != PatchProxyResult.class) {
          i = obj1.intValue();
       }else if(tx.a != null){
          i = 1;
       }else {
          i = 2;
       }
       this.setStyle(i, this.x.f);
       tx = this.x;
       Dialog uDialog = super.onCreateDialog(p0);
       Objects.requireNonNull(tx);
       Object obj2 = PatchProxy.applyOneRefs(uDialog, tx, uob, "2");
       if (obj2 != PatchProxyResult.class) {
          uDialog = obj2;
       }else {
          uDialog.setCanceledOnTouchOutside(true);
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       c uoc1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecyclerDialogFragment.class, "7");
       if (p2 != patchProxyRe) {
          return p2;
       }
       c uoc = new c(this);
       this.q = uoc;
       int layoutResId = this.getLayoutResId();
       int i = this.uh();
       Objects.requireNonNull(uoc);
       if (PatchProxy.isSupport(c.class)) {
          uoc1 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(layoutResId), Integer.valueOf(i), uoc, c.class, "1");
          if (uoc1 != patchProxyRe) {
          label_0056 :
             return uoc1;
          }
       }
       View view = a.g(p0, layoutResId, p1, false);
       uoc.e = view;
       uoc.c = view.findViewById(i);
       uoc1 = uoc.e;
       goto label_0056 ;
    }
    public void onDestroy(){
       c c;
       if (PatchProxy.applyVoid(null, this, RecyclerDialogFragment.class, "25")) {
          return;
       }
       this.v.onNext(new c(5, this));
       this.v.onComplete();
       super.onDestroy();
       RecyclerDialogFragment tq = this.q;
       if (tq != null) {
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoid(null, tq, c.class, "5")) {
             c = tq.c;
             if (c != null) {
                c.setAdapter(null);
             }
          }
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecyclerDialogFragment.class, "21")) {
          return;
       }
       super.onDestroyView();
       RecyclerDialogFragment tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, c.class, "6")) {
          tq.c.clearOnChildAttachStateChangeListeners();
       }
       this.r.c();
       this.w.j();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, RecyclerDialogFragment.class, "23")) {
          return;
       }
       this.v.onNext(new c(4, this));
       super.onPause();
       this.w.e();
       return;
    }
    public void onRequestPermissionsResult(int p0,String[] p1,int[] p2){
       if (PatchProxy.isSupport(RecyclerDialogFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, RecyclerDialogFragment.class, "11")) {
          return;
       }
       super.onRequestPermissionsResult(p0, p1, p2);
       this.u.b(this, p0, p1, p2);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, RecyclerDialogFragment.class, "24")) {
          return;
       }
       this.v.onNext(new c(1, this));
       super.onResume();
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerDialogFragment.class, "9")) {
          return;
       }
       super.onSaveInstanceState(p0);
       if (this.th()) {
          RecyclerDialogFragment ty = this.y;
          if (ty != null) {
             Objects.requireNonNull(ty);
             if (!PatchProxy.applyVoidOneRefs(p0, ty, RecyclerDialogFragment$a.class, "2")) {
                p0.putBoolean("SLIDE_WIDTH_ORIENTATION", ty.a);
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecyclerDialogFragment.class, "13")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.wh();
       this.r = new b(this, this.v, new d(this));
       d uod = new d(this, this.t);
       this.p = uod;
       this.s = new e(this, uod, new e(this));
       RecyclerDialogFragment tq = this.q;
       g og = tq.b();
       i oi = this.q();
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoidTwoRefs(og, oi, tq, c.class, "4")) {
          tq.d = oi;
          tq.a = og;
          og.o1(tq.f);
          c a = tq.a;
          if (a.f != null) {
             a.W0(tq.d.getItems());
          }
          tq.a.q1(tq.d);
       }
       this.w.d(this);
       this.a();
       return;
    }
    public i q(){
       Object obj = PatchProxy.apply(null, this, RecyclerDialogFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.d;
    }
    public d r9(){
       return this.w;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public boolean th(){
       return this instanceof LiveCustomerServiceSizeFragment;
    }
    public void u(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecyclerDialogFragment.class, "19")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, RecyclerDialogFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.g7() != null && !this.g7().getItemCount()){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          this.p.b();
       }
       this.v.onNext(new c(3, this));
       return;
    }
    public boolean u2(){
       return false;
    }
    public int uh(){
       return 0x7f0a34da;
    }
    public void v2(boolean p0,boolean p1){
       p.b(this, p0, p1);
    }
    public t vh(){
       Object obj = PatchProxy.apply(null, this, RecyclerDialogFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.a;
    }
    public void wh(){
       c c;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecyclerDialogFragment.class, "10")) {
          return;
       }
       g og = this.xh();
       d uod = new d(og);
       uod.G0(false);
       RecyclerDialogFragment tq = this.q;
       RecyclerView$LayoutManager layoutManage = this.yh();
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoidThreeRefs(og, uod, layoutManage, tq, c.class, "2")) {
          tq.a = og;
          tq.b = uod;
          c = tq.c;
          if (c != null) {
             c.setItemAnimator(objArray);
             tq.c.setLayoutManager(layoutManage);
             tq.c.setAdapter(tq.b);
          }
       }
       return;
    }
    public boolean x0(){
       return j.a(this);
    }
    public abstract g xh();
    public RecyclerView$LayoutManager yh(){
       Object obj = PatchProxy.apply(null, this, RecyclerDialogFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LinearLayoutManager(this.getContext());
    }
    public abstract i zh();
}
