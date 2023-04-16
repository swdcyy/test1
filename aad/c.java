package aad.c;
import aad.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.ExtInfo;
import com.yxcorp.plugin.search.entity.template.aggregate.BottomBar;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.yxcorp.plugin.search.utils.j0;
import lnc.a1;
import nfd.o3;
import android.widget.TextView;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import java.util.Arrays;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.StringBuilder;
import java.lang.Character;
import java.lang.Integer;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.entity.SearchItem;
import nfd.q1;
import im8.f;
import mcd.c;
import mcd.b$c;
import mcd.d;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;

public class c extends b	// class@0000b3
{
    public TemplateBaseFeed A;
    public f B;

    public void c(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "3")) {
          return;
       }
       super.E8();
       TemplateBaseFeed mExtInfo = this.A.mExtInfo;
       if (mExtInfo != null) {
          ExtInfo mBottomBar = mExtInfo.mBottomBar;
          if (mBottomBar != null && !TextUtils.x(mBottomBar.mTitle)) {
             j0.D(this.w, 0);
             j0.B(this.w, a1.e(4.00f));
             int i = 0;
             o3.H(this.p, i);
             this.y = this.A.mExtInfo.mBottomBar;
             b uob = b.class;
             if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
                o3.G(this.q, this.y.mTitle);
                if (!q.f(this.y.mCovers)) {
                   b ty = this.y;
                   if (!PatchProxy.applyVoidOneRefs(ty, this, uob, "7")) {
                      BottomBar mCovers = ty.mCovers;
                      KwaiImageView[] kwaiImageVie = new KwaiImageView[]{this.s,this.t,this.u};
                      List list = Arrays.asList(kwaiImageVie);
                      int i1 = (mCovers == null)? 0: list.size();
                      int i2 = 0;
                      while (i2 < i1) {
                         if (i2 >= mCovers.size()) {
                            list.get(i2).setVisibility(8);
                         }else {
                            list.get(i2).setVisibility(i);
                            list.get(i2).P(mCovers.get(i2));
                         }
                         i2 = i2 + 1;
                      }
                   }
                }else {
                   o3.H(this.s, 8);
                   o3.H(this.t, 8);
                   o3.H(this.u, 8);
                }
                if (!TextUtils.x(this.y.mCount)) {
                   this.v.setText("+"+this.y.mCount);
                }else {
                   this.v.setVisibility(8);
                }
                if (!TextUtils.x(this.y.mSoldCount) && !(this.y.mSoldCount).equals(Character.valueOf('0'))) {
                   o3.G(this.r, this.y.mSoldCount);
                }else {
                   o3.H(this.r, 8);
                }
                j0.D(this.v, (float)a1.e(4.00f));
             }
             return;
          }
       }
       o3.H(this.p, 8);
       j0.D(this.w, (float)a1.e(4.00f));
       return;
    }
    public void V8(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "5")) {
          return;
       }
       super.V8();
       if (!PatchProxy.isSupport(uoc) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(1), "PREVIEW_COMMODITY_PENDANT_SUBCARD", this, uoc, "6") && !TextUtils.x("PREVIEW_COMMODITY_PENDANT_SUBCARD"))) {
          q1.v(1, this.z, this.x, this.A, "PREVIEW_COMMODITY_PENDANT_SUBCARD");
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c tB = this.B;
       if (tB != null && tB.get() != null) {
          this.B.get().a(b$c.f());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.w = m1.f(p0, 0x7f0a30d8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.j8();
       this.x = this.q8(SearchItem.class);
       this.A = this.r8("SEARCH_PLAY_KBOX_FEED");
       this.B = this.w8("SEARCH_FLOW_CARD_OPEN_DETAIL_LISTENER");
       this.z = this.r8("FRAGMENT");
       return;
    }
}
