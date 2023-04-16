package com.yxcorp.gifshow.v3.editor.magicfinger.o$c;
import hkd.d;
import com.yxcorp.gifshow.v3.editor.magicfinger.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;

public class o$c extends d	// class@00103f
{
    public final o b;

    public void o$c(o p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, o$c.class, "1")) {
          return;
       }
       this.b.s.setText("1.0x");
       b uob = new b();
       uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060759));
       uob.s(DrawableCreator$Shape.Oval);
       this.b.s.setBackground(uob.a());
       return;
    }
}
