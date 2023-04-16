package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$i;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import kotlin.jvm.internal.a;
import android.app.Activity;
import android.content.Intent;
import g26.b;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.f;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class SwapMagicAlbumActivity$i implements g	// class@001c21
{
    public final SwapMagicAlbumActivity b;
    public final QMedia c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public void SwapMagicAlbumActivity$i(SwapMagicAlbumActivity p0,QMedia p1,int p2,boolean p3,boolean p4,int p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwapMagicAlbumActivity$i.class, "1")) {
       }else {
          p0 = this.b.z3(this.c, this.d);
          SwapMagicAlbumActivity t = this.b.T;
          a.m(t);
          SwapMagicAlbumActivity$i tb = this.b;
          Intent intent = t.uO(tb, this.c, p0, tb.B3(), true, true, this.b.R, this.e);
          intent.putExtra("kuaishan_clip_for_swap_magic", true);
          this.b.t1(intent, 101, new f(this, p0, intent));
       }
       return;
    }
}
