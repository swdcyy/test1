package com.yxcorp.gifshow.album.home.AlbumHomeFragment$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub;
import w69.e;
import kotlin.jvm.internal.a;

public final class AlbumHomeFragment$d implements Observer	// class@0019fd
{
    public final AlbumHomeFragment b;

    public void AlbumHomeFragment$d(AlbumHomeFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumHomeFragment$d.class, "1")) {
       }else {
          e uoe = this.b.rh().j();
          if (uoe != null) {
             a.h(p0, "enable");
             uoe.d(p0.booleanValue());
          }
       }
       return;
    }
}
