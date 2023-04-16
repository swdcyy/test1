package com.kwai.library.widget.viewpager.tabstrip.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import i27.b;
import tyc.q4$a;
import h3.a;
import android.content.Context;
import androidx.fragment.app.c;
import java.util.ArrayList;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.util.List;
import com.kwai.library.widget.viewpager.tabstrip.b;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment$SavedState;
import java.lang.Class;
import java.lang.String;
import android.os.Bundle;
import com.kwai.library.widget.viewpager.tabstrip.a$a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;
import java.lang.IllegalStateException;
import android.view.View;
import android.os.Parcelable;
import java.lang.ClassLoader;
import java.util.Collection;
import java.lang.RuntimeException;

public class a extends a implements PagerSlidingTabStrip$d$b, b, q4$a	// class@000a96
{
    public final Context d;
    public final c e;
    public final List f;
    public e g;
    public SparseArray h;
    public SparseArray i;
    public SparseArray j;
    public Fragment k;
    public int l;

    public void a(Context p0,c p1){
       super();
       this.f = new ArrayList();
       this.g = null;
       this.h = new SparseArray();
       this.i = new SparseArray();
       this.j = new SparseArray();
       this.k = null;
       this.e = p1;
       this.d = p0;
    }
    public Fragment A(ViewGroup p0,int p1){
       Fragment uFragment = this.h.get(p1);
       if (uFragment != null) {
          this.f.get(p1).d(p1, uFragment);
          return uFragment;
       }else if(this.g == null){
          this.g = this.e.beginTransaction();
       }
       uFragment = this.B(p1);
       this.f.get(p1).d(p1, uFragment);
       Fragment$SavedState savedState = this.i.get(p1);
       if (savedState != null) {
          uFragment.setInitialSavedState(savedState);
       }
       uFragment.setMenuVisibility(false);
       uFragment.setUserVisibleHint(false);
       this.h.put(p1, uFragment);
       this.g.f(p0.getId(), uFragment);
       return uFragment;
    }
    public Fragment B(int p0){
       return Fragment.instantiate(this.d, this.f.get(p0).b().getName(), this.j.get(p0));
    }
    public void C(int p0,Bundle p1){
       if (p1 == null) {
          return;
       }
       Bundle uBundle = this.j.get(p0);
       if (uBundle != null) {
          uBundle.putAll(p1);
          p1 = uBundle;
       }
       this.j.put(p0, p1);
       Fragment uFragment = this.a(p0);
       if (uFragment instanceof a$a) {
          uFragment.z1(p1);
       }
       return;
    }
    public void D(List p0){
       this.f.clear();
       this.z(p0);
    }
    public Fragment a(int p0){
       return this.h.get(p0);
    }
    public PagerSlidingTabStrip$d b(int p0){
       if (this.f.isEmpty()) {
          return null;
       }
       if (p0 < 0 || p0 >= this.f.size()) {
          return null;
       }
       return this.f.get(p0).c();
    }
    public int c(String p0){
       if (this.f != null && !TextUtils.isEmpty(p0)) {
          int i = 0;
          while (i < this.f.size()) {
             b uob = this.f.get(i);
             if (uob != null && (uob.c() != null && p0.equals(uob.c().c()))) {
                return i;
             }
             i = i + 1;
          }
       }
       return -1;
    }
    public String d(int p0){
       PagerSlidingTabStrip$d uod = this.b(p0);
       String str = "";
       if (uod == null) {
       }else if(uod.c() == null){
          str = uod.c();
       }
       return str;
    }
    public PagerSlidingTabStrip$d e(String p0){
       b uob;
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       Iterator iterator = this.f.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uob = iterator.next();
          if (uob != null && (uob.c() != null && p0.equals(uob.c().c()))) {
             break ;
          }
       }
       return uob.c();
    }
    public int getCurrentIndex(){
       return this.l;
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (this.g == null) {
          this.g = this.e.beginTransaction();
       }
       this.i.put(p1, this.e.saveFragmentInstanceState(p2));
       this.h.remove(p1);
       this.g.u(p2);
       return;
    }
    public void i(ViewGroup p0){
       a tg = this.g;
       if (tg != null) {
          tg.m();
          e uoe = null;
          try{
             this.g = uoe;
             this.e.executePendingTransactions();
          }catch(java.lang.IllegalStateException e1){
             e1.printStackTrace();
          }
       }
    }
    public int j(){
       return this.f.size();
    }
    public Object o(ViewGroup p0,int p1){
       return this.A(p0, p1);
    }
    public boolean p(View p0,Object p1){
       boolean b = (p1.getView() == p0)? true: false;
       return b;
    }
    public void s(Parcelable p0,ClassLoader p1){
    }
    public Fragment t(){
       return this.k;
    }
    public Parcelable u(){
       return null;
    }
    public void v(ViewGroup p0,int p1,Object p2){
       a tk = this.k;
       if (p2 != tk) {
          if (tk != null) {
             tk.setMenuVisibility(false);
             this.k.setUserVisibleHint(false);
          }
          if (p2 != null) {
             p2.setMenuVisibility(true);
             p2.setUserVisibleHint(true);
          }
          this.k = p2;
          this.l = p1;
       }
       return;
    }
    public void x(ViewGroup p0){
    }
    public void z(List p0){
       if (p0 == null) {
          throw new RuntimeException("delegates should not be null for setFragments\(\)");
       }
       int i = this.f.size();
       int i1 = p0.size() + i;
       for (int i2 = i; i2 < i1; i2 = i2 + 1) {
          int i3 = i2 - i;
          this.j.put(i2, p0.get(i3).a());
       }
       this.f.addAll(p0);
       this.q();
       return;
    }
}
