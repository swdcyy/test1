package com.facebook.react.bridge.SoftAssertions;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.facebook.react.bridge.AssertionException;
import java.lang.Throwable;
import com.facebook.react.bridge.ReactSoftException;
import com.kwai.robust.PatchProxyResult;

public class SoftAssertions	// class@00123a
{

    public void SoftAssertions(){
       super();
    }
    public static void assertCondition(boolean p0,String p1){
       SoftAssertions softAssertio = SoftAssertions.class;
       if (PatchProxy.isSupport(softAssertio) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, softAssertio, "2")) {
          return;
       }
       if (!p0) {
          ReactSoftException.logSoftException("SoftAssertions", new AssertionException(p1));
       }
       return;
    }
    public static Object assertNotNull(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SoftAssertions.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          ReactSoftException.logSoftException("SoftAssertions", new AssertionException("Expected object to not be null!"));
       }
       return p0;
    }
    public static void assertUnreachable(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, SoftAssertions.class, "1")) {
          return;
       }
       ReactSoftException.logSoftException("SoftAssertions", new AssertionException(p0));
       return;
    }
}
