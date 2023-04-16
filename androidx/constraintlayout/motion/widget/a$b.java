package androidx.constraintlayout.motion.widget.a$b;
import androidx.constraintlayout.motion.widget.a;
import android.content.Context;
import org.xmlpull.v1.XmlPullParser;
import java.lang.Object;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.constraintlayout.motion.widget.a$b$a;
import java.lang.String;
import android.content.res.Resources;
import java.lang.StringBuilder;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.a;
import android.util.SparseArray;
import android.util.TypedValue;
import ll8.c$b;
import androidx.constraintlayout.motion.widget.b;

public class a$b	// class@000674
{
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public String f;
    public int g;
    public int h;
    public float i;
    public final a j;
    public ArrayList k;
    public b l;
    public ArrayList m;
    public int n;
    public boolean o;
    public int p;
    public int q;
    public int r;

    public void a$b(a p0,Context p1,XmlPullParser p2){
       super();
       this.a = -1;
       this.b = false;
       this.c = -1;
       this.d = -1;
       this.e = 0;
       this.f = null;
       this.g = -1;
       this.h = 400;
       this.i = 0;
       this.k = new ArrayList();
       this.l = null;
       this.m = new ArrayList();
       this.n = 0;
       this.o = false;
       this.p = -1;
       this.q = 0;
       this.r = 0;
       this.h = p0.l;
       this.q = p0.m;
       this.j = p0;
       this.d(p0, p1, Xml.asAttributeSet(p2));
    }
    public void a$b(a p0,a$b p1){
       super();
       this.a = -1;
       this.b = false;
       this.c = -1;
       this.d = -1;
       this.e = 0;
       this.f = null;
       this.g = -1;
       this.h = 400;
       this.i = 0;
       this.k = new ArrayList();
       this.l = null;
       this.m = new ArrayList();
       this.n = 0;
       this.o = false;
       this.p = -1;
       this.q = 0;
       this.r = 0;
       this.j = p0;
       if (p1 != null) {
          this.p = p1.p;
          this.e = p1.e;
          this.f = p1.f;
          this.g = p1.g;
          this.h = p1.h;
          this.k = p1.k;
          this.i = p1.i;
          this.q = p1.q;
       }
       return;
    }
    public void a(Context p0,XmlPullParser p1){
       this.m.add(new a$b$a(p0, this, p1));
    }
    public String b(Context p0){
       StringBuilder str = -1;
       String str1 = (this.d == str)? "null": p0.getResources().getResourceEntryName(this.d);
       String str2 = (this.c == str)? str1+" -> null": str1+" -> "+p0.getResources().getResourceEntryName(this.c);
       return str2;
    }
    public final void c(a p0,Context p1,TypedArray p2){
       a uoa;
       int indexCount = p2.getIndexCount();
       int i = 0;
       a$b uob = -1;
       a$b uob1 = 1;
       while (i < indexCount) {
          int index = p2.getIndex(i);
          String str = "layout";
          if (index == 2) {
             this.c = p2.getResourceId(index, this.c);
             if (str.equals(p1.getResources().getResourceTypeName(this.c))) {
                uoa = new a();
                uoa.D(p1, this.c);
                p0.h.append(this.c, uoa);
             }
          }else {
             String str1 = 3;
             if (index == str1) {
                this.d = p2.getResourceId(index, this.d);
                if (str.equals(p1.getResources().getResourceTypeName(this.d))) {
                   uoa = new a();
                   uoa.D(p1, this.d);
                   p0.h.append(this.d, uoa);
                }
             }else if(index == 6){
                TypedValue type = p2.peekValue(index).type;
                if (type == uob1) {
                   int resourceId = p2.getResourceId(index, uob);
                   this.g = resourceId;
                   if (resourceId != uob) {
                      this.e = -2;
                   }
                }else if(type == str1){
                   String str2 = p2.getString(index);
                   this.f = str2;
                   if (str2.indexOf("/") > 0) {
                      this.g = p2.getResourceId(index, uob);
                      this.e = -2;
                   }else {
                      this.e = uob;
                   }
                }else {
                   this.e = p2.getInteger(index, this.e);
                }
             }else if(index == 4){
                this.h = p2.getInt(index, this.h);
             }else if(index == 8){
                this.i = p2.getFloat(index, this.i);
             }else if(index == uob1){
                this.n = p2.getInteger(index, this.n);
             }else if(!index){
                this.a = p2.getResourceId(index, this.a);
             }else if(index == 9){
                this.o = p2.getBoolean(index, this.o);
             }else if(index == 7){
                this.p = p2.getInteger(index, uob);
             }else if(index == 5){
                this.q = p2.getInteger(index, 0);
             }else if(index == 10){
                this.r = p2.getInteger(index, 0);
             }
          }
          i = i + 1;
       }
       if (this.d == uob) {
          this.b = uob1;
       }
       return;
    }
    public final void d(a p0,Context p1,AttributeSet p2){
       TypedArray typedArray = p1.obtainStyledAttributes(p2, c$b.O5);
       this.c(p0, p1, typedArray);
       typedArray.recycle();
    }
    public int e(){
       return this.n;
    }
    public int f(){
       return this.c;
    }
    public int g(){
       return this.q;
    }
    public int h(){
       return this.d;
    }
    public b i(){
       return this.l;
    }
    public boolean j(){
       return (this.o ^ 0x01);
    }
    public boolean k(int p0){
       boolean b = (p0 & this.r)? true: false;
       return b;
    }
    public void l(int p0){
       this.h = p0;
    }
}
