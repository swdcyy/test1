package com.kwai.video.wayne.player.util.GsonUtil;
import zk.d;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.player.mid.manifest.v2.KwaiManifestTypeAdapter;
import java.lang.reflect.Type;
import java.lang.Object;
import com.google.gson.Gson;

public class GsonUtil	// class@000dbc
{
    public static Gson KP_MID_GSON;

    static {
       d uod = new d();
       if (InjectConfig.getConfig().enableGsonTypeAdapter()) {
          uod.f(KwaiManifest.class, new KwaiManifestTypeAdapter());
       }
       GsonUtil.KP_MID_GSON = uod.b();
    }
    public void GsonUtil(){
       super();
    }
}
