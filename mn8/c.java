package mn8.c;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.component.canvas.TKPaint;
import java.util.Map;
import cq8.a;
import java.util.Objects;
import iq8.r;
import iq8.a;
import java.lang.Number;
import com.tkruntime.v8.V8Array;
import java.lang.Boolean;

public class c implements b	// class@002e7e
{

    public void c(){
       super();
    }
    public Object a(f p0){
       TKPaint tKPaint = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (tKPaint != PatchProxyResult.class) {
       }else {
          tKPaint = new TKPaint(p0);
       }
       return tKPaint;
    }
    public void b(Object p0,Map p1){
       a.b(this, p0, p1);
    }
    public boolean c(String p0){
       return a.i(this, p0);
    }
    public boolean d(String p0){
       return a.h(this, p0);
    }
    public Object e(Object p0,String p1){
       return a.f(this, p0, p1);
    }
    public Object f(Object p0,String p1,Object[] p2){
       int this;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TKPaint tKPaint = p0;
       Objects.requireNonNull(p1);
       int i = -1;
       Number number = 5;
       this = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       int i4 = 0;
       switch (p1.hashCode()){
           case 0x93e77fab:
             if (p1.equals("measureText")) {
                i = 0;
             }
             break;
           case 0xb5b57c58:
             if (p1.equals("setStrikeThruText")) {
                i = 1;
             }
             break;
           case 0xb76f4a64:
             if (p1.equals("setPorterDuffMode")) {
                i = 2;
             }
             break;
           case 0xbd649828:
             if (p1.equals("setLineDash")) {
                i = 3;
             }
             break;
           case 0xca025810:
             if (p1.equals("setCap")) {
                i = 4;
             }
             break;
           case 0xce0aa3fb:
             if (p1.equals("setLetterSpacing")) {
                i = 5;
             }
             break;
           case 0xd365a295:
             if (p1.equals("setFontFamily")) {
                i = 6;
             }
             break;
           case 0xd957749d:
             if (p1.equals("clearGradient")) {
                i = 7;
             }
             break;
           case 0xe2eaa4ac:
             if (p1.equals("setStrokeWidth")) {
                i = 8;
             }
             break;
           case 0xe40e6b71:
             if (p1.equals("setRadialGradient")) {
                i = 9;
             }
             break;
           case 0xe88dc7d4:
             if (p1.equals("setBoldText")) {
                i = 10;
             }
             break;
           case 0x6761d4f:
             if (p1.equals("reset")) {
                i = 11;
             }
             break;
           case 0x11f2da4f:
             if (p1.equals("setShadowLayer")) {
                i = 12;
             }
             break;
           case 0x125c0f84:
             if (p1.equals("clearShadowLayer")) {
                i = 13;
             }
             break;
           case 0x1c3ec796:
             if (p1.equals("setTextAlign")) {
                i = 14;
             }
             break;
           case 0x1d3bed1f:
             if (p1.equals("setTextSkewX")) {
                i = 15;
             }
             break;
           case 0x3abfd950:
             if (p1.equals("setTextSize")) {
                i = 16;
             }
             break;
           case 0x52b5721c:
             if (p1.equals("setAlpha")) {
                i = 17;
             }
             break;
           case 0x52d2f021:
             if (p1.equals("setColor")) {
                i = 18;
             }
             break;
           case 0x53b6de6f:
             if (p1.equals("setStyle")) {
                i = 19;
             }
             break;
           case 0x764c0cac:
             if (p1.equals("setJoin")) {
                i = 20;
             }
             break;
           case 0x780f5cd7:
             if (p1.equals("setUnderlineText")) {
                i = 21;
             }
             break;
           case 0x7e29f25a:
             if (p1.equals("setStrokeJoinMiterLimit")) {
                i = 22;
             }
             break;
           case 0x7fec2a77:
             if (p1.equals("setLinearGradient")) {
                i = 23;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return tKPaint.measureText(a.a(p2, i4));
           case 1:
             tKPaint.setStrikeThruText(a.b(p2, i4).booleanValue());
             return null;
           case 2:
             tKPaint.setPorterDuffMode(a.m(a.c(p2, i4)));
             return null;
           case 3:
             tKPaint.setLineDash(a.a(p2, i4), a.l(a.c(p2, i3)));
             return null;
           case 4:
             tKPaint.setCap(a.m(a.c(p2, i4)));
             return null;
           case 5:
             tKPaint.setLetterSpacing(a.l(a.c(p2, i4)));
             return null;
           case 6:
             tKPaint.setFontFamily(a.a(p2, i4));
             return null;
           case 7:
             tKPaint.clearGradient();
             return null;
           case 8:
             tKPaint.setStrokeWidth(a.l(a.c(p2, i4)));
             return null;
           case 9:
             tKPaint.setRadialGradient(a.l(a.c(p2, i4)), a.l(a.c(p2, i3)), a.l(a.c(p2, i2)), a.a(p2, i1), a.a(p2, this));
             return null;
           case 10:
             tKPaint.setBoldText(a.b(p2, i4).booleanValue());
             return null;
           case 11:
             tKPaint.reset();
             return null;
           case 12:
             tKPaint.setShadowLayer(a.l(a.c(p2, i4)), a.l(a.c(p2, i3)), a.l(a.c(p2, i2)), a.a(p2, i1));
             return null;
           case 13:
             tKPaint.clearShadowLayer();
             return null;
           case 14:
             tKPaint.setTextAlign(a.a(p2, i4));
             return null;
           case 15:
             tKPaint.setTextSkewX(a.l(a.c(p2, i4)));
             return null;
           case 16:
             tKPaint.setTextSize(a.l(a.c(p2, i4)));
             return null;
           case 17:
             tKPaint.setAlpha(a.l(a.c(p2, i4)));
             return null;
           case 18:
             tKPaint.setColor(a.a(p2, i4));
             return null;
           case 19:
             tKPaint.setStyle(a.m(a.c(p2, i4)));
             return null;
           case 20:
             tKPaint.setJoin(a.m(a.c(p2, i4)));
             return null;
           case 21:
             tKPaint.setUnderlineText(a.b(p2, i4).booleanValue());
             return null;
           case 22:
             tKPaint.setStrokeJoinMiterLimit(a.l(a.c(p2, i4)));
             return null;
           case 23:
             tKPaint.setLinearGradient(a.l(a.c(p2, i4)), a.l(a.c(p2, i3)), a.l(a.c(p2, i2)), a.l(a.c(p2, i1)), a.a(p2, this), a.a(p2, number));
             return null;
           default:
             r.a();
             return null;
       }
    }
    public void g(Object p0,String p1,Object p2){
       a.a(this, p0, p1, p2);
    }
    public int h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x93e77fab:
             if (p0.equals("measureText")) {
                i = 0;
             }
             break;
           case 0xb5b57c58:
             if (p0.equals("setStrikeThruText")) {
                i = 1;
             }
             break;
           case 0xb76f4a64:
             if (p0.equals("setPorterDuffMode")) {
                i = 2;
             }
             break;
           case 0xbd649828:
             if (p0.equals("setLineDash")) {
                i = 3;
             }
             break;
           case 0xca025810:
             if (p0.equals("setCap")) {
                i = 4;
             }
             break;
           case 0xce0aa3fb:
             if (p0.equals("setLetterSpacing")) {
                i = 5;
             }
             break;
           case 0xd365a295:
             if (p0.equals("setFontFamily")) {
                i = 6;
             }
             break;
           case 0xd957749d:
             if (p0.equals("clearGradient")) {
                i = 7;
             }
             break;
           case 0xe2eaa4ac:
             if (p0.equals("setStrokeWidth")) {
                i = 8;
             }
             break;
           case 0xe40e6b71:
             if (p0.equals("setRadialGradient")) {
                i = 9;
             }
             break;
           case 0xe88dc7d4:
             if (p0.equals("setBoldText")) {
                i = 10;
             }
             break;
           case 0x6761d4f:
             if (p0.equals("reset")) {
                i = 11;
             }
             break;
           case 0x11f2da4f:
             if (p0.equals("setShadowLayer")) {
                i = 12;
             }
             break;
           case 0x125c0f84:
             if (p0.equals("clearShadowLayer")) {
                i = 13;
             }
             break;
           case 0x1c3ec796:
             if (p0.equals("setTextAlign")) {
                i = 14;
             }
             break;
           case 0x1d3bed1f:
             if (p0.equals("setTextSkewX")) {
                i = 15;
             }
             break;
           case 0x3abfd950:
             if (p0.equals("setTextSize")) {
                i = 16;
             }
             break;
           case 0x52b5721c:
             if (p0.equals("setAlpha")) {
                i = 17;
             }
             break;
           case 0x52d2f021:
             if (p0.equals("setColor")) {
                i = 18;
             }
             break;
           case 0x53b6de6f:
             if (p0.equals("setStyle")) {
                i = 19;
             }
             break;
           case 0x764c0cac:
             if (p0.equals("setJoin")) {
                i = 20;
             }
             break;
           case 0x780f5cd7:
             if (p0.equals("setUnderlineText")) {
                i = 21;
             }
             break;
           case 0x7e29f25a:
             if (p0.equals("setStrokeJoinMiterLimit")) {
                i = 22;
             }
             break;
           case 0x7fec2a77:
             if (p0.equals("setLinearGradient")) {
                i = 23;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return 2;
           case 1:
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
           case 18:
           case 19:
           case 20:
           case 21:
           case 22:
           case 23:
           case 2:
             return 1;
           default:
             return 0;
       }
    }
    public String i(){
       return "1";
    }
    public boolean k(Object p0,String p1,Object p2){
       return a.c(this, p0, p1, p2);
    }
    public String l(){
       return "setShadowLayer,setTextAlign,setJoin,setUnderlineText,setLinearGradient,setFontFamily,setColor,setRadialGradient,setTextSize,setPorterDuffMode,setLineDash,setCap,measureText,setStrikeThruText,reset,setBoldText,setStrokeJoinMiterLimit,setTextSkewX,setStyle,setAlpha,clearGradient,setLetterSpacing,setStrokeWidth,clearShadowLayer";
    }
}
