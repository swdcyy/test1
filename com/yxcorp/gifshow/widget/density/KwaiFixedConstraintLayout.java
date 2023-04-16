package com.yxcorp.gifshow.widget.density.KwaiFixedConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import azc.b;
import android.view.View;
import czc.b;

public class KwaiFixedConstraintLayout extends ConstraintLayout	// class@001971
{
    public Context B;

    public void KwaiFixedConstraintLayout(Context p0){
       super(p0, null);
    }
    public void KwaiFixedConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiFixedConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(b.g(p0, p1), p1, p2);
       this.B = p0;
       b.a(this);
    }
    public Context getRealContext(){
       return this.B;
    }
}
