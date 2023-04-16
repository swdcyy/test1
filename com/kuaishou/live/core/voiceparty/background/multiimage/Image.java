package com.kuaishou.live.core.voiceparty.background.multiimage.Image;
import ho2.d;
import ho2.e;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import csd.b;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.background.multiimage.Url;
import java.lang.IllegalArgumentException;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Image extends d	// class@00134f
{
    public final Url _src;
    public final String _style;
    public final float alpha;
    public final int height;
    public final int width;
    public final int x;
    public final int y;

    public void Image(){
       super();
       this._src = null;
       this.width = 0;
       this.height = 0;
       this.x = 0;
       this.y = 0;
       this._style = null;
       this.alpha = 0x3f800000;
    }
    public Object a(e p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Image.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.d(this, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public final float b(){
       return this.alpha;
    }
    public final Url c(){
       Image obj = PatchProxy.apply(null, this, Image.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this._src;
       if (obj != null) {
          return obj;
       }
       throw new IllegalArgumentException("image don\'t have src");
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Image.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Image && (a.g(this._src, p0._src) && (this.width == p0.width && (this.height == p0.height && (this.x == p0.x && (this.y == p0.y && (a.g(this._style, p0._style) && !Float.compare(this.alpha, p0.alpha))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Image obj = PatchProxy.apply(null, this, Image.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this._src;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((((((i1 * 31) + this.width) * 31) + this.height) * 31) + this.x) * 31) + this.y) * 31;
       Image t_style = this._style;
       if (t_style != null) {
          i = t_style.hashCode();
       }
       return (((i1 + i) * 31) + Float.floatToIntBits(this.alpha));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Image.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Image\(_src="+this._src+", width="+this.width+", height="+this.height+", x="+this.x+", y="+this.y+", _style="+this._style+", alpha="+this.alpha+"\)";
    }
}
