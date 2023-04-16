package com.kuaishou.gifshow.kuaishan.ui.preview.b;
import com.kuaishou.gifshow.kuaishan.widget.KSVerticalViewPager;
import com.kuaishou.gifshow.kuaishan.ui.preview.b$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kuaishan.ui.preview.b$b;
import android.view.View$OnTouchListener;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewConfiguration;

public final class b	// class@001ae8
{
    public final int a;
    public float b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final View$OnTouchListener g;
    public b$a h;

    public void b(KSVerticalViewPager p0,b$a p1){
       a.p(p0, "mTargetView");
       super();
       this.h = p1;
       this.d = true;
       b$b uob = new b$b(this);
       this.g = uob;
       p0.setOnTouchListener(uob);
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0.getContext());
       a.o(viewConfigur, "ViewConfiguration.get\(mTargetView.context\)");
       this.a = viewConfigur.getScaledPagingTouchSlop();
    }
    public final void a(boolean p0){
       this.d = p0;
    }
    public final void b(int p0){
       this.e = p0;
    }
}
