package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.c;
import java.lang.Runnable;
import java.lang.Object;
import wkd.b;
import com.yxcorp.gifshow.featured.offline.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.hodor.Hodor;
import iea.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public final class c implements Runnable	// class@000f34
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       b uob = b.a(0x260f527b);
       Objects.requireNonNull(uob);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uob, b.class, "9")) {
       }else {
          Hodor.instance().clearCacheFilesOfCacheGroup("offline_photo_cache_group");
          SharedPreferences a = b.a;
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putString(b.d("user")+"offlineCachedList", b.e(objArray));
          g.a(uEditor);
          uEditor = a.edit();
          uEditor.putString(b.d("user")+"offlineCachingList", b.e(objArray));
          g.a(uEditor);
          SharedPreferences$Editor uEditor1 = a.edit();
          uEditor1.putBoolean(b.d("user")+"isClearOffline", true);
          g.a(uEditor1);
       }
       return;
    }
}
