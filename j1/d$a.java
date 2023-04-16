package j1.d$a;
import android.content.Context;
import org.xmlpull.v1.XmlPullParser;
import java.lang.Object;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.util.Xml;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import java.lang.String;
import j1.d$b;

public class d$a	// class@002216
{
    public int a;
    public ArrayList b;
    public int c;
    public boolean d;

    public void d$a(Context p0,XmlPullParser p1){
       super();
       this.b = new ArrayList();
       this.c = -1;
       boolean b = false;
       this.d = b;
       TypedArray typedArray = p0.obtainStyledAttributes(Xml.asAttributeSet(p1), c$b.r5);
       int indexCount = typedArray.getIndexCount();
       while (b < indexCount) {
          int index = typedArray.getIndex(b);
          if (!index) {
             this.a = typedArray.getResourceId(index, this.a);
          }else {
             boolean b1 = true;
             if (index == b1) {
                this.c = typedArray.getResourceId(index, this.c);
                p0.getResources().getResourceName(this.c);
                if (("layout").equals(p0.getResources().getResourceTypeName(this.c))) {
                   this.d = b1;
                }
             }
          }
          b = b + 1;
       }
       typedArray.recycle();
       return;
    }
    public void a(d$b p0){
       this.b.add(p0);
    }
    public int b(float p0,float p1){
       int i = 0;
       while (true) {
          if (i >= this.b.size()) {
             return -1;
          }
          if (this.b.get(i).a(p0, p1)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
}
