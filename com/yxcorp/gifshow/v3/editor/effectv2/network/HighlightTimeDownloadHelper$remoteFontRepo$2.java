package com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDownloadHelper$remoteFontRepo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HighlightTimeDownloadHelper$remoteFontRepo$2 extends Lambda implements a	// class@000f58
{
    public static final HighlightTimeDownloadHelper$remoteFontRepo$2 INSTANCE;

    static {
       HighlightTimeDownloadHelper$remoteFontRepo$2.INSTANCE = new HighlightTimeDownloadHelper$remoteFontRepo$2();
    }
    public void HighlightTimeDownloadHelper$remoteFontRepo$2(){
       super(0);
    }
    public final RemoteFontRepo invoke(){
       Object obj = PatchProxy.apply(null, this, HighlightTimeDownloadHelper$remoteFontRepo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RemoteFontRepo();
    }
    public Object invoke(){
       return this.invoke();
    }
}
