package okhttp3.Cookie$Builder;
import java.lang.Object;
import okhttp3.Cookie;
import java.lang.String;
import java.util.Objects;
import okhttp3.internal.Util;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class Cookie$Builder	// class@001f3f
{
    public String domain;
    public long expiresAt;
    public boolean hostOnly;
    public boolean httpOnly;
    public String name;
    public String path;
    public boolean persistent;
    public boolean secure;
    public String value;

    public void Cookie$Builder(){
       super();
       this.expiresAt = 0xe677d21fdbff;
       this.path = "/";
    }
    public Cookie build(){
       return new Cookie(this);
    }
    public Cookie$Builder domain(String p0){
       return this.domain(p0, false);
    }
    public final Cookie$Builder domain(String p0,boolean p1){
       Objects.requireNonNull(p0, "domain == null");
       String str = Util.canonicalizeHost(p0);
       if (str == null) {
          throw new IllegalArgumentException("unexpected domain: "+p0);
       }
       this.domain = str;
       this.hostOnly = p1;
       return this;
    }
    public Cookie$Builder expiresAt(long p0){
       if (p0 <= 0) {
          p0 = Long.MIN_VALUE;
       }
       if (p0 - 0xe677d21fdbff > 0) {
          p0 = 0xe677d21fdbff;
       }
       this.expiresAt = p0;
       this.persistent = true;
       return this;
    }
    public Cookie$Builder hostOnlyDomain(String p0){
       return this.domain(p0, true);
    }
    public Cookie$Builder httpOnly(){
       this.httpOnly = true;
       return this;
    }
    public Cookie$Builder name(String p0){
       Objects.requireNonNull(p0, "name == null");
       if (!(p0.trim()).equals(p0)) {
          throw new IllegalArgumentException("name is not trimmed");
       }
       this.name = p0;
       return this;
    }
    public Cookie$Builder path(String p0){
       if (!p0.startsWith("/")) {
          throw new IllegalArgumentException("path must start with \'/\'");
       }
       this.path = p0;
       return this;
    }
    public Cookie$Builder secure(){
       this.secure = true;
       return this;
    }
    public Cookie$Builder value(String p0){
       Objects.requireNonNull(p0, "value == null");
       if (!(p0.trim()).equals(p0)) {
          throw new IllegalArgumentException("value is not trimmed");
       }
       this.value = p0;
       return this;
    }
}
