package j4a.c;
import java.lang.Object;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import f4a.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import com.yxcorp.gifshow.detail.plc.helper.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f4a.n;
import f4a.s;

public final class c	// class@0028fc
{

    public void c(){
       super();
    }
    public static i a(PlcEntryDataAdapter p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       GameCenterDownloadParams gameCenterDo = i.m(p0.getActionUrl(), p0.getPackageName(), p0.getActionIconUrl(), p0.getAppName());
       if (d.a(-1986139969).isAvailable() && !TextUtils.x(gameCenterDo.mDownloadId)) {
          return new n(gameCenterDo);
       }
       return new s();
    }
}
