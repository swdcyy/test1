package com.kwai.library.widget.specific.misc.PlayBackView;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.specific.misc.PlayBackView$Status;
import com.kwai.library.widget.specific.misc.PlayBackView$a;
import android.widget.ImageView;
import com.kwai.library.widget.specific.misc.PlayBackView$1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.StateListDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.Enum;
import b27.i;

public class PlayBackView extends ViewGroup	// class@000a18
{
    public ImageView b;
    public ImageView c;
    public ImageView d;
    public PlayBackView$Status e;
    public static final int f;

    public void PlayBackView(Context p0){
       super(p0, null);
    }
    public void PlayBackView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PlayBackView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = PlayBackView$Status.PLAY;
    }
    public final ImageView a(Context p0,int p1,int p2,PlayBackView$a p3){
       PlayBackView$1 u1 = new PlayBackView$1(this, p0, p3);
       u1.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       u1.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       StateListDrawable stateListDra = new StateListDrawable();
       int[] ointArray = new int[]{0x10100a7};
       stateListDra.addState(ointArray, this.getResources().getDrawable(p1));
       int[] ointArray1 = new int[0];
       stateListDra.addState(ointArray1, this.getResources().getDrawable(p2));
       u1.setBackground(stateListDra);
       return u1;
    }
    public void b(){
       PlayBackView$Status lOADING = PlayBackView$Status.LOADING;
       this.e(lOADING);
       this.e = lOADING;
    }
    public void c(){
       PlayBackView$Status pAUSE = PlayBackView$Status.PAUSE;
       this.e(pAUSE);
       this.e = pAUSE;
    }
    public void d(){
       PlayBackView$Status pLAY = PlayBackView$Status.PLAY;
       this.e(pLAY);
       this.e = pLAY;
    }
    public final void e(PlayBackView$Status p0){
       for (int i = 0; i < PlayBackView$Status.values().length; i = i + 1) {
          View childAt = this.getChildAt(i);
          int i1 = (i == p0.ordinal())? 0: 8;
          childAt.setVisibility(i1);
       }
       return;
    }
    public PlayBackView$Status getStatus(){
       return this.e;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.c.clearAnimation();
    }
    public void onFinishInflate(){
       super.onFinishInflate();
       this.b = this.a(this.getContext(), 0x7f0808bf, 0x7f0808be, null);
       this.c = this.a(this.getContext(), 0x7f0808bd, 0x7f0808bc, new i(this));
       this.d = this.a(this.getContext(), 0x7f0808c2, 0x7f0808c1, null);
       this.addView(this.b);
       this.addView(this.c);
       this.addView(this.d);
       this.d();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       for (p1 = 0; p1 < PlayBackView$Status.values().length; p1++) {
          this.getChildAt(p1).layout(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
       }
       return;
    }
}
