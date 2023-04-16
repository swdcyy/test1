package com.meizu.cloud.pushsdk.c.c.g;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.Locale;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.nio.charset.Charset;

public class g	// class@0014d3
{
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public static final Pattern a;
    public static final Pattern b;

    static {
       g.a = Pattern.compile("\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)/\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)");
       g.b = Pattern.compile(";\\s*\(?:\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)=\(?:\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)|\"\([^\"]*\)\"\)\)?");
    }
    public void g(String p0,String p1,String p2,String p3){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
    }
    public static g a(String p0){
       Matcher matcher = g.a.matcher(p0);
       g og = null;
       if (!matcher.lookingAt()) {
          return og;
       }
       int i = 1;
       Locale uS = Locale.US;
       String str = (matcher.group(i)).toLowerCase(uS);
       String str1 = (matcher.group(2)).toLowerCase(uS);
       Matcher matcher1 = g.b.matcher(p0);
       int i1 = matcher.end();
       g og1 = og;
       while (true) {
          if (i1 >= p0.length()) {
             return new g(p0, str, str1, og1);
          }
          matcher1.region(i1, p0.length());
          if (!matcher1.lookingAt()) {
             break ;
          }else if(!("charset").equalsIgnoreCase(matcher1.group(i))){
             String str2 = (matcher1.group(2) != null)? matcher1.group(2): matcher1.group(3);
             if (og1 == null || str2.equalsIgnoreCase(og1)) {
                og1 = str2;
             }else {
                throw new IllegalArgumentException("Multiple different charsets: "+p0);
             }
          }
          i1 = matcher1.end();
       }
       return og;
    }
    public String a(){
       return this.d;
    }
    public Charset b(){
       g tf = this.f;
       Charset uCharset = (tf != null)? Charset.forName(tf): null;
       return uCharset;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof g && (p0.c).equals(this.c))? true: false;
       return b;
    }
    public int hashCode(){
       return (this.c).hashCode();
    }
    public String toString(){
       return this.c;
    }
}
