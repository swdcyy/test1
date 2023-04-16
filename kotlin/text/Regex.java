package kotlin.text.Regex;
import java.io.Serializable;
import kotlin.text.Regex$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.regex.Pattern;
import java.util.Set;
import java.lang.Iterable;
import kotlin.text.RegexKt;
import kotlin.text.RegexOption;
import java.lang.CharSequence;
import zsd.k;
import wsd.m;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.text.Regex$findAll$1;
import kotlin.text.Regex$findAll$2;
import msd.a;
import msd.l;
import kotlin.sequences.SequencesKt__SequencesKt;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.util.EnumSet;
import kotlin.text.Regex$fromInt$$inlined$apply$lambda$1;
import trd.y;
import java.util.Collections;
import usd.k;
import java.lang.Integer;
import java.util.ArrayList;
import usd.q;
import trd.t;
import java.lang.IllegalArgumentException;
import kotlin.text.Regex$Serialized;

public final class Regex implements Serializable	// class@001cbe
{
    public Set _options;
    public final Pattern nativePattern;
    public static final Regex$a Companion;

    static {
       Regex.Companion = new Regex$a(null);
    }
    public void Regex(String p0){
       Pattern pattern;
       a.p(p0, "pattern");
       pattern = Pattern.compile(p0);
       a.o(pattern, "Pattern.compile\(pattern\)");
       super(pattern);
    }
    public void Regex(String p0,Set p1){
       Pattern pattern;
       a.p(p0, "pattern");
       a.p(p1, "options");
       pattern = Pattern.compile(p0, Regex.Companion.a(RegexKt.f(p1)));
       a.o(pattern, "Pattern.compile\(pattern,¡­odeCase\(options.toInt\(\)\)\)");
       super(pattern);
    }
    public void Regex(String p0,RegexOption p1){
       Pattern pattern;
       a.p(p0, "pattern");
       a.p(p1, "option");
       pattern = Pattern.compile(p0, Regex.Companion.a(p1.getValue()));
       a.o(pattern, "Pattern.compile\(pattern,¡­nicodeCase\(option.value\)\)");
       super(pattern);
    }
    public void Regex(Pattern p0){
       a.p(p0, "nativePattern");
       super();
       this.nativePattern = p0;
    }
    public static k find$default(Regex p0,CharSequence p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = 0;
       }
       return p0.find(p1, p2);
    }
    public static m findAll$default(Regex p0,CharSequence p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = 0;
       }
       return p0.findAll(p1, p2);
    }
    public static List split$default(Regex p0,CharSequence p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = 0;
       }
       return p0.split(p1, p2);
    }
    public final boolean containsMatchIn(CharSequence p0){
       a.p(p0, "input");
       return this.nativePattern.matcher(p0).find();
    }
    public final k find(CharSequence p0,int p1){
       a.p(p0, "input");
       Matcher matcher = this.nativePattern.matcher(p0);
       a.o(matcher, "nativePattern.matcher\(input\)");
       return RegexKt.a(matcher, p1, p0);
    }
    public final m findAll(CharSequence p0,int p1){
       a.p(p0, "input");
       if (p1 >= 0 && p1 <= p0.length()) {
          return SequencesKt__SequencesKt.q(new Regex$findAll$1(this, p0, p1), Regex$findAll$2.INSTANCE);
       }
       throw new IndexOutOfBoundsException("Start index out of bounds: "+p1+", input length: "+p0.length());
    }
    public final Set getOptions(){
       Regex t_options = this._options;
       if (t_options != null) {
       }else {
          EnumSet uEnumSet = EnumSet.allOf(RegexOption.class);
          y.P0(uEnumSet, new Regex$fromInt$$inlined$apply$lambda$1(this.nativePattern.flags()));
          t_options = Collections.unmodifiableSet(uEnumSet);
          a.o(t_options, "Collections.unmodifiable¡­mask == it.value }\n    }\)");
          this._options = t_options;
       }
       return t_options;
    }
    public final String getPattern(){
       String str = this.nativePattern.pattern();
       a.o(str, "nativePattern.pattern\(\)");
       return str;
    }
    public final k matchEntire(CharSequence p0){
       a.p(p0, "input");
       Matcher matcher = this.nativePattern.matcher(p0);
       a.o(matcher, "nativePattern.matcher\(input\)");
       return RegexKt.c(matcher, p0);
    }
    public final boolean matches(CharSequence p0){
       a.p(p0, "input");
       return this.nativePattern.matcher(p0).matches();
    }
    public final String replace(CharSequence p0,String p1){
       a.p(p0, "input");
       a.p(p1, "replacement");
       String str = this.nativePattern.matcher(p0).replaceAll(p1);
       a.o(str, "nativePattern.matcher\(in¡­\).replaceAll\(replacement\)");
       return str;
    }
    public final String replace(CharSequence p0,l p1){
       a.p(p0, "input");
       a.p(p1, "transform");
       int i = 0;
       k ok = Regex.find$default(this, p0, i, 2, null);
       if (ok == null) {
          return p0.toString();
       }
       int i1 = p0.length();
       StringBuilder str = new StringBuilder(i1);
       do {
          a.m(ok);
          str = str+p0+p1.invoke(ok);
          i = ok.getRange().s().intValue() + 1;
          ok = ok.next();
       } while (i >= i1 || ok == null);
       if (i < i1) {
          str = str+p0;
       }
       String str1 = str;
       a.o(str1, "sb.toString\(\)");
       return str1;
    }
    public final String replaceFirst(CharSequence p0,String p1){
       a.p(p0, "input");
       a.p(p1, "replacement");
       String str = this.nativePattern.matcher(p0).replaceFirst(p1);
       a.o(str, "nativePattern.matcher\(in¡­replaceFirst\(replacement\)");
       return str;
    }
    public final List split(CharSequence p0,int p1){
       a.p(p0, "input");
       int i = 0;
       int i1 = 1;
       Regex regex = (p1 >= 0)? 1: null;
       if (regex) {
          Matcher matcher = this.nativePattern.matcher(p0);
          if (!matcher.find() || p1 == i1) {
             return t.k(p0.toString());
          }else {
             int i2 = 10;
             if (p1 > 0) {
                i2 = q.u(p1, i2);
             }
             ArrayList uArrayList = new ArrayList(i2);
             p1 = p1 - i1;
             do {
                uArrayList.add(p0.subSequence(i, matcher.start()).toString());
                i = matcher.end();
             } while (p1 >= 0 && (uArrayList.size() == p1 || !matcher.find()));
             uArrayList.add(p0.subSequence(i, p0.length()).toString());
             return uArrayList;
          }
       }else {
          throw new IllegalArgumentException("Limit must be non-negative, but was "+p1+'.'.toString());
       }
    }
    public final Pattern toPattern(){
       return this.nativePattern;
    }
    public String toString(){
       String str = this.nativePattern.toString();
       a.o(str, "nativePattern.toString\(\)");
       return str;
    }
    public final Object writeReplace(){
       String str = this.nativePattern.pattern();
       a.o(str, "nativePattern.pattern\(\)");
       return new Regex$Serialized(str, this.nativePattern.flags());
    }
}
