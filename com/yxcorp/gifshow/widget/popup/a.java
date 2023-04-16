package com.yxcorp.gifshow.widget.popup.a;
import p07.c;
import com.kwai.library.widget.popup.bubble.a$c;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import java.lang.String;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import kzc.a;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import kzc.b;
import p07.e;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.exception.KwaiPopupBuildException;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import s07.c;
import com.kwai.library.widget.popup.bubble.a;
import p07.b;
import com.kwai.library.widget.popup.common.e;
import java.lang.StringBuilder;

public class a extends a$c implements c	// class@0019a2
{
    public KwaiBubbleOption k0;
    public String l0;
    public int m0;
    public e n0;
    public final PopupInterface$Excluded o0;

    public void a(Activity p0){
       super(p0);
       this.m0 = -1;
       this.o0 = this.u;
    }
    public c$b D(PopupInterface$Excluded p0){
       super.D(p0);
       return this;
    }
    public final Animator G0(View p0,float p1,float p2){
       float[] uofloatArray = new float[]{p1,p2};
       return ObjectAnimator.ofFloat(p0, View.ALPHA, uofloatArray).setDuration(100);
    }
    public KwaiBubbleOption H0(){
       return this.k0;
    }
    public a I0(int p0){
       this.J0(null, p0);
       return this;
    }
    public a J0(String p0,int p1){
       this.m0 = p1;
       this.l0 = p0;
       return this;
    }
    public a K0(KwaiBubbleOption p0){
       this.k0 = p0;
       return this;
    }
    public a L0(){
       this.B0(0);
       this.C0(0);
       this.n0(c.c(this.a.getResources()).widthPixels, 0);
       this.D0(BubbleInterface$Position.LEFT);
       this.w(new ColorDrawable(Color.parseColor("#99000000")));
       this.G(new a(this));
       this.O(new b(this));
       return this;
    }
    public a M0(e p0){
       this.n0 = p0;
       return this;
    }
    public c X(){
       if (this.m0 >= null || (this.k0 != null && this.u != this.o0)) {
          Log.e("", "", new KwaiPopupBuildException("ExcludeType not working. BubbleManager deal with it with KwaiBubbleOption"));
       }
       return super.X();
    }
    public Object a(String p0,int p1){
       this.J0(p0, p1);
       return this;
    }
    public e b(){
       return this.n0;
    }
    public void c(){
       if (this.n0 == null) {
          this.n0 = new c(this.a);
       }
       return;
    }
    public int d(){
       return this.m0;
    }
    public Object e(e p0){
       this.M0(p0);
       return this;
    }
    public a e0(){
       if (this.n0 == null) {
          this.n0 = new c(this.a);
       }
       return super.e0();
    }
    public Object f(Object p0){
       p0 = (p0 != null)? e.e(p0).a(p0): null;
       this.M0(p0);
       return this;
    }
    public String g(){
       return this.l0;
    }
    public Object h(int p0){
       this.I0(p0);
       return this;
    }
    public Object i(){
       return this.H0();
    }
    public c j(Object p0){
       this.K0(p0);
       return this;
    }
    public c k(){
       return this.e0();
    }
    public String toString(){
       return "KwaiBubbleBuilder{mConfigId="+this.m0+", mObservable="+this.n0+", mDefaultConfig="+this.k0+'}';
    }
}
