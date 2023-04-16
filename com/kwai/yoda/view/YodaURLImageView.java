package com.kwai.yoda.view.YodaURLImageView;
import com.kwai.yoda.view.URLImageView;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;

public class YodaURLImageView extends URLImageView	// class@0012fb
{
    public float j;
    public float k;
    public String l;
    public String m;

    public void YodaURLImageView(Context p0){
       super(p0);
       this.j = 0x3f800000;
       this.k = 0.40f;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(YodaURLImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, YodaURLImageView.class, "3")) {
          return;
       }
       super.setEnabled(p0);
       YodaURLImageView tj = (p0)? this.j: this.k;
       this.setAlpha(tj);
       return;
    }
    public void setNormalUrl(String p0){
       this.l = p0;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(YodaURLImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, YodaURLImageView.class, "1")) {
          return;
       }
       super.setPressed(p0);
       if (this.isEnabled()) {
          YodaURLImageView tk = (p0 && this.isClickable())? this.k: this.j;
          this.setAlpha(tk);
       }else {
          this.setAlpha(this.k);
       }
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(YodaURLImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, YodaURLImageView.class, "2")) {
          return;
       }
       super.setSelected(p0);
       YodaURLImageView tm = (p0)? this.m: this.l;
       this.setImageURI(tm);
       return;
    }
    public void setSelectedUrl(String p0){
       this.m = p0;
    }
}
