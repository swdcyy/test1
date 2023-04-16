package com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import j8c.b;
import hka.h;
import w3b.l;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import c4b.f;

public class MagicEmojiFragment$d implements Runnable	// class@001ba6
{
    public final MagicEmoji$MagicFace b;
    public final MagicEmojiFragment c;

    public void MagicEmojiFragment$d(MagicEmojiFragment p0,MagicEmoji$MagicFace p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, MagicEmojiFragment$d.class, "1")) {
          return;
       }
       if (this.c.isDetached()) {
          return;
       }
       String str = "MagicEmojiFragment";
       if (this.c.U0 != null) {
          b.a(str, "selectMagicFace onItemSelect");
          this.c.U0.b(this.b);
       }
       l.s(this.b);
       this.c.hi(false);
       MagicEmojiFragment h = this.c.H;
       if (h == MagicEmojiFragment$Source.LIVE || h == MagicEmojiFragment$Source.LOCAL_CHAT) {
          b.a(str, "selectMagicFace updateHistory");
          f.b().j(this.b);
       }
       return;
    }
}
