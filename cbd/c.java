package cbd.c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.plugin.search.kbox.weak.SearchWeakMusicView;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateMusicFeed;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import nfd.g3;
import android.app.Activity;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.plugin.search.utils.p;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import nfd.q1;

public class c extends m	// class@000518
{
    public final TemplateMusicFeed c;
    public final SearchWeakMusicView d;

    public void c(SearchWeakMusicView p0,TemplateMusicFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       c td;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       if (g3.p(this.d.J)) {
          td = this.d;
          p.n(td.S, td.I);
       }else {
          td = this.d;
          p.o(td.S, td.J, 2);
       }
       c td1 = this.d;
       q1.v(1, td1.R, td1.J, this.c, "MUSICSMALL_SUBCARD");
       return;
    }
}
