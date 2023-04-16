package com.kwai.emotionsdk.widget.a;
import android.text.SpannableStringBuilder;
import java.lang.Class;
import java.util.ArrayList;
import java.lang.Object;
import jl5.r;
import java.lang.CharSequence;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.emotionsdk.widget.a$a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import android.text.Editable;
import java.lang.Character;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Appendable;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.reflect.Array;

public final class a extends SpannableStringBuilder	// class@000dc8
{
    public final Class b;
    public final List c;
    public static final int d;

    public void a(Class p0){
       super();
       this.c = new ArrayList();
       r.c(p0, "watcherClass cannot be null");
       this.b = p0;
    }
    public void a(Class p0,CharSequence p1){
       super(p1);
       this.c = new ArrayList();
       r.c(p0, "watcherClass cannot be null");
       this.b = p0;
    }
    public void a(Class p0,CharSequence p1,int p2,int p3){
       super(p1, p2, p3);
       this.c = new ArrayList();
       r.c(p0, "watcherClass cannot be null");
       this.b = p0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       int i = 0;
       while (i < this.c.size()) {
          a$a uoa = this.c.get(i);
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(null, uoa, a$a.class, "7")) {
             uoa.c.incrementAndGet();
          }
          i = i + 1;
       }
       return;
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
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Character.valueOf(p0), this, a.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       super.append(p0);
       return this;
    }
    public SpannableStringBuilder append(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.append(p0);
       return this;
    }
    public SpannableStringBuilder append(CharSequence p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       super.append(p0, p1, p2);
       return this;
    }
    public SpannableStringBuilder append(CharSequence p0,Object p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
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
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "13")) {
          return;
       }
       this.f();
       if (!PatchProxy.applyVoid(objArray, this, a.class, "16")) {
          for (int i = 0; i < this.c.size(); i = i + 1) {
             this.c.get(i).onTextChanged(this, 0, this.length(), this.length());
          }
       }
       return;
    }
    public final a$a c(Object p0){
       a$a uoa;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
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
    public final boolean d(Class p0){
       boolean b = (this.b == p0)? true: false;
       return b;
    }
    public Editable delete(int p0,int p1){
       return this.delete(p0, p1);
    }
    public SpannableStringBuilder delete(int p0,int p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, a.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       super.delete(p0, p1);
       return this;
    }
    public final boolean e(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && this.d(p0.getClass()))? true: false;
       return b;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       int i = 0;
       while (i < this.c.size()) {
          a$a uoa = this.c.get(i);
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(null, uoa, a$a.class, "8")) {
             uoa.c.decrementAndGet();
          }
          i = i + 1;
       }
       return;
    }
    public int getSpanEnd(Object p0){
       a$a obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.e(p0)) {
          obj = this.c(p0);
          if (obj != null) {
             p0 = obj;
          }
       }
       return super.getSpanEnd(p0);
    }
    public int getSpanFlags(Object p0){
       a$a obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.e(p0)) {
          obj = this.c(p0);
          if (obj != null) {
             p0 = obj;
          }
       }
       return super.getSpanFlags(p0);
    }
    public int getSpanStart(Object p0){
       a$a obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.e(p0)) {
          obj = this.c(p0);
          if (obj != null) {
             p0 = obj;
          }
       }
       return super.getSpanStart(p0);
    }
    public Object[] getSpans(int p0,int p1,Class p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d(p2)) {
          a$a[] spans = super.getSpans(p0, p1, a$a.class);
          Object[] objArray = Array.newInstance(p2, spans.length);
          for (int i = 0; i < spans.length; i++) {
             objArray[i] = spans[i].b;
          }
          return objArray;
       }else {
          return super.getSpans(p0, p1, p2);
       }
    }
    public Editable insert(int p0,CharSequence p1){
       return this.insert(p0, p1);
    }
    public Editable insert(int p0,CharSequence p1,int p2,int p3){
       return this.insert(p0, p1, p2, p3);
    }
    public SpannableStringBuilder insert(int p0,CharSequence p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, a.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       super.insert(p0, p1);
       return this;
    }
    public SpannableStringBuilder insert(int p0,CharSequence p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       super.insert(p0, p1, p2, p3);
       return this;
    }
    public int nextSpanTransition(int p0,int p1,Class p2){
       a$a uoa;
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.d(p2)) {
          uoa = a$a.class;
       }
       return super.nextSpanTransition(p0, p1, uoa);
    }
    public void removeSpan(Object p0){
       a$a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       if (this.e(p0)) {
          uoa = this.c(p0);
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
       return this.replace(p0, p1, p2);
    }
    public Editable replace(int p0,int p1,CharSequence p2,int p3,int p4){
       return this.replace(p0, p1, p2, p3, p4);
    }
    public SpannableStringBuilder replace(int p0,int p1,CharSequence p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a();
       super.replace(p0, p1, p2);
       this.f();
       return this;
    }
    public SpannableStringBuilder replace(int p0,int p1,CharSequence p2,int p3,int p4){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, a.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a();
       super.replace(p0, p1, p2, p3, p4);
       this.f();
       return this;
    }
    public void setSpan(Object p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "4")) {
          return;
       }
       if (this.e(p0)) {
          a$a uoa = new a$a(p0);
          this.c.add(uoa);
          p0 = uoa;
       }
       super.setSpan(p0, p1, p2, p3);
       return;
    }
    public CharSequence subSequence(int p0,int p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a(this.b, this, p0, p1);
    }
}
