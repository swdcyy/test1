package com.kwai.library.widget.popup.bubble.b$a;
import java.lang.Object;
import nsd.u;
import java.lang.Integer;
import com.kwai.library.widget.popup.bubble.b;
import com.kwai.library.widget.popup.bubble.a$c;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import android.content.Context;
import zf6.l;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;

public final class b$a	// class@00097a
{

    public void b$a(){
       super();
    }
    public void b$a(u p0){
       super();
    }
    public final Integer a(){
       return b.l;
    }
    public final Integer b(){
       return b.i;
    }
    public final Integer c(){
       return b.k;
    }
    public final Integer d(){
       return b.j;
    }
    public final b e(a$c p0,int p1){
       a.p(p0, "builder");
       Activity uActivity = (!p0.r())? p0.q(): l.h(p0.q(), p0.r());
       a.o(uActivity, "uiModeContext");
       int[] e1 = c$b.E1;
       a.o(e1, "R.styleable.KwaiBubble");
       TypedArray typedArray = uActivity.obtainStyledAttributes(p1, e1);
       BubbleInterface$Position position = BubbleInterface$Position.fromOrdinal(typedArray.getInt(2, 0));
       a.o(position, "BubbleInterface.Position.fromOrdinal\(ordinal\)");
       b uob = new b(position, typedArray.getDimensionPixelSize(3, -1), typedArray.getColor(1, Integer.MAX_VALUE), typedArray.getColor(4, Integer.MAX_VALUE), typedArray.getDimension(6, 0xbf800000), typedArray.getResourceId(5, -1), typedArray.getResourceId(0, -1));
       typedArray.recycle();
       return v9;
    }
}
