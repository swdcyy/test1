package com.kuaishou.merchant.transaction.detail.self.widget.ScoreShoppingExperienceView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import xm4.a;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import com.kuaishou.merchant.basic.widget.MerchantCDNImageView;
import android.widget.TextView;
import android.widget.RatingBar;
import androidx.constraintlayout.widget.Group;
import com.kuaishou.merchant.basic.recyclerpendant.LiveMerchantRecyclerPendantView;

public class ScoreShoppingExperienceView extends FrameLayout implements d	// class@000775
{
    public SelectShapeConstraintLayout b;
    public MerchantCDNImageView c;
    public TextView d;
    public RatingBar e;
    public TextView f;
    public TextView g;
    public Group h;
    public LiveMerchantRecyclerPendantView i;
    public ScoreShoppingExperienceView$b j;
    public b k;

    public void ScoreShoppingExperienceView(Context p0){
       super(p0, null);
    }
    public void ScoreShoppingExperienceView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void ScoreShoppingExperienceView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ScoreShoppingExperienceView.class, "4")) {
       }else if(PatchProxy.applyVoid(objArray, this, ScoreShoppingExperienceView.class, "5")){
          View view = a.a(this.getContext(), R.layout.arg_RES_7f0d0f1b);
          this.doBindView(view);
          this.addView(view);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScoreShoppingExperienceView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a0b2b);
       this.c = m1.f(p0, 0x7f0a0b28);
       this.d = m1.f(p0, 0x7f0a0b31);
       this.e = m1.f(p0, 0x7f0a0b2f);
       this.f = m1.f(p0, 0x7f0a0b2d);
       this.g = m1.f(p0, 0x7f0a0b2c);
       this.h = m1.f(p0, 0x7f0a0b2e);
       this.i = m1.f(p0, 0x7f0a0b32);
       return;
    }
}
