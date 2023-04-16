package com.yxcorp.gifshow.detail.plc.helper.c$a;
import mu8.o;
import com.yxcorp.gifshow.detail.plc.helper.c;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.download.DownloadManager;

public class c$a extends o	// class@001674
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public boolean a(DownloadTask p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       DownloadManager.C("tuna_plc", "");
       return false;
    }
}
