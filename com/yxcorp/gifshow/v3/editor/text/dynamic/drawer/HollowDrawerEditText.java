package com.yxcorp.gifshow.v3.editor.text.dynamic.drawer.HollowDrawerEditText;
import com.yxcorp.gifshow.v3.editor.text.dynamic.TemplateEditText;
import android.content.Context;
import juc.b;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.widget.CommonDrawerEditText;
import com.yxcorp.gifshow.v3.editor.text.dynamic.drawer.HollowDrawerEditText$clearMode$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.graphics.PorterDuffXfermode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Canvas;
import android.widget.EditText;
import android.graphics.Paint;
import android.text.TextPaint;
import android.graphics.Xfermode;
import juc.c;
import juc.c$a;

public final class HollowDrawerEditText extends TemplateEditText	// class@0013c4
{
    public final p p;
    public final DynamicTextParams q;
    public HashMap r;

    public void HollowDrawerEditText(Context p0,b p1,DynamicTextParams p2){
       a.p(p0, "context");
       a.p(p1, "textDrawer");
       a.p(p2, "dynamicParams");
       super(p0, p1, p2);
       this.q = p2;
       this.setSelfDrawBackground(true);
       this.p = s.c(HollowDrawerEditText$clearMode$2.INSTANCE);
    }
    public final PorterDuffXfermode getClearMode(){
       Object obj = PatchProxy.apply(null, this, HollowDrawerEditText.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public int getCursorColor(){
       return 0xff000000;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HollowDrawerEditText.class, "2")) {
          return;
       }
       a.p(p0, "canvas");
       p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null, 31);
       TextPaint paint = this.getPaint();
       a.o(paint, "paint");
       paint.setXfermode(this.getClearMode());
       c$a.a(this.getTextDrawer(), p0, false, 2, null);
       super.onDraw(p0);
       TextPaint paint1 = this.getPaint();
       a.o(paint1, "paint");
       TemplateEditText.e(this, p0, paint1, false, 4, null);
       return;
    }
}
