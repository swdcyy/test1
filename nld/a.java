package nld.a;
import com.kuaishou.edit.draft.CropOptions;
import java.lang.String;
import com.yxcrop.gifshow.v3.editor.crop.data.ratio.CropRatioType;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.StringBuilder;

public final class a	// class@001e43
{
    public final CropOptions a;
    public final String b;
    public final boolean c;
    public final CropRatioType d;

    public void a(){
       super(null, null, false, null, 15, null);
    }
    public void a(CropOptions p0,String p1,boolean p2,CropRatioType p3){
       a.p(p0, "cropOptions");
       a.p(p1, "croppedFilePath");
       a.p(p3, "ratioType");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void a(CropOptions p0,String p1,boolean p2,CropRatioType p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = CropOptions.getDefaultInstance();
          a.o(p0, "CropOptions.getDefaultInstance\(\)");
       }
       if (p4 & 0x02) {
          p1 = "";
       }
       if (p4 & 0x04) {
          p2 = false;
       }
       p3 = (p4 & 0x08)? CropRatioType.FREE: null;
       super(p0, p1, p2, p3);
       return;
    }
    public final CropOptions a(){
       return this.a;
    }
    public final String b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (this.c == p0.c && a.g(this.d, p0.d)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.d;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CropDraftData\(cropOptions="+this.a+", croppedFilePath="+this.b+", useRotate="+this.c+", ratioType="+this.d+"\)";
    }
}
