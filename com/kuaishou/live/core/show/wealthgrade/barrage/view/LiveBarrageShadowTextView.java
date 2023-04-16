package com.kuaishou.live.core.show.wealthgrade.barrage.view.LiveBarrageShadowTextView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.RelativeLayout;
import android.widget.TextView;
import e61.g;
import e61.d;
import crd.b;

public class LiveBarrageShadowTextView extends FrameLayout	// class@001258
{
    public TextView b;
    public RelativeLayout c;
    public g d;
    public b e;
    public static final int[] f;
    public static final int[] g;
    public static final int h;

    static {
       int[] ointArray = new int[]{a1.a(0x7f060cbe),a1.a(0x7f060cbe)};
       LiveBarrageShadowTextView.f = ointArray;
       ointArray = new int[]{a1.d(0x7f0702b8),a1.d(0x7f0702b8),a1.d(0x7f0702b8),a1.d(0x7f0702b8)};
       LiveBarrageShadowTextView.g = ointArray;
       LiveBarrageShadowTextView.h = a1.d(0x7f0702df);
    }
    public void LiveBarrageShadowTextView(Context p0){
       super(p0);
       this.a();
    }
    public void LiveBarrageShadowTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void LiveBarrageShadowTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveBarrageShadowTextView.class, "1")) {
          return;
       }
       a.k(this, R.layout.arg_RES_7f0d0aec, true);
       this.c = this.findViewById(0x7f0a095c);
       this.b = this.findViewById(0x7f0a088e);
       this.d = d.b("LIVE_BULLET_COMMENT_BACKGROUND", 100);
       return;
    }
    public void detachViewFromParent(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBarrageShadowTextView.class, "2")) {
          return;
       }
       super.detachViewFromParent(p0);
       LiveBarrageShadowTextView te = this.e;
       if (te != null) {
          te.dispose();
       }
       return;
    }
}
