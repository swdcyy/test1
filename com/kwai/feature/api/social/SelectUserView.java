package com.kwai.feature.api.social.SelectUserView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.feature.api.social.SelectUserView$a;

public class SelectUserView extends FrameLayout	// class@00107f
{
    public Context b;
    public a c;

    public void SelectUserView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new SelectUserView$a(this);
       this.b = p0;
    }
    public void a(){
    }
}
