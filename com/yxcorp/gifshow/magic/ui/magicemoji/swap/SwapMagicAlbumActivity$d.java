package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$d;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import java.lang.Integer;
import java.util.List;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import qsd.d;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public final class SwapMagicAlbumActivity$d implements g	// class@001c1c
{
    public final SwapMagicAlbumActivity b;
    public final Integer[] c;
    public final List d;

    public void SwapMagicAlbumActivity$d(SwapMagicAlbumActivity p0,Integer[] p1,List p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwapMagicAlbumActivity$d.class, "1")) {
       }else {
          int i = p0.getFirst().intValue();
          int i1 = p0.getSecond().intValue();
          SwapMagicAlbumActivity u = this.b.U;
          if (u != null) {
             a.m(u);
             if (u.isAdded()) {
                this.c[i] = Integer.valueOf(i1);
                float f = ((float)ArraysKt___ArraysKt.zw(this.c) / (float)(this.d.size() * 100)) * (float)100;
                Log.l("SwapMagicAlbumActivity", "info progress "+i1+" index"+i+" size:"+this.d.size()+", percent:"+f);
                i1 = this.b.U;
                a.m(i1);
                i1.Nh(d.H0(f));
             }
          }
       }
       return;
    }
}
