package com.kwai.moved.utility.AlbumEnv$globalGson$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.google.gson.Gson;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g79.a;
import java.util.Objects;
import w69.v;
import kotlin.jvm.internal.a;
import w69.c;

public final class AlbumEnv$globalGson$2 extends Lambda implements a	// class@000f70
{
    public static final AlbumEnv$globalGson$2 INSTANCE;

    static {
       AlbumEnv$globalGson$2.INSTANCE = new AlbumEnv$globalGson$2();
    }
    public void AlbumEnv$globalGson$2(){
       super(0);
    }
    public final Gson invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, AlbumEnv$globalGson$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.c;
       Objects.requireNonNull(obj);
       c uoc = PatchProxy.apply(objArray, obj, a.class, "13");
       if (uoc != patchProxyRe) {
       }else {
          obj.a();
          c b = a.b;
          if (b == null) {
             a.S("mConfiguration");
          }
          uoc = b.e;
       }
       return uoc.a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
