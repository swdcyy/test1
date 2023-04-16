package bod.d;
import mn9.a;
import nuc.a;
import d0c.a;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.model.TextTemplateItemType;
import java.lang.Enum;

public class d implements a	// class@000296
{
    public final a a;
    public a b;
    public String c;
    public boolean d;
    public DynamicTextParams e;
    public boolean f;
    public String g;
    public TextStyleAttrs h;
    public TextStyleValue i;

    public void d(a p0,a p1,String p2,boolean p3,DynamicTextParams p4,boolean p5,String p6,TextStyleAttrs p7,TextStyleValue p8,int p9,u p10){
       p2 = "";
       String str = (p9 & 0x04)? p2: null;
       if (p9 & 0x08) {
          p3 = false;
       }
       if (p9 & 0x10) {
          p4 = null;
       }
       if (p9 & 0x20) {
          p5 = false;
       }
       if (!(p9 & 0x40)) {
          a uoa = null;
       }
       if (p9 & 0x0080) {
          p7 = null;
       }
       if (p9 & 0x0100) {
          p8 = null;
       }
       a.p(p0, "textConfig");
       a.p(str, "fontPath");
       a.p(p2, "sk2cUnzipPath");
       super();
       this.a = p0;
       this.b = null;
       this.c = str;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p2;
       this.h = p7;
       this.i = p8;
       return;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public final a b(){
       return this.b;
    }
    public final boolean c(){
       return this.d;
    }
    public boolean d(){
       return true;
    }
    public final TextStyleAttrs e(){
       return this.h;
    }
    public final TextStyleValue f(){
       return this.i;
    }
    public final DynamicTextParams g(){
       return this.e;
    }
    public String getId(){
       String obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.r();
       a.m(obj);
       return obj;
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TextTemplateItemType.DYNAMIC.ordinal();
    }
    public boolean i(){
       return false;
    }
    public final boolean j(){
       return this.f;
    }
    public final a k(){
       return this.a;
    }
    public final void l(a p0){
       this.b = p0;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.r();
       a.m(obj);
       return obj;
    }
}
