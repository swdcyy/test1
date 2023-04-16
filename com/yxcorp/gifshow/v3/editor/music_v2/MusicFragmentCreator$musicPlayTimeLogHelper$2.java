package com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$musicPlayTimeLogHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import d46.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import a46.c;
import a46.d;

public final class MusicFragmentCreator$musicPlayTimeLogHelper$2 extends Lambda implements a	// class@001057
{
    public static final MusicFragmentCreator$musicPlayTimeLogHelper$2 INSTANCE;

    static {
       MusicFragmentCreator$musicPlayTimeLogHelper$2.INSTANCE = new MusicFragmentCreator$musicPlayTimeLogHelper$2();
    }
    public void MusicFragmentCreator$musicPlayTimeLogHelper$2(){
       super(0);
    }
    public final d invoke(){
       b obj = PatchProxy.apply(null, this, MusicFragmentCreator$musicPlayTimeLogHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(-93013550);
       a.o(obj, "PluginManager.get\(MusicPlugin::class.java\)");
       d uod = obj.hN();
       uod.setBusinessType(11);
       return uod;
    }
    public Object invoke(){
       return this.invoke();
    }
}
