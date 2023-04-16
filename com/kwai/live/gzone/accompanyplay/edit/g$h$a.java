package com.kwai.live.gzone.accompanyplay.edit.g$h$a;
import erd.o;
import com.kwai.live.gzone.accompanyplay.edit.g$h;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.api.ResultResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import com.kwai.live.gzone.accompanyplay.edit.g;

public class g$h$a implements o	// class@000bee
{
    public final g$h b;

    public void g$h$a(g$h p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, g$h$a.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = this.b;
          p0 = p0.d.j(p0.b, p0.c);
       }
       return p0;
    }
}
