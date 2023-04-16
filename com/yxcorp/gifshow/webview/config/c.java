package com.yxcorp.gifshow.webview.config.c;
import com.yxcorp.gifshow.webview.config.a$b;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n3d.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.webview.config.d;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import yz7.r;
import o79.a;
import lnc.a1;
import w69.i$a;
import w69.b$a;
import android.app.Activity;
import android.os.Bundle;
import w69.b;
import w69.k$a;
import w69.k;
import w69.f$a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import java.util.ArrayList;
import uxb.o;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.i;
import x79.e;
import e16.a$a;
import e16.a;
import android.content.Context;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import yxc.e;
import com.yxcorp.gifshow.webview.config.b;
import erd.g;
import crd.b;

public class c implements a$b	// class@001742
{

    public void c(){
       super();
    }
    public void a(GifshowActivity p0,int p1,a p2){
       Intent intent;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "2")) {
          return;
       }
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          intent = PatchProxy.applyTwoRefs(p0, Boolean.FALSE, null, uod, "2");
          if (intent != PatchProxyResult.class) {
          label_00bf :
             p0.t1(intent, p1, p2);
             return;
          }
       }
       r.g("openMediaChooserActivity, openVideo:false");
       b$a uoa = new b$a();
       uoa.c(true);
       uoa.b(p0.getIntent().getExtras());
       k$a uoa1 = new k$a();
       uoa1.k(a1.r(R.string.arg_RES_7f1031c6, "1"));
       f$a uoa2 = new f$a();
       uoa2.g(a.c);
       uoa2.h(true);
       AlbumLimitOption$Builder uBuilder = new AlbumLimitOption$Builder();
       uBuilder.p(true);
       uBuilder = uBuilder.e(o.d());
       uBuilder.c(o.c());
       intent = e.f().a(p0, new a$a().g(new i$a().a(uoa.a()).m(uoa1.b()).d(uoa2.a()).f(uBuilder.d()).b()).f());
       goto label_00bf ;
    }
    public void b(GifshowActivity p0,int p1,a p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "1")) {
          return;
       }
       y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).R(new e(p0, p1, p2), b.b);
       return;
    }
}
