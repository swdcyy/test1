package apb.j;
import android.view.View$OnClickListener;
import apb.m;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import ekd.p0;
import kob.k;
import w46.b;
import e17.i;
import com.kuaishou.android.model.music.Music;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$MusicState;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.utility.n;
import kob.n;
import jqb.k;
import com.google.gson.JsonObject;
import k2b.e0;

public final class j implements View$OnClickListener	// class@0002ac
{
    public final m b;

    public void j(m p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, om, "6")) {
       }else if(!p0.C(p0.getContext())){
          Object[] objArray = new Object[0];
          k.D().t("PlayHistoryPV2", "network isn\'t connected", objArray);
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       }else {
          CloudMusicHelper$MusicState musicState = tb.q.j(tb.p.hashCode());
          if (!PatchProxy.applyVoidTwoRefs(p0, musicState, tb, om, "7") && (tb.u instanceof CloudMusicRecyclerFragment && !musicState.isPlaying())) {
             RecyclerView recyclerView = tb.u.h0();
             LinearLayoutManager layoutManage = recyclerView.getLayoutManager();
             if ((n.o(p0)[1] + p0.getMeasuredHeight()) > (n.o(recyclerView)[1] + layoutManage.getHeight())) {
                recyclerView.smoothScrollToPosition(layoutManage.getPosition(p0));
             }
          }
          if (musicState.isPlaying()) {
             tb.q.stop();
             k.i(tb.p, 1, tb.t.f());
          }else {
             tb.q.l(tb.p, tb.L);
             k.j(tb.p, 1, tb.t.f(), null, tb.u);
          }
       }
       return;
    }
}
