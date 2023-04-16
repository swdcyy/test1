package com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDownloadHelper$fontDownloadHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HighlightTimeDownloadHelper$fontDownloadHelper$2 extends Lambda implements a	// class@000f56
{
    public static final HighlightTimeDownloadHelper$fontDownloadHelper$2 INSTANCE;

    static {
       HighlightTimeDownloadHelper$fontDownloadHelper$2.INSTANCE = new HighlightTimeDownloadHelper$fontDownloadHelper$2();
    }
    public void HighlightTimeDownloadHelper$fontDownloadHelper$2(){
       super(0);
    }
    public final FontDownloadHelper invoke(){
       Object obj = PatchProxy.apply(null, this, HighlightTimeDownloadHelper$fontDownloadHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FontDownloadHelper();
    }
    public Object invoke(){
       return this.invoke();
    }
}
