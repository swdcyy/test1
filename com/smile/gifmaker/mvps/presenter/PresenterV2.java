package com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;
import ml8.d;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import vl8.b;
import java.lang.Class;
import com.smile.gifmaker.mvps.presenter.PresenterStateMachine$PresenterState;
import com.smile.gifmaker.mvps.presenter.PresenterV2$b;
import crd.a;
import androidx.lifecycle.LifecycleOwner;
import com.smile.gifshow.annotation.provider.v2.a;
import java.util.Iterator;
import java.util.List;
import com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.View;
import nl8.r;
import com.smile.gifmaker.mvps.presenter.PresenterStateMachine;
import com.google.common.collect.ImmutableTable;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.util.Collection;
import qk.g0;
import java.util.Map$Entry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.lang.Integer;
import java.util.Map;
import im8.a;
import java.util.Set;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2$PresenterAction;
import com.smile.gifmaker.mvps.presenter.PresenterV2$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2$e;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import im8.e;
import tl8.b;
import im8.f;

public class PresenterV2 implements c, d	// class@000c27
{
    public final List b;
    public final Map c;
    public final Set d;
    public final b e;
    public PresenterStateMachine$PresenterState f;
    public PresenterStateMachine$PresenterState g;
    public boolean h;
    public PresenterV2$e i;
    public PresenterV2$b j;
    public LifecycleOwner k;
    public a l;
    public g0 m;
    public a n;
    public static boolean o;

    public void PresenterV2(){
       super();
       this.b = new ArrayList();
       this.c = new HashMap();
       this.d = new HashSet();
       this.e = new b(this, PresenterV2.class);
       PresenterStateMachine$PresenterState iNIT = PresenterStateMachine$PresenterState.INIT;
       this.f = iNIT;
       this.g = iNIT;
       this.h = true;
       this.j = new PresenterV2$b();
       this.l = new a();
       this.a8(this);
    }
    public void PresenterV2(LifecycleOwner p0){
       super();
       this.b = new ArrayList();
       this.c = new HashMap();
       this.d = new HashSet();
       this.e = new b(this, PresenterV2.class);
       PresenterStateMachine$PresenterState iNIT = PresenterStateMachine$PresenterState.INIT;
       this.f = iNIT;
       this.g = iNIT;
       this.h = true;
       this.j = new PresenterV2$b();
       this.l = new a();
       this.k = p0;
       this.a8(this);
    }
    public static void S7(PresenterV2 p0){
       p0.e8();
    }
    private void e8(){
       if (!this.R1()) {
          throw new IllegalArgumentException("This method should not be invoke before bind.");
       }
       this.e.reset();
       this.n = null;
       a uoa = this.e.a(this.j.b);
       this.e.b(uoa);
       this.n = uoa;
       this.j8();
       this.n = null;
       this.b8(uoa);
       Object[] objArray = new Object[]{uoa};
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          PresenterV2$c a = iterator.next().a;
          if (!a.R1()) {
             this.g8(a);
          }
          if (a.R1()) {
             a.M8(objArray);
             a.e8();
          }
       }
       this.f = PresenterStateMachine$PresenterState.BIND;
       return;
    }
    public final void A8(PresenterV2 p0,View p1){
       p0.f(p1);
       p0.F8();
       p0.g = PresenterStateMachine$PresenterState.CREATE;
    }
    public final void B8(PresenterStateMachine$PresenterState p0){
       this.C8(p0, this.h);
    }
    public final void C8(PresenterStateMachine$PresenterState p0,boolean p1){
       IllegalStateException illegalState;
       PresenterV2 tf = this.f;
       if (tf != this.g) {
          throw new IllegalStateException("状态异常。可能是当前 Presenter 在前一次 "+this.f+" 过程中异常被兜住了，导致真实状态还停留在 "+this.g+"。"+this.z8());
       }
       r or = new r(this, p1);
       List list = PresenterStateMachine.a.get(tf, p0);
       if (list == null) {
          illegalState = null;
       }else {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             or.a(iterator.next());
          }
          illegalState = 1;
       }
       if (illegalState) {
          return;
       }else {
          throw new IllegalStateException("不能从 "+this.f+" 跳到 "+p0+"："+this.z8());
       }
    }
    public void D8(PresenterStateMachine$PresenterState p0,PresenterV2$b p1,boolean p2){
       this.j = p1;
       this.C8(p0, (p2 ^ 0x01));
    }
    public void E8(){
    }
    public void F8(){
    }
    public void H8(){
    }
    public void I8(PresenterV2 p0){
       PresenterV2 tk = this.k;
       if (tk != null && p0.k == null) {
          p0.k = tk;
       }
       this.b.add(new PresenterV2$c(p0));
       p0.h = false;
       this.a8(p0);
       return;
    }
    public void J8(){
    }
    public void K8(PresenterStateMachine$PresenterState p0){
       this.g = p0;
    }
    public void L8(){
       Iterator iterator;
       PresenterV2 tm = this.m;
       if (tm != null) {
          iterator = tm.entries().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             LiveData key = uEntry.getKey();
             key.removeObserver(uEntry.getValue());
          }
          this.m.clear();
       }
       this.l.dispose();
       this.l = new a();
       iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a.L8();
       }
       this.f = PresenterStateMachine$PresenterState.UNBIND;
       return;
    }
    public final void M8(Object[] p0){
       this.j.b = p0;
    }
    public final void O8(View p0){
       this.j.a = p0;
    }
    public final boolean R1(){
       boolean b = (this.f.index() >= PresenterStateMachine$PresenterState.CREATE.index())? true: false;
       return b;
    }
    public final PresenterV2 U7(PresenterV2 p0){
       this.I8(p0);
       if (this.R1() && !p0.R1()) {
          this.A8(p0, this.j.a);
       }
       return this;
    }
    public final PresenterV2 V7(int p0,PresenterV2 p1){
       this.I8(p1);
       this.c.put(p1, Integer.valueOf(p0));
       if (this.R1()) {
          this.A8(p1, this.j.a.findViewById(p0));
       }
       return this;
    }
    public void W7(a p0){
       this.d.add(p0);
    }
    public void X7(b p0){
       this.l.c(p0);
    }
    public final void a8(PresenterV2 p0){
       this.e.x(p0);
    }
    public Object add(int p0,Object p1){
       this.U7(p1);
       return this;
    }
    public Object add(Object p0){
       this.U7(p0);
       return this;
    }
    public void b8(a p0){
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          uoa.reset();
          Object[] objArray = new Object[]{p0};
          uoa.u(objArray);
       }
       return;
    }
    public final void destroy(){
       this.B8(PresenterStateMachine$PresenterState.DESTROY);
    }
    public void doBindView(View p0){
    }
    public void f(View p0){
       this.O8(p0);
       this.B8(PresenterStateMachine$PresenterState.CREATE);
       if (PresenterV2.o) {
          p0.setTag(R.id.root_presenter, this);
       }
       return;
    }
    public void f8(PresenterV2$PresenterAction p0){
       p0.performCallState(this);
       PresenterV2 ti = this.i;
       if (ti != null && p0 == PresenterV2$PresenterAction.ACTION_BIND) {
          ti.b(this.b);
          return;
       }else if(ti != null && p0 == PresenterV2$PresenterAction.ACTION_UNBIND){
          ti.a(this.b);
          return;
       }else {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().a.f8(p0);
          }
          return;
       }
    }
    public final void g8(PresenterV2 p0){
       Integer integer = this.c.get(p0);
       if (integer == null) {
          p0.O8(this.j.a);
       }else {
          p0.O8(this.j.a.findViewById(integer.intValue()));
       }
       p0.h8();
       return;
    }
    public Activity getActivity(){
       Context context = this.getContext();
       while (true) {
          if (!context instanceof ContextWrapper) {
             return null;
          }
          if (context instanceof Activity) {
             break ;
          }else {
             context = context.getBaseContext();
          }
       }
       return context;
    }
    public final Context getContext(){
       PresenterV2$b a = this.j.a;
       Context uContext = (a == null)? null: a.getContext();
       return uContext;
    }
    public void h8(){
       if (this.R1()) {
          throw new IllegalStateException("Presenter只能被初始化一次.");
       }
       this.doBindView(this.j.a);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          this.g8(iterator.next().a);
       }
       this.f = PresenterStateMachine$PresenterState.CREATE;
       return;
    }
    public final void i(Object[] p0){
       this.M8(p0);
       this.B8(PresenterStateMachine$PresenterState.BIND);
    }
    public void i8(){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a.i8();
       }
       this.f = PresenterStateMachine$PresenterState.DESTROY;
       return;
    }
    public void j8(){
    }
    public View k8(int p0){
       return this.j.a.findViewById(p0);
    }
    public final Resources l8(){
       Context context = this.getContext();
       Resources resources = (context == null)? null: context.getResources();
       return resources;
    }
    public View m8(){
       return this.j.a;
    }
    public final String n8(int p0){
       Context context = this.getContext();
       String str = (context == null)? null: context.getString(p0);
       return str;
    }
    public boolean p8(){
       boolean b = (this.b.size() > 0)? true: false;
       return b;
    }
    public Object q8(Class p0){
       PresenterV2 tn = this.n;
       Object obj = e.b(tn, p0);
       if (obj != null) {
          return obj;
       }
       if (e.d(tn, p0)) {
          throw new IllegalArgumentException("需要注入的数据不能为空："+p0.getName());
       }
       throw new IllegalArgumentException("未提供数据："+p0.getName());
    }
    public Object r8(String p0){
       PresenterV2 tn = this.n;
       Object obj = e.c(tn, p0);
       if (obj != null) {
          return obj;
       }
       if (e.e(tn, p0)) {
          throw new IllegalArgumentException("需要注入的数据不能为空："+p0);
       }
       throw new IllegalArgumentException("未提供数据："+p0);
    }
    public Object s8(Class p0){
       p0 = e.b(this.n, p0);
       if (p0 != null) {
       }else {
          p0 = null;
       }
       return p0;
    }
    public Object t8(String p0){
       p0 = e.c(this.n, p0);
       if (p0 != null) {
       }else {
          p0 = null;
       }
       return p0;
    }
    public final void unbind(){
       this.B8(PresenterStateMachine$PresenterState.UNBIND);
    }
    public Object v8(String p0,Class p1){
       p0 = e.c(this.n, p0);
       if (p0 != null) {
       }else {
          p0 = b.a(p1);
       }
       return p0;
    }
    public f w8(String p0){
       return e.f(this.n, p0, f.class);
    }
    public f x8(String p0){
       f uof = e.f(this.n, p0, f.class);
       if (uof != null) {
          return uof;
       }
       throw new IllegalArgumentException("未提供数据："+p0);
    }
    public final boolean y8(){
       boolean b = (this.f.index() == PresenterStateMachine$PresenterState.DESTROY.index())? true: false;
       return b;
    }
    public final String z8(){
       StringBuilder str = "Class="+this.getClass().getName();
       if (!this.b.isEmpty()) {
          str = str+" children=";
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             str = str+iterator.next().a.getClass().getName()+" ";
          }
       }
       return str;
    }
}
