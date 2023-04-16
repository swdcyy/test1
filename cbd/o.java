package cbd.o;
import ucd.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMetaExt;
import i8d.g1;
import com.facebook.drawee.view.DraweeView;
import ac.b;
import yb.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import xb.t$b;
import android.widget.ImageView;
import i8d.i;
import com.yxcorp.gifshow.model.CDNUrl;
import yed.c;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateMeta;
import com.yxcorp.plugin.search.entity.TemplateText;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import nfd.o3;
import android.text.TextPaint;
import android.widget.TextView;
import nfd.t0;
import com.yxcorp.plugin.search.utils.j0;
import ekd.j;
import cbd.n;
import ub.b;
import com.kuaishou.android.model.feed.ImageFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kwai.framework.model.feed.BaseFeed;
import nfd.c3;
import com.google.gson.JsonObject;
import nfd.q1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;

public class o extends n	// class@000524
{
    public SearchItem p;
    public CoverMeta q;
    public TemplateBaseFeed r;
    public SearchResultFragment s;
    public KwaiImageView t;
    public TemplateMeta u;
    public KwaiImageView v;
    public TextView w;
    public boolean x;
    public ImageView y;

    public void o(){
       super();
    }
    public void E8(){
       int i1;
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "3")) {
          return;
       }
       o tp = this.p;
       int i = 0;
       if (tp != null && (!q.f(tp.mKBoxBaseItems) && this.p.mKBoxBaseItems.size() >= 2)) {
          i1 = 13;
          if (this.p.mKBoxBaseItems.get(i).mType == i1) {
             this.r = this.p.mKBoxBaseItems.get(i).mKBoxFeeds.get(i);
          }else if(this.p.mKBoxBaseItems.get(1).mType == i1){
             this.r = this.p.mKBoxBaseItems.get(1).mKBoxFeeds.get(i);
          }
       }
       tp = this.r;
       if (tp != null && tp.getQphoto() != null) {
          this.q = this.r.getQphoto().getCoverMeta();
       }
       if (!PatchProxy.applyVoid(objArray, this, oo, "5")) {
          float coverAspectR = CoverMetaExt.getCoverAspectRatio(this.q);
          if (coverAspectR - 0x3fe38e39 > 0) {
             coverAspectR = 0x3fe38e39;
          }
          i1 = g1.a(this.q);
          int i2 = g1.b(this.q);
          if (coverAspectR) {
             float f = 0x3f800000;
             this.t.setAspectRatio((f / coverAspectR));
             a hierarchy = this.t.getHierarchy();
             if (coverAspectR - f < 0) {
                this.t.setAspectRatio(f);
                this.t.setImageResource(R.drawable.arg_RES_7f081f30);
                hierarchy.u(t$b.e);
             }else {
                this.t.setBackgroundColor(i);
                i oi = new i(CoverMetaExt.getCoverCutType(this.q), CoverMetaExt.getCoverCutShift(this.q), CoverMetaExt.getShiftDirection(this.q));
                oi.b(i1);
                oi.c(i2);
                hierarchy.u(oi);
             }
             this.t.setPlaceHolderImage(new ColorDrawable(this.q.mColor));
             this.t.U(c.a(this.q));
             this.t.setVisibility(i);
          }
       }
       o oo1 = 8;
       if (!PatchProxy.applyVoid(objArray, this, oo, "6")) {
          if (this.p.mKBoxBaseItems.get(i).mType == 1) {
             this.u = this.p.mKBoxBaseItems.get(i).mKBoxTitleMeta;
          }else if(this.p.mKBoxBaseItems.get(1).mType == 1){
             this.u = this.p.mKBoxBaseItems.get(1).mKBoxTitleMeta;
          }
          tp = this.u;
          if (tp != null) {
             TemplateMeta mTitleConten = tp.mTitleContentName;
             if (mTitleConten != null && this.w != null) {
                if (!TextUtils.x(mTitleConten.mText)) {
                   o3.H(this.w, i);
                   this.w.getPaint().setFakeBoldText(1);
                   j0.D(this.w, (float)t0.e);
                   o3.G(this.w, this.u.mTitleContentName.mText);
                }else {
                   o3.H(this.w, oo1);
                }
             }
             if (!j.h(this.u.mTitleContentTypeIcons)) {
                tp = this.v;
                if (tp != null) {
                   o3.H(tp, i);
                   this.v.Y(this.u.mTitleContentTypeIcons, objArray, new n(this));
                }
             }
             o3.H(this.v, oo1);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oo, "7")) {
          QPhoto qphoto = this.r.getQphoto();
          if (qphoto != null && (this.v != null && qphoto.mEntity instanceof ImageFeed)) {
             c3.a(this.y, qphoto, qphoto.getPhotoMeta(), qphoto.getImageMeta(), qphoto.mEntity);
          }else {
             o3.H(this.y, oo1);
          }
       }
       if (this.x != null || (this.r != null && !PatchProxy.applyVoid(objArray, this, oo, "8"))) {
          this.r.setPosition(1);
          o tr = this.r;
          ClientEvent$ElementPackage uElementPack = q1.f(this.p, tr, "AUTOPLAYSMALL_SUBCARD", null, q1.r(tr), null);
          t.m(0, this.s, uElementPack, t.a(this.s, "ALADDIN", this.p), null, this.p, this.r.getFeedLogCtx());
          this.x = true;
       }
    label_0230 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       o3.H(this.w, 8);
       o3.H(this.v, 8);
       o3.H(this.y, 8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0f93);
       this.v = m1.f(p0, 0x7f0a12fb);
       this.w = m1.f(p0, 0x7f0a12fa);
       this.y = m1.f(p0, 0x7f0a135a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       this.p = this.q8(SearchItem.class);
       this.s = this.r8("FRAGMENT");
       return;
    }
}
