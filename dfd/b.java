package dfd.b;
import ucd.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import xed.b;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import android.view.View;
import nfd.o3;
import ekd.m1;
import android.widget.ImageView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Boolean;

public class b extends n	// class@000cbb
{
    public TemplateBaseFeed p;
    public RecyclerFragment q;
    public boolean r;
    public ImageView s;
    public KBoxItem t;

    public void b(){
       super();
       this.r = true;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (this.r != null && !b.b(this.p)) {
          b tt = this.t;
          if (tt == null || tt.mType != 13) {
             o3.H(this.s, 0);
             return;
          }
       }
       o3.H(this.s, 8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a37df);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("SEARCH_PLAY_KBOX_FEED");
       this.q = this.r8("FRAGMENT");
       this.r = this.v8("SEARCH_PLAY_IMAGE_ENABLE_PLAY", Boolean.class).booleanValue();
       this.t = this.s8(KBoxItem.class);
       return;
    }
}
