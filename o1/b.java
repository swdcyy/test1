package o1.b;
import android.graphics.Shader;
import android.content.res.ColorStateList;
import java.lang.Object;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.util.Xml;
import java.lang.String;
import java.util.Objects;
import o1.a;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.StringBuilder;
import o1.d;

public final class b	// class@002736
{
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public void b(Shader p0,ColorStateList p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static b a(Resources p0,int p1,Resources$Theme p2){
       int i;
       String str;
       XmlResourceParser xml = p0.getXml(p1);
       AttributeSet uAttributeSe = Xml.asAttributeSet(xml);
       do {
          i = xml.next();
          str = 2;
       } while (i != str && i != 1);
       if (i != str) {
          throw new XmlPullParserException("No start tag found");
       }
       String name = xml.getName();
       Objects.requireNonNull(name);
       if (name.equals("gradient")) {
          return b.d(d.b(p0, xml, uAttributeSe, p2));
       }
       if (name.equals("selector")) {
          return b.c(a.b(p0, xml, uAttributeSe, p2));
       }
       throw new XmlPullParserException(xml.getPositionDescription()+": unsupported complex color tag "+name);
    }
    public static b b(int p0){
       return new b(null, null, p0);
    }
    public static b c(ColorStateList p0){
       return new b(null, p0, p0.getDefaultColor());
    }
    public static b d(Shader p0){
       return new b(p0, null, 0);
    }
    public static b g(Resources p0,int p1,Resources$Theme p2){
       try{
          return b.a(p0, p1, p2);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public int e(){
       return this.c;
    }
    public Shader f(){
       return this.a;
    }
    public boolean h(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean i(){
       boolean b;
       if (this.a == null) {
          b tb = this.b;
          if (tb != null && tb.isStateful()) {
             b = true;
          label_0011 :
             return b;
          }
       }
       b = false;
       goto label_0011 ;
    }
    public boolean j(int[] p0){
       if (this.i()) {
          b tb = this.b;
          int colorForStat = tb.getColorForState(p0, tb.getDefaultColor());
          if (colorForStat != this.c) {
             this.c = colorForStat;
          label_0019 :
             return true;
          }
       }
       boolean b = false;
       goto label_0019 ;
    }
    public void k(int p0){
       this.c = p0;
    }
    public boolean l(){
       boolean b = (this.h() || this.c != null)? true: false;
       return b;
    }
}
