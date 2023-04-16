package com.gifshow.tuna.player.component.TunaSlidePlayFragment;
import nj.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.gifshow.tuna.player.component.TunaSlidePlayFragment$PageState;
import java.util.ArrayList;
import nj.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import nj.h;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import java.util.Iterator;
import android.os.Bundle;
import crd.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import androidx.viewpager2.widget.ViewPager2;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.gifshow.tuna.player.component.TunaSlidePlayFragment$a;
import androidx.viewpager2.widget.ViewPager2$h;
import nj.i;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import zf6.j;
import nj.j;

public class TunaSlidePlayFragment extends BaseFragment implements d	// class@0015e6
{
    public ViewPager2 j;
    public View k;
    public View l;
    public ImageView m;
    public h n;
    public a o;
    public TunaSlidePlayFragment$PageState p;
    public final List q;
    public boolean r;
    public static final int s;

    public void TunaSlidePlayFragment(){
       super();
       this.p = TunaSlidePlayFragment$PageState.LOADING;
       this.q = new ArrayList();
    }
    public void Oc(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaSlidePlayFragment.class, "12")) {
          return;
       }
       this.q.add(p0);
       return;
    }
    public void ch(){
    }
    public h dh(){
       Object obj = PatchProxy.apply(null, this, TunaSlidePlayFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this.getActivity(), this);
    }
    public void eh(int p0){
       if (PatchProxy.isSupport(TunaSlidePlayFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TunaSlidePlayFragment.class, "11")) {
          return;
       }
       Iterator iterator = this.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().P4(p0);
       }
       return;
    }
    public void jf(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaSlidePlayFragment.class, "13")) {
          return;
       }
       this.q.remove(p0);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaSlidePlayFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.o = new a();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TunaSlidePlayFragment.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.a(this.getContext(), 0x7f0d051c);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, TunaSlidePlayFragment.class, "2")) {
          return;
       }
       super.onDestroy();
       TunaSlidePlayFragment to = this.o;
       if (to != null) {
          to.dispose();
          this.o = null;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaSlidePlayFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       ViewPager2 viewPager2 = p0.findViewById(R.id.tuna_slide_play_viewpager);
       this.j = viewPager2;
       h oh = this.dh();
       this.n = oh;
       viewPager2.setAdapter(oh);
       this.j.j(new TunaSlidePlayFragment$a(this));
       this.k = p0.findViewById(0x7f0a2921);
       View view = p0.findViewById(R.id.refresh_view);
       this.l = view;
       view.setOnClickListener(new i(this));
       this.m = p0.findViewById(0x7f0a0399);
       Drawable uDrawable = j.n(this.getContext(), R.drawable.arg_RES_7f080562, 0x7f0620c7);
       if (uDrawable != null) {
          this.m.setImageDrawable(uDrawable);
       }
       this.m.setOnClickListener(new j(this));
       if (!PatchProxy.applyVoid(null, this, TunaSlidePlayFragment.class, "8")) {
          this.p = TunaSlidePlayFragment$PageState.LOADING;
          this.j.setVisibility(4);
          this.k.setVisibility(4);
          this.l.setVisibility(4);
       }
       this.ch();
       return;
    }
}
