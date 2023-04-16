package com.yxcorp.gifshow.record.album.LocalAlbumListFragment$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment;
import com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.fragment.user.h;
import com.yxcorp.gifshow.album.LocalAlbumParams;
import ika.o;

public class LocalAlbumListFragment$a extends GridLayoutManager$b	// class@0016fd
{
    public final LocalAlbumGridGroupHeaderAdapter e;
    public final LocalAlbumListFragment f;

    public void LocalAlbumListFragment$a(LocalAlbumListFragment p0,LocalAlbumGridGroupHeaderAdapter p1){
       this.f = p0;
       this.e = p1;
       super();
    }
    public int f(int p0){
       LocalAlbumListFragment$a uoa = LocalAlbumListFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uoa = this.f;
       int i = (uoa.t.t != null)? 1: 0;
       if (i && !p0) {
          return uoa.v.getColumnCount();
       }else if(this.e.f0(p0) == 1000){
          return this.f.v.getColumnCount();
       }else {
          return 1;
       }
    }
}
