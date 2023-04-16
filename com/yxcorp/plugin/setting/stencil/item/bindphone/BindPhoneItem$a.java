package com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem$a;
import erd.g;
import com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem;
import java.lang.Object;
import c66.h$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class BindPhoneItem$a implements g	// class@000920
{
    public final BindPhoneItem b;

    public void BindPhoneItem$a(BindPhoneItem p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BindPhoneItem$a.class, "1")) {
       }else {
          this.b.k();
       }
       return;
    }
}
