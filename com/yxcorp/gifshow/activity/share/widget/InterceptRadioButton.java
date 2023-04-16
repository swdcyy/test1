package com.yxcorp.gifshow.activity.share.widget.InterceptRadioButton;
import com.kwai.library.widget.button.SizeAdjustableRadioButton;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.CompoundButton;

public class InterceptRadioButton extends SizeAdjustableRadioButton	// class@00149b
{
    public View$OnClickListener f;

    public void InterceptRadioButton(Context p0){
       super(p0);
    }
    public void InterceptRadioButton(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void InterceptRadioButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean performClick(){
       InterceptRadioButton obj = PatchProxy.apply(null, this, InterceptRadioButton.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       if (obj == null) {
          return super.performClick();
       }
       obj.onClick(this);
       return true;
    }
    public void setInterceptClickListener(View$OnClickListener p0){
       this.f = p0;
    }
}
