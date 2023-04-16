package hmd.b;
import erd.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f;
import java.lang.Object;
import rd5.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo$AttachData;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import hmd.d;

public final class b implements g	// class@000f8b
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "5")) {
       }else if(tb.p != null || tb.s == null){
          if (p0.a - tb.i.getAttachData().getStartTime() >= 0 && p0.a - tb.i.getAttachData().getEndTime() <= 0) {
             tb.h.setVisibility(0);
             p0 = tb.b;
             if (p0 != null) {
                p0.setVisibility(4);
             }
          }else if(p0.a - tb.i.getAttachData().getEndTime() > 0){
             if (tb.b != null) {
                tb.c();
                tb.b.setImageResource(tb.v.b());
                tb.b.setVisibility(0);
                tb.p = true;
             }
          }else {
             tb.h.setVisibility(4);
             p0 = tb.b;
             if (p0 != null) {
                p0.setVisibility(4);
             }
          }
       }
       return;
    }
}
