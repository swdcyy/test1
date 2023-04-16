package com.google.android.material.circularreveal.c;
import com.google.android.material.circularreveal.b$a;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.c$e;

public interface abstract c implements b$a	// class@001686
{

    void a();
    void c();
    void draw(Canvas p0);
    Drawable getCircularRevealOverlayDrawable();
    int getCircularRevealScrimColor();
    c$e getRevealInfo();
    boolean isOpaque();
    void setCircularRevealOverlayDrawable(Drawable p0);
    void setCircularRevealScrimColor(int p0);
    void setRevealInfo(c$e p0);
}
