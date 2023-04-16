package com.yxcorp.gifshow.widget.EditCoverSeekBar$b;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.widget.EditCoverSeekBar$a;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.EditCoverSeekBar;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class EditCoverSeekBar$b	// class@00181d
{
    public final float a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public final Drawable f;
    public final int g;
    public Drawable h;
    public boolean i;
    public WeakReference j;

    public void EditCoverSeekBar$b(float p0,int p1,int p2,Drawable p3,int p4,Drawable p5,EditCoverSeekBar$a p6){
       super();
       this.i = false;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.f = p3;
       this.d = p3.getBounds().width();
       this.e = p3.getBounds().height();
       this.g = p4;
       this.h = p5;
    }
    public Drawable a(int p0,int p1,boolean p2){
       int i;
       int i1;
       if (PatchProxy.isSupport(EditCoverSeekBar$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, EditCoverSeekBar$b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       EditCoverSeekBar$b th = (p2)? this.h: this.f;
       if (this.i != null) {
          return th;
       }else {
          float f = (float)p1;
          float f1 = (float)p0;
          float f2 = f / f1;
          EditCoverSeekBar$b tg = this.g;
          if (tg != null) {
             if (tg == 2) {
                f = EditCoverSeekBar.r;
                f1 = ((f1 * (f2 + this.a)) + (float)f) - (float)this.b;
                tg = this.c;
                f = f + tg;
                i = tg + this.e;
                i1 = (int)(f1 - (float)this.d);
                f1 = (int)f1;
                this.h.getBounds().set(i1, f, f1, i);
                this.f.getBounds().set(i1, f, f1, i);
             }else {
                throw new IllegalArgumentException("mAlignPosition:"+this.g+"not supported yet");
             }
          }else {
             f = EditCoverSeekBar.r;
             f1 = (((f1 * (f2 + this.a)) - f) + (float)f) + (float)this.b;
             f2 = (float)this.d + f1;
             tg = this.c;
             f = f + tg;
             i = tg + this.e;
             f1 = (int)f1;
             i1 = (int)f2;
             this.h.getBounds().set(f1, f, i1, i);
             this.f.getBounds().set(f1, f, i1, i);
          }
          this.i = true;
          return th;
       }
    }
}
