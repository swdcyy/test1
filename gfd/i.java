package gfd.i;
import ucd.n;
import gfd.i$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;

public class i extends n	// class@000f10
{
    public ImageView p;
    public SearchItem q;
    public TemplateBaseFeed r;
    public SearchResultFragment s;
    public f t;
    public f u;

    public void i(){
       super();
       this.u = new i$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       this.t.set(this.u);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0f94);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.q = this.q8(SearchItem.class);
       this.s = this.r8("FRAGMENT");
       this.r = this.r8("SEARCH_PLAY_KBOX_FEED");
       this.t = this.x8("SEARCH_AUTO_PLAY_LOG");
       return;
    }
}
