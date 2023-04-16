package com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideBannerView;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView;
import java.lang.Long;
import android.content.Context;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideConfig;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideBannerView$a;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideBannerView$b;

public class IntimateGuideBannerView extends KwaiBannerView	// class@0018e2
{
    public List D;
    public static final Long E;

    static {
       IntimateGuideBannerView.E = Long.valueOf(4000);
    }
    public void IntimateGuideBannerView(Context p0,IntimateGuideConfig p1,LoopBannerView$a p2){
       super(p0);
       this.D = new ArrayList();
       Object[] objArray = null;
       IntimateGuideConfig mBannerConfi = (p1 != null)? p1.mBannerConfigs: objArray;
       this.D = mBannerConfi;
       boolean b = false;
       this.setUseAutoStart(b);
       this.setMDisableAutoScroll(true);
       this.setLoopInterval(p1.mAutoSlideInterval);
       this.setAspectRatio(0x3fd53f5b);
       ArrayList uArrayList = PatchProxy.apply(objArray, this, IntimateGuideBannerView.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          if (this.D != null) {
             for (; b < this.D.size(); b = b + 1) {
                KwaiBannerView$b uob = new KwaiBannerView$b(null, null, null, null, String.valueOf(b));
                uArrayList.add(this.D.size());
             }
          }
       }
       this.setBanner(uArrayList);
       this.setListener(new IntimateGuideBannerView$a(this, p2));
       return;
    }
    public RecyclerView$Adapter c(){
       Object obj = PatchProxy.apply(null, this, IntimateGuideBannerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IntimateGuideBannerView$b(this);
    }
    public int getLayoutResId(){
       return 0x7f0d0646;
    }
}
