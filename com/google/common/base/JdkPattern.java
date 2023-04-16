package com.google.common.base.JdkPattern;
import java.io.Serializable;
import ok.e;
import java.util.regex.Pattern;
import java.lang.Object;
import ok.n;
import java.lang.CharSequence;
import ok.d;
import com.google.common.base.JdkPattern$a;
import java.util.regex.Matcher;
import java.lang.String;

public final class JdkPattern extends e implements Serializable	// class@00171b
{
    public final Pattern pattern;
    public static final long serialVersionUID;

    public void JdkPattern(Pattern p0){
       super();
       n.j(p0);
       this.pattern = p0;
    }
    public boolean equals(Object p0){
       if (!p0 instanceof JdkPattern) {
          return false;
       }
       return this.pattern.equals(p0.pattern);
    }
    public int flags(){
       return this.pattern.flags();
    }
    public int hashCode(){
       return this.pattern.hashCode();
    }
    public d matcher(CharSequence p0){
       return new JdkPattern$a(this.pattern.matcher(p0));
    }
    public String pattern(){
       return this.pattern.pattern();
    }
    public String toString(){
       return this.pattern.toString();
    }
}
