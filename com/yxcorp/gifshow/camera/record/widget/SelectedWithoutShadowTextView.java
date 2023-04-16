package com.yxcorp.gifshow.camera.record.widget.SelectedWithoutShadowTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public class SelectedWithoutShadowTextView extends AppCompatTextView	// class@000fde
{
    public float f;
    public float g;
    public float h;
    public int i;

    public void SelectedWithoutShadowTextView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void SelectedWithoutShadowTextView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0x1010084);
    }
    public void SelectedWithoutShadowTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.f = this.getShadowRadius();
       this.g = this.getShadowDx();
       this.h = this.getShadowDy();
       this.i = this.getShadowColor();
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(SelectedWithoutShadowTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SelectedWithoutShadowTextView.class, "1")) {
          return;
       }
       super.setSelected(p0);
       if (p0) {
          this.setShadowLayer(0, 0, 0, 0);
       }else {
          this.setShadowLayer(this.f, this.g, this.h, this.i);
       }
       return;
    }
}
