package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$f;
import erd.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import android.content.Intent;
import android.app.Activity;

public final class SwapMagicAlbumActivity$f implements a	// class@001c1e
{
    public final SwapMagicAlbumActivity b;
    public final List c;

    public void SwapMagicAlbumActivity$f(SwapMagicAlbumActivity p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SwapMagicAlbumActivity$f.class, "1")) {
          return;
       }
       Log.b("SwapMagicAlbumActivity", "clip index finish");
       this.b.A3();
       SwapMagicAlbumActivity$f tb = this.b;
       tb.D3(this.c, this.c, tb.getIntent());
       return;
    }
}
