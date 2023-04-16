package f3.h$d;
import f3.h$e;
import f3.h$a;
import android.graphics.Matrix;
import java.util.ArrayList;
import androidx.collection.ArrayMap;
import java.lang.Object;
import androidx.collection.SimpleArrayMap;
import f3.h$c;
import f3.h$b;
import f3.h$f;
import java.lang.IllegalStateException;
import java.lang.String;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import f3.a;
import android.content.res.TypedArray;
import o1.g;

public class h$d extends h$e	// class@001fc8
{
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public int k;
    public int[] l;
    public String m;

    public void h$d(){
       super(null);
       this.a = new Matrix();
       this.b = new ArrayList();
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0x3f800000;
       this.g = 0x3f800000;
       this.h = 0;
       this.i = 0;
       this.j = new Matrix();
       this.m = null;
    }
    public void h$d(h$d p0,ArrayMap p1){
       h$c uoc;
       super(null);
       this.a = new Matrix();
       this.b = new ArrayList();
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0x3f800000;
       this.g = 0x3f800000;
       this.h = 0;
       this.i = 0;
       Matrix matrix = new Matrix();
       this.j = matrix;
       this.m = null;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.l = p0.l;
       h$d m = p0.m;
       this.m = m;
       this.k = p0.k;
       if (m != null) {
          p1.put(m, this);
       }
       matrix.set(p0.j);
       p0 = p0.b;
       int i = 0;
       while (true) {
          if (i >= p0.size()) {
             return;
          }
          h$f obj = p0.get(i);
          if (obj instanceof h$d) {
             this.b.add(new h$d(obj, p1));
          }else if(obj instanceof h$c){
             uoc = new h$c(obj);
          }else if(obj instanceof h$b){
             uoc = new h$b(obj);
          }else {
             break ;
          }
          this.b.add(uoc);
          obj = uoc.b;
          if (obj != null) {
             p1.put(obj, uoc);
          }
          i = i + 1;
       }
       throw new IllegalStateException("Unknown object in the tree!");
    }
    public boolean a(){
       boolean b = false;
       int i = 0;
       while (true) {
          if (i >= this.b.size()) {
             return b;
          }
          if (this.b.get(i).a()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean b(int[] p0){
       int i1 = 0;
       for (int i = 0; i < this.b.size(); i = i + 1) {
          i1 = i1 | this.b.get(i).b(p0);
       }
       return i1;
    }
    public void c(Resources p0,AttributeSet p1,Resources$Theme p2,XmlPullParser p3){
       TypedArray typedArray = g.k(p0, p2, p1, a.b);
       this.e(typedArray, p3);
       typedArray.recycle();
    }
    public final void d(){
       this.j.reset();
       this.j.postTranslate((- this.d), (- this.e));
       this.j.postScale(this.f, this.g);
       this.j.postRotate(this.c, 0, 0);
       this.j.postTranslate((this.h + this.d), (this.i + this.e));
    }
    public final void e(TypedArray p0,XmlPullParser p1){
       this.l = null;
       this.c = g.f(p0, p1, "rotation", 5, this.c);
       this.d = p0.getFloat(1, this.d);
       this.e = p0.getFloat(2, this.e);
       this.f = g.f(p0, p1, "scaleX", 3, this.f);
       this.g = g.f(p0, p1, "scaleY", 4, this.g);
       this.h = g.f(p0, p1, "translateX", 6, this.h);
       this.i = g.f(p0, p1, "translateY", 7, this.i);
       String str = p0.getString(0);
       if (str != null) {
          this.m = str;
       }
       this.d();
       return;
    }
    public String getGroupName(){
       return this.m;
    }
    public Matrix getLocalMatrix(){
       return this.j;
    }
    public float getPivotX(){
       return this.d;
    }
    public float getPivotY(){
       return this.e;
    }
    public float getRotation(){
       return this.c;
    }
    public float getScaleX(){
       return this.f;
    }
    public float getScaleY(){
       return this.g;
    }
    public float getTranslateX(){
       return this.h;
    }
    public float getTranslateY(){
       return this.i;
    }
    public void setPivotX(float p0){
       if (p0 - this.d) {
          this.d = p0;
          this.d();
       }
       return;
    }
    public void setPivotY(float p0){
       if (p0 - this.e) {
          this.e = p0;
          this.d();
       }
       return;
    }
    public void setRotation(float p0){
       if (p0 - this.c) {
          this.c = p0;
          this.d();
       }
       return;
    }
    public void setScaleX(float p0){
       if (p0 - this.f) {
          this.f = p0;
          this.d();
       }
       return;
    }
    public void setScaleY(float p0){
       if (p0 - this.g) {
          this.g = p0;
          this.d();
       }
       return;
    }
    public void setTranslateX(float p0){
       if (p0 - this.h) {
          this.h = p0;
          this.d();
       }
       return;
    }
    public void setTranslateY(float p0){
       if (p0 - this.i) {
          this.i = p0;
          this.d();
       }
       return;
    }
}
