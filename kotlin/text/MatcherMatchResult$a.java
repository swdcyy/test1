package kotlin.text.MatcherMatchResult$a;
import trd.c;
import kotlin.text.MatcherMatchResult;
import java.util.regex.MatchResult;
import java.lang.Object;
import java.lang.String;
import kotlin.collections.AbstractCollection;

public final class MatcherMatchResult$a extends c	// class@0018ee
{
    public final MatcherMatchResult c;

    public void MatcherMatchResult$a(MatcherMatchResult p0){
       this.c = p0;
       super();
    }
    public int b(){
       return (this.c.d().groupCount() + 1);
    }
    public final boolean contains(Object p0){
       if (p0 instanceof String) {
          return this.d(p0);
       }
       return false;
    }
    public boolean d(String p0){
       return super.contains(p0);
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public String get(int p0){
       String str = this.c.d().group(p0);
       if (str != null) {
       }else {
          str = "";
       }
       return str;
    }
    public final int indexOf(Object p0){
       if (p0 instanceof String) {
          return this.l(p0);
       }
       return -1;
    }
    public int l(String p0){
       return super.indexOf(p0);
    }
    public final int lastIndexOf(Object p0){
       if (p0 instanceof String) {
          return this.m(p0);
       }
       return -1;
    }
    public int m(String p0){
       return super.lastIndexOf(p0);
    }
}
