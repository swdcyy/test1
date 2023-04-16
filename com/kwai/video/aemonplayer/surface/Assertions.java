package com.kwai.video.aemonplayer.surface.Assertions;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IndexOutOfBoundsException;
import android.os.Looper;
import java.lang.IllegalStateException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import java.lang.NullPointerException;

public final class Assertions	// class@0019d0
{

    public void Assertions(){
       super();
    }
    public static void checkArgument(boolean p0){
       Assertions uAssertions = Assertions.class;
       if (PatchProxy.isSupport(uAssertions) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uAssertions, "1")) {
          return;
       }
       if (p0) {
          return;
       }
       throw new IllegalArgumentException();
    }
    public static void checkArgument(boolean p0,Object p1){
       Assertions uAssertions = Assertions.class;
       if (PatchProxy.isSupport(uAssertions) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, uAssertions, "2")) {
          return;
       }
       if (p0) {
          return;
       }
       throw new IllegalArgumentException(String.valueOf(p1));
    }
    public static int checkIndex(int p0,int p1,int p2){
       if (PatchProxy.isSupport(Assertions.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, Assertions.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 >= p1 && p0 < p2) {
          return p0;
       }else {
          throw new IndexOutOfBoundsException();
       }
    }
    public static void checkMainThread(){
       if (PatchProxy.applyVoid(null, null, Assertions.class, "12")) {
          return;
       }
       if (Looper.myLooper() == Looper.getMainLooper()) {
          return;
       }
       throw new IllegalStateException("Not in applications main thread");
    }
    public static String checkNotEmpty(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Assertions.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          return p0;
       }
       throw new IllegalArgumentException();
    }
    public static String checkNotEmpty(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Assertions.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          return p0;
       }
       throw new IllegalArgumentException(String.valueOf(p1));
    }
    public static Object checkNotNull(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Assertions.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       return p0;
    }
    public static Object checkNotNull(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Assertions.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return p0;
       }
       throw new NullPointerException(String.valueOf(p1));
    }
    public static void checkState(boolean p0){
       Assertions uAssertions = Assertions.class;
       if (PatchProxy.isSupport(uAssertions) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uAssertions, "4")) {
          return;
       }
       if (p0) {
          return;
       }
       throw new IllegalStateException();
    }
    public static void checkState(boolean p0,Object p1){
       Assertions uAssertions = Assertions.class;
       if (PatchProxy.isSupport(uAssertions) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, uAssertions, "5")) {
          return;
       }
       if (p0) {
          return;
       }
       throw new IllegalStateException(String.valueOf(p1));
    }
    public static Object checkStateNotNull(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Assertions.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return p0;
       }
       throw new IllegalStateException();
    }
    public static Object checkStateNotNull(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Assertions.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return p0;
       }
       throw new IllegalStateException(String.valueOf(p1));
    }
}
