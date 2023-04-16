package nf.b;
import xb.t$a;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.lang.Math;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;

public class b extends t$a	// class@002701
{
    public float l;
    public String m;
    public float n;
    public String o;
    public ReadableMap p;
    public float q;
    public float r;

    public void b(){
       super();
       this.l = 0;
       this.n = 0;
    }
    public void b(Matrix p0,Rect p1,int p2,int p3,float p4,float p5,float p6,float p7){
       float f2;
       String str3;
       float f5;
       String str5;
       int i4;
       float f = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = p2;
       int i1 = p3;
       int i2 = 2;
       int i3 = 1;
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),Float.valueOf(p6),Float.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, f, b.class, "1")) {
             return;
          }
       }
       f.q = (float)oobject1.left;
       f.r = (float)oobject1.top;
       f.l = 0;
       f.n = 0;
       f.m = null;
       f.o = null;
       String str = "size";
       float f1 = 0x3f800000;
       if (f.p.hasKey(str) && f.p.getType(str) == ReadableType.String) {
          if (("cover").equals(f.p.getString(str))) {
             f1 = Math.max(p6, p7);
             f2 = f1;
          }else {
             f2 = 0x3f800000;
          }
          if (("contain").equals(f.p.getString(str))) {
             f1 = Math.min(p6, p7);
             f2 = f1;
          }
       }else {
          f2 = 0x3f800000;
       }
       String str1 = "width";
       String str2 = "height";
       if (f.p.hasKey(str1) || f.p.hasKey(str2)) {
          if (!PatchProxy.applyVoidOneRefs(oobject1, f, b.class, "4") && f.p.hasKey(str1)) {
             if (f.p.getType(str1) == ReadableType.Number) {
                f.l = (float)f.p.getInt(str1);
             }else if(f.p.getType(str1) == ReadableType.String){
                f.m = f.p.getString(str1);
                f.l = ((float)p1.width() * f.c(f.m)) / 100.00f;
             }
          }
          if (!PatchProxy.applyVoidOneRefs(oobject1, f, b.class, "3") && f.p.hasKey(str2)) {
             if (f.p.getType(str2) == ReadableType.Number) {
                f.n = (float)f.p.getInt(str2);
             }else if(f.p.getType(str2) == ReadableType.String){
                f.o = f.p.getString(str2);
                f.n = ((float)p1.height() * f.c(f.o)) / 100.00f;
             }
          }
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p2), Integer.valueOf(p3), f, b.class, "2")) {
             str = "auto";
             if (str.equals(f.m) && str.equals(f.o)) {
                f.l = (float)i;
                f.n = (float)i1;
             }else if(str.equals(f.m)){
                f.l = (f.n * (float)i) / (float)i1;
             }else if(str.equals(f.o)){
                f.n = (f.l * (float)i1) / (float)i;
             }
          }
          f1 = f.l / (float)i;
          f2 = f.n / (float)i1;
       }
       float f3 = f2;
       float f4 = f1;
       str = "positionX";
       str2 = "center";
       if (f.p.hasKey(str)) {
          if (f.p.getType(str) == ReadableType.Number) {
             f.q = (float)f.p.getDouble(str);
          label_0280 :
             str3 = str2;
             f5 = f4;
             p5 = f3;
          }else if(f.p.getType(str) == ReadableType.String){
             str1 = f.p.getString(str);
             if (PatchProxy.isSupport(b.class)) {
                str5 = str1;
                str3 = str2;
                f5 = f4;
                p5 = f3;
                if (!PatchProxy.applyVoidFourRefs(str1, p1, Float.valueOf(f4), Integer.valueOf(p2), this, b.class, "6")) {
                }
             }else {
                str5 = str1;
                str3 = str2;
                f5 = f4;
                p5 = f3;
             }
          }else {
             goto label_0280 ;
          }
       }else {
          goto label_0280 ;
       }
       str = "positionY";
       if (f.p.hasKey(str)) {
          if (f.p.getType(str) == ReadableType.Number) {
             f.r = (float)f.p.getDouble(str);
          label_0343 :
             f1 = p5;
          }else if(f.p.getType(str) == ReadableType.String){
             String str4 = f.p.getString(str);
             if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(str4, p1, Float.valueOf(p5), Integer.valueOf(p3), this, b.class, "7")) {
                goto label_0343 ;
             }else {
                Objects.requireNonNull(str4);
                switch (str4.hashCode()){
                    case 0xad8d9a2b:
                      if (str4.equals("bottom")) {
                         i2 = 0;
                      }
                      break;
                    case 0xaeb2cc55:
                      if (str4.equals(str3)) {
                         i2 = 1;
                      }
                      break;
                    case 0x1c155:
                      if (str4.equals("top")) {
                         i2 = 2;
                      }
                      break;
                    default:
                   label_02dc :
                      i2 = -1;
                }
                switch (i2){
                    case 0:
                      f1 = p5;
                      f.r = (float)oobject1.top + ((float)p1.height() - ((float)i1 * f1));
                      break;
                    case 1:
                      f1 = p5;
                      f.r = (float)oobject1.top + (((float)p1.height() - ((float)i1 * f1)) * 0x3f000000);
                      break;
                    case 2:
                      f1 = p5;
                      f.r = (float)oobject1.top;
                      break;
                    default:
                      f1 = p5;
                      f.r = (((float)p1.height() - ((float)i1 * f1)) * f.c(str4)) / 100.00f;
                }
             }
          }else {
             goto label_0343 ;
          }
       }else {
          goto label_0343 ;
       }
       oobject.setScale(f5, f1);
       oobject.postTranslate((float)(int)(f.q + 0x3f000000), (float)(int)(f.r + 0x3f000000));
       return;
    }
    public final float c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 0;
       if (TextUtils.isEmpty(p0)) {
          return f;
       }
       if (!p0.endsWith("%")) {
          return f;
       }
       return Float.parseFloat(p0.substring(0, (p0.length() - 1)));
    }
    public String toString(){
       return "backgroundImageScaleType";
    }
}
