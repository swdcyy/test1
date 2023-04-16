package com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerCircle$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerCircle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class GrowthCleanerCircle$a implements Runnable	// class@00134e
{
    public final GrowthCleanerCircle b;

    public void GrowthCleanerCircle$a(GrowthCleanerCircle p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerCircle$a.class, "1")) {
          return;
       }
       this.b.c();
       return;
    }
}
