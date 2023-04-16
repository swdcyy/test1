package com.kuaishou.commercial.search.banner.SearchHomeAdBannerView$a;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$a;
import com.kuaishou.commercial.search.banner.SearchHomeAdBannerView;
import java.lang.Object;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.o5;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity;
import java.util.Objects;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import sy5.a;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import k2b.u1;
import jm9.b;
import android.content.Context;
import android.widget.FrameLayout;
import android.app.Activity;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$IconEntity;
import com.kuaishou.commercial.search.b;
import com.yxcorp.gifshow.log.model.ClickMetaData;

public class SearchHomeAdBannerView$a implements LoopBannerView$a	// class@001547
{
    public final SearchHomeAdBannerView b;

    public void SearchHomeAdBannerView$a(SearchHomeAdBannerView p0){
       this.b = p0;
       super();
    }
    public void Q5(KwaiBannerView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchHomeAdBannerView$a.class, "2")) {
          return;
       }
       int i = -1;
       int i1 = o5.b(p0.e, i);
       BannerItemEntity uBannerItemE = this.b.o(i1);
       if (i1 != i && uBannerItemE != null) {
          if (uBannerItemE.mShowReported == null) {
             SearchHomeAdBannerView$a tb = this.b;
             BannerItemEntity mBannerId = uBannerItemE.mBannerId;
             Objects.requireNonNull(tb);
             if (!PatchProxy.isSupport(SearchHomeAdBannerView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mBannerId), tb, SearchHomeAdBannerView.class, "1")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "AD_BRAND_BANNER";
                uElementPack.params = a.k().e("tab_name", "Æ·ÅÆ°ñ").a("deliverId", mBannerId).i();
                u1.B0(new ShowMetaData().setLogPage(tb.E).setType(3).setElementPackage(uElementPack));
             }
             uBannerItemE.mShowReported = true;
          }
          SearchHomeAdBannerView f = this.b.F;
          if (f != null) {
             f.a(i1, uBannerItemE);
          }
       }
    label_0082 :
       return;
    }
    public void e3(KwaiBannerView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchHomeAdBannerView$a.class, "1")) {
          return;
       }
       int i = -1;
       int i1 = o5.b(p0.e, i);
       BannerItemEntity uBannerItemE = this.b.o(i1);
       if (i1 != i && uBannerItemE != null) {
          if (uBannerItemE.mItemImg != null && this.b.getContext() instanceof Activity) {
             b.c(uBannerItemE.mItemImg.mLinkUrl, this.b.getContext());
          }
          SearchHomeAdBannerView$a tb = this.b;
          BannerItemEntity mBannerId = uBannerItemE.mBannerId;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(SearchHomeAdBannerView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mBannerId), tb, SearchHomeAdBannerView.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "AD_BRAND_BANNER";
             uElementPack.params = a.k().e("tab_name", "Æ·ÅÆ°ñ").a("deliverId", mBannerId).i();
             u1.B(new ClickMetaData().setLogPage(tb.E).setType(1).setElementPackage(uElementPack));
          }
          SearchHomeAdBannerView f = this.b.F;
          if (f != null) {
             f.b(i1, uBannerItemE);
          }
       }
    label_0098 :
       return;
    }
}
