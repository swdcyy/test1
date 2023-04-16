package lu1.e;
import erd.g;
import lu1.f;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lu1.v$h;
import lu1.q;
import android.view.View;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import lu1.v;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;

public final class e implements g	// class@00303d
{
    public final f b;

    public void e(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          b.Z(LiveCommonLogTag.MULTI_PK, "bindAudioWidget view shot");
          p0 = this.b;
          p0.c.E0(new v$h(BitmapUtil.j(p0.b.z)));
       }
       return;
    }
}
