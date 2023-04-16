package com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelsGroup;
import android.widget.LinearLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta$InterestV3Entity;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestItemView;
import java.lang.Integer;
import android.widget.SeekBar;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelsGroup$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestItemView$b;
import android.view.View;

public final class InterestLabelsGroup extends LinearLayout	// class@00173c
{
    public InterestManagementV3Meta b;
    public InterestItemView$b c;

    public void InterestLabelsGroup(Context p0){
       a.p(p0, "context");
       super(p0);
       this.setOrientation(1);
    }
    public void InterestLabelsGroup(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.setOrientation(1);
    }
    public void InterestLabelsGroup(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setOrientation(1);
    }
    public final void a(List p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InterestLabelsGroup.class, "2")) {
          return;
       }
       a.p(p0, "list");
       this.removeAllViews();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          InterestManagementV3Meta$InterestV3Entity interestV3En = iterator.next();
          Context context = this.getContext();
          a.o(context, "context");
          InterestItemView interestItem = new InterestItemView(context);
          InterestLabelsGroup tb = this.b;
          if (!PatchProxy.applyVoidTwoRefsWithListener(interestV3En, tb, interestItem, InterestItemView.class, "1")) {
             a.p(interestV3En, "entity");
             interestItem.f = interestV3En;
             interestItem.g = tb;
             InterestManagementV3Meta$InterestV3Entity mUpdatedWeig = interestV3En.mUpdatedWeight;
             if (mUpdatedWeig != null) {
                a.o(mUpdatedWeig, "entity.mUpdatedWeight");
                interestItem.b.setProgress(interestItem.a(mUpdatedWeig.intValue()));
             }else {
                interestItem.b.setProgress(interestItem.a(interestV3En.mWeight));
             }
             interestItem.c.L(interestV3En.mIcon);
             interestItem.d.setText(interestV3En.mName);
             interestItem.e.setText(interestItem.b(interestItem.b.getProgress()));
             PatchProxy.onMethodExit(InterestItemView.class, "1");
          }
          interestItem.setProgressChangeListener(new InterestLabelsGroup$a(this));
          this.addView(interestItem);
       }
       PatchProxy.onMethodExit(InterestLabelsGroup.class, "2");
       return;
    }
}
