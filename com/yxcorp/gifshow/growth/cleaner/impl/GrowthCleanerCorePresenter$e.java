package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$e;
import androidx.recyclerview.widget.RecyclerView$i;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Integer;

public final class GrowthCleanerCorePresenter$e extends RecyclerView$i	// class@00131e
{
    public final GrowthCleanerCorePresenter a;

    public void GrowthCleanerCorePresenter$e(GrowthCleanerCorePresenter p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerCorePresenter$e.class, "1")) {
          return;
       }
       Iterator iterator = GrowthCleanerCorePresenter.P8(this.a).iterator();
       while (iterator.hasNext()) {
          iterator.next().g();
       }
       return;
    }
    public void h(int p0,int p1){
       GrowthCleanerCorePresenter$e uoe = GrowthCleanerCorePresenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "2")) {
          return;
       }
       Iterator iterator = GrowthCleanerCorePresenter.P8(this.a).iterator();
       while (iterator.hasNext()) {
          iterator.next().h(p0, p1);
       }
       return;
    }
    public void i(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(GrowthCleanerCorePresenter$e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, GrowthCleanerCorePresenter$e.class, "3")) {
          return;
       }
       Iterator iterator = GrowthCleanerCorePresenter.P8(this.a).iterator();
       while (iterator.hasNext()) {
          iterator.next().i(p0, p1, p2);
       }
       return;
    }
    public void j(int p0,int p1){
       GrowthCleanerCorePresenter$e uoe = GrowthCleanerCorePresenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "4")) {
          return;
       }
       Iterator iterator = GrowthCleanerCorePresenter.P8(this.a).iterator();
       while (iterator.hasNext()) {
          iterator.next().j(p0, p1);
       }
       return;
    }
    public void k(int p0,int p1,int p2){
       if (PatchProxy.isSupport(GrowthCleanerCorePresenter$e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, GrowthCleanerCorePresenter$e.class, "6")) {
          return;
       }
       Iterator iterator = GrowthCleanerCorePresenter.P8(this.a).iterator();
       while (iterator.hasNext()) {
          iterator.next().k(p0, p1, p2);
       }
       return;
    }
    public void l(int p0,int p1){
       GrowthCleanerCorePresenter$e uoe = GrowthCleanerCorePresenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "5")) {
          return;
       }
       Iterator iterator = GrowthCleanerCorePresenter.P8(this.a).iterator();
       while (iterator.hasNext()) {
          iterator.next().l(p0, p1);
       }
       return;
    }
}
