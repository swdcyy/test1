package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class EnhanceFilterViewModel$i implements g	// class@000f7e
{
    public static final EnhanceFilterViewModel$i b;

    static {
       EnhanceFilterViewModel$i.b = new EnhanceFilterViewModel$i();
    }
    public void EnhanceFilterViewModel$i(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EnhanceFilterViewModel$i.class, "1")) {
       }else {
          PostUtils.D("EnhanceFilterViewModel", "startTaskInner tasks", p0);
       }
       return;
    }
}
