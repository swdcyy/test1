package com.kwai.live.gzone.widget.LiveGzoneSelectShapeMediumTextView;
import ald.b;
import com.kwai.library.widget.textview.KwaiSimpleMediumStyleTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveGzoneSelectShapeMediumTextView extends KwaiSimpleMediumStyleTextView implements b	// class@000e80
{
    public d r;

    public void LiveGzoneSelectShapeMediumTextView(Context p0){
       super(p0);
       this.u();
    }
    public void LiveGzoneSelectShapeMediumTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.u();
       e.c(p0, p1, this);
    }
    public void LiveGzoneSelectShapeMediumTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.u();
       e.c(p0, p1, this);
    }
    public d getSelectShapeDelegate(){
       return this.r;
    }
    public void setAttrs(IAttrHost[] p0){
       a.a(this, p0);
    }
    public final void u(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneSelectShapeMediumTextView.class, "1")) {
          return;
       }
       this.r = new d(this);
       return;
    }
}
