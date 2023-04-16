package com.kwai.middleware.leia.handler.LeiaParamExtractor;
import java.lang.Object;
import com.kwai.middleware.leia.handler.LeiaParamExtractor$defaultPhoneModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.middleware.leia.handler.LeiaParamExtractor$defaultSystemVersion$2;
import com.kwai.middleware.leia.handler.LeiaParamExtractor$defaultLanguage$2;
import android.content.Context;
import java.lang.String;
import tb7.b;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.jvm.internal.a;
import kotlin.TypeCastException;

public abstract class LeiaParamExtractor	// class@000d73
{
    public final p a;
    public final p b;
    public final p c;

    public void LeiaParamExtractor(){
       super();
       this.a = s.c(LeiaParamExtractor$defaultPhoneModel$2.INSTANCE);
       this.b = s.c(LeiaParamExtractor$defaultSystemVersion$2.INSTANCE);
       this.c = s.c(new LeiaParamExtractor$defaultLanguage$2(this));
    }
    public abstract Context a();
    public String b(){
       return b.a(this.a());
    }
    public String c(){
       String str = this.b();
       try{
          int i = 0;
          int i1 = StringsKt__StringsKt.i3(str, ".", (StringsKt__StringsKt.i3(str, ".", 0, false, 6, null) + 1), false, 4, null);
          if (str == null) {
             throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
          }
          String str1 = str.substring(i, i1);
          a.h(str1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          str = str1;
          return str;
       }catch(java.lang.Exception e0){
       }
    }
    public abstract String d();
    public String e(){
       return b.c(this.a());
    }
    public abstract String f();
    public String g(){
       return "";
    }
    public String h(){
       return this.c.getValue();
    }
    public double i(){
       return 0;
    }
    public double j(){
       return 0;
    }
    public String k(){
       return this.a.getValue();
    }
    public String l(){
       return "ANDROID_PHONE";
    }
    public abstract String m();
    public String n(){
       return "";
    }
    public abstract String o();
    public String p(){
       return "";
    }
    public String q(){
       return this.b.getValue();
    }
    public String r(){
       return "";
    }
}
