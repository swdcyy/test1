package com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment$c;
import kob.f;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.f;

public class LocalMusicFragment$c extends f	// class@002026
{
    public final LocalMusicFragment l;

    public void LocalMusicFragment$c(LocalMusicFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, LocalMusicFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.k(R.drawable.arg_RES_7f0805f2);
       return obj;
    }
}
