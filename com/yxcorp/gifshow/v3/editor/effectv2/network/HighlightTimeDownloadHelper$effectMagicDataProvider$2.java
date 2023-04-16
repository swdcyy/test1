package com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDownloadHelper$effectMagicDataProvider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import iqc.e;
import com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;

public final class HighlightTimeDownloadHelper$effectMagicDataProvider$2 extends Lambda implements a	// class@000f55
{
    public final e this$0;

    public void HighlightTimeDownloadHelper$effectMagicDataProvider$2(e p0){
       this.this$0 = p0;
       super(0);
    }
    public final EffectMagicDataProvider invoke(){
       Object obj = PatchProxy.apply(null, this, HighlightTimeDownloadHelper$effectMagicDataProvider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HighlightTimeDownloadHelper$effectMagicDataProvider$2 tthis$0 = this.this$0;
       return new EffectMagicDataProvider(tthis$0.e, tthis$0.f, true);
    }
    public Object invoke(){
       return this.invoke();
    }
}
