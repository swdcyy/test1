package c15.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import lc5.b;
import msd.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import c15.a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.Throwable;

public final class b	// class@0003ff
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public static final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       String[] stringArray = new String[]{""};
       List list = CollectionsKt__CollectionsKt.P(stringArray);
       list.add(0, "Tuna");
       String[] stringArray1 = new String[0];
       Object[] objArray = list.toArray(stringArray1);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       b.d(p0, Arrays.copyOf(objArray, objArray.length));
       return;
    }
    public static final void b(List p0,a p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "2")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getTagName());
       }
       iterator = CollectionsKt___CollectionsKt.J5(uArrayList);
       try{
          str = p1.invoke();
       }catch(java.lang.Exception e4){
          str = "onInfo exception : "+e4.getMessage();
       }
       iterator.add(0, "Tuna");
       String[] stringArray = new String[0];
       Object[] objArray = iterator.toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       b.d(str, Arrays.copyOf(objArray, objArray.length));
       return;
    }
    public static final void c(List p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "6")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "throwable");
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getTagName());
       }
       String[] stringArray = new String[0];
       Object[] objArray = CollectionsKt___CollectionsKt.J5(uArrayList).toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       b.f(p1.getMessage(), Arrays.copyOf(objArray, objArray.length));
       return;
    }
    public static final void d(List p0,a p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "5")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getTagName());
       }
       iterator = CollectionsKt___CollectionsKt.J5(uArrayList);
       try{
          str = p1.invoke();
       }catch(java.lang.Exception e4){
          str = "onInfo exception : "+e4.getMessage();
       }
       String[] stringArray = new String[0];
       Object[] objArray = iterator.toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       b.f(str, Arrays.copyOf(objArray, objArray.length));
       return;
    }
    public static final void e(List p0,a p1,Throwable p2){
       String str;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "7")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       a.p(p2, "throwable");
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getTagName());
       }
       iterator = CollectionsKt___CollectionsKt.J5(uArrayList);
       try{
          str = p1.invoke();
       }catch(java.lang.Exception e7){
          str = "onError exception : "+e7.getMessage();
       }
       String[] stringArray = new String[0];
       Object[] objArray = iterator.toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       b.f(str+" , throw : "+p2.getMessage(), Arrays.copyOf(objArray, objArray.length));
       return;
    }
    public static final void f(List p0,a p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "3")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getTagName());
       }
       iterator = CollectionsKt___CollectionsKt.J5(uArrayList);
       try{
          str = p1.invoke();
       }catch(java.lang.Exception e4){
          str = "onInfo exception : "+e4.getMessage();
       }
       iterator.add(0, "Tuna");
       String[] stringArray = new String[0];
       Object[] objArray = iterator.toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       b.h(str, Arrays.copyOf(objArray, objArray.length));
       return;
    }
    public static final void g(List p0,a p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "4")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getTagName());
       }
       iterator = CollectionsKt___CollectionsKt.J5(uArrayList);
       try{
          str = p1.invoke();
       }catch(java.lang.Exception e4){
          str = "onWarning exception : "+e4.getMessage();
       }
       iterator.add(0, "Tuna");
       String[] stringArray = new String[0];
       Object[] objArray = iterator.toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       b.i(str, Arrays.copyOf(objArray, objArray.length));
       return;
    }
}
