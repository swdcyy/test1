package com.yxcorp.gifshow.magic.data.db.MagicDBProvider;
import com.yxcorp.gifshow.magic.data.db.MagicDBProvider$b;
import nsd.u;
import com.yxcorp.gifshow.magic.data.db.MagicDBProvider$a;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.magic.data.db.MagicDBProvider$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.magic.data.db.MagicFaceDatabase;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import androidx.room.RoomDatabase$a;
import androidx.room.c0;
import w2.c;
import androidx.room.RoomDatabase;
import x3b.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class MagicDBProvider	// class@001b86
{
    public final b a;
    public static final c b;
    public static final p c;
    public static final MagicDBProvider$b d;

    static {
       MagicDBProvider.d = new MagicDBProvider$b(null);
       MagicDBProvider.b = new MagicDBProvider$a(1, 2);
       MagicDBProvider.c = s.b(LazyThreadSafetyMode.SYNCHRONIZED, MagicDBProvider$Companion$instance$2.INSTANCE);
    }
    public void MagicDBProvider(){
       super();
       RoomDatabase$a uoa = c0.a(a.b(), MagicFaceDatabase.class, "kwai_magicface");
       c[] uocArray = new c[]{MagicDBProvider.b};
       uoa.b(uocArray);
       uoa.f();
       this.a = uoa.d().E();
    }
    public void MagicDBProvider(u p0){
       super();
       RoomDatabase$a uoa = c0.a(a.b(), MagicFaceDatabase.class, "kwai_magicface");
       c[] uocArray = new c[]{MagicDBProvider.b};
       uoa.b(uocArray);
       uoa.f();
       this.a = uoa.d().E();
    }
    public static final MagicDBProvider b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MagicDBProvider$b obj = PatchProxy.apply(null, null, MagicDBProvider.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = MagicDBProvider.d;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, MagicDBProvider$b.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = MagicDBProvider.c.getValue();
       }
       return obj1;
    }
    public final b a(){
       return this.a;
    }
}
