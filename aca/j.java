package aca.j;
import erd.g;
import aca.f;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingBitmapAction;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import tvc.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class j implements g	// class@000096
{
    public final f b;

    public void j(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else if(this.b.h.size()){
          p0 = this.b;
          if (p0.f != 1 || p0.h.size() != 1) {
             p0 = this.b;
             int i = 0;
             if (p0.f >= p0.h.size()) {
                p0 = this.b;
                if (p0.e == null) {
                   p0.f = i;
                }
             }
             p0 = this.b.a();
             if (p0 != null) {
                j tb = this.b;
                Object obj = tb.h.get(tb.f);
                a.o(obj, "mShowBitmapList[curPosition]");
                p0.a(new VideoTemplateLoadingBitmapAction(obj));
             }
             Object[] objArray = new Object[i];
             a.D().w("VideoTemplateLoadingMW", "playImages mCurPosition = "+this.b.f, objArray);
             p0 = this.b;
             p0.f = p0.f + 1;
          }
       }
       return;
    }
}
