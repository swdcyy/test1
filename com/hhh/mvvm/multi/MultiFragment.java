package com.hhh.mvvm.multi.MultiFragment;
import com.hhh.mvvm.base.BaseFragment;
import em.b;
import android.view.View;
import android.os.Bundle;
import com.trello.rxlifecycle3.components.support.RxFragment;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import com.google.android.material.tabs.TabLayout;
import em.a;
import com.google.android.material.tabs.TabLayout$c;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public abstract class MultiFragment extends BaseFragment	// class@000561
{
    public ViewPager c;
    public TabLayout d;
    public ViewGroup e;
    public b f;
    public BaseFragment g;

    public void MultiFragment(){
       super();
    }
    public abstract b Xg();
    public void onViewCreated(View p0,Bundle p1){
       super.onViewCreated(p0, p1);
       this.c = this.Vg(0x7f0a444e);
       b uob = this.Xg();
       this.f = uob;
       this.c.setAdapter(uob);
       this.c.setOffscreenPageLimit(2);
       TabLayout tabLayout = this.Vg(R.id.tab_layout);
       this.d = tabLayout;
       tabLayout.setupWithViewPager(this.c);
       this.d.a(new a(this));
       int i = 0x7f0a1250;
       ViewGroup viewGroup = this.Vg(i);
       this.e = viewGroup;
       if (viewGroup == null) {
       }else {
          BaseFragment uBaseFragmen = this.getChildFragmentManager().findFragmentById(i);
          this.g = uBaseFragmen;
          if (uBaseFragmen == null) {
             this.g = null;
          }
       }
       return;
    }
}
