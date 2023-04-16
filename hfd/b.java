package hfd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hfd.b$a;
import android.view.View$OnClickListener;
import android.view.View;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nfd.t0;
import com.yxcorp.plugin.search.utils.j0;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import jfd.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import igc.b;
import yed.d;
import im8.f;
import w99.f;
import u99.b;
import u99.f;
import e7d.h;

public class b extends PresenterV2	// class@000f7f
{
    public f A;
    public b B;
    public f C;
    public TemplateBaseFeed D;
    public h E;
    public TextView F;
    public KwaiImageView G;
    public View H;
    public a I;
    public PhotoMeta p;
    public CoverMeta q;
    public BaseFeed r;
    public SearchItem s;
    public KBoxItem t;
    public d u;
    public BaseFragment v;
    public BaseFragment w;
    public b x;
    public d y;
    public f z;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.H.setOnClickListener(new b$a(this));
       b tD = this.D;
       if (tD != null) {
          TemplateBaseFeed mCoverExtInf = tD.mCoverExtInfo;
          if (mCoverExtInf != null && !TextUtils.x(mCoverExtInf.mDisplayInfo)) {
             j0.I(this.F, 0, 0, t0.k, 0);
          label_0036 :
             return;
          }
       }
       j0.I(this.F, 0, 0, t0.H, 0);
       goto label_0036 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.H = m1.f(p0, 0x7f0a30d8);
       this.G = m1.f(p0, 0x7f0a0f93);
       this.F = m1.f(p0, 0x7f0a1715);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(PhotoMeta.class);
       this.q = this.q8(CoverMeta.class);
       this.r = this.r8("feed");
       this.s = this.q8(SearchItem.class);
       this.t = this.q8(KBoxItem.class);
       this.u = this.r8("SEARCH_PLAY_PHOTO_WRAPPER");
       this.w = this.r8("FRAGMENT");
       this.v = this.r8("FRAGMENT");
       this.x = this.t8("SEARCH_PLAY_MODULE_WRAPPER");
       this.y = this.r8("SEARCH_PLAY_LAZY_DATA");
       this.z = this.x8("ADAPTER_POSITION");
       this.A = this.r8("SEARCH_PLAY_DETAIL_CALLBACK");
       this.B = this.r8("SEARCH_PLAY_VIDEO_STAT_RECORDER");
       this.C = this.r8("SEARCH_PLAY_VIDEO_STAT_COLLECTOR");
       this.D = this.r8("SEARCH_PLAY_KBOX_FEED");
       this.E = this.r8("SEARCH_FRAGMENT_DELEGATE");
       return;
    }
}
