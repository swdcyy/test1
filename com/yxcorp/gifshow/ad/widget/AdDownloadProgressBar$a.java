package com.yxcorp.gifshow.ad.widget.AdDownloadProgressBar$a;
import com.yxcorp.gifshow.ad.widget.AdDownloadProgressBar;
import java.lang.Object;
import java.lang.String;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.widget.ImageView;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Objects;
import w59.d;
import java.lang.Float;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;

public class AdDownloadProgressBar$a	// class@001916
{
    public float a;
    public CharSequence b;
    public boolean c;
    public boolean d;
    public final AdDownloadProgressBar e;

    public void AdDownloadProgressBar$a(AdDownloadProgressBar p0){
       this.e = p0;
       super();
       this.a = 0xbf800000;
       this.b = a1.p(0x7f100aad);
       this.c = false;
       this.d = true;
    }
    public void a(boolean p0){
       AdDownloadProgressBar$a uoa = AdDownloadProgressBar$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.a - null < 0 || this.c == null) {
          this.e.j.setText(this.b);
          if (this.d != null && !p0) {
             this.e.h();
          }else {
             this.e.k.setImageDrawable(null);
          }
       }else {
          this.e.k.setVisibility(0);
          this.e.h();
          this.e.j.setText((int)(this.a * 100.00f)+"%");
          AdDownloadProgressBar n = this.e.n;
          uoa = this.a;
          Objects.requireNonNull(n);
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(uoa), n, d.class, "1")) {
             n.c = uoa;
             n.invalidateSelf();
          }
       }
       return;
    }
}
