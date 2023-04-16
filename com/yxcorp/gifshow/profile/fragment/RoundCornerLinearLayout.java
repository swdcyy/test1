package com.yxcorp.gifshow.profile.fragment.RoundCornerLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.profile.fragment.RoundCornerLinearLayout$a;
import android.view.ViewOutlineProvider;

public class RoundCornerLinearLayout extends LinearLayout	// class@00131a
{
    public float b;

    public void RoundCornerLinearLayout(Context p0){
       super(p0);
    }
    public void RoundCornerLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RoundCornerLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setRadius(float p0){
       if (PatchProxy.isSupport(RoundCornerLinearLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RoundCornerLinearLayout.class, "1")) {
          return;
       }
       this.b = p0;
       this.setOutlineProvider(new RoundCornerLinearLayout$a(this));
       this.setClipToOutline(true);
       return;
    }
}
