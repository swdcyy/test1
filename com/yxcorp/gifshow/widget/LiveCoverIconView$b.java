package com.yxcorp.gifshow.widget.LiveCoverIconView$b;
import com.yxcorp.gifshow.widget.LiveCoverIconView$c;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;

public class LiveCoverIconView$b implements LiveCoverIconView$c	// class@001876
{
    public final int a;

    public void LiveCoverIconView$b(int p0){
       super();
       this.a = p0;
    }
    public Drawable create(){
       b obj = PatchProxy.apply(null, this, LiveCoverIconView$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.g(KwaiRadiusStyles.R4);
       obj.v(this.a);
       return obj.a();
    }
}
