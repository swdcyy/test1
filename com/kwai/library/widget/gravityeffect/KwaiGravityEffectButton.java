package com.kwai.library.widget.gravityeffect.KwaiGravityEffectButton;
import v17.b;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.gravityeffect.GravityEffectButtonConfig;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import kotlin.jvm.internal.a;
import ll8.c$b;
import android.content.res.TypedArray;
import j17.a;
import com.kwai.library.widget.gravityeffect.GravityEffectButtonConfig$a;
import qz6.a;
import android.view.View;
import w17.b;
import android.graphics.Canvas;
import android.widget.TextView;

public class KwaiGravityEffectButton extends AppCompatTextView implements b	// class@00093d
{
    public final a f;
    public boolean g;

    public void KwaiGravityEffectButton(Context p0){
       super(p0, null);
    }
    public void KwaiGravityEffectButton(Context p0,AttributeSet p1){
       super(p0, p1, 0x1010084);
    }
    public void KwaiGravityEffectButton(Context p0,AttributeSet p1,int p2){
       GravityEffectButtonConfig a;
       super(p0, p1, p2);
       boolean b = true;
       this.g = b;
       GravityEffectButtonConfig gravityEffec = GravityEffectButtonConfig.b();
       Objects.requireNonNull(gravityEffec);
       a.p(p0, "context");
       a = gravityEffec.a;
       int i = 3;
       int i1 = 2;
       if (a == -1) {
       }else {
          TypedArray typedArray1 = p0.obtainStyledAttributes(a, c$b.Q1);
          a.o(typedArray1, "context\n        .obtainS¡­.KwaiGravityEffectButton\)");
          gravityEffec.b.a = typedArray1.getColor(i1, a.a(p0, 0x7f06212b));
          GravityEffectButtonConfig b1 = gravityEffec.b;
          b1.b = typedArray1.getColor(i, a.d(b1.b(), 0x3f000000));
          gravityEffec.b.c = typedArray1.getColor(0, a.a(p0, 0x7f06212a));
          gravityEffec = gravityEffec.b;
          gravityEffec.d = typedArray1.getColor(b, a.d(gravityEffec.a(), 0x3f000000));
          typedArray1.recycle();
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Q1, p2, 0);
       int color = typedArray.getColor(i1, GravityEffectButtonConfig.b().a().b());
       int color1 = typedArray.getColor(i, GravityEffectButtonConfig.b().a().b);
       int color2 = typedArray.getColor(0, GravityEffectButtonConfig.b().a().a());
       i = typedArray.getColor(b, GravityEffectButtonConfig.b().a().d);
       typedArray.recycle();
       a uoa = new a(this, color, color2, color1, i);
       this.f = i1;
       return;
    }
    public void f(b p0){
       if (this.g != null) {
          this.f.g((((- p0.a()) / 9.80f) * 90.00f));
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (this.g != null) {
          this.f.e(p0);
       }
       super.onDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.f.f(p0, p1, p2, p3);
    }
    public void setEnableGravityEffect(boolean p0){
       this.g = p0;
       if (p0) {
          this.f.f(this.getWidth(), this.getHeight(), this.getWidth(), this.getHeight());
       }
       return;
    }
}
