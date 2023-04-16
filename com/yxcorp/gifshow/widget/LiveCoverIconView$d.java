package com.yxcorp.gifshow.widget.LiveCoverIconView$d;
import android.text.style.UpdateAppearance;
import android.text.style.CharacterStyle;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;

public class LiveCoverIconView$d extends CharacterStyle implements UpdateAppearance	// class@001878
{
    public final int b;
    public final int c;
    public final float d;

    public void LiveCoverIconView$d(int p0,int p1,float p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverIconView$d.class, "1")) {
          return;
       }
       LinearGradient linearGradie = new LinearGradient(0, 0, this.d, 0, this.b, this.c, Shader$TileMode.CLAMP);
       p0.setShader(v0);
       return;
    }
}
