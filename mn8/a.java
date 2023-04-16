package mn8.a;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.component.canvas.TKCanvas2D;
import java.util.Map;
import cq8.a;
import java.util.Objects;
import iq8.r;
import iq8.a;
import java.lang.Number;
import com.tkruntime.v8.V8Object;

public class a implements b	// class@002e7c
{

    public void a(){
       super();
    }
    public Object a(f p0){
       TKCanvas2D tKCanvas2D = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (tKCanvas2D != PatchProxyResult.class) {
       }else {
          tKCanvas2D = new TKCanvas2D(p0);
       }
       return tKCanvas2D;
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
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TKCanvas2D tKCanvas2D = p0;
       Objects.requireNonNull(p1);
       int i = -1;
       int i1 = 4;
       this = 3;
       int i2 = 2;
       int i3 = 1;
       int i4 = 0;
       switch (p1.hashCode()){
           case 0xc8dadd5b:
             if (p1.equals("rotate")) {
                i = 0;
             }
             break;
           case 0xceb30f58:
             if (p1.equals("drawLine")) {
                i = 1;
             }
             break;
           case 0xceb49bb6:
             if (p1.equals("drawOval")) {
                i = 2;
             }
             break;
           case 0xceb4c389:
             if (p1.equals("drawPath")) {
                i = 3;
             }
             break;
           case 0xceb5b948:
             if (p1.equals("drawRect")) {
                i = 4;
             }
             break;
           case 0xceb6a491:
             if (p1.equals("drawText")) {
                i = 5;
             }
             break;
           case 0xded2d334:
             if (p1.equals("drawCircle")) {
                i = 6;
             }
             break;
           case 0x35c17d:
             if (p1.equals("save")) {
                i = 7;
             }
             break;
           case 0x35e50a:
             if (p1.equals("skew")) {
                i = 8;
             }
             break;
           case 0x683094a:
             if (p1.equals("scale")) {
                i = 9;
             }
             break;
           case 0x732bc7f:
             if (p1.equals("drawColor")) {
                i = 10;
             }
             break;
           case 0x7863677:
             if (p1.equals("drawImage")) {
                i = 11;
             }
             break;
           case 0x839a7ae:
             if (p1.equals("drawRoundRect")) {
                i = 12;
             }
             break;
           case 0x36b25395:
             if (p1.equals("clipPath")) {
                i = 13;
             }
             break;
           case 0x3ec0f14e:
             if (p1.equals("translate")) {
                i = 14;
             }
             break;
           case 0x416ad28e:
             if (p1.equals("restore")) {
                i = 15;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             tKCanvas2D.rotate(a.l(a.c(p2, i4)));
             return null;
           case 1:
             tKCanvas2D.drawLine(a.l(a.c(p2, i4)), a.l(a.c(p2, i3)), a.l(a.c(p2, i2)), a.l(a.c(p2, this)), a.a(p2, i1));
             return null;
           case 2:
             tKCanvas2D.drawOval(a.a(p2, i4), a.a(p2, i3));
             return null;
           case 3:
             tKCanvas2D.drawPath(a.a(p2, i4), a.a(p2, i3));
             return null;
           case 4:
             tKCanvas2D.drawRect(a.a(p2, i4), a.a(p2, i3));
             return null;
           case 5:
             tKCanvas2D.drawText(a.a(p2, i4), a.l(a.c(p2, i3)), a.l(a.c(p2, i2)), a.a(p2, this));
             return null;
           case 6:
             tKCanvas2D.drawCircle(a.l(a.c(p2, i4)), a.l(a.c(p2, i3)), a.l(a.c(p2, i2)), a.a(p2, this));
             return null;
           case 7:
             tKCanvas2D.save();
             return null;
           case 8:
             tKCanvas2D.skew(a.l(a.c(p2, i4)), a.l(a.c(p2, i3)));
             return null;
           case 9:
             tKCanvas2D.scale(a.l(a.c(p2, i4)), a.l(a.c(p2, i3)));
             return null;
           case 10:
             tKCanvas2D.drawColor(a.a(p2, i4));
             return null;
           case 11:
             tKCanvas2D.drawImage(a.a(p2, i4), a.a(p2, i3), a.a(p2, i2), a.a(p2, this));
             return null;
           case 12:
             tKCanvas2D.drawRoundRect(a.a(p2, i4), a.l(a.c(p2, i3)), a.l(a.c(p2, i2)), a.a(p2, this));
             return null;
           case 13:
             tKCanvas2D.clipPath(a.a(p2, i4));
             return null;
           case 14:
             tKCanvas2D.translate(a.l(a.c(p2, i4)), a.l(a.c(p2, i3)));
             return null;
           case 15:
             tKCanvas2D.restore();
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
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xc8dadd5b:
             if (p0.equals("rotate")) {
                i = 0;
             }
             break;
           case 0xceb30f58:
             if (p0.equals("drawLine")) {
                i = 1;
             }
             break;
           case 0xceb49bb6:
             if (p0.equals("drawOval")) {
                i = 2;
             }
             break;
           case 0xceb4c389:
             if (p0.equals("drawPath")) {
                i = 3;
             }
             break;
           case 0xceb5b948:
             if (p0.equals("drawRect")) {
                i = 4;
             }
             break;
           case 0xceb6a491:
             if (p0.equals("drawText")) {
                i = 5;
             }
             break;
           case 0xded2d334:
             if (p0.equals("drawCircle")) {
                i = 6;
             }
             break;
           case 0x35c17d:
             if (p0.equals("save")) {
                i = 7;
             }
             break;
           case 0x35e50a:
             if (p0.equals("skew")) {
                i = 8;
             }
             break;
           case 0x683094a:
             if (p0.equals("scale")) {
                i = 9;
             }
             break;
           case 0x732bc7f:
             if (p0.equals("drawColor")) {
                i = 10;
             }
             break;
           case 0x7863677:
             if (p0.equals("drawImage")) {
                i = 11;
             }
             break;
           case 0x839a7ae:
             if (p0.equals("drawRoundRect")) {
                i = 12;
             }
             break;
           case 0x36b25395:
             if (p0.equals("clipPath")) {
                i = 13;
             }
             break;
           case 0x3ec0f14e:
             if (p0.equals("translate")) {
                i = 14;
             }
             break;
           case 0x416ad28e:
             if (p0.equals("restore")) {
                i = 15;
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
           case 1:
           default:
             return 0;
       }
       return 1;
    }
    public String i(){
       return "1";
    }
    public boolean k(Object p0,String p1,Object p2){
       return a.c(this, p0, p1, p2);
    }
    public String l(){
       return "restore,drawColor,drawImage,drawLine,drawRoundRect,drawCircle,drawRect,drawPath,drawOval,skew,clipPath,rotate,scale,translate,save,drawText";
    }
}
