package com.yxcorp.gifshow.trending.list.TrendingListFragmentV2$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.trending.list.TrendingListFragmentV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import alc.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Map;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;
import com.facebook.drawee.view.SimpleDraweeView;

public class TrendingListFragmentV2$a implements ViewPager$i	// class@001dab
{
    public final TrendingListFragmentV2 b;

    public void TrendingListFragmentV2$a(TrendingListFragmentV2 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       TrendingListFragmentV2$a uoa = TrendingListFragmentV2$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       uoa.L = p0;
       if (uoa.Q != null && p0 < uoa.U.size()) {
          uoa = this.b;
          TrendingListFragmentV2 trendingList = 1;
          if (uoa.X != null) {
             String str = uoa.W.get(p0);
             TrendingListFragmentV2$a tb = this.b;
             TrendingListFragmentV2 b1 = tb.b1;
             String str1 = tb.Rh();
             TrendingListFragmentV2$a tb1 = this.b;
             if (!PatchProxy.applyVoidFourRefs(str, b1, str1, tb1, null, a.class, "27")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.name = "POPULAR_TOP_TYPE";
                uElementPack.action2 = "POPULAR_TOP_TYPE";
                i3 oi3 = a.e(b1);
                oi3.d("trending_type", str);
                oi3.d("city", str1);
                uElementPack.params = oi3.e();
                u1.B(new ClickMetaData().setLogPage(tb1).setType(trendingList).setElementPackage(uElementPack));
             }
             tb = this.b;
             a.l(this.b.W.get(p0), tb.b1, tb.Rh(), this.b);
          }else {
             uoa.X = trendingList;
          }
          if (this.b.Sh()) {
             uoa = this.b;
             uoa.Q.setImageURI(uoa.V.get(p0));
          }else {
             uoa = this.b;
             uoa.Q.setImageURI(uoa.U.get(p0));
          }
       }
       return;
    }
}
