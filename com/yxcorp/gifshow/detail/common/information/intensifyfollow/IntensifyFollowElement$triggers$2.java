package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$triggers$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import v6a.f0;
import uw9.q3;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class IntensifyFollowElement$triggers$2 extends Lambda implements a	// class@001422
{
    public static final IntensifyFollowElement$triggers$2 INSTANCE;

    static {
       IntensifyFollowElement$triggers$2.INSTANCE = new IntensifyFollowElement$triggers$2();
    }
    public void IntensifyFollowElement$triggers$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, IntensifyFollowElement$triggers$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f0.d;
       String str = q3.a.getString("pyml_following_intensify_triggers", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          objArray = CollectionsKt__CollectionsKt.E();
       }
       return objArray;
    }
}
