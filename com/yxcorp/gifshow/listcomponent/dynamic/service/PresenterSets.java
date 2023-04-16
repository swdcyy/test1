package com.yxcorp.gifshow.listcomponent.dynamic.service.PresenterSets;
import java.util.LinkedHashSet;
import t0b.e;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashSet;

public class PresenterSets extends LinkedHashSet	// class@001a67
{

    public void PresenterSets(){
       super();
    }
    public void PresenterSets(e[] p0){
       super(Arrays.asList(p0));
    }
    public PresenterSets clone(){
       Object obj = PatchProxy.apply(null, this, PresenterSets.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public Object clone(){
       return this.clone();
    }
}
