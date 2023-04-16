package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$k;
import com.yxcorp.gifshow.album.IAlbumMainFragment$b;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import java.lang.Object;
import java.lang.Long;
import w69.z;
import r79.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i5b.j;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$a;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import nsd.s0;

public final class SwapMagicAlbumActivity$k implements IAlbumMainFragment$b	// class@001c23
{
    public final SwapMagicAlbumActivity a;

    public void SwapMagicAlbumActivity$k(SwapMagicAlbumActivity p0){
       this.a = p0;
       super();
    }
    public void a(Long p0){
       z.b(this, p0);
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwapMagicAlbumActivity$k.class, "1")) {
          return;
       }
       String str = this.a.B3();
       if (str != null) {
          j a = j.a;
          SwapMagicAlbumActivity$k ta = this.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(ta, str, a, j.class, "6")) {
             a.p(ta, "page");
             a.p(str, "magicId");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "USER_DEFINED_MAGIC_FACE_PICK_PICTURE";
             i3 oi3 = i3.f();
             oi3.d("magic_face_id", str);
             uElementPack.params = oi3.e();
             u1.L("", ta, 1, uElementPack, null);
          }
       }
       return;
    }
    public void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwapMagicAlbumActivity$k.class, "2")) {
          return;
       }
       Iterator iterator = this.a.W.iterator();
       QMedia qMedia = null;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          QMedia qMedia1 = obj.b();
          if (qMedia1 != null) {
             qMedia = qMedia1.path;
          }
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcorp.gifshow.models.QMedia");
          if (TextUtils.n(qMedia, p0.path)) {
             qMedia = obj;
             break ;
          }
       }
       SwapMagicAlbumActivity w = this.a.W;
       Objects.requireNonNull(w, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
       s0.a(w).remove(qMedia);
       return;
    }
}
