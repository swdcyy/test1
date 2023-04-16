package hp8.h;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.component.text.SpanItem;
import java.util.Map;
import cq8.a;
import java.lang.Boolean;
import java.util.Objects;
import iq8.r;
import java.lang.Float;
import java.lang.Integer;
import iq8.a;
import com.tkruntime.v8.V8Function;
import java.lang.Number;

public class h implements b	// class@0025cf
{

    public void h(){
       super();
    }
    public Object a(f p0){
       SpanItem spanItem = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (spanItem != PatchProxyResult.class) {
       }else {
          spanItem = new SpanItem(p0);
       }
       return spanItem;
    }
    public void b(Object p0,Map p1){
       a.b(this, p0, p1);
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xa3b52e25:
             if (p0.equals("offsetX")) {
                i = 0;
             }
             break;
           case 0xa3b52e26:
             if (p0.equals("offsetY")) {
                i = 1;
             }
             break;
           case 0xa98b352b:
             if (p0.equals("imageWidth")) {
                i = 2;
             }
             break;
           case 0xb7009c93:
             if (p0.equals("fontFamily")) {
                i = 3;
             }
             break;
           case 0xc17f1c84:
             if (p0.equals("textStyle")) {
                i = 4;
             }
             break;
           case 0xccc36214:
             if (p0.equals("imageUrl")) {
                i = 5;
             }
             break;
           case 0xe329ad18:
             if (p0.equals("imagePlaceholder")) {
                i = 6;
             }
             break;
           case 0x188db:
             if (p0.equals("end")) {
                i = 7;
             }
             break;
           case 0x1c56f:
             if (p0.equals("url")) {
                i = 8;
             }
             break;
           case 0x35e001:
             if (p0.equals("size")) {
                i = 9;
             }
             break;
           case 0x5a72f63:
             if (p0.equals("color")) {
                i = 10;
             }
             break;
           case 0x5fb28d2:
             if (p0.equals("index")) {
                i = 11;
             }
             break;
           case 0x68ac462:
             if (p0.equals("start")) {
                i = 12;
             }
             break;
           case 0x3a1ea90e:
             if (p0.equals("marginRight")) {
                i = 13;
             }
             break;
           case 0x6e0c7662:
             if (p0.equals("imageHeight")) {
                i = 14;
             }
             break;
           case 0x757a12d5:
             if (p0.equals("marginLeft")) {
                i = 15;
             }
             break;
           case 0x7a9d45a4:
             if (p0.equals("spanType")) {
                i = 16;
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
           case 1:
           default:
             return false;
       }
       return true;
    }
    public boolean d(String p0){
       return a.h(this, p0);
    }
    public Object e(Object p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0xa3b52e25:
             if (p1.equals("offsetX")) {
                i = 0;
             }
             break;
           case 0xa3b52e26:
             if (p1.equals("offsetY")) {
                i = 1;
             }
             break;
           case 0xa98b352b:
             if (p1.equals("imageWidth")) {
                i = 2;
             }
             break;
           case 0xb7009c93:
             if (p1.equals("fontFamily")) {
                i = 3;
             }
             break;
           case 0xc17f1c84:
             if (p1.equals("textStyle")) {
                i = 4;
             }
             break;
           case 0xccc36214:
             if (p1.equals("imageUrl")) {
                i = 5;
             }
             break;
           case 0xe329ad18:
             if (p1.equals("imagePlaceholder")) {
                i = 6;
             }
             break;
           case 0x188db:
             if (p1.equals("end")) {
                i = 7;
             }
             break;
           case 0x1c56f:
             if (p1.equals("url")) {
                i = 8;
             }
             break;
           case 0x35e001:
             if (p1.equals("size")) {
                i = 9;
             }
             break;
           case 0x5a72f63:
             if (p1.equals("color")) {
                i = 10;
             }
             break;
           case 0x5fb28d2:
             if (p1.equals("index")) {
                i = 11;
             }
             break;
           case 0x68ac462:
             if (p1.equals("start")) {
                i = 12;
             }
             break;
           case 0x3a1ea90e:
             if (p1.equals("marginRight")) {
                i = 13;
             }
             break;
           case 0x6e0c7662:
             if (p1.equals("imageHeight")) {
                i = 14;
             }
             break;
           case 0x757a12d5:
             if (p1.equals("marginLeft")) {
                i = 15;
             }
             break;
           case 0x7a9d45a4:
             if (p1.equals("spanType")) {
                i = 16;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return Integer.valueOf(p0.offsetX);
           case 1:
             return Float.valueOf(p0.offsetY);
           case 2:
             return Integer.valueOf(p0.imageWidth);
           case 3:
             return p0.fontFamily;
           case 4:
             return p0.textStyle;
           case 5:
             return p0.imageUrl;
           case 6:
             return p0.imagePlaceholder;
           case 7:
             return Integer.valueOf(p0.end);
           case 8:
             return p0.url;
           case 9:
             return Integer.valueOf(p0.size);
           case 10:
             return p0.color;
           case 11:
             return Integer.valueOf(p0.index);
           case 12:
             return Integer.valueOf(p0.start);
           case 13:
             return Float.valueOf(p0.marginRight);
           case 14:
             return Integer.valueOf(p0.imageHeight);
           case 15:
             return Float.valueOf(p0.marginLeft);
           case 16:
             return p0.spanType;
           default:
             r.a();
             return null;
       }
    }
    public Object f(Object p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       if (!p1.equals("setSpanOnClickListener")) {
          r.a();
          return null;
       }else {
          p0.setSpanOnClickListener(a.a(p2, 0));
          return null;
       }
    }
    public void g(Object p0,String p1,Object p2){
       a.a(this, p0, p1, p2);
    }
    public int h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("setSpanOnClickListener")) {
          return 0;
       }
       return 1;
    }
    public String i(){
       return "1";
    }
    public boolean k(Object p0,String p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p1);
       int i = -1;
       boolean b = false;
       switch (p1.hashCode()){
           case 0xa3b52e25:
             if (p1.equals("offsetX")) {
                i = 0;
             }
             break;
           case 0xa3b52e26:
             if (p1.equals("offsetY")) {
                i = 1;
             }
             break;
           case 0xa98b352b:
             if (p1.equals("imageWidth")) {
                i = 2;
             }
             break;
           case 0xb7009c93:
             if (p1.equals("fontFamily")) {
                i = 3;
             }
             break;
           case 0xc17f1c84:
             if (p1.equals("textStyle")) {
                i = 4;
             }
             break;
           case 0xccc36214:
             if (p1.equals("imageUrl")) {
                i = 5;
             }
             break;
           case 0xe329ad18:
             if (p1.equals("imagePlaceholder")) {
                i = 6;
             }
             break;
           case 0x188db:
             if (p1.equals("end")) {
                i = 7;
             }
             break;
           case 0x1c56f:
             if (p1.equals("url")) {
                i = 8;
             }
             break;
           case 0x35e001:
             if (p1.equals("size")) {
                i = 9;
             }
             break;
           case 0x5a72f63:
             if (p1.equals("color")) {
                i = 10;
             }
             break;
           case 0x5fb28d2:
             if (p1.equals("index")) {
                i = 11;
             }
             break;
           case 0x68ac462:
             if (p1.equals("start")) {
                i = 12;
             }
             break;
           case 0x3a1ea90e:
             if (p1.equals("marginRight")) {
                i = 13;
             }
             break;
           case 0x6e0c7662:
             if (p1.equals("imageHeight")) {
                i = 14;
             }
             break;
           case 0x757a12d5:
             if (p1.equals("marginLeft")) {
                i = 15;
             }
             break;
           case 0x7a9d45a4:
             if (p1.equals("spanType")) {
                i = 16;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p0.offsetX = a.m(p2);
          label_0185 :
             b = true;
             break;
           case 1:
             p0.offsetY = a.l(p2);
             goto label_0185 ;
             break;
           case 2:
             p0.imageWidth = a.m(p2);
             goto label_0185 ;
             break;
           case 3:
             p0.fontFamily = p2;
             goto label_0185 ;
             break;
           case 4:
             p0.textStyle = p2;
             goto label_0185 ;
             break;
           case 5:
             p0.imageUrl = p2;
             goto label_0185 ;
             break;
           case 6:
             p0.imagePlaceholder = p2;
             goto label_0185 ;
             break;
           case 7:
             p0.end = a.m(p2);
             goto label_0185 ;
             break;
           case 8:
             p0.url = p2;
             goto label_0185 ;
             break;
           case 9:
             p0.size = a.m(p2);
             goto label_0185 ;
             break;
           case 10:
             p0.setColor(p2);
             goto label_0185 ;
             break;
           case 11:
             p0.index = a.m(p2);
             goto label_0185 ;
             break;
           case 12:
             p0.start = a.m(p2);
             goto label_0185 ;
             break;
           case 13:
             p0.marginRight = a.l(p2);
             goto label_0185 ;
             break;
           case 14:
             p0.imageHeight = a.m(p2);
             goto label_0185 ;
             break;
           case 15:
             p0.marginLeft = a.l(p2);
             goto label_0185 ;
             break;
           case 16:
             p0.spanType = p2;
             goto label_0185 ;
             break;
           default:
             r.a();
       }
       return b;
    }
    public String l(){
       return "offsetX,marginLeft,url,start,textStyle,size,offsetY,marginRight,spanType,fontFamily,index,imageWidth,color,imageUrl,end,imagePlaceholder,imageHeight,setSpanOnClickListener";
    }
}
