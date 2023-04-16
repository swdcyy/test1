package com.kwai.yoda.view.YodaImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.widget.ImageView;

public class YodaImageView extends AppCompatImageView	// class@0012f9
{
    public float d;
    public float e;

    public void YodaImageView(Context p0){
       super(p0);
       this.d = 0x3f800000;
       this.e = 0.40f;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(YodaImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, YodaImageView.class, "2")) {
          return;
       }
       super.setEnabled(p0);
       YodaImageView td = (p0)? this.d: this.e;
       this.setAlpha(td);
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(YodaImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, YodaImageView.class, "1")) {
          return;
       }
       super.setPressed(p0);
       if (this.isEnabled()) {
          YodaImageView te = (p0 && this.isClickable())? this.e: this.d;
          this.setAlpha(te);
       }else {
          this.setAlpha(this.e);
       }
       return;
    }
}
