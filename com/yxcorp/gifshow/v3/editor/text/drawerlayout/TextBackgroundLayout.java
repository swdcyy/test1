package com.yxcorp.gifshow.v3.editor.text.drawerlayout.TextBackgroundLayout;
import android.widget.FrameLayout;
import android.content.Context;
import juc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import juc.c;
import juc.c$a;

public final class TextBackgroundLayout extends FrameLayout	// class@0013be
{
    public final b b;
    public final boolean c;
    public HashMap d;

    public void TextBackgroundLayout(Context p0,b p1,boolean p2){
       a.p(p0, "context");
       a.p(p1, "textDrawer");
       super(p0);
       this.b = p1;
       this.c = p2;
       this.setBackgroundColor(0);
    }
    public final b getTextDrawer(){
       return this.b;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextBackgroundLayout.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       super.onDraw(p0);
       if (this.c != null) {
          c$a.a(this.b, p0, false, 2, null);
       }
       return;
    }
}
