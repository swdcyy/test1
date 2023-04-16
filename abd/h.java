package abd.h;
import ucd.n;
import nfd.t0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rkd.b;
import java.lang.Integer;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateCommonFeed;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.plugin.search.widget.CoverImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.entity.SearchItem;
import nfd.q1;
import android.view.View;
import ekd.m1;
import abd.g;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;

public class h extends n	// class@0000c7
{
    public CoverImageView p;
    public TextView q;
    public TextView r;
    public TemplateCommonFeed s;
    public int t;
    public int u;
    public SearchResultFragment v;
    public SearchItem w;

    public void h(){
       super();
       this.t = t0.t;
       this.u = t0.i;
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       int i = 3;
       if (b.g() && b.e()) {
          i = 5;
       }
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, oh, "6")) {
          int i2 = ((n.z(this.getContext()) - (this.t * 2)) - (this.u * (i - 1))) / i;
          ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
          int i3 = -2;
          if (layoutParams == null) {
             layoutParams = new ViewGroup$LayoutParams(i2, i3);
          }
          layoutParams.width = i2;
          layoutParams.height = i3;
          this.p.setLayoutParams(layoutParams);
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "4")) {
          if (this.s.getCoverInfo() != null) {
             this.p.d(this.s.getCoverInfo().mCoverUrl, this.s.getCoverInfo().mCoverUrls);
          }
          this.p.setWidthHeightRatio(0x3f400000);
       }
       int i1 = 4;
       if (TextUtils.x(this.s.mCoverInfo.mCoverTitle)) {
          this.q.setVisibility(i1);
       }else {
          this.q.setVisibility(0);
          this.q.setText(this.s.mCoverInfo.mCoverTitle);
       }
       if (TextUtils.x(this.s.mCoverInfo.mCoverSubTitle)) {
          this.r.setVisibility(i1);
       }else {
          this.r.setVisibility(0);
          this.r.setText(this.s.mCoverInfo.mCoverSubTitle);
       }
       if (!this.s.isShowed()) {
          this.s.setShowed(true);
          q1.v(0, this.v, this.w, this.s, "FILTERABLE_SUBCARD");
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a135e);
       this.q = m1.f(p0, 0x7f0a04f8);
       this.r = m1.f(p0, 0x7f0a04e9);
       this.P8(this.p, new g(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.v = this.r8("FRAGMENT");
       this.s = this.q8(TemplateBaseFeed.class);
       this.w = this.r8("SEARCH_ITEM");
       return;
    }
}
