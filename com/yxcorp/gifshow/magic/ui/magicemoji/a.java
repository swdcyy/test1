package com.yxcorp.gifshow.magic.ui.magicemoji.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import java.lang.Object;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import w3b.l;
import androidx.fragment.app.Fragment;
import z3b.s0;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import q87.c;
import z3b.p0;
import java.util.concurrent.ExecutorService;
import ekd.k1;
import w3b.k;
import t45.c;

public final class a implements Runnable	// class@001bb5
{
    public final MagicEmojiFragment b;
    public final MagicEmojiResponse c;

    public void a(MagicEmojiFragment p0,MagicEmojiResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       MagicBusinessId magicBusines = l.d(tb.H);
       int i = 0;
       if (tb.isAdded()) {
          s0 os0 = s0.e();
          Objects.requireNonNull(os0);
          if (PatchProxy.applyVoid(null, os0, s0.class, "5") || (s0.g && s0.f())) {
             Object[] objArray1 = new Object[i];
             b.D().w("MagicFacePreDownload", "打开魔表面板，预下载热门前3个魔表", objArray1);
             s0.a.execute(p0.b);
          }
       label_0043 :
          if (magicBusines != MagicBusinessId.VIDEO && (!PatchProxy.applyVoidOneRefs(tc, null, l.class, "33") && tc != null)) {
             c.a(new k(k1.i(), tc.clone()));
          }
       }
    label_0065 :
       Object[] objArray = new Object[i];
       b.D().w("MagicEmojiFragment", "logOpenMagicEmojiTimeCost while updateFragments", objArray);
       return;
    }
}
