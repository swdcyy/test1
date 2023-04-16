package com.yxcorp.gifshow.v3.editor.sticker.p0$a;
import voc.y;
import com.yxcorp.gifshow.v3.editor.sticker.p0;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ooc.g1;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$c;
import itc.j2;
import java.util.List;
import java.util.Set;
import mrd.a;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$d;
import itc.m2;
import x59.e$d;
import android.view.ViewPropertyAnimator;
import android.view.View;
import itc.f2;
import java.lang.Runnable;

public class p0$a implements y	// class@00127c
{
    public final p0 b;

    public void p0$a(p0 p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p0$a.class, "1")) {
          return;
       }
       p0$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, p0.class, "5")) {
          g1.v(tb.z, tb.A, "click_sticker_store");
          StickerLibraryFragment stickerLibra = new StickerLibraryFragment();
          tb.L = stickerLibra;
          StickerLibraryFragment$c uoc = new StickerLibraryFragment$c(tb.u, tb.v, tb.x, new j2(tb));
          uoc.b(tb.N);
          uoc.c(new m2(tb));
          stickerLibra.Th(uoc);
          tb.q.animate().translationY(0).setDuration(0).withEndAction(new f2(tb)).start();
       }
       return;
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       x.a(this);
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       x.j(this);
    }
    public void z2(){
       x.c(this);
    }
}
