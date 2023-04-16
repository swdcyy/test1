package ln8.b;
import cq8.d;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import cq8.b;
import iq8.r;
import sn8.a;
import do8.b;
import tn8.a;
import rn8.a;
import un8.k;
import xn8.d;
import wn8.b;
import mn8.b;
import io8.b;
import mn8.c;
import ko8.f;
import mn8.d;
import mn8.a;
import co8.e;
import un8.x;
import pn8.c;
import un8.y;
import qn8.a;

public class b implements d	// class@002d06
{
    public final ConcurrentHashMap a;
    public static final String[] b;

    static {
       String[] stringArray = new String[]{"Path","TKImageView","Canvas2D","TKImageLoadParam","RoundRectView","Paint","TKAnimatedImage","ViewPager","ViewPager2","TKNetwork","ImageResource","ListView","ScrollView","Dialog","ReboundView","Canvas2DView","TKImage","RefreshControl"};
       b.b = stringArray;
    }
    public void b(){
       super();
       this.a = new ConcurrentHashMap(25);
    }
    public ConcurrentHashMap a(){
       return this.a;
    }
    public String[] b(){
       return b.b;
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x9c7d5a22:
             if (p0.equals("RefreshControl")) {
                i = 0;
             }
             break;
           case 0xafaa1de9:
             if (p0.equals("TKImageView")) {
                i = 1;
             }
             break;
           case 0xcda7dc50:
             if (p0.equals("ReboundView")) {
                i = 2;
             }
             break;
           case 0xdfbea124:
             if (p0.equals("TKImage")) {
                i = 3;
             }
             break;
           case 0xe68683b7:
             if (p0.equals("TKNetwork")) {
                i = 4;
             }
             break;
           case 0xfd8ce9ca:
             if (p0.equals("Canvas2D")) {
                i = 5;
             }
             break;
           case 0x25d845:
             if (p0.equals("Path")) {
                i = 6;
             }
             break;
           case 0x1a4bbf4:
             if (p0.equals("ViewPager2")) {
                i = 7;
             }
             break;
           case 0x495083e:
             if (p0.equals("Paint")) {
                i = 8;
             }
             break;
           case 0x18d3c3fe:
             if (p0.equals("ViewPager")) {
                i = 9;
             }
             break;
           case 0x3637a38f:
             if (p0.equals("Canvas2DView")) {
                i = 10;
             }
             break;
           case 0x49e40a83:
             if (p0.equals("TKImageLoadParam")) {
                i = 11;
             }
             break;
           case 0x54104483:
             if (p0.equals("ListView")) {
                i = 12;
             }
             break;
           case 0x684d3c41:
             if (p0.equals("TKAnimatedImage")) {
                i = 13;
             }
             break;
           case 0x6cba7669:
             if (p0.equals("ImageResource")) {
                i = 14;
             }
             break;
           case 0x79fee968:
             if (p0.equals("Dialog")) {
                i = 15;
             }
             break;
           case 0x7ac64332:
             if (p0.equals("ScrollView")) {
                i = 16;
             }
             break;
           case 0x7f3f4e37:
             if (p0.equals("RoundRectView")) {
                i = 17;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
           case 12:
           case 13:
           case 14:
           case 15:
           case 16:
           case 17:
           case 1:
           default:
             return false;
       }
       return true;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.a.clear();
       return;
    }
    public b init(String p0){
       String str5;
       int i;
       c str41;
       a str43;
       d str44;
       b str46;
       Object obj = p0;
       String obj1 = PatchProxy.applyOneRefs(obj, this, b.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       Objects.requireNonNull(p0);
       obj1 = "Canvas2D";
       String str = "TKNetwork";
       String str1 = "TKImage";
       String str2 = "ReboundView";
       String str3 = "TKImageView";
       y String str4 = "RefreshControl";
       switch (p0.hashCode()){
           case 0x9c7d5a22:
             str5 = str3;
             if (!obj.equals(str4)) {
             label_004b :
                i = -1;
             }else {
                i = 0;
             }
             break;
           case 0xafaa1de9:
             str5 = str3;
             if (!obj.equals(str5)) {
                goto label_004b ;
             }else {
                i = 1;
             }
             break;
           case 0xcda7dc50:
             str5 = str2;
             if (!obj.equals(str5)) {
                str2 = str5;
             }else {
                str2 = str5;
                str5 = str3;
                i = 2;
             }
             break;
           case 0xdfbea124:
             str5 = str1;
             if (!obj.equals(str5)) {
                str1 = str5;
             }else {
                str1 = str5;
                str5 = str3;
                i = 3;
             }
             break;
           case 0xe68683b7:
             str5 = str;
             if (!obj.equals(str5)) {
                str = str5;
             }else {
                str = str5;
                str5 = str3;
                i = 4;
             }
             break;
           case 0xfd8ce9ca:
             if (obj.equals(obj1)) {
                str5 = str3;
                i = 5;
             }else {
             }
             break;
           case 0x25d845:
             if (obj.equals("Path")) {
                str5 = str3;
                i = 6;
             }else {
             }
             break;
           case 0x1a4bbf4:
             if (obj.equals("ViewPager2")) {
                str5 = str3;
                i = 7;
             }else {
             }
             break;
           case 0x495083e:
             if (obj.equals("Paint")) {
                str5 = str3;
                i = 8;
             }else {
             }
             break;
           case 0x18d3c3fe:
             if (obj.equals("ViewPager")) {
                str5 = str3;
                i = 9;
             }else {
             }
             break;
           case 0x3637a38f:
             if (obj.equals("Canvas2DView")) {
                str5 = str3;
                i = 10;
             }else {
             }
             break;
           case 0x49e40a83:
             if (obj.equals("TKImageLoadParam")) {
                str5 = str3;
                i = 11;
             }else {
             }
             break;
           case 0x54104483:
             if (obj.equals("ListView")) {
                str5 = str3;
                i = 12;
             }else {
             }
             break;
           case 0x684d3c41:
             if (obj.equals("TKAnimatedImage")) {
                str5 = str3;
                i = 13;
             }else {
             }
             break;
           case 0x6cba7669:
             if (obj.equals("ImageResource")) {
                str5 = str3;
                i = 14;
             }else {
             }
             break;
           case 0x79fee968:
             if (obj.equals("Dialog")) {
                str5 = str3;
                i = 15;
             }else {
             }
             break;
           case 0x7ac64332:
             if (obj.equals("ScrollView")) {
                str5 = str3;
                i = 16;
             }else {
             }
             break;
           case 0x7f3f4e37:
             if (obj.equals("RoundRectView")) {
                str5 = str3;
                i = 17;
             }else {
             }
             break;
           default:
             str5 = str3;
             goto label_004b ;
       }
       switch (i){
           case 0:
             a uoa = new a();
             this.a.put(str4, uoa);
             return uoa;
           case 1:
             str4 = new y();
             this.a.put(str5, str4);
             return str4;
           case 2:
             str41 = new c();
             this.a.put(str2, str41);
             return str41;
           case 3:
             x str42 = new x();
             this.a.put(str1, str42);
             return str42;
           case 4:
             e uoe = new e();
             this.a.put(str, uoe);
             return uoe;
           case 5:
             str43 = new a();
             this.a.put(obj1, str43);
             return str43;
           case 6:
             str44 = new d();
             this.a.put("Path", str44);
             return str44;
           case 7:
             f str45 = new f();
             this.a.put("ViewPager2", str45);
             return str45;
           case 8:
             str41 = new c();
             this.a.put("Paint", str41);
             return str41;
           case 9:
             str46 = new b();
             this.a.put("ViewPager", str46);
             return str46;
           case 10:
             str46 = new b();
             this.a.put("Canvas2DView", str46);
             return str46;
           case 11:
             str46 = new b();
             this.a.put("TKImageLoadParam", str46);
             return str46;
           case 12:
             str44 = new d();
             this.a.put("ListView", str44);
             return str44;
           case 13:
             k str47 = new k();
             this.a.put("TKAnimatedImage", str47);
             return str47;
           case 14:
             str43 = new a();
             this.a.put("ImageResource", str43);
             return str43;
           case 15:
             str43 = new a();
             this.a.put("Dialog", str43);
             return str43;
           case 16:
             str46 = new b();
             this.a.put("ScrollView", str46);
             return str46;
           case 17:
             str43 = new a();
             this.a.put("RoundRectView", str43);
             return str43;
           default:
             r.a();
             return null;
       }
    }
    public void init(){
       String[] b;
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b = b.b;
       int len = b.length;
       int i = 0;
       while (i < len) {
          object oobject = b[i];
          if (!this.a.contains(oobject)) {
             this.init(oobject);
          }
          i = i + 1;
       }
       return;
    }
}
