package com.kuaishou.recruit.doubleList.ceil.banner.widget.RecruitDoubleListBannerView;
import com.kuaishou.live.widget.view.LiveAutoScrollBanner;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class RecruitDoubleListBannerView extends LiveAutoScrollBanner	// class@000ea9
{

    public void RecruitDoubleListBannerView(Context p0){
       super(p0, null);
    }
    public void RecruitDoubleListBannerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RecruitDoubleListBannerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, RecruitDoubleListBannerView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.setOffscreenPageLimit(-1);
       RecyclerView$LayoutManager layoutManage = this.h.getLayoutManager();
       Objects.requireNonNull(layoutManage);
       layoutManage.setItemPrefetchEnabled(false);
       this.setMillisecondPerInch(200.00f);
       return;
    }
}
