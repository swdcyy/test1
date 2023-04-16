package com.kwai.live.gzone.accompanyplay.edit.g$f;
import n37.b;
import com.kwai.live.gzone.accompanyplay.edit.g;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.lang.Boolean;

public class g$f implements b	// class@000bec
{
    public final g a;

    public void g$f(g p0){
       this.a = p0;
       super();
    }
    public boolean a(LiveGzoneAccompanyFleetSetting p0){
       return true;
    }
    public String b(LiveGzoneAccompanyFleetSetting p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = (this.a.l(p0))? a1.p(R.string.arg_RES_7f10233b): a1.p(R.string.arg_RES_7f1023bd);
       return str;
    }
    public boolean c(LiveGzoneAccompanyFleetSetting p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.isItemValueChanged();
    }
}
