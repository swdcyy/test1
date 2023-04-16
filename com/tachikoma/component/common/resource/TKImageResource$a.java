package com.tachikoma.component.common.resource.TKImageResource$a;
import erd.g;
import com.tachikoma.component.common.resource.TKImageResource;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iq8.n;

public class TKImageResource$a implements g	// class@000ce7
{
    public final TKImageResource b;

    public void TKImageResource$a(TKImageResource p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageResource$a.class, "1")) {
       }else if(p0 != null){
          this.b.mWidthPx = p0.getWidth();
          this.b.mHeightPx = p0.getHeight();
          TKImageResource$a tb = this.b;
          tb.mWidth = n.f(tb.mWidthPx);
          tb = this.b;
          tb.mHeight = n.f(tb.mHeightPx);
          tb = this.b;
          tb.mBitmap = p0;
          tb.callOnSuccess(tb.mWidth, tb.mHeight);
       }else {
          this.b.callOnFail("Load failed.");
       }
       return;
    }
}
