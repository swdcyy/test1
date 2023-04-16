package j1.a$a;
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
import androidx.constraintlayout.widget.a;
import j1.a$b;

public class a$a	// class@002211
{
    public int a;
    public ArrayList b;
    public int c;
    public a d;

    public void a$a(Context p0,XmlPullParser p1){
       super();
       this.b = new ArrayList();
       this.c = -1;
       TypedArray typedArray = p0.obtainStyledAttributes(Xml.asAttributeSet(p1), c$b.r5);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          if (!index) {
             this.a = typedArray.getResourceId(index, this.a);
          }else if(index == 1){
             this.c = typedArray.getResourceId(index, this.c);
             p0.getResources().getResourceName(this.c);
             if (("layout").equals(p0.getResources().getResourceTypeName(this.c))) {
                a uoa = new a();
                this.d = uoa;
                uoa.h(p0, this.c);
             }
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
    public void a(a$b p0){
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
