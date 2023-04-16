package com.yxcorp.gifshow.music.cloudmusic.history.HistoryMusicFragment$b;
import kob.f;
import com.yxcorp.gifshow.music.cloudmusic.history.HistoryMusicFragment;
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

public class HistoryMusicFragment$b extends f	// class@00201c
{
    public final HistoryMusicFragment l;

    public void HistoryMusicFragment$b(HistoryMusicFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public View J0(){
       Object obj = PatchProxy.apply(null, this, HistoryMusicFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.b(super.J0());
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, HistoryMusicFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KwaiEmptyStateView.e();
       obj.h(R.string.arg_RES_7f103719);
       obj.k(R.drawable.arg_RES_7f0805f2);
       return obj;
    }
}
