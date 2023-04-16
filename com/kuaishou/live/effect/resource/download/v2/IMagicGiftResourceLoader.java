package com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import wz2.a;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$a;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Type;

public interface abstract IMagicGiftResourceLoader	// class@001b56
{

    void a(MagicEmoji$MagicFace p0);
    void b(MagicEmoji$MagicFace p0);
    void c(MagicEmoji$MagicFace p0);
    boolean d(MagicEmoji$MagicFace p0);
    void e(a p0,MagicEmoji$MagicFace p1,IMagicGiftResourceLoader$a p2);
    IMagicGiftResourceLoader$Type getType();
}
