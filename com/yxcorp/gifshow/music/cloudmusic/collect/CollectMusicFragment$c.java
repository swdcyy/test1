package com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment$c;
import kob.m;
import com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.f;
import jqb.j;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;

public class CollectMusicFragment$c extends m	// class@001ff8
{
    public final CollectMusicFragment l;

    public void CollectMusicFragment$c(CollectMusicFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public View J0(){
       Object obj = PatchProxy.apply(null, this, CollectMusicFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.b(super.J0());
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, CollectMusicFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KwaiEmptyStateView.e();
       obj.h(R.string.arg_RES_7f1014d0);
       obj.k(R.drawable.arg_RES_7f0805f2);
       return obj;
    }
}
