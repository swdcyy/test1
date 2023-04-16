package j1.a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Object;
import android.util.SparseArray;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import j1.a$b;
import j1.a$a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import androidx.constraintlayout.widget.a;
import java.lang.CharSequence;
import java.lang.Integer;
import java.util.ArrayList;

public class a	// class@002213
{
    public final ConstraintLayout a;
    public a b;
    public int c;
    public int d;
    public SparseArray e;
    public SparseArray f;
    public b g;

    public void a(Context p0,ConstraintLayout p1,int p2){
       super();
       this.c = -1;
       this.d = -1;
       this.e = new SparseArray();
       this.f = new SparseArray();
       this.a = p1;
       this.a(p0, p2);
    }
    public final void a(Context p0,int p1){
       XmlResourceParser xml = p0.getResources().getXml(p1);
       try{
          int i = 0;
          int eventType = xml.getEventType();
          a$a uoa = 1;
          while (eventType != uoa) {
             if (eventType) {
                if (eventType == 2) {
                   String name = xml.getName();
                   int i1 = -1;
                   switch (name.hashCode()){
                       case 0xaf89b525:
                         if (name.equals("ConstraintSet")) {
                            i1 = 4;
                         }
                         break;
                       case 0x4c7d471:
                         if (name.equals("State")) {
                            i1 = 2;
                         }
                         break;
                       case 0x526c4e31:
                         if (name.equals("StateSet")) {
                            i1 = 1;
                         }
                         break;
                       case 0x62ce7272:
                         if (name.equals("layoutDescription")) {
                            i1 = 0;
                         }
                         break;
                       case 0x7155a865:
                         if (name.equals("Variant")) {
                            i1 = 3;
                         }
                         break;
                       default:
                   }
                label_0057 :
                   if (i1 && i1 != uoa) {
                      if (i1 != 2) {
                         if (i1 != 3) {
                            if (i1 == 4) {
                               this.b(p0, xml);
                            }
                         }else {
                            a$b uob = new a$b(p0, xml);
                            if (i != null) {
                               i.a(uob);
                            }
                         }
                      }else {
                         a$a uoa1 = new a$a(p0, xml);
                         this.e.put(uoa1.a, uoa1);
                      }
                   }
                }
             }else {
                xml.getName();
             }
             eventType = xml.next();
          }
       }catch(org.xmlpull.v1.XmlPullParserException e9){
          e9.printStackTrace();
       }catch(java.io.IOException e9){
          e9.printStackTrace();
       }
       return;
    }
    public final void b(Context p0,XmlPullParser p1){
       a uoa = new a();
       int attributeCou = p1.getAttributeCount();
       int i = 0;
       while (i < attributeCou) {
          if (("id").equals(p1.getAttributeName(i))) {
             String attributeVal = p1.getAttributeValue(i);
             int i1 = -1;
             i = (attributeVal.contains("/"))? p0.getResources().getIdentifier(attributeVal.substring((attributeVal.indexOf(47) + 1)), "id", p0.getPackageName()): -1;
             if (i == i1 && attributeVal.length() > 1) {
                i = Integer.parseInt(attributeVal.substring(1));
             }
             uoa.E(p0, p1);
             this.f.put(i, uoa);
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
    public void c(int p0,float p1,float p2){
       a$a uoa;
       int i;
       a tb;
       a$b f;
       a tc = this.c;
       if (tc == p0) {
          uoa = (p0 == -1)? this.e.valueAt(0): this.e.get(tc);
          tc = this.d;
          if (tc != -1 && uoa.b.get(tc).a(p1, p2)) {
             return;
          }else {
             i = uoa.b(p1, p2);
             if (this.d == i) {
                return;
             }else if(i == -1){
                tb = this.b;
             }else {
                tb = uoa.b.get(i).g;
             }
             if (i != -1) {
                f = uoa.b.get(i).f;
             }
             if (tb == null) {
                return;
             }else {
                this.d = i;
                tb.b(this.a);
             }
          }
       }else {
          this.c = p0;
          uoa = this.e.get(p0);
          i = uoa.b(p1, p2);
          a$a d = (i == -1)? uoa.d: uoa.b.get(i).g;
          if (i != -1) {
             f = uoa.b.get(i).f;
          }
          if (d == null) {
             return;
          }else {
             this.d = i;
             d.b(this.a);
          }
       }
       return;
    }
}
