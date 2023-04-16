package com.kuaishou.live.core.basic.widget.LiveSpectrumView;
import com.kwai.library.widget.specific.misc.SpectrumView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class LiveSpectrumView extends SpectrumView	// class@000913
{
    public boolean n;

    public void LiveSpectrumView(Context p0){
       super(p0);
    }
    public void LiveSpectrumView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveSpectrumView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveSpectrumView.class, "1")) {
          return;
       }
       super.a();
       this.n = true;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveSpectrumView.class, "2")) {
          return;
       }
       super.b();
       this.n = false;
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveSpectrumView.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.n != null) {
          this.a();
       }
       return;
    }
}
