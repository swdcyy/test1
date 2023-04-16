package androidx.emoji.widget.a;
import android.text.SpannableStringBuilder;
import java.lang.Class;
import java.util.ArrayList;
import java.lang.Object;
import z1.h;
import java.lang.CharSequence;
import android.text.Editable;
import java.lang.Appendable;
import java.util.List;
import androidx.emoji.widget.a$a;
import java.lang.reflect.Array;

public final class a extends SpannableStringBuilder	// class@00076e
{
    public final Class b;
    public final List c;

    public void a(Class p0){
       super();
       this.c = new ArrayList();
       h.h(p0, "watcherClass cannot be null");
       this.b = p0;
    }
    public void a(Class p0,CharSequence p1){
       super(p1);
       this.c = new ArrayList();
       h.h(p0, "watcherClass cannot be null");
       this.b = p0;
    }
    public void a(Class p0,CharSequence p1,int p2,int p3){
       super(p1, p2, p3);
       this.c = new ArrayList();
       h.h(p0, "watcherClass cannot be null");
       this.b = p0;
    }
    public static a c(Class p0,CharSequence p1){
       return new a(p0, p1);
    }
    public void a(){
       this.b();
    }
    public Editable append(char p0){
       this.append(p0);
       return this;
    }
    public Editable append(CharSequence p0){
       this.append(p0);
       return this;
    }
    public Editable append(CharSequence p0,int p1,int p2){
       this.append(p0, p1, p2);
       return this;
    }
    public SpannableStringBuilder append(char p0){
       super.append(p0);
       return this;
    }
    public SpannableStringBuilder append(CharSequence p0){
       super.append(p0);
       return this;
    }
    public SpannableStringBuilder append(CharSequence p0,int p1,int p2){
       super.append(p0, p1, p2);
       return this;
    }
    public SpannableStringBuilder append(CharSequence p0,Object p1,int p2){
       super.append(p0, p1, p2);
       return this;
    }
    public Appendable append(char p0){
       this.append(p0);
       return this;
    }
    public Appendable append(CharSequence p0){
       this.append(p0);
       return this;
    }
    public Appendable append(CharSequence p0,int p1,int p2){
       this.append(p0, p1, p2);
       return this;
    }
    public final void b(){
       for (int i = 0; i < this.c.size(); i = i + 1) {
          this.c.get(i).a();
       }
       return;
    }
    public void d(){
       this.i();
       this.e();
    }
    public Editable delete(int p0,int p1){
       this.delete(p0, p1);
       return this;
    }
    public SpannableStringBuilder delete(int p0,int p1){
       super.delete(p0, p1);
       return this;
    }
    public final void e(){
       for (int i = 0; i < this.c.size(); i = i + 1) {
          this.c.get(i).onTextChanged(this, 0, this.length(), this.length());
       }
       return;
    }
    public final a$a f(Object p0){
       a$a uoa;
       int i = 0;
       while (true) {
          if (i >= this.c.size()) {
             return null;
          }
          uoa = this.c.get(i);
          if (uoa.b == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return uoa;
    }
    public final boolean g(Class p0){
       boolean b = (this.b == p0)? true: false;
       return b;
    }
    public int getSpanEnd(Object p0){
       if (this.h(p0)) {
          a$a uoa = this.f(p0);
          if (uoa != null) {
             p0 = uoa;
          }
       }
       return super.getSpanEnd(p0);
    }
    public int getSpanFlags(Object p0){
       if (this.h(p0)) {
          a$a uoa = this.f(p0);
          if (uoa != null) {
             p0 = uoa;
          }
       }
       return super.getSpanFlags(p0);
    }
    public int getSpanStart(Object p0){
       if (this.h(p0)) {
          a$a uoa = this.f(p0);
          if (uoa != null) {
             p0 = uoa;
          }
       }
       return super.getSpanStart(p0);
    }
    public Object[] getSpans(int p0,int p1,Class p2){
       if (!this.g(p2)) {
          return super.getSpans(p0, p1, p2);
       }
       a$a[] spans = super.getSpans(p0, p1, a$a.class);
       Object[] objArray = Array.newInstance(p2, spans.length);
       for (int i = 0; i < spans.length; i++) {
          objArray[i] = spans[i].b;
       }
       return objArray;
    }
    public final boolean h(Object p0){
       boolean b = (p0 != null && this.g(p0.getClass()))? true: false;
       return b;
    }
    public final void i(){
       for (int i = 0; i < this.c.size(); i = i + 1) {
          this.c.get(i).c();
       }
       return;
    }
    public Editable insert(int p0,CharSequence p1){
       this.insert(p0, p1);
       return this;
    }
    public Editable insert(int p0,CharSequence p1,int p2,int p3){
       this.insert(p0, p1, p2, p3);
       return this;
    }
    public SpannableStringBuilder insert(int p0,CharSequence p1){
       super.insert(p0, p1);
       return this;
    }
    public SpannableStringBuilder insert(int p0,CharSequence p1,int p2,int p3){
       super.insert(p0, p1, p2, p3);
       return this;
    }
    public int nextSpanTransition(int p0,int p1,Class p2){
       a$a uoa;
       if (this.g(p2)) {
          uoa = a$a.class;
       }
       return super.nextSpanTransition(p0, p1, uoa);
    }
    public void removeSpan(Object p0){
       a$a uoa;
       if (this.h(p0)) {
          uoa = this.f(p0);
          if (uoa != null) {
             p0 = uoa;
          }
       }else {
          uoa = null;
       }
       super.removeSpan(p0);
       if (uoa != null) {
          this.c.remove(uoa);
       }
       return;
    }
    public Editable replace(int p0,int p1,CharSequence p2){
       this.replace(p0, p1, p2);
       return this;
    }
    public Editable replace(int p0,int p1,CharSequence p2,int p3,int p4){
       this.replace(p0, p1, p2, p3, p4);
       return this;
    }
    public SpannableStringBuilder replace(int p0,int p1,CharSequence p2){
       this.b();
       super.replace(p0, p1, p2);
       this.i();
       return this;
    }
    public SpannableStringBuilder replace(int p0,int p1,CharSequence p2,int p3,int p4){
       this.b();
       super.replace(p0, p1, p2, p3, p4);
       this.i();
       return this;
    }
    public void setSpan(Object p0,int p1,int p2,int p3){
       if (this.h(p0)) {
          a$a uoa = new a$a(p0);
          this.c.add(uoa);
          p0 = uoa;
       }
       super.setSpan(p0, p1, p2, p3);
       return;
    }
    public CharSequence subSequence(int p0,int p1){
       return new a(this.b, this, p0, p1);
    }
}
