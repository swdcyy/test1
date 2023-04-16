package j1.a$b;
import android.content.Context;
import org.xmlpull.v1.XmlPullParser;
import java.lang.Object;
import android.util.AttributeSet;
import android.util.Xml;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import java.lang.String;
import androidx.constraintlayout.widget.a;
import java.lang.Float;

public class a$b	// class@002212
{
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;
    public a g;

    public void a$b(Context p0,XmlPullParser p1){
       super();
       this.b = Float.NaN;
       this.c = Float.NaN;
       this.d = Float.NaN;
       this.e = Float.NaN;
       this.f = -1;
       TypedArray typedArray = p0.obtainStyledAttributes(Xml.asAttributeSet(p1), c$b.T5);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          if (!index) {
             this.f = typedArray.getResourceId(index, this.f);
             p0.getResources().getResourceName(this.f);
             if (("layout").equals(p0.getResources().getResourceTypeName(this.f))) {
                a uoa = new a();
                this.g = uoa;
                uoa.h(p0, this.f);
             }
          }else if(index == 1){
             this.e = typedArray.getDimension(index, this.e);
          }else if(index == 2){
             this.c = typedArray.getDimension(index, this.c);
          }else if(index == 3){
             this.d = typedArray.getDimension(index, this.d);
          }else if(index == 4){
             this.b = typedArray.getDimension(index, this.b);
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
    public boolean a(float p0,float p1){
       if (!Float.isNaN(this.b) && p0 - this.b < 0) {
          return false;
       }
       if (!Float.isNaN(this.c) && p1 - this.c < 0) {
          return false;
       }
       if (!Float.isNaN(this.d) && p0 - this.d > 0) {
          return false;
       }
       if (!Float.isNaN(this.e) && p1 - this.e > 0) {
          return false;
       }
       return true;
    }
}
