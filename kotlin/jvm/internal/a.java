package kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Class;
import java.lang.StackTraceElement;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.lang.AssertionError;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import kotlin.KotlinNullPointerException;
import java.lang.UnsupportedOperationException;
import kotlin.UninitializedPropertyAccessException;
import java.lang.Double;
import java.lang.Float;
import java.lang.ClassNotFoundException;
import java.lang.Thread;

public class a	// class@001cb0
{

    public void a(){
       super();
    }
    public static Throwable A(Throwable p0){
       return a.B(p0, a.class.getName());
    }
    public static Throwable B(Throwable p0,String p1){
       StackTraceElement[] stackTrace = p0.getStackTrace();
       int len = stackTrace.length;
       int i = -1;
       int i1 = 0;
       while (i1 < len) {
          if (p1.equals(stackTrace[i1].getClassName())) {
             i = i1;
          }
          i1 = i1 + 1;
       }
       p0.setStackTrace(Arrays.copyOfRange(stackTrace, (i + 1), len));
       return p0;
    }
    public static String C(String p0,Object p1){
       return p0+p1;
    }
    public static void D(){
       throw a.A(new AssertionError());
    }
    public static void E(String p0){
       throw a.A(new AssertionError(p0));
    }
    public static void F(){
       throw a.A(new IllegalArgumentException());
    }
    public static void G(String p0){
       throw a.A(new IllegalArgumentException(p0));
    }
    public static void H(){
       throw a.A(new IllegalStateException());
    }
    public static void I(String p0){
       throw a.A(new IllegalStateException(p0));
    }
    public static void J(){
       throw a.A(new NullPointerException());
    }
    public static void K(String p0){
       throw a.A(new NullPointerException(p0));
    }
    public static void L(){
       throw a.A(new KotlinNullPointerException());
    }
    public static void M(String p0){
       throw a.A(new KotlinNullPointerException(p0));
    }
    public static void N(String p0){
       throw a.A(new IllegalArgumentException(a.v(p0)));
    }
    public static void O(String p0){
       throw a.A(new NullPointerException(a.v(p0)));
    }
    public static void P(){
       a.Q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
    public static void Q(String p0){
       throw new UnsupportedOperationException(p0);
    }
    public static void R(String p0){
       throw a.A(new UninitializedPropertyAccessException(p0));
    }
    public static void S(String p0){
       a.R("lateinit property "+p0+" has not been initialized");
    }
    public static boolean a(double p0,Double p1){
       boolean b = (p1 != null && !p0 - p1.doubleValue())? true: false;
       return b;
    }
    public static boolean b(float p0,Float p1){
       boolean b = (p1 != null && !p0 - p1.floatValue())? true: false;
       return b;
    }
    public static boolean c(Double p0,double p1){
       boolean b = (p0 != null && !p0.doubleValue() - p1)? true: false;
       return b;
    }
    public static boolean d(Double p0,Double p1){
       boolean b = true;
       if (p0 == null) {
          if (p1 != null) {
          label_0016 :
             b = false;
          }
       }else if(p1 != null && !p0.doubleValue() - p1.doubleValue()){
       }
       return b;
    }
    public static boolean e(Float p0,float p1){
       boolean b = (p0 != null && !p0.floatValue() - p1)? true: false;
       return b;
    }
    public static boolean f(Float p0,Float p1){
       boolean b = true;
       if (p0 == null) {
          if (p1 != null) {
          label_0016 :
             b = false;
          }
       }else if(p1 != null && !p0.floatValue() - p1.floatValue()){
       }
       return b;
    }
    public static boolean g(Object p0,Object p1){
       boolean b;
       if (p0 == null) {
          b = (p1 == null)? true: false;
       }else {
          b = p0.equals(p1);
       }
       return b;
    }
    public static void h(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       throw a.A(new IllegalStateException(p1+" must not be null"));
    }
    public static void i(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       throw a.A(new IllegalStateException(p1));
    }
    public static void j(Object p0,String p1,String p2){
       if (p0 != null) {
          return;
       }
       throw a.A(new IllegalStateException("Field specified as non-null is null: "+p1+"."+p2));
    }
    public static void k(String p0){
       p0 = p0.replace('/', '.');
       try{
          Class.forName(p0);
          return;
       }catch(java.lang.ClassNotFoundException e0){
          throw a.A(new ClassNotFoundException("Class "+p0+" is not found. Please update the Kotlin runtime to the latest version", e0));
       }
    }
    public static void l(String p0,String p1){
       p0 = p0.replace('/', '.');
       try{
          Class.forName(p0);
          return;
       }catch(java.lang.ClassNotFoundException e0){
          throw a.A(new ClassNotFoundException("Class "+p0+" is not found: this code requires the Kotlin runtime of version at least "+p1, e0));
       }
    }
    public static void m(Object p0){
       if (p0 == null) {
          a.J();
       }
       return;
    }
    public static void n(Object p0,String p1){
       if (p0 == null) {
          a.K(p1);
       }
       return;
    }
    public static void o(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       throw a.A(new NullPointerException(p1+" must not be null"));
    }
    public static void p(Object p0,String p1){
       if (p0 == null) {
          a.O(p1);
       }
       return;
    }
    public static void q(Object p0,String p1){
       if (p0 == null) {
          a.N(p1);
       }
       return;
    }
    public static void r(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       throw a.A(new IllegalStateException(p1));
    }
    public static void s(Object p0,String p1,String p2){
       if (p0 != null) {
          return;
       }
       throw a.A(new IllegalStateException("Method specified as non-null returned null: "+p1+"."+p2));
    }
    public static int t(int p0,int p1){
       if (p0 < p1) {
          p0 = -1;
       }else if(p0 == p1){
          p0 = 0;
       }else {
          p0 = 1;
       }
       return p0;
    }
    public static int u(long p0,long p1){
       int i;
       if ((v0 = p0 - p1) < 0) {
          i = -1;
       }else if(!v0){
          i = 0;
       }else {
          i = 1;
       }
       return i;
    }
    public static String v(String p0){
       object oobject = Thread.currentThread().getStackTrace()[4];
       String className = oobject.getClassName();
       StringBuilder str = "Parameter specified as non-null is null: method "+className;
       return str+"."+oobject.getMethodName()+", parameter "+p0;
    }
    public static void w(){
       a.P();
    }
    public static void x(String p0){
       a.Q(p0);
    }
    public static void y(int p0,String p1){
       a.P();
    }
    public static void z(int p0,String p1,String p2){
       a.Q(p2);
    }
}
