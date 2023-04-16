package com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$magicFaceController$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import s3b.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import t5b.a;
import ixc.c;

public final class IMMagicEffectController$magicFaceController$2 extends Lambda implements a	// class@001d8f
{
    public static final IMMagicEffectController$magicFaceController$2 INSTANCE;

    static {
       IMMagicEffectController$magicFaceController$2.INSTANCE = new IMMagicEffectController$magicFaceController$2();
    }
    public void IMMagicEffectController$magicFaceController$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       b obj = PatchProxy.apply(null, this, IMMagicEffectController$magicFaceController$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(0x3bf0d115);
       a.o(obj, "PluginManager.get\(MagicEmojiPlugin::class.java\)");
       return obj.KA();
    }
}
