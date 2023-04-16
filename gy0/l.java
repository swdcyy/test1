package gy0.l;
import z1.a;
import com.kuaishou.live.audience.component.comments.send.e$d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import java.lang.String;
import com.kuaishou.live.audience.component.comments.send.e;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t02.a0;
import y47.k;

public final class l implements a	// class@0025af
{
    public final e$d a;
    public final BaseEditorFragment$g b;

    public void l(e$d p0,BaseEditorFragment$g p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       l ta = this.a;
       ta.b.P8(this.b, 2, p0.mGiftSentInfo, false);
       p0 = ta.b;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, e.class, "13")) {
       }else {
          p0.G = "";
          p0 = p0.r.v1;
          if (p0 != null) {
             p0.f("");
          }
       }
       return;
    }
}
