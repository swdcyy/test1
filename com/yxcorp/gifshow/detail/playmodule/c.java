package com.yxcorp.gifshow.detail.playmodule.c;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Long;
import p5a.c;
import java.lang.System;
import com.kwai.framework.player.core.b;
import p7c.b;
import q87.c;

public final class c implements Runnable	// class@001653
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       _monitor_enter(QPhotoMediaPlayerCacheManager.class);
       if (PatchProxy.applyVoid(null, null, QPhotoMediaPlayerCacheManager.class, "12")) {
          _monitor_exit(QPhotoMediaPlayerCacheManager.class);
       }else {
          Map a = QPhotoMediaPlayerCacheManager.a;
          if (a.isEmpty()) {
             _monitor_exit(QPhotoMediaPlayerCacheManager.class);
          }else {
             Iterator iterator = a.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Map b = QPhotoMediaPlayerCacheManager.b;
                Long longx = b.get(uEntry.getKey());
                c value = uEntry.getValue();
                if (longx != null) {
                   long l = System.currentTimeMillis() - longx.longValue();
                   if (l - 5000 >= 0 && (value != null && value.b() == 3)) {
                      b.remove(uEntry.getKey());
                      iterator.remove();
                      value.release();
                      Object[] objArray = new Object[]{uEntry};
                      b.C().w("QPhotoMediaPlayerCacheM", "release expiring player ", objArray);
                   }
                }
             }
             _monitor_exit(QPhotoMediaPlayerCacheManager.class);
          }
       }
       return;
    }
}
