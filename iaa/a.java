package iaa.a;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.graphics.Bitmap;

public class a	// class@0027d4
{
    public String a;
    public boolean b;
    public Bitmap c;
    public byte[] d;
    public int e;
    public a f;
    public final int g;

    public void a(int p0){
       super();
       this.a = null;
       this.b = false;
       this.c = null;
       this.d = null;
       this.e = DraftFileManager.l;
       this.f = null;
       this.g = p0;
    }
    public void a(int p0,int p1){
       super();
       this.a = null;
       this.b = false;
       this.c = null;
       this.d = null;
       this.e = DraftFileManager.l;
       this.f = null;
       this.g = p0;
       this.e = p1;
    }
    public static a a(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoa = new a(0);
       uoa.a = p0;
       uoa.b = p1;
       return uoa;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "ResourceOrigin{mFilePath="+this.a+", mMoveOrigin="+this.b+", mBitmap="+this.c+", w,h=";
       String str = (this.c == null)? "0 0": this.c.getWidth()+" "+this.c.getHeight();
       obj = obj+str+", mBytes=";
       a td = this.d;
       int i = (td == null)? 0: td.length;
       return obj+i+", mQuality="+this.e+", mInternalResourceOrigin="+this.f+", mResourceType="+this.g+'}';
    }
}
