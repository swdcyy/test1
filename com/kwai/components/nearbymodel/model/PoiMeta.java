package com.kwai.components.nearbymodel.model.PoiMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import fa6.e;
import fa6.b;

public class PoiMeta implements Serializable	// class@000cc1
{
    public PoiCollectInfo mCollectInfo;
    public static final long serialVersionUID = 0x774a7adc214ea867;

    public void PoiMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, PoiMeta.class, "1")) {
          return;
       }
       e uoe = new e(PoiMeta.class, "", "localLifeMeta");
       uoe.a(null);
       c.a.e(PhotoMeta.class, uoe);
       return;
    }
}
