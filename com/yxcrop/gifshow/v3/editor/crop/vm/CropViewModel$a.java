package com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel$a;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel;
import java.lang.Object;
import lnc.d1$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import tld.b;
import t36.f$a;
import t36.f;

public final class CropViewModel$a implements Observer	// class@000a20
{
    public final CropViewModel b;

    public void CropViewModel$a(CropViewModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropViewModel$a.class, "1")) {
       }else {
          CropViewModel$a tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, CropViewModel.class, "4")) {
             a.p(p0, "task");
             tb.r.s0(new b(p0));
          }
       }
       return;
    }
}
