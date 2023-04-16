package com.kwai.middleware.leia.handler.LeiaParamExtractor$defaultLanguage$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.middleware.leia.handler.LeiaParamExtractor;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import java.util.Locale;
import tb7.b;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import kotlin.TypeCastException;

public final class LeiaParamExtractor$defaultLanguage$2 extends Lambda implements a	// class@000d70
{
    public final LeiaParamExtractor this$0;

    public void LeiaParamExtractor$defaultLanguage$2(LeiaParamExtractor p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String str1;
       Locale locale = b.b(this.this$0.a());
       String str = null;
       String language = (locale != null)? locale.getLanguage(): str;
       if (locale != null) {
          str = locale.getCountry();
       }
       locale = (str == null || !str.length())? 1: null;
       if (locale) {
          if (language == null) {
             language = "";
          }
          locale = Locale.US;
          a.h(locale, "Locale.US");
          str1 = language.toLowerCase(locale);
          a.h(str1, "\(this as java.lang.String\).toLowerCase\(locale\)");
       }else {
          str1 = language+'-'+str;
          Locale uS = Locale.US;
          a.h(uS, "Locale.US");
          if (str1 != null) {
             str1 = str1.toLowerCase(uS);
             a.h(str1, "\(this as java.lang.String\).toLowerCase\(locale\)");
          }else {
             throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
          }
       }
       return str1;
    }
}
