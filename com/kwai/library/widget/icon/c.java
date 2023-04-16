package com.kwai.library.widget.icon.c;
import android.graphics.drawable.Drawable$ConstantState;
import android.app.Application;
import com.kwai.library.widget.icon.c$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import android.content.res.Resources;
import android.util.Pair;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.Context;

public final class c extends Drawable$ConstantState	// class@00094a
{
    public final WeakReference a;
    public WeakReference b;
    public final int c;
    public final int d;
    public final int e;
    public final c$a f;

    public void c(Application p0,int p1,int p2,int p3,c$a p4){
       a.p(p0, "application");
       super();
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.a = new WeakReference(p0);
    }
    public final Pair a(Resources p0,int p1){
       c tb = this.b;
       Drawable$ConstantState uConstantSta = (tb != null)? tb.get(): null;
       if (uConstantSta != null) {
          return new Pair(uConstantSta, uConstantSta.newDrawable(p0));
       }else {
          BitmapDrawable uBitmapDrawa = new BitmapDrawable(p0, BitmapFactory.decodeResource(p0, p1));
          Drawable$ConstantState constantStat = uBitmapDrawa.getConstantState();
          this.b = new WeakReference(constantStat);
          return new Pair(constantStat, uBitmapDrawa);
       }
    }
    public final Resources b(){
       Context uContext = this.a.get();
       Resources resources = (uContext != null)? uContext.getResources(): null;
       return resources;
    }
    public boolean canApplyTheme(){
       return this.a(this.b(), this.d).first.canApplyTheme();
    }
    public int getChangingConfigurations(){
       Pair first = this.a(this.b(), this.d).first;
       a.o(first, "getOrCreateDrawableState¡­rces, mTargetResId\).first");
       return first.getChangingConfigurations();
    }
    public Drawable newDrawable(){
       return this.newDrawable(this.b());
    }
    public Drawable newDrawable(Resources p0){
       Pair second = this.a(p0, this.d).second;
       c tf = this.f;
       if (tf != null) {
          Drawable uDrawable = tf.a(this.c, this.d, this.e, p0, second);
          if (uDrawable != null) {
             second = uDrawable;
          label_0023 :
             return second;
          }
       }
       a.o(second, "drawable");
       goto label_0023 ;
    }
}
