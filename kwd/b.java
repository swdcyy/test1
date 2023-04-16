package kwd.b;
import kwd.a;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.Class;

public class b implements a	// class@001c05
{
    public final String a;
    public static final Pattern b;
    public static final Pattern c;

    static {
       b.b = Pattern.compile(" ");
       b.c = Pattern.compile(",");
    }
    public void b(String p0){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException();
       }
       this.a = p0;
       return;
    }
    public boolean acceptProvidedProtocol(String p0){
       String[] stringArray = b.c.split(b.b.matcher(p0).replaceAll(""));
       int len = stringArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if ((this.a).equals(stringArray[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public a copyInstance(){
       return new b(this.getProvidedProtocol());
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || b.class != p0.getClass()) {
          return false;
       }
       return (this.a).equals(p0.a);
    }
    public String getProvidedProtocol(){
       return this.a;
    }
    public int hashCode(){
       return (this.a).hashCode();
    }
    public String toString(){
       return this.getProvidedProtocol();
    }
}
