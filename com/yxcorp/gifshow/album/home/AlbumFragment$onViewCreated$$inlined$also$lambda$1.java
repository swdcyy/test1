package com.yxcorp.gifshow.album.home.AlbumFragment$onViewCreated$$inlined$also$lambda$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w69.k0;
import java.util.List;
import q79.d;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;

public final class AlbumFragment$onViewCreated$$inlined$also$lambda$1 extends Lambda implements p	// class@0019f7
{
    public final Ref$IntRef $preSelectedDataCount$inlined;
    public final AlbumFragment this$0;

    public void AlbumFragment$onViewCreated$$inlined$also$lambda$1(AlbumFragment p0,Ref$IntRef p1){
       this.this$0 = p0;
       this.$preSelectedDataCount$inlined = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.booleanValue(), p1.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0,boolean p1){
       if (PatchProxy.isSupport2(AlbumFragment$onViewCreated$$inlined$also$lambda$1.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), Boolean.valueOf(p1), this, AlbumFragment$onViewCreated$$inlined$also$lambda$1.class, "1")) {
          return;
       }
       if (this.$preSelectedDataCount$inlined.element > null) {
          AlbumFragment e = this.this$0.E;
          if (e != null) {
             e.g(p0);
          }
       }
       if (p1) {
          AlbumFragment y = this.this$0.Y;
          if (y != null) {
             List list = y.m();
             if (list != null) {
                AlbumSelectedContainer uAlbumSelect = this.this$0.wh();
                if (uAlbumSelect != null) {
                   uAlbumSelect.W(list);
                }
             }
          }
       }
       this.this$0.ph(true);
       PatchProxy.onMethodExit(AlbumFragment$onViewCreated$$inlined$also$lambda$1.class, "1");
       return;
    }
}
