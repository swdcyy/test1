package com.yxcorp.gifshow.growth.widgetmiui.NBAWidgetProviderManager$a;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pra.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import pra.b$a;
import java.lang.Long;
import ora.b;
import org.json.JSONObject;
import java.lang.StringBuffer;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.Closeable;
import java.lang.NullPointerException;
import java.lang.Exception;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import com.yxcorp.gifshow.growth.widgetmiui.model.NBAWidgetBean;
import java.lang.Integer;
import java.util.List;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ora.a;
import brd.g;

public final class NBAWidgetProviderManager$a implements g	// class@001614
{
    public final long b;
    public final String c;

    public void NBAWidgetProviderManager$a(long p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       NBAWidgetProviderManager$a b;
       b uob;
       b uob1;
       b a;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, NBAWidgetProviderManager$a.class, "1")) {
          return;
       }
       a.p(obj1, "it");
       b$a c = b.c;
       b = obj.b;
       NBAWidgetProviderManager$a c1 = obj.c;
       Objects.requireNonNull(c);
       String str = "UTF-8";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uob = PatchProxy.applyTwoRefs(Long.valueOf(b), c1, c, uoa, "4");
          if (uob != patchProxyRe) {
          }else {
          label_0039 :
             a.p(c1, "widgetType");
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("request_type", c1);
             String str1 = jSONObject.toString();
             a.o(str1, "jsonObject.toString\(\)");
             StringBuffer str2 = "";
             String str3 = null;
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i < 5) {
                   try{
                      URLConnection uRLConnectio = new URL("https://growth-partner.gifshow.com/rest/n/partner/xiaomi_widget/get_content").openConnection();
                      if (uRLConnectio != null) {
                         uRLConnectio.setConnectTimeout(5000);
                         uRLConnectio.setReadTimeout(5000);
                         uRLConnectio.setDoOutput(true);
                         uRLConnectio.setDoInput(true);
                         uRLConnectio.setUseCaches(false);
                         uRLConnectio.setRequestMethod("POST");
                         int i2 = str3;
                         uRLConnectio.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                         uRLConnectio.setRequestProperty("K-Co-Timestamp", String.valueOf(b));
                         uRLConnectio.connect();
                         OutputStreamWriter outputStream = new OutputStreamWriter(uRLConnectio.getOutputStream(), str);
                         outputStream.write(str1);
                         try{
                            outputStream.flush();
                            InputStream inputStream = uRLConnectio.getInputStream();
                            try{
                               InputStreamReader inputStreamR = new InputStreamReader(inputStream, str);
                               BufferedReader uBufferedRea = new BufferedReader(inputStreamR);
                               try{
                                  str3 = uBufferedRea.readLine();
                                  while (str3 != null) {
                                     str2 = str2+str3;
                                  }
                                  c.a(outputStream);
                                  c.a(uBufferedRea);
                                  c.a(inputStreamR);
                                  str3 = i2;
                                  OutputStreamWriter outputStream1 = outputStream;
                               label_0101 :
                                  if (str3) {
                                     i = i + 1;
                                  }else {
                                     try{
                                     label_0117 :
                                        uob1 = DataKt.a().h(str2, b.class);
                                     }catch(java.lang.Exception e0){
                                        e0.printStackTrace();
                                        uob1 = null;
                                     }
                                     if (uob1 == null) {
                                        uob1 = b.a;
                                     }else {
                                        a = b.a;
                                        if (a == null) {
                                           b.a = uob1;
                                        }else {
                                           a.m(a);
                                           NBAWidgetBean obj2 = PatchProxy.applyTwoRefs(uob1, a, c, uoa, "5");
                                           if (obj2 != patchProxyRe) {
                                              uob = obj2;
                                           }else {
                                              obj2 = uob1.a();
                                              Integer integer = (obj2 != null)? Integer.valueOf(obj2.b()): null;
                                              NBAWidgetBean nBAWidgetBea = a.a();
                                              Integer integer1 = (nBAWidgetBea != null)? Integer.valueOf(nBAWidgetBea.b()): null;
                                              if (integer == null) {
                                                 nBAWidgetBea = 1;
                                              label_0176 :
                                                 if (integer1 != null && integer1.intValue() == nBAWidgetBea) {
                                                 label_01e0 :
                                                    a.data = uob1.a();
                                                 }else {
                                                    NBAWidgetBean obj3 = PatchProxy.applyTwoRefs(uob1, a, c, uoa, "6");
                                                    if (obj3 != patchProxyRe) {
                                                       a = obj3;
                                                    }else {
                                                       NBAWidgetBean nBAWidgetBea1 = uob1.a();
                                                       a.m(nBAWidgetBea1);
                                                       List list = nBAWidgetBea1.a();
                                                       a.m(list);
                                                       obj3 = a.a();
                                                       a.m(obj3);
                                                       List list1 = obj3.a();
                                                       a.m(list1);
                                                       list1 = CollectionsKt___CollectionsKt.J5(list1);
                                                       b$a c2 = b.c;
                                                       list1.set(0, c2.c(list.get(0), list1.get(0)));
                                                       list1.set(1, c2.c(list.get(1), list1.get(1)));
                                                       nBAWidgetBea1 = a.a();
                                                       a.m(nBAWidgetBea1);
                                                       nBAWidgetBea1.nbaInfos = list1;
                                                    }
                                                 }
                                              }else {
                                                 nBAWidgetBea = 1;
                                                 if (integer.intValue() != nBAWidgetBea) {
                                                    goto label_0176 ;
                                                 }else {
                                                    goto label_01e0 ;
                                                 }
                                              }
                                              uob = a;
                                           }
                                        }
                                     }
                                     uob = uob1;
                                  }
                               }catch(java.lang.Exception e0){
                                  Closeable uCloseable2 = uBufferedRea;
                               }
                               i1 = inputStreamR;
                            }catch(java.lang.Exception e0){
                               goto label_00dd ;
                            }
                         }catch(java.lang.Exception e0){
                         }
                         Closeable uCloseable1 = outputStream;
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                      }
                   }catch(java.lang.Exception e0){
                   }
                   Closeable uCloseable = i1;
                   e0.printStackTrace();
                   c.a(null);
                   c.a(0);
                   c.a(uCloseable);
                   str3 = 1;
                   goto label_0101 ;
                }else {
                   goto label_0117 ;
                }
             }
          }
       }else {
          goto label_0039 ;
       }
       if (uob != null) {
          obj1.onNext(uob);
       }
       return;
    }
}
