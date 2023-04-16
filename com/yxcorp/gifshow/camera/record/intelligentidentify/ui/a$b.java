package com.yxcorp.gifshow.camera.record.intelligentidentify.ui.a$b;
import java.lang.String;
import android.graphics.Color;
import lnc.a1;
import android.app.Activity;
import java.lang.Object;
import java.lang.CharSequence;

public class a$b	// class@000e08
{
    public Activity a;
    public CharSequence b;
    public String c;
    public long d;
    public float e;
    public int f;
    public static final int g;
    public static final int h;

    static {
       a$b.g = Color.parseColor("#802B2B2F");
       a$b.h = a1.e(16.00f);
    }
    public void a$b(Activity p0){
       super();
       this.f = 0;
       this.e = (float)a$b.h;
       this.d = 3000;
       this.a = p0;
    }
    public a$b a(long p0){
       this.d = p0;
       return this;
    }
    public a$b b(CharSequence p0){
       this.b = p0;
       return this;
    }
}
