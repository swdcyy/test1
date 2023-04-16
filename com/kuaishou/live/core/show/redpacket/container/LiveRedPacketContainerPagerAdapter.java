package com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerPagerAdapter;
import androidx.fragment.app.d;
import androidx.fragment.app.c;
import android.util.SparseArray;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h3.a;
import android.view.ViewGroup;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import va1.j;
import androidx.fragment.app.Fragment;
import uw1.f;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerPagerAdapter$b;
import rg2.g0;
import uw1.n;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerPagerAdapter$1;
import androidx.lifecycle.LifecycleObserver;

public class LiveRedPacketContainerPagerAdapter extends d	// class@000e6b
{
    public List k;
    public LiveRedPacketContainerPagerAdapter$c l;
    public SparseArray m;
    public String n;
    public boolean o;
    public g0 p;

    public void LiveRedPacketContainerPagerAdapter(c p0){
       super(p0, 1);
       this.m = new SparseArray();
       this.o = true;
    }
    public void A(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPacketContainerPagerAdapter.class, "1")) {
          return;
       }
       this.k = p0;
       this.q();
       return;
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(LiveRedPacketContainerPagerAdapter.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveRedPacketContainerPagerAdapter.class, "3")) {
          return;
       }
       this.m.remove(p1);
       super.h(p0, p1, p2);
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketContainerPagerAdapter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return j.a(this.k);
    }
    public int k(Object p0){
       return -2;
    }
    public Fragment z(int p0){
       LiveRedPacketContainerItemBaseFragment obj;
       LiveRedPacketContainerPagerAdapter liveRedPacke = LiveRedPacketContainerPagerAdapter.class;
       if (PatchProxy.isSupport(liveRedPacke)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveRedPacke, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.m.get(p0) != null) {
          return this.m.get(p0);
       }else {
          obj = this.k.get(p0).f(this.n);
          if (this.o != null) {
             this.o = false;
             obj.setDispatchDrawFinishedListener(new LiveRedPacketContainerPagerAdapter$b(obj, this.p));
          }
          obj.getLifecycle().addObserver(new LiveRedPacketContainerPagerAdapter$1(this, obj, p0));
          this.m.put(p0, obj);
          return obj;
       }
    }
}
