package com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$e;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.graphics.Typeface;

public final class RecyclerTabWithIndicatorView$e	// class@0018b1
{
    public Context a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public void RecyclerTabWithIndicatorView$e(Context p0,int p1,int p2,int p3,int p4,int p5,int p6){
       a.p(p0, "mContext");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final void a(TextView p0,boolean p1){
       RecyclerTabWithIndicatorView$e uoe = RecyclerTabWithIndicatorView$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "2")) {
          return;
       }
       a.p(p0, "textView");
       uoe = (p1)? this.e: this.d;
       p0.setTextColor(uoe);
       Typeface dEFAULT_BOLD = (p1)? Typeface.DEFAULT_BOLD: Typeface.DEFAULT;
       p0.setTypeface(dEFAULT_BOLD);
       if (p1) {
          p0.setTextSize(0, (float)this.c);
       }else {
          p0.setTextSize(0, (float)this.b);
       }
       return;
    }
}
