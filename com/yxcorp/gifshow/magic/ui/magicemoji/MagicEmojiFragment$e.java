package com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$e;
import q4b.d;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import q87.c;
import uyb.c$a;
import com.yxcorp.gifshow.model.WishMagicInfo;
import com.kwai.video.westeros.models.EffectDescription;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kwai.robust.PatchProxyResult;
import w3b.p;

public class MagicEmojiFragment$e implements d	// class@001ba7
{
    public final MagicEmojiFragment a;

    public void MagicEmojiFragment$e(MagicEmojiFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MagicEmojiFragment$e.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicEmojiFragment", "onMultiInputTextRequest", objArray);
       MagicEmojiFragment u = this.a.U;
       if (u != null) {
          u.a();
       }
       return;
    }
    public void b(WishMagicInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiFragment$e.class, "3")) {
          return;
       }
       MagicEmojiFragment u = this.a.U;
       if (u != null) {
          u.e(p0);
       }
       return;
    }
    public EffectDescription c(){
       return this.a.K;
    }
    public String getTaskId(){
       MagicEmojiFragment j = this.a.J;
       MagicEmojiPageConfig mTaskId = (j != null)? j.mTaskId: "";
       return mTaskId;
    }
    public MagicEmoji$MagicFace r(){
       Object obj = PatchProxy.apply(null, this, MagicEmojiFragment$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.b().c(this.a.J.mPageIdentify);
    }
    public WishMagicInfo z(){
       Object[] objArray = null;
       MagicEmojiFragment obj = PatchProxy.apply(objArray, this, MagicEmojiFragment$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.U;
       if (obj != null) {
          objArray = obj.b();
       }
       return objArray;
    }
}
