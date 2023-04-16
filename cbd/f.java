package cbd.f;
import ucd.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxObjectModel;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;
import java.util.Collection;
import ekd.q;
import s7d.d;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.ExtInfo;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.plugin.search.utils.j0;
import nfd.t0;
import java.lang.Boolean;
import nfd.o3;
import android.graphics.Color;
import k06.a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import ekd.m1;
import android.widget.ImageView;

public class f extends n	// class@00051b
{
    public SearchItem p;
    public ImageView q;
    public KwaiImageView r;
    public ImageView s;
    public View t;

    public void f(){
       super();
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       SearchItem mKBoxItem = this.p.mKBoxItem;
       KBoxItem kBoxItem = 98;
       if (mKBoxItem.mType == kBoxItem && TextUtils.equals(mKBoxItem.mKboxModel.mTachikomaKey, "HotSearch")) {
          return;
       }
       boolean b = false;
       this.V8(b);
       SearchItem mKBoxItem1 = this.p.mKBoxItem;
       String str = 13;
       if (!PatchProxy.applyVoidOneRefs(mKBoxItem1, this, uof, "4") && this.p != null) {
          if (mKBoxItem1.mType == str) {
             this.W8(this.t);
          }else {
             this.W8(this.q);
          }
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, this, uof, "6")) {
          CDNUrl[] uCDNUrlArray = PatchProxy.apply(objArray, this, uof, "7");
          if (uCDNUrlArray != patchProxyRe) {
          }else {
             f tp = this.p;
             if (tp.mKBoxItem.mType == kBoxItem) {
                int i1 = 0;
                while (true) {
                   if (i1 < this.p.mKBoxBaseItems.size()) {
                      KBoxItem kBoxItem2 = this.p.mKBoxBaseItems.get(i1);
                      if (!q.f(kBoxItem2.mKboxModel.mTKDatas) && kBoxItem2.mKboxModel.mTKDatas.get(b).b() != null) {
                         uCDNUrlArray = kBoxItem2.mKboxModel.mTKDatas.get(b).b();
                      }else {
                         i1 = i1 + 1;
                      }
                   }
                }
             }else {
                KBoxItem kBoxItem3 = tp.mKBoxBaseItems.get(true);
                KBoxItem mKBoxFeeds = kBoxItem3.mKBoxFeeds;
                kBoxItem3 = kBoxItem3.mType;
                if (kBoxItem3 != 5) {
                   if (kBoxItem3 != str) {
                      if (kBoxItem3 == 18) {
                         uCDNUrlArray = mKBoxFeeds.get(b).getGradientUrls();
                      }
                   }else {
                      this.V8(true);
                      uCDNUrlArray = mKBoxFeeds.get(b).getGradientUrls();
                   }
                }else {
                   uCDNUrlArray = mKBoxFeeds.get(b).getGradientUrls();
                }
             }
             uCDNUrlArray = objArray;
          }
          SearchItem obj = PatchProxy.apply(objArray, this, uof, "8");
          if (obj != patchProxyRe) {
             objArray = obj;
          }else if(this.p.mKBoxItem.mType == kBoxItem){
             int i = 0;
             while (i < this.p.mKBoxBaseItems.size()) {
                KBoxItem kBoxItem1 = this.p.mKBoxBaseItems.get(i);
                if (!q.f(kBoxItem1.mKboxModel.mTKDatas) && !TextUtils.isEmpty(kBoxItem1.mKboxModel.mTKDatas.get(b).a())) {
                   objArray = kBoxItem1.mKboxModel.mTKDatas.get(b).a();
                }
                i = i + 1;
             }
          }
          obj = this.p.mExtInfo;
          if (obj != null) {
             ExtInfo mWeakKboxCov = obj.mWeakKboxCoverUrl;
             if (mWeakKboxCov != null) {
                uCDNUrlArray = mWeakKboxCov;
             }
          }
          if (uCDNUrlArray != null || !TextUtils.isEmpty(objArray)) {
             j0.z(uCDNUrlArray, objArray, this.r, this.m8(), true);
          }
       }
       j0.D(this.m8(), (float)t0.e);
       return;
    }
    public final void V8(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "9")) {
          return;
       }
       uof = this.s;
       int i = (p0)? 8: 0;
       o3.H(uof, i);
       return;
    }
    public final void W8(View p0){
       a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       SearchItem mExtInfo = this.p.mExtInfo;
       if (mExtInfo != null) {
          ExtInfo mWeakKboxCov = mExtInfo.mWeakKboxCoverColor;
          if (mWeakKboxCov != null) {
             uoa = new a();
             uoa.i(Color.parseColor(mWeakKboxCov));
          label_0035 :
             p0.setBackground(uoa.a());
             return;
          }
       }
       uoa = new a().h(this.getContext(), R.color.arg_RES_7f0601e7);
       goto label_0035 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1357);
       this.q = m1.f(p0, 0x7f0a0458);
       this.s = m1.f(p0, 0x7f0a3b0b);
       this.t = m1.f(p0, 0x7f0a2c0c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(SearchItem.class);
       return;
    }
}
