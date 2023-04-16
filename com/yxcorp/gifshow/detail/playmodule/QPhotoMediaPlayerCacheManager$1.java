package com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager$1;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import p7c.b;
import q87.c;
import p5a.c;
import com.kwai.framework.player.core.b;

public class QPhotoMediaPlayerCacheManager$1 extends LinkedHashMap	// class@00164f
{
    public static final long serialVersionUID = 0xfd4d9d91fc5d9ceb;

    public void QPhotoMediaPlayerCacheManager$1(int p0,float p1,boolean p2){
       super(p0, p1, p2);
    }
    public boolean removeEldestEntry(Map$Entry p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhotoMediaPlayerCacheManager$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.size() < 3) {
          return b;
       }
       if (p0.getValue() != null) {
          Object[] objArray = new Object[]{p0};
          b.C().w("QPhotoMediaPlayerCacheM", "release old ", objArray);
          p0.getValue().release();
       }
       return 1;
    }
}
