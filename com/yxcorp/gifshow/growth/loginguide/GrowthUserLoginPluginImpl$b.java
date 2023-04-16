package com.yxcorp.gifshow.growth.loginguide.GrowthUserLoginPluginImpl$b;
import ov5.a;
import com.yxcorp.gifshow.growth.loginguide.GrowthUserLoginPluginImpl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$a;

public final class GrowthUserLoginPluginImpl$b implements a	// class@001425
{
    public final GrowthUserLoginPluginImpl a;

    public void GrowthUserLoginPluginImpl$b(GrowthUserLoginPluginImpl p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,int p1,boolean p2){
    }
    public void b(int p0,boolean p1){
       if (PatchProxy.isSupport(GrowthUserLoginPluginImpl$b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, GrowthUserLoginPluginImpl$b.class, "1")) {
          return;
       }
       Iterator iterator = this.a.RA().iterator();
       while (iterator.hasNext()) {
          iterator.next().reset();
       }
       return;
    }
}
