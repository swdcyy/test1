package com.yxcorp.gifshow.common_music_player.PlayBackView;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.common_music_player.PlayBackView$Status;
import com.yxcorp.gifshow.common_music_player.PlayBackView$a;
import android.widget.ImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.common_music_player.PlayBackView$1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.StateListDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.Enum;
import qm9.g0;
import java.lang.Boolean;

public class PlayBackView extends ViewGroup	// class@001190
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
       PlayBackView$1 obj;
       if (PatchProxy.isSupport(PlayBackView.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, PlayBackView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PlayBackView$1(this, p0, p3);
       obj.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       obj.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       StateListDrawable stateListDra = new StateListDrawable();
       int[] ointArray = new int[]{0x10100a7};
       stateListDra.addState(ointArray, this.getResources().getDrawable(p1));
       int[] ointArray1 = new int[0];
       stateListDra.addState(ointArray1, this.getResources().getDrawable(p2));
       obj.setBackground(stateListDra);
       return obj;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, PlayBackView.class, "6")) {
          return;
       }
       PlayBackView$Status lOADING = PlayBackView$Status.LOADING;
       this.e(lOADING);
       this.e = lOADING;
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, PlayBackView.class, "7")) {
          return;
       }
       PlayBackView$Status pAUSE = PlayBackView$Status.PAUSE;
       this.e(pAUSE);
       this.e = pAUSE;
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, PlayBackView.class, "5")) {
          return;
       }
       PlayBackView$Status pLAY = PlayBackView$Status.PLAY;
       this.e(pLAY);
       this.e = pLAY;
       return;
    }
    public final void e(PlayBackView$Status p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayBackView.class, "8")) {
          return;
       }
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
       if (PatchProxy.applyVoid(null, this, PlayBackView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.c.clearAnimation();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, PlayBackView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.a(this.getContext(), 0x7f0818d2, 0x7f0818d2, null);
       this.c = this.a(this.getContext(), 0x7f0808bd, 0x7f0808bc, new g0(this));
       this.d = this.a(this.getContext(), 0x7f0818d4, 0x7f0818d4, null);
       this.addView(this.b);
       this.addView(this.c);
       this.addView(this.d);
       this.d();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(PlayBackView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, PlayBackView.class, "4")) {
             return;
          }
       }
       for (int i = 0; i < PlayBackView$Status.values().length; i++) {
          this.getChildAt(i).layout(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
       }
       return;
    }
}
