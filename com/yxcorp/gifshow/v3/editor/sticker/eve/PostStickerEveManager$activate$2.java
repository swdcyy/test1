package com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveManager$activate$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import brd.t;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import otc.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveManager$activate$2$a;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveManager$activate$2$b;
import erd.g;
import crd.b;

public final class PostStickerEveManager$activate$2 extends Lambda implements l	// class@001243
{
    public static final PostStickerEveManager$activate$2 INSTANCE;

    static {
       PostStickerEveManager$activate$2.INSTANCE = new PostStickerEveManager$activate$2();
    }
    public void PostStickerEveManager$activate$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostStickerEveManager$activate$2.class, "1")) {
          return;
       }
       a.p(p0, "o");
       a.d = p0.subscribeOn(d.c).observeOn(d.a).subscribe(PostStickerEveManager$activate$2$a.b, PostStickerEveManager$activate$2$b.b);
       return;
    }
}
