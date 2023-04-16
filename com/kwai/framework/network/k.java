package com.kwai.framework.network.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ta6.k;
import java.lang.Runnable;
import t45.c;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import wb6.g;
import java.util.Objects;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import java.net.URL;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.network.j;
import io7.a;
import com.kwai.framework.network.k$a;
import java.lang.reflect.Type;
import el.a;

public final class k	// class@0017d0
{
    public static List a;

    public void k(){
       super();
    }
    public static void a(boolean p0,String[] p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, ok, "5")) {
          return;
       }
       c.a(new k(p1, p0));
       return;
    }
    public static String b(String p0,boolean p1){
       List obj;
       g mRequestClue;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, ok, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = PatchProxy.apply(null, null, ok, "8");
       if (obj != PatchProxyResult.class) {
       }else if(k.a == null){
          _monitor_enter(ok);
          if (k.a == null) {
             k.a = k.e();
          }
          _monitor_exit(ok);
       }
       obj = k.a;
       Iterator iterator = obj.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          g og = iterator.next();
          mRequestClue = (p1)? og.mRequestClue: og.mResponseClue;
          Objects.requireNonNull(og);
          g og1 = PatchProxy.apply(null, og, g.class, "1");
          if (og1 != PatchProxyResult.class) {
          }else if(og.mPath == null){
             og.mPath = new ArrayList();
          }
          og1 = og.mPath;
          if (og1.contains(p0) && !TextUtils.isEmpty(mRequestClue)) {
             break ;
          }
       }
       return mRequestClue;
    }
    public static HttpUrl c(HttpUrl p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HttpUrl$Builder().scheme(p0.scheme()).host(p0.host()).addPathSegments(p0.url().getPath()).build();
    }
    public static void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, k.class, "4")) {
          return;
       }
       int i = 10;
       try{
          String[] stringArray = new String[i];
          stringArray[0] = "clue";
          stringArray[1] = "Dispatch.config.overwrite";
          stringArray[2] = "requestId";
          stringArray[3] = p0;
          stringArray[4] = "userId";
          stringArray[5] = QCurrentUser.me().getId();
          stringArray[6] = "did";
          stringArray[7] = a.a;
          stringArray[8] = "isOverwrittenSuccessfully";
          stringArray[9] = String.valueOf(1);
          k.a(0, stringArray);
       }catch(java.lang.Exception e5){
          ExceptionHandler.handleCaughtException(e5);
       }
       return;
    }
    public static List e(){
       Object obj = PatchProxy.apply(null, null, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.t().p("semanticLogging", j.b);
       return a.t().getValue("semanticLogging", new k$a().getType(), new ArrayList());
    }
}
