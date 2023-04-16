package com.google.android.material.tabs.TabItem;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import w0.x;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;

public class TabItem extends View	// class@0016c4
{
    public final CharSequence b;
    public final Drawable c;
    public final int d;

    public void TabItem(Context p0){
       super(p0, null);
    }
    public void TabItem(Context p0,AttributeSet p1){
       super(p0, p1);
       x ox = x.u(p0, p1, c$b.C5);
       this.b = ox.p(2);
       this.c = ox.g(0);
       this.d = ox.n(1, 0);
       ox.w();
    }
}
