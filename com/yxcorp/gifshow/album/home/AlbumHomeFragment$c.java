package com.yxcorp.gifshow.album.home.AlbumHomeFragment$c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub;
import w69.e;

public final class AlbumHomeFragment$c implements Observer	// class@0019fc
{
    public final AlbumHomeFragment b;

    public void AlbumHomeFragment$c(AlbumHomeFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumHomeFragment$c.class, "1")) {
       }else {
          a.h(p0, "expand");
          if (p0.booleanValue()) {
             p0 = this.b.rh().j();
             if (p0 != null) {
                p0.c(true);
             }
          }else {
             p0 = this.b.rh().j();
             if (p0 != null) {
                p0.l3();
             }
          }
       }
       return;
    }
}
