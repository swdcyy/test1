package com.hhh.mvvm.recycler.RecyclerFragment;
import com.hhh.mvvm.base.BaseFragment;
import java.lang.Object;
import com.hhh.mvvm.recycler.k;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.View;
import fm.i;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import fm.k;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.lifecycle.LifecycleOwner;
import fm.g;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.fragment.app.c;
import fm.h;
import fm.f;
import com.hhh.mvvm.multi.MultiFragment;
import androidx.viewpager.widget.ViewPager;
import em.b;

public abstract class RecyclerFragment extends BaseFragment	// class@000566
{
    public BaseFragment c;
    public BaseFragment d;
    public ViewGroup e;
    public ViewGroup f;
    public RecyclerView g;
    public i h;
    public k i;
    public int j;
    public boolean k;
    public static final int l;

    public void RecyclerFragment(){
       super();
    }
    public void A(){
       if (this.ah()) {
          this.i.p0(this.ch());
       }
       return;
    }
    public void Xg(){
       if (this.j == null) {
          return;
       }
       Rect rect = new Rect();
       int i = 0;
       int childCount = this.g.getChildCount();
       while (i < childCount) {
          View childAt = this.g.getChildAt(i);
          if (childAt.getGlobalVisibleRect(rect)) {
             this.eh(childAt);
          }
          i = i + 1;
       }
       return;
    }
    public k Yg(){
       return this.i;
    }
    public abstract boolean Zg();
    public boolean ah(){
       RecyclerFragment th = this.h;
       boolean b = (th != null && !th.getItemCount())? true: false;
       return b;
    }
    public abstract i bh();
    public abstract Object ch();
    public abstract k dh();
    public void eh(View p0){
       k a = this.g.getChildViewHolder(p0).a;
       if (this.j == 1) {
          this.i.r0(a);
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d102f;
    }
    public void onPause(){
       super.onPause();
       this.Xg();
    }
    public void onViewCreated(View p0,Bundle p1){
       super.onViewCreated(p0, p1);
       RecyclerView recyclerView = this.Vg(R.id.recycler_view);
       this.g = recyclerView;
       recyclerView.setLayoutManager(new LinearLayoutManager(this.requireContext()));
       this.g.setHasFixedSize(this.Zg());
       i oi = this.bh();
       this.h = oi;
       this.g.setAdapter(oi);
       k ok = this.dh();
       this.i = ok;
       ok.e.observe(this.getViewLifecycleOwner(), new g(this));
       int i = 0x7f0a1250;
       ViewGroup viewGroup = this.Vg(i);
       this.f = viewGroup;
       int i1 = 0;
       if (viewGroup == null) {
       }else {
          BaseFragment uBaseFragmen = this.getChildFragmentManager().findFragmentById(i);
          this.c = uBaseFragmen;
          if (uBaseFragmen == null) {
             this.c = i1;
          }
       }
       i = 0x7f0a0d14;
       viewGroup = this.Vg(i);
       this.e = viewGroup;
       if (viewGroup != null) {
          this.d = this.getChildFragmentManager().findFragmentById(i);
          this.i.o0().observe(this.getViewLifecycleOwner(), new h(this));
       }
       this.i.f.observe(this.getViewLifecycleOwner(), new f(this));
       i = 0;
       this.j = i;
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme instanceof MultiFragment) {
          MultiFragment c = parentFragme.c;
          if (c != null) {
             i1 = parentFragme.f.C(c.getCurrentItem());
          }
          if (i1 != this) {
          label_00bc :
             if (i) {
                this.i.p0(this.ch());
             }
             return;
          }
       }
       i = 1;
       goto label_00bc ;
    }
}
