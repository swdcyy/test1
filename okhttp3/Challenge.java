package okhttp3.Challenge;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.Map;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Locale;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import java.lang.StringBuilder;

public final class Challenge	// class@001f3c
{
    public final Map authParams;
    public final String scheme;

    public void Challenge(String p0,String p1){
       super();
       Objects.requireNonNull(p0, "scheme == null");
       Objects.requireNonNull(p1, "realm == null");
       this.scheme = p0;
       this.authParams = Collections.singletonMap("realm", p1);
    }
    public void Challenge(String p0,Map p1){
       super();
       Objects.requireNonNull(p0, "scheme == null");
       Objects.requireNonNull(p1, "authParams == null");
       this.scheme = p0;
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String str = (uEntry.getKey() == null)? null: (uEntry.getKey()).toLowerCase(Locale.US);
          linkedHashMa.put(str, uEntry.getValue());
       }
       this.authParams = Collections.unmodifiableMap(linkedHashMa);
       return;
    }
    public Map authParams(){
       return this.authParams;
    }
    public Charset charset(){
       String str = this.authParams.get("charset");
       if (str != null) {
          return Charset.forName(str);
       }
       return Util.ISO_8859_1;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof Challenge && ((p0.scheme).equals(this.scheme) && p0.authParams.equals(this.authParams)))? true: false;
       return b;
    }
    public int hashCode(){
       return (((899 + (this.scheme).hashCode()) * 31) + this.authParams.hashCode());
    }
    public String realm(){
       return this.authParams.get("realm");
    }
    public String scheme(){
       return this.scheme;
    }
    public String toString(){
       return this.scheme+" authParams="+this.authParams;
    }
    public Challenge withCharset(Charset p0){
       Objects.requireNonNull(p0, "charset == null");
       LinkedHashMap linkedHashMa = new LinkedHashMap(this.authParams);
       linkedHashMa.put("charset", p0.name());
       return new Challenge(this.scheme, linkedHashMa);
    }
}
