package com.yxcorp.gifshow.profile.music.CollectionMusicFragment$d$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment$d;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o07.o;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment;
import kob.r;
import java.lang.Integer;

public class CollectionMusicFragment$d$a implements PopupInterface$h	// class@0013f6
{
    public final boolean b;
    public final CollectionMusicFragment$d c;

    public void CollectionMusicFragment$d$a(CollectionMusicFragment$d p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionMusicFragment$d$a.class, "1")) {
          return;
       }
       o.e(this, p0);
       if (this.b != null) {
          this.c.a.O.pause();
       }
       return;
    }
    public void H(c p0,int p1){
       CollectionMusicFragment$d$a uod$a = CollectionMusicFragment$d$a.class;
       if (PatchProxy.isSupport(uod$a) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod$a, "2")) {
          return;
       }
       o.b(this, p0, p1);
       if (this.b != null) {
          this.c.a.O.start();
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
