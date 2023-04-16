package gha.s;
import android.app.Activity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.net.Uri;
import android.content.Intent;
import ekd.x0;

public final class s	// class@002ae4
{

    public static final int a(Activity p0,String p1,int p2){
       if (PatchProxy.isSupport(s.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, s.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p1, "parameter");
       if (s.b(p0, p1) != null) {
          p2 = a1.s(s.b(p0, p1), p2);
       }
       return p2;
    }
    public static final String b(Activity p0,String p1){
       s os = s.class;
       String str = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, str, os, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "parameter");
       Uri uri = PatchProxy.applyOneRefs(p0, str, os, "1");
       if (uri != PatchProxyResult.class) {
       }else if(p0 != null){
          Intent intent = p0.getIntent();
          if (intent != null) {
             uri = intent.getData();
          }
       }
       uri = str;
       if (uri != null && uri.isHierarchical()) {
          str = x0.a(uri, p1);
       }
       return str;
    }
    public static final String c(Intent p0,String p1){
       s os = s.class;
       String str = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, str, os, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "parameter");
       Uri uri = PatchProxy.applyOneRefs(p0, str, os, "4");
       if (uri != PatchProxyResult.class) {
       }else if(p0 != null){
          uri = p0.getData();
       }else {
          uri = str;
       }
       if (uri != null && uri.isHierarchical()) {
          str = x0.a(uri, p1);
       }
       return str;
    }
}
