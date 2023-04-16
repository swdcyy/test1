package com.kuaishou.live.core.show.modifycover.b;
import com.kuaishou.live.core.show.modifycover.a;
import android.app.Activity;
import lc2.k;
import java.lang.Object;
import lc2.l;
import com.kuaishou.live.core.show.modifycover.b$a;
import com.kuaishou.live.core.show.modifycover.b$b;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import w69.i$a;
import w69.b$a;
import w69.b;
import w69.k$a;
import lnc.a1;
import w69.k;
import w69.f$a;
import o79.a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.i;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lc2.c;

public class b	// class@000d1c
{
    public a a;
    public String b;
    public LiveStartInfoResponse c;
    public File d;
    public k e;
    public Activity f;
    public final l g;
    public boolean h;
    public b i;
    public b j;
    public b k;
    public b l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final c p;
    public a$a q;

    public void b(a p0,Activity p1,k p2){
       super();
       this.g = new l();
       this.m = false;
       this.n = false;
       this.o = false;
       this.p = new b$a(this);
       this.q = new b$b(this);
       this.f = p1;
       this.e = p2;
       this.a = p0;
    }
    public t a(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b$a uoa = new b$a();
       uoa.c(true);
       k$a uoa1 = new k$a();
       uoa1.f(a1.p(R.string.arg_RES_7f103a83));
       f$a uoa2 = new f$a();
       uoa2.g(a.c);
       uoa2.h(false);
       AlbumLimitOption$Builder uBuilder = new AlbumLimitOption$Builder();
       uBuilder.p(true);
       return new LiveEntryCoverSelectSupplier(this.f, this.p).c(new i$a().a(uoa.a()).m(uoa1.b()).d(uoa2.a()).f(uBuilder.d()).b());
    }
}
