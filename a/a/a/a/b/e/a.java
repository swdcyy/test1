package a.a.a.a.b.e.a;
import a.a.a.a.b.e.c;
import java.lang.System;
import a.a.a.a.b.e.c$b;
import org.json.JSONObject;
import a.a.a.a.b.e.c$a;
import java.lang.String;
import java.lang.Object;
import org.json.JSONArray;
import java.util.Iterator;
import java.util.ArrayList;
import k.a;
import a.a.a.a.b.e.b$b;
import a.a.a.a.b.e.b;
import java.lang.Throwable;

public class a	// class@000010
{
    public static int a = 5;
    public static int b = 80;
    public static int c = 1;

    public static void a(c p0){
       p0.a = System.currentTimeMillis();
    }
    public static void b(c p0){
       p0.b.a = System.currentTimeMillis() - p0.b.a;
    }
    public static void c(c p0){
       p0.b = System.currentTimeMillis();
    }
    public static void d(c p0){
       p0.b.b = System.currentTimeMillis() - p0.b.b;
    }
    public static void e(c p0){
       p0.e = System.currentTimeMillis();
    }
    public static void f(c p0){
       p0.b.e = System.currentTimeMillis() - p0.b.e;
    }
    public static void g(c p0){
       p0.b.f = System.currentTimeMillis() - p0.b.f;
    }
    public static void h(c p0){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("sdkver", p0.a.a);
       JSONObject jSONObject1 = new JSONObject();
       jSONObject1.put("sc", p0.b.a);
       jSONObject1.put("scid", p0.b.b);
       jSONObject1.put("scil", p0.b.c);
       jSONObject1.put("bcud", p0.b.d);
       jSONObject1.put("bcul", p0.b.e);
       jSONObject1.put("iks", p0.b.f);
       JSONArray jSONArray = new JSONArray();
       Iterator iterator = p0.b.g.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          JSONObject jSONObject2 = new JSONObject();
          jSONObject2.put("id", uoa.a);
          jSONObject2.put("cost", uoa.b);
          jSONArray.put(jSONObject2);
       }
       jSONObject1.put("invs", jSONArray);
       jSONObject.put("runtime", jSONObject1);
       b.a(b$b.a, jSONObject.toString(), 1000);
       return;
    }
    public static void i(c p0){
       p0.b = -1;
    }
    public static void j(c p0){
       p0.f = -1;
    }
}
