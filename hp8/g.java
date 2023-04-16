package hp8.g;
import java.lang.Object;
import com.tkruntime.v8.V8Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tx4.y;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tkruntime.v8.V8Object$Undefined;
import java.lang.StringBuilder;
import java.lang.Throwable;
import zp8.a;
import java.lang.Integer;
import java.util.Objects;
import com.tkruntime.v8.V8Function;

public class g	// class@0025ce
{
    public String a;
    public String b;
    public int c;
    public int d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public int l;
    public int m;
    public float n;
    public int o;
    public float p;
    public float q;
    public V8Function r;
    public static final String s = "absoluteSize";
    public static final String t = "textStyle";

    public void g(){
       super();
    }
    public static Object a(V8Object p0,String p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!y.a(p0) || TextUtils.isEmpty(p1)) {
          return p2;
       }
       p0 = p0.get(p1);
       if (p0 instanceof V8Object$Undefined) {
          return p2;
       }
       return p0;
    }
    public static g b(int p0,int p1,int p2,V8Object p3){
       g obj;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), p3, null, g.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       g og = null;
       if (!y.a(p3)) {
          return og;
       }else {
          obj = new g();
          obj.c = p0;
          obj.d = p1;
          obj.o = p2;
          String str = g.a(p3, "spanType", og);
          obj.a = str;
          Objects.requireNonNull(str);
          switch (str.hashCode()){
              case 0xb7009c93:
                if (str.equals("fontFamily")) {
                   str = 0;
                }
                break;
              case 0xbc66ce18:
                if (str.equals("absoluteSize")) {
                   str = 1;
                }
                break;
              case 0xc17f1c84:
                if (str.equals("textStyle")) {
                   str = 2;
                }
                break;
              case 0xc2bb3aec:
                if (str.equals("underLine")) {
                   str = 3;
                }
                break;
              case 0xd9ca27e0:
                if (str.equals("foregroundColor")) {
                   str = 4;
                }
                break;
              case 0x1c56f:
                if (str.equals("url")) {
                   str = 5;
                }
                break;
              case 0x5a5c588:
                if (str.equals("click")) {
                   str = 6;
                }
                break;
              case 0x5faa95b:
                if (str.equals("image")) {
                   str = 7;
                }
                break;
              case 0x294116b3:
                if (str.equals("strikeThrough")) {
                   str = 8;
                }
                break;
              case 0x4cb7f6d5:
                if (str.equals("backgroundColor")) {
                   str = 9;
                }
                break;
              default:
             label_0054 :
                str = -1;
          }
          String str1 = "size";
          switch (str){
              case 0:
                obj.g = g.a(p3, "fontFamily", og);
                obj.f = g.a(p3, str1, Integer.valueOf(-1)).intValue();
                obj.h = g.a(p3, "textStyle", og);
                break;
              case 1:
                str = g.a(p3, str1, Integer.valueOf(-1)).intValue();
                obj.f = str;
                if (-1 != str) {
                }
                break;
              case 2:
                str = g.a(p3, "textStyle", og);
                obj.h = str;
                if (!TextUtils.isEmpty(str)) {
                }
              case 3:
              case 8:
             label_01cc :
                og = obj;
                break;
              case 4:
              case 9:
                str = g.a(p3, "color", og);
                obj.e = str;
                if (!TextUtils.isEmpty(str)) {
                }
                break;
              case 5:
                str = g.a(p3, "url", og);
                obj.b = str;
                if (!TextUtils.isEmpty(str)) {
                }
                break;
              case 6:
                Object obj1 = g.a(p3, "clickListener", og);
                if (obj1 instanceof V8Function && y.a(obj1)) {
                   obj.r = obj1;
                   goto label_01cc ;
                }else {
                   goto label_01cc ;
                }
                break;
              case 7:
                str = g.a(p3, "imageUrl", og);
                if (!TextUtils.isEmpty(str)) {
                   obj.i = str;
                   obj.j = g.a(p3, "imagePlaceholder", og);
                   obj.k = g.a(p3, "imageWidth", Integer.valueOf(0)).intValue();
                   obj.l = g.a(p3, "imageHeight", Integer.valueOf(0)).intValue();
                   obj.p = (float)g.a(p3, "marginLeft", Integer.valueOf(0)).intValue();
                   obj.q = (float)g.a(p3, "marginRight", Integer.valueOf(0)).intValue();
                   obj.m = g.a(p3, "offsetX", Integer.valueOf(0)).intValue();
                   obj.n = (float)g.a(p3, "offsetY", Integer.valueOf(0)).intValue();
                   goto label_01cc ;
                }
                break;
              default:
          }
       label_01cd :
          return og;
       }
    }
}
