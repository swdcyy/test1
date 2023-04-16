package h80.l;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class l	// class@00210c
{
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public void l(){
       super();
       this.a = false;
       this.b = true;
       this.c = true;
    }
    public final boolean a(){
       return this.b;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof l && (this.a == p0.a && (this.b == p0.b && this.c == p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       l ta = this.a;
       int i = 1;
       if (ta != null) {
          ta = 1;
       }
       int i1 = ta * 31;
       l tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       i1 = (i1 + tb) * 31;
       tb = this.c;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PreviewCustomParam\(mForceShowSinglePhotoPreviewTopBottomMask="+this.a+", mPictureRenderDecorationInPreview="+this.b+", enableLongVideoUpload="+this.c+"\)";
    }
}
