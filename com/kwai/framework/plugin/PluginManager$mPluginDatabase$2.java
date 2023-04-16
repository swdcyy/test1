package com.kwai.framework.plugin.PluginManager$mPluginDatabase$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.plugin.repository.persistence.PluginDatabase;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sd6.c;
import com.kwai.framework.plugin.PluginManager;
import android.content.Context;
import kotlin.jvm.internal.a;
import sd6.a;
import sd6.b;
import androidx.room.RoomDatabase$a;
import androidx.room.c0;
import w2.c;
import androidx.room.RoomDatabase;

public final class PluginManager$mPluginDatabase$2 extends Lambda implements a	// class@000c76
{
    public static final PluginManager$mPluginDatabase$2 INSTANCE;

    static {
       PluginManager$mPluginDatabase$2.INSTANCE = new PluginManager$mPluginDatabase$2();
    }
    public void PluginManager$mPluginDatabase$2(){
       super(0);
    }
    public final PluginDatabase invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       RoomDatabase obj = PatchProxy.apply(null, this, PluginManager$mPluginDatabase$2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       Context uContext = PluginManager.a(PluginManager.H);
       obj = PatchProxy.applyOneRefs(uContext, new c(), c.class, str);
       if (obj != patchProxyRe) {
       }else {
          a.p(uContext, "context");
          RoomDatabase$a uoa = c0.a(uContext, PluginDatabase.class, "kwai_dva_plugin");
          c[] uocArray = new c[]{new a(1, 2)};
          uoa.b(uocArray);
          c[] uocArray1 = new c[]{new b(2, 3)};
          uoa.b(uocArray1);
          uoa.f();
          RoomDatabase roomDatabase = uoa.d();
          a.o(roomDatabase, "Room.databaseBuilder\(con¡­ngrade\(\)\n        .build\(\)");
          obj = roomDatabase;
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
