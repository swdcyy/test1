package okhttp3.Headers$Builder;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import okhttp3.Headers;
import java.util.Date;
import okhttp3.internal.http.HttpDate;
import java.lang.NullPointerException;
import java.util.List;

public final class Headers$Builder	// class@00207a
{
    public final List namesAndValues;

    public void Headers$Builder(){
       super();
       this.namesAndValues = new ArrayList(20);
    }
    public Headers$Builder add(String p0){
       int i = p0.indexOf(":");
       if (i != -1) {
          return this.add((p0.substring(0, i)).trim(), p0.substring((i + 1)));
       }
       throw new IllegalArgumentException("Unexpected header: "+p0);
    }
    public Headers$Builder add(String p0,String p1){
       Headers.checkName(p0);
       Headers.checkValue(p1, p0);
       return this.addLenient(p0, p1);
    }
    public Headers$Builder add(String p0,Date p1){
       if (p1 == null) {
          throw new NullPointerException("value for name "+p0+" == null");
       }
       this.add(p0, HttpDate.format(p1));
       return this;
    }
    public Headers$Builder addAll(Headers p0){
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.addLenient(p0.name(i1), p0.value(i1));
       }
       return this;
    }
    public Headers$Builder addLenient(String p0){
       String str = ":";
       int i = p0.indexOf(str, 1);
       if (i != -1) {
          return this.addLenient(p0.substring(0, i), p0.substring((i + 1)));
       }
       if (p0.startsWith(str)) {
          return this.addLenient("", p0.substring(1));
       }
       return this.addLenient("", p0);
    }
    public Headers$Builder addLenient(String p0,String p1){
       this.namesAndValues.add(p0);
       this.namesAndValues.add(p1.trim());
       return this;
    }
    public Headers$Builder addUnsafeNonAscii(String p0,String p1){
       Headers.checkName(p0);
       return this.addLenient(p0, p1);
    }
    public Headers build(){
       return new Headers(this);
    }
    public String get(String p0){
       int i = this.namesAndValues.size() - 2;
       while (true) {
          if (i < 0) {
             return null;
          }
          if (p0.equalsIgnoreCase(this.namesAndValues.get(i))) {
             break ;
          }else {
             i = i - 2;
          }
       }
       return this.namesAndValues.get((i + 1));
    }
    public Headers$Builder removeAll(String p0){
       int i = 0;
       while (i < this.namesAndValues.size()) {
          if (p0.equalsIgnoreCase(this.namesAndValues.get(i))) {
             this.namesAndValues.remove(i);
             this.namesAndValues.remove(i);
             i = i - 2;
          }
          i = i + 2;
       }
       return this;
    }
    public Headers$Builder set(String p0,String p1){
       Headers.checkName(p0);
       Headers.checkValue(p1, p0);
       this.removeAll(p0);
       this.addLenient(p0, p1);
       return this;
    }
    public Headers$Builder set(String p0,Date p1){
       if (p1 == null) {
          throw new NullPointerException("value for name "+p0+" == null");
       }
       this.set(p0, HttpDate.format(p1));
       return this;
    }
}
