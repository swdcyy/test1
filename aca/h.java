package aca.h;
import erd.g;
import aca.f;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingBitmapAction;
import kotlin.jvm.internal.a;
import tvc.a;

public final class h implements g	// class@000094
{
    public final f b;

    public void h(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else if(!this.b.h.size()){
          KSStore kSStore = this.b.a();
          if (kSStore != null) {
             a.o(p0, "it");
             kSStore.a(new VideoTemplateLoadingBitmapAction(p0));
          }
          h tb = this.b;
          tb.f = tb.f + 1;
       }
       a.m(p0);
       this.b.h.add(p0);
       return;
    }
}
