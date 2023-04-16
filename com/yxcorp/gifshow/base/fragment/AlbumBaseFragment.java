package com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import dc7.j;
import dc7.f;
import ga9.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import dc7.i;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashSet;
import dc7.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import mrd.a;
import java.util.HashMap;
import ga9.b;
import androidx.lifecycle.ViewModel;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import ea9.b;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

public abstract class AlbumBaseFragment extends RxFragment implements j, f, a	// class@001c4b
{
    public final HashSet c;
    public b d;
    public boolean e;
    public e f;
    public final i g;
    public HashMap h;

    public void AlbumBaseFragment(){
       super(null, 1, null);
    }
    public void AlbumBaseFragment(i p0){
       a.q(p0, "selectableDelegate");
       super();
       this.g = p0;
       this.c = new HashSet();
    }
    public void AlbumBaseFragment(i p0,int p1,u p2){
       p0 = (p1 & 0x01)? new i(): null;
       super(p0);
       return;
    }
    public void I3(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumBaseFragment.class, "16")) {
          return;
       }
       this.f = p0;
       if (p0 != null) {
          p0.h(this.m());
       }
       return;
    }
    public boolean K0(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AlbumBaseFragment obj = PatchProxy.apply(objArray, this, AlbumBaseFragment.class, "17");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.g;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, i.class, "8");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          Boolean uBoolean = obj.b.i();
          b = (uBoolean != null)? uBoolean.booleanValue(): true;
       }
       return b;
    }
    public void Vg(){
       if (PatchProxy.applyVoid(null, this, AlbumBaseFragment.class, "21")) {
          return;
       }
       AlbumBaseFragment th = this.h;
       if (th != null) {
          th.clear();
       }
       return;
    }
    public abstract b Wg();
    public final b Xg(){
       AlbumBaseFragment obj = PatchProxy.apply(null, this, AlbumBaseFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("mViewBinder");
       }
       return obj;
    }
    public b Yg(){
       AlbumBaseFragment obj = PatchProxy.apply(null, this, AlbumBaseFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("mViewBinder");
       }
       return obj;
    }
    public t Z0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AlbumBaseFragment obj = PatchProxy.apply(objArray, this, AlbumBaseFragment.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.g;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.apply(objArray, obj, i.class, "6");
       if (ot != patchProxyRe) {
       }else {
          ot = obj.b.hide().distinctUntilChanged();
          a.h(ot, "pageStateSubject.hide\(\).distinctUntilChanged\(\)");
       }
       return ot;
    }
    public abstract ViewModel Zg();
    public void ah(int p0){
       if (PatchProxy.isSupport(AlbumBaseFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumBaseFragment.class, "15")) {
          return;
       }
       if (this.e == null) {
          this.e = true;
          AlbumBaseFragment tf = this.f;
          if (tf != null) {
             tf.k();
          }
       }
       Fragment parentFragme = this.getParentFragment();
       if (!parentFragme instanceof AlbumBaseFragment) {
          parentFragme = null;
       }
       if (parentFragme != null) {
          parentFragme.ah(p0);
       }
       return;
    }
    public AlbumBaseFragment b(){
       return this;
    }
    public final void bh(boolean p0){
       if (PatchProxy.isSupport(AlbumBaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumBaseFragment.class, "8")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       a.h(iterator, "mSelectListenerSet.iterator\(\)");
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          a.h(obj, "iterator.next\(\)");
          if (p0) {
             obj.u();
          }else {
             obj.c0();
          }
       }
       return;
    }
    public void c0(){
       AlbumBaseFragment tg = this.g;
       Objects.requireNonNull(tg);
       if (PatchProxy.applyVoid(null, tg, i.class, "2")) {
       }else {
          tg.a(false);
       }
       this.bh(false);
       return;
    }
    public t n1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AlbumBaseFragment obj = PatchProxy.apply(objArray, this, AlbumBaseFragment.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.g;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.apply(objArray, obj, i.class, "7");
       if (ot != patchProxyRe) {
       }else {
          ot = obj.b.hide().distinctUntilChanged().skip(1);
          a.h(ot, "pageStateSubject.hide\(\).¡­nctUntilChanged\(\).skip\(1\)");
       }
       return ot;
    }
    public boolean onBackPressed(){
       return false;
    }
    public abstract void onBindClickEvent();
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumBaseFragment.class, "3")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          b b = b.b;
          a.h(activity, "it");
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(activity, b, b.class, "1")) {
             a.q(activity, "activity");
             b.a.put(activity, null);
          }
       }
       super.onCreate(p0);
       this.d = this.Wg();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       AlbumBaseFragment obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AlbumBaseFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "inflater");
       obj = this.d;
       if (obj == null) {
          a.S("mViewBinder");
       }
       View view = obj.f(p0, p1, p2);
       AlbumBaseFragment td = this.d;
       if (td == null) {
          a.S("mViewBinder");
       }
       td.e(view);
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AlbumBaseFragment.class, "13")) {
          return;
       }
       AlbumBaseFragment td = this.d;
       if (td == null) {
          a.S("mViewBinder");
       }
       td.onDestroy();
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AlbumBaseFragment.class, "11")) {
          return;
       }
       super.onDestroyView();
       this.c.clear();
       this.Vg();
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, AlbumBaseFragment.class, "4")) {
          return;
       }
       super.onDetach();
       AlbumBaseFragment tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(this, tg, i.class, "4")) {
          a.q(this, "fragment");
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumBaseFragment.class, "6")) {
          return;
       }
       a.q(p0, "view");
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, AlbumBaseFragment.class, "7")) {
          AlbumBaseFragment td = this.d;
          if (td == null) {
             a.S("mViewBinder");
          }
          if (!td.a(this.Zg())) {
             this.onBindClickEvent();
          }
       }
       return;
    }
    public void u(){
       AlbumBaseFragment tg = this.g;
       Objects.requireNonNull(tg);
       if (PatchProxy.applyVoid(null, tg, i.class, "1")) {
       }else {
          tg.a(true);
       }
       this.bh(true);
       return;
    }
}
