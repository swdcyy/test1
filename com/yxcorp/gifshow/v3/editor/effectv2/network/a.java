package com.yxcorp.gifshow.v3.editor.effectv2.network.a;
import erd.o;
import com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDataProvider$highlightTimeRepo$2$a;
import hqc.d;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.k;
import uxb.e$a;
import com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDataProvider$highlightTimeRepo$2;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDataProvider;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Double;
import p16.c;

public final class a implements o	// class@000f59
{
    public final HighlightTimeDataProvider$highlightTimeRepo$2$a b;
    public final d c;

    public void a(HighlightTimeDataProvider$highlightTimeRepo$2$a p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          k ok = k.f();
          int i = this.c.p().a();
          double d = this.c.p().b();
          p0 = this.b.a.this$0.i().j();
          a.m(p0);
          a.o(p0, "editorHelperContract.videoSDKPlayerView!!");
          int videoWidth = p0.getVideoWidth();
          p0 = this.b.a.this$0.i().j();
          a.m(p0);
          a.o(p0, "editorHelperContract.videoSDKPlayerView!!");
          int videoHeight = p0.getVideoHeight();
          Objects.requireNonNull(ok);
          p0 = k.class;
          if (PatchProxy.isSupport(p0)) {
             obj = new Object[]{Integer.valueOf(i),Double.valueOf(d),Integer.valueOf(videoWidth),Integer.valueOf(videoHeight),Boolean.TRUE};
             p0 = PatchProxy.apply(obj, ok, p0, "7");
             if (p0 != PatchProxyResult.class) {
             label_00a2 :
                obj = p0;
             }
          }
          p0 = ok.e(i, d, videoWidth, videoHeight, null, true, false);
          goto label_00a2 ;
       }
       return obj;
    }
}
