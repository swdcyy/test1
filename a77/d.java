package a77.d;
import erd.g;
import a77.f;
import java.lang.Object;
import com.kwai.live.gzone.popup.bean.LiveGzonePopupInfoResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kwai.live.gzone.popup.bean.LiveGzoneSignalPopupInfo;
import a77.l;

public final class d implements g	// class@00006e
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && (p0.mPopupType == null || (!PatchProxy.applyVoidOneRefs(p0, tb, f.class, "6") && tb.u.get(p0.mPopupType) != null))) {
          LiveGzoneSignalPopupInfo liveGzoneSig = new LiveGzoneSignalPopupInfo();
          liveGzoneSig.msg = tb.w;
          liveGzoneSig.mPopupInfoResponse = p0;
          tb.u.get(p0.mPopupType).a(liveGzoneSig);
       }
    label_003a :
       return;
    }
}
