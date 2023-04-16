package com.yxcorp.gifshow.gamezone.bridge.d$a;
import vxc.z;
import com.yxcorp.gifshow.gamezone.bridge.d;
import com.kuaishou.webkit.WebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import o56.a;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams$Params;
import android.net.Uri;
import lnc.m9;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.c;
import brd.t;
import com.yxcorp.gifshow.gamezone.bridge.a;
import erd.o;
import brd.z;
import lrd.b;
import t45.d;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import sc4.a;
import erd.a;
import com.yxcorp.gifshow.gamezone.bridge.b;
import com.yxcorp.gifshow.gamezone.bridge.c;
import erd.g;
import crd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class d$a extends z	// class@0012ba
{
    public final YodaBaseWebView k;
    public final String l;
    public final String m;
    public final String n;
    public final d o;

    public void d$a(d p0,WebView p1,YodaBaseWebView p2,String p3,String p4,String p5){
       this.o = p0;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       super(p1);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else if(p0 == null || p0.mParams == null){
          GifshowActivity gifshowActiv = this.e();
          Intent intent = new Intent();
          intent.setPackage(a.v);
          intent.setData(Uri.parse(p0.mParams.mScheme));
          intent.putExtra("game_tv_open_from_desktop", true);
          intent.setAction("android.intent.action.VIEW");
          intent.addCategory("android.intent.category.DEFAULT");
          JsAddShortcutToDesktopParams mParams = p0.mParams;
          if (!m9.e(mParams.mShortcutId, mParams.mTitle, intent, "GameGzoneAddShortcutToDesktopFunction")) {
             d$a to = this.o;
             Objects.requireNonNull(to);
             ProgressFragment progressFrag = PatchProxy.applyOneRefs(gifshowActiv, to, d.class, "3");
             if (progressFrag != PatchProxyResult.class) {
             }else {
                progressFrag = new ProgressFragment();
                if (progressFrag.isAdded()) {
                   progressFrag = null;
                }else {
                   progressFrag.show(gifshowActiv.getSupportFragmentManager(), "runner");
                }
             }
             if (progressFrag == null) {
                this.o.l(this.k, FunctionResultParams.createErrorResult(-1, ""), this.l, this.m, null, this.n);
             }else {
                t.just(progressFrag).flatMap(new a(this, p0)).subscribeOn(b.c()).observeOn(d.a).compose(c.c(gifshowActiv.m(), ActivityEvent.DESTROY)).doFinally(new a(progressFrag)).subscribe(new b(this, gifshowActiv, p0, intent), new c(this));
             }
          }else {
             b.Z(LiveLogTag.GZONE, "not show dialog because same name shortcut has been exist!!!");
             this.o.l(this.k, FunctionResultParams.createSuccessResult(), this.l, this.m, null, this.n);
          }
       }
       return;
    }
}
