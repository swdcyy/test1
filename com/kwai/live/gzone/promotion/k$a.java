package com.kwai.live.gzone.promotion.k$a;
import com.kwai.live.gzone.promotion.k$c;
import com.kwai.live.gzone.promotion.k;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import s67.e;
import fq5.b;
import java.lang.CharSequence;
import com.kwai.framework.model.feed.BaseFeed;
import s67.i1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import androidx.fragment.app.Fragment;
import java.lang.Integer;

public class k$a extends k$c	// class@000dc8
{
    public final int d;
    public final LiveGzonePromotionGame e;
    public final WebViewFragment f;
    public final k g;

    public void k$a(k p0,int p1,LiveGzonePromotionGame p2,WebViewFragment p3){
       this.g = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       super(p0);
    }
    public void b(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(k$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, k$a.class, "1")) {
          return;
       }
       i1.i(this.g.k.e.d(), this.g.k.e.getLiveStreamId(), String.valueOf(this.g.l(this.d)), i1.c(this.g.k.f), this.g.k.e.a());
       this.a = p2;
       this.g.D(this.e, this.f, this.d);
       this.g.H(this.f, true);
       return;
    }
    public void c(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(k$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, k$a.class, "2")) {
          return;
       }
       this.g.H(this.f, false);
       return;
    }
}
