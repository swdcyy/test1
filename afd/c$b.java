package afd.c$b;
import com.yxcorp.gifshow.widget.m;
import afd.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.ExtInfo;
import com.google.gson.JsonObject;
import nfd.q1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class c$b extends m	// class@000020
{
    public final c c;

    public void c$b(c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       c$b tc = this.c;
       c s = tc.s;
       if (s.mKBoxItem.mType == 13) {
          c r = tc.r;
          TemplateBaseFeed mExtInfo = r.mExtInfo;
          if (mExtInfo != null && mExtInfo.mSearchLiveGoodPendant != null) {
             q1.x(1, tc.p, s, r, "AUTOPLAY_COMMODITY_PENDANT_SUBCARD", null, q1.r(r));
             this.c.P8();
          }
       }
       return;
    }
}
