package bpa.e;
import ay7.a;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonElement;
import com.google.gson.c;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import java.lang.CharSequence;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import vt5.e;

public final class e extends a	// class@00041e
{

    public void e(){
       super();
    }
    public String c(){
       return "showPendantBubble";
    }
    public String d(){
       return "KwaiBubble";
    }
    public boolean j(){
       return true;
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       JsonElement jsonElement = c.d(p1);
       a.o(jsonElement, "JsonParser.parseString\(params\)");
       JsonObject jsonObject = jsonElement.r();
       FunctionResultParams uFunctionRes = new FunctionResultParams();
       String str = "text";
       JsonElement jsonElement1 = jsonObject.e0(str);
       int i = 0;
       String str1 = (jsonElement1 != null)? jsonElement1.w(): i;
       str1 = (!str1 || !str1.length())? 1: null;
       if (!str1) {
          str1 = "id";
          JsonElement jsonElement2 = jsonObject.e0(str1);
          if (jsonElement2 != null) {
             i = Integer.valueOf(jsonElement2.p());
          }
          if (i != null) {
             JsonElement jsonElement3 = jsonObject.e0(str);
             a.o(jsonElement3, "jsonObject.get\(\"text\"\)");
             jsonElement = jsonObject.e0(str1);
             a.o(jsonElement, "jsonObject.get\(\"id\"\)");
             d.a(-1094279325).H1(jsonElement3.w(), jsonElement.p());
             uFunctionRes.mResult = 1;
          label_0084 :
             return uFunctionRes;
          }
       }
       uFunctionRes.mResult = 0x1e850;
       uFunctionRes.mMessage = "must have text and id";
       goto label_0084 ;
    }
}
