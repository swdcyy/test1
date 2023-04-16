package com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment$b;
import kob.m;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.f;

public class SearchMusicFragment$b extends m	// class@002031
{
    public final SearchMusicFragment l;

    public void SearchMusicFragment$b(SearchMusicFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, SearchMusicFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.k(R.drawable.arg_RES_7f0805f2);
       return obj;
    }
}
