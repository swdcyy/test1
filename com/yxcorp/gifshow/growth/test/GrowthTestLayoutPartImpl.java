package com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl;
import vqa.m;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$a;
import msd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1;

public class GrowthTestLayoutPartImpl implements m	// class@001501
{
    public final GrowthTestLayoutPartImpl$a a;

    public void GrowthTestLayoutPartImpl(){
       super();
       this.a = new GrowthTestLayoutPartImpl$a();
    }
    public l a(){
       Object obj = PatchProxy.apply(null, this, GrowthTestLayoutPartImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GrowthTestLayoutPartImpl$inflate$1(this);
    }
    public void onConfirm(){
       PatchProxy.applyVoid(null, this, GrowthTestLayoutPartImpl.class, "2");
    }
}
