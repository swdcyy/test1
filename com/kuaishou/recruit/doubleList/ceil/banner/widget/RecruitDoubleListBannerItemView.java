package com.kuaishou.recruit.doubleList.ceil.banner.widget.RecruitDoubleListBannerItemView;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View$OnClickListener;

public class RecruitDoubleListBannerItemView extends SelectShapeFrameLayout	// class@000ea8
{
    public KwaiImageView c;

    public void RecruitDoubleListBannerItemView(Context p0){
       super(p0);
    }
    public void RecruitDoubleListBannerItemView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RecruitDoubleListBannerItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, RecruitDoubleListBannerItemView.class, "1")) {
          return;
       }
       this.c = this.findViewById(0x7f0a26f2);
       return;
    }
    public void setClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecruitDoubleListBannerItemView.class, "3")) {
          return;
       }
       this.setOnClickListener(p0);
       return;
    }
}
