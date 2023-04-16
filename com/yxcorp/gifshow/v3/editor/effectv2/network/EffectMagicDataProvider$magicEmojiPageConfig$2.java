package com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider$magicEmojiPageConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$b;
import com.yxcorp.gifshow.model.SimpleMagicFace;

public final class EffectMagicDataProvider$magicEmojiPageConfig$2 extends Lambda implements a	// class@000f4f
{
    public final EffectMagicDataProvider this$0;

    public void EffectMagicDataProvider$magicEmojiPageConfig$2(EffectMagicDataProvider p0){
       this.this$0 = p0;
       super(0);
    }
    public final MagicEmojiPageConfig invoke(){
       MagicEmojiPageConfig$b obj = PatchProxy.apply(null, this, EffectMagicDataProvider$magicEmojiPageConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MagicEmojiPageConfig$b.c("magic_edit");
       obj.l(this.this$0.e);
       EffectMagicDataProvider b = this.this$0.b;
       if (b != null) {
          obj.n(b.mId);
       }
       return obj.a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
