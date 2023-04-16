package com.kwai.video.wayne.player.main.WaynePlayerFactory;
import com.kwai.video.wayne.player.InjectInitor;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import java.util.List;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.datasource.CDNListDatasource;
import com.kwai.video.wayne.player.datasource.IDatasource;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.wayne.player.datasource.KwaiManifestDatasource;

public class WaynePlayerFactory	// class@000da3
{

    static {
       InjectInitor.getInstance().initRun();
    }
    public void WaynePlayerFactory(){
       super();
    }
    public static IWaynePlayer createCdnListPlayer(WayneBuildData p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, WaynePlayerFactory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.setDatasourceModule(new CDNListDatasource(p1, 1));
       return new WaynePlayer(p0);
    }
    public static IWaynePlayer createManifestPlayer(WayneBuildData p0,KwaiManifest p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, WaynePlayerFactory.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.setDatasourceModule(new KwaiManifestDatasource(p1));
       return new WaynePlayer(p0);
    }
    public static IWaynePlayer createManifestPlayer(WayneBuildData p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, WaynePlayerFactory.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.setDatasourceModule(new KwaiManifestDatasource(p1));
       return new WaynePlayer(p0);
    }
    public static IWaynePlayer createPlayer(WayneBuildData p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WaynePlayerFactory.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WaynePlayer(p0);
    }
}
