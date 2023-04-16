package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$c;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import java.util.List;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.String;
import java.lang.StringBuilder;

public final class SlideHorizontalAtlasPlayer$c	// class@0008b6
{
    public final ImageMeta$AtlasCoverSize a;
    public final List b;
    public final int c;
    public boolean d;
    public boolean e;

    public void SlideHorizontalAtlasPlayer$c(){
       super(null, null, 0, false, false, 31, null);
    }
    public void SlideHorizontalAtlasPlayer$c(ImageMeta$AtlasCoverSize p0,List p1,int p2,boolean p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void SlideHorizontalAtlasPlayer$c(ImageMeta$AtlasCoverSize p0,List p1,int p2,boolean p3,boolean p4,int p5,u p6){
       int i = 0;
       int i1 = (p5 & 0x01)? i: p0;
       if (!(p5 & 0x02)) {
          i = p1;
       }
       int i2 = (p5 & 0x04)? 0: p2;
       int i3 = (p5 & 0x08)? 0: p3;
       boolean b = (p5 & 0x10)? false: p4;
       super(i1, i, i2, i3, b);
       return;
    }
    public final ImageMeta$AtlasCoverSize a(){
       return this.a;
    }
    public final List b(){
       return this.b;
    }
    public final int c(){
       return this.c;
    }
    public final boolean d(){
       return this.d;
    }
    public final boolean e(){
       return this.e;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof SlideHorizontalAtlasPlayer$c && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (this.c == p0.c && (this.d == p0.d && this.e == p0.e)))))) {
          return true;
       }
       return false;
    }
    public final void f(boolean p0){
       this.e = p0;
    }
    public final void g(boolean p0){
       this.d = p0;
    }
    public int hashCode(){
       SlideHorizontalAtlasPlayer$c ta = this.a;
       int i = 0;
       int i1 = (ta != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       SlideHorizontalAtlasPlayer$c tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (((i1 + i) * 31) + this.c) * 31;
       SlideHorizontalAtlasPlayer$c td = this.d;
       int i2 = 1;
       if (td != null) {
          td = 1;
       }
       i1 = (i1 + td) * 31;
       td = this.e;
       if (td == null) {
          i2 = td;
       }
       return (i1 + i2);
    }
    public String toString(){
       return "Model\(atlasCoverSize="+this.a+", atlasUrls="+this.b+", index="+this.c+", loaded="+this.d+", isLoadSuccess="+this.e+"\)";
    }
}
