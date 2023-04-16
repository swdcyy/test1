package j1.d;
import android.content.Context;
import org.xmlpull.v1.XmlPullParser;
import java.lang.Object;
import android.util.SparseArray;
import j1.d$a;
import java.util.Iterator;
import java.util.ArrayList;
import j1.d$b;
import android.util.AttributeSet;
import android.util.Xml;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public class d	// class@002218
{
    public int a;
    public a b;
    public int c;
    public int d;
    public SparseArray e;
    public SparseArray f;
    public b g;

    public void d(Context p0,XmlPullParser p1){
       super();
       this.a = -1;
       this.c = -1;
       this.d = -1;
       this.e = new SparseArray();
       this.f = new SparseArray();
       this.b(p0, p1);
    }
    public int a(int p0,int p1,float p2,float p3){
       d$a uoa = this.e.get(p1);
       if (uoa == null) {
          return p1;
       }
       d$a uoa1 = 0xbf800000;
       if (!p2 - uoa1 || !p3 - uoa1) {
          if (uoa.c == p0) {
             return p0;
          }
          Iterator iterator = uoa.b.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return uoa.c;
             }
             if (p0 == iterator.next().f) {
                break ;
             }
          }
          return p0;
       }else {
          d$b uob = null;
          Iterator iterator1 = uoa.b.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                d$b uob1 = iterator1.next();
                if (uob1.a(p2, p3)) {
                   if (p0 == uob1.f) {
                      break ;
                   }else {
                      uob = uob1;
                   }
                }
             }else if(uob != null){
                return uob.f;
             }else {
                return uoa.c;
             }
          }
          return p0;
       }
    }
    public final void b(Context p0,XmlPullParser p1){
       TypedArray typedArray = p0.obtainStyledAttributes(Xml.asAttributeSet(p1), c$b.s5);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          if (!index) {
             this.a = typedArray.getResourceId(index, this.a);
          }
          i = i + 1;
       }
       typedArray.recycle();
       try{
          typedArray = 0;
          indexCount = p1.getEventType();
          d$a uoa = 1;
          while (indexCount != uoa) {
             if (indexCount) {
                String str = "StateSet";
                if (indexCount != 2) {
                   if (indexCount == 3 && str.equals(p1.getName())) {
                      return;
                   }
                }else {
                   String name = p1.getName();
                   int i1 = -1;
                   switch (name.hashCode()){
                       case 0x4c7d471:
                         if (name.equals("State")) {
                            i1 = 2;
                         }
                         break;
                       case 0x4d92b252:
                         if (name.equals("LayoutDescription")) {
                            i1 = 0;
                         }
                         break;
                       case 0x526c4e31:
                         if (name.equals(str)) {
                            i1 = 1;
                         }
                         break;
                       case 0x7155a865:
                         if (name.equals("Variant")) {
                            i1 = 3;
                         }
                         break;
                       default:
                   }
                label_0076 :
                   if (i1 && i1 != uoa) {
                      if (i1 != 2) {
                         if (i1 == 3) {
                            d$b uob = new d$b(p0, p1);
                            if (typedArray != null) {
                               typedArray.a(uob);
                            }
                         }
                      }else {
                         d$a uoa1 = new d$a(p0, p1);
                         this.e.put(uoa1.a, uoa1);
                      }
                   }
                }
             }else {
                p1.getName();
             }
             indexCount = p1.next();
          }
       }catch(org.xmlpull.v1.XmlPullParserException e10){
          e10.printStackTrace();
       }catch(java.io.IOException e10){
          e10.printStackTrace();
       }
       return;
    }
    public int c(int p0,int p1,int p2){
       return this.d(-1, p0, (float)p1, (float)p2);
    }
    public int d(int p0,int p1,float p2,float p3){
       d$a c;
       d$b f;
       if (p0 == p1) {
          d$a uoa = (p1 == -1)? this.e.valueAt(0): this.e.get(this.c);
          if (uoa == null) {
             return -1;
          }else if(this.d != -1 && uoa.b.get(p0).a(p2, p3)){
             return p0;
          }else {
             int i = uoa.b(p2, p3);
             if (p0 == i) {
                return p0;
             }else if(i == -1){
                c = uoa.c;
             }else {
                c = uoa.b.get(i).f;
             }
             return c;
          }
       }else {
          c = this.e.get(p1);
          if (c == null) {
             return -1;
          }
          p1 = c.b(p2, p3);
          c = (p1 == -1)? c.c: c.b.get(p1).f;
          return c;
       }
    }
}
