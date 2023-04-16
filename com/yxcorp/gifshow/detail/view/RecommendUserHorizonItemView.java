package com.yxcorp.gifshow.detail.view.RecommendUserHorizonItemView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.Integer;

public class RecommendUserHorizonItemView extends ConstraintLayout	// class@001a55
{
    public TextView B;
    public TextView C;

    public void RecommendUserHorizonItemView(Context p0){
       super(p0, null);
    }
    public void RecommendUserHorizonItemView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void RecommendUserHorizonItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       ViewGroup.inflate(p0, R.layout.arg_RES_7f0d12c7, this);
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RecommendUserHorizonItemView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       TextView textView = this.findViewById(R.id.user_name);
       this.B = textView;
       textView.getPaint().setFakeBoldText(true);
       textView = this.findViewById(R.id.follow_text);
       this.C = textView;
       textView.getPaint().setFakeBoldText(true);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(RecommendUserHorizonItemView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RecommendUserHorizonItemView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       return;
    }
}
