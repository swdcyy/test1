package com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDownloadHelper$highlightTimeDownloader$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import eb7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import wkd.b;
import c0d.a;

public final class HighlightTimeDownloadHelper$highlightTimeDownloader$2 extends Lambda implements a	// class@000f57
{
    public static final HighlightTimeDownloadHelper$highlightTimeDownloader$2 INSTANCE;

    static {
       HighlightTimeDownloadHelper$highlightTimeDownloader$2.INSTANCE = new HighlightTimeDownloadHelper$highlightTimeDownloader$2();
    }
    public void HighlightTimeDownloadHelper$highlightTimeDownloader$2(){
       super(0);
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, HighlightTimeDownloadHelper$highlightTimeDownloader$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       Context applicationC = uApplication.getApplicationContext();
       a.o(applicationC, "AppEnv.getAppContext\(\).applicationContext");
       return new a(applicationC, b.a(0x1a7467ca));
    }
    public Object invoke(){
       return this.invoke();
    }
}