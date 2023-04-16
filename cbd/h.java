package cbd.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateLiveFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.plugin.search.entity.kbox.KBoxExtParam;
import android.view.ViewGroup;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import com.yxcorp.plugin.search.utils.j0;
import android.view.View;
import ekd.m1;

public class h extends PresenterV2	// class@00051d
{
    public LiveStreamFeed p;
    public SearchItem q;
    public TemplateLiveFeed r;
    public LiveCoverIconView s;

    public void h(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "3")) {
          return;
       }
       h tq = this.q;
       int i = 0;
       if (tq != null && (!q.f(tq.mKBoxBaseItems) && this.q.mKBoxBaseItems.size() >= 2)) {
          if (this.q.mKBoxBaseItems.get(i).mType == 13) {
             objArray = this.q.mKBoxBaseItems.get(i);
          }else if(this.q.mKBoxBaseItems.get(1).mType == 13){
             objArray = this.q.mKBoxBaseItems.get(1);
          }
       }
       if (objArray != null) {
          KBoxItem mKBoxFeeds = objArray.mKBoxFeeds;
          if (!q.f(mKBoxFeeds) && mKBoxFeeds.get(i) instanceof TemplateLiveFeed) {
             TemplateLiveFeed templateLive = mKBoxFeeds.get(i);
             this.r = templateLive;
             if (templateLive != null) {
                templateLive = templateLive.mQphoto;
                if (templateLive != null) {
                   this.p = templateLive.mEntity;
                }
             }
             if (this.p == null || this.q.mKBoxItem.mExtParam.isEnableKboxSlide != null) {
                this.s.setVisibility(8);
             }else {
                this.s.setVisibility(i);
                h tp = this.p;
                j0.b(this.s, tp, (r1.y1(tp) - 1));
                return;
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       this.s.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a268f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.q = this.q8(SearchItem.class);
       return;
    }
}
