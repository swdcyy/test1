package okhttp3.MediaType;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.Locale;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.nio.charset.Charset;

public final class MediaType	// class@002080
{
    public final String charset;
    public final String mediaType;
    public final String subtype;
    public final String type;
    public static final Pattern PARAMETER;
    public static final Pattern TYPE_SUBTYPE;

    static {
       MediaType.TYPE_SUBTYPE = Pattern.compile("\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)/\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)");
       MediaType.PARAMETER = Pattern.compile(";\\s*\(?:\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)=\(?:\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)|\"\([^\"]*\)\"\)\)?");
    }
    public void MediaType(String p0,String p1,String p2,String p3){
       super();
       this.mediaType = p0;
       this.type = p1;
       this.subtype = p2;
       this.charset = p3;
    }
    public static MediaType get(String p0){
       String str3;
       Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(p0);
       if (!matcher.lookingAt()) {
          throw new IllegalArgumentException("No subtype found for: \""+p0+'"');
       }
       int i = 1;
       Locale uS = Locale.US;
       String str = (matcher.group(i)).toLowerCase(uS);
       String str1 = (matcher.group(2)).toLowerCase(uS);
       String str2 = null;
       Matcher matcher1 = MediaType.PARAMETER.matcher(p0);
       int i1 = matcher.end();
       while (true) {
          if (i1 >= p0.length()) {
             return new MediaType(p0, str, str1, str2);
          }
          matcher1.region(i1, p0.length());
          if (!matcher1.lookingAt()) {
             throw new IllegalArgumentException("Parameter is not formatted correctly: \""+p0.substring(i1)+"\" for: \""+p0+'"');
          }
          str3 = matcher1.group(i);
          if (str3 != null && str3.equalsIgnoreCase("charset")) {
             str3 = matcher1.group(2);
             if (str3 != null) {
                String str4 = "\'";
                if (str3.startsWith(str4) && (str3.endsWith(str4) && str3.length() > 2)) {
                   int i2 = str3.length() - i;
                   str3 = str3.substring(i, i2);
                }
             }else {
                str3 = matcher1.group(3);
             }
             if (str2 == null || str3.equalsIgnoreCase(str2)) {
                str2 = str3;
             }else {
                break ;
             }
          }
          i1 = matcher1.end();
       }
       throw new IllegalArgumentException("Multiple charsets defined: \""+str2+"\" and: \""+str3+"\" for: \""+p0+'"');
    }
    public static MediaType parse(String p0){
       try{
          return MediaType.get(p0);
       }catch(java.lang.IllegalArgumentException e0){
          return null;
       }
    }
    public Charset charset(){
       return this.charset(null);
    }
    public Charset charset(Charset p0){
       try{
          MediaType tcharset = this.charset;
          if (tcharset != null) {
             p0 = Charset.forName(tcharset);
          }
          return p0;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof MediaType && (p0.mediaType).equals(this.mediaType))? true: false;
       return b;
    }
    public int hashCode(){
       return (this.mediaType).hashCode();
    }
    public String subtype(){
       return this.subtype;
    }
    public String toString(){
       return this.mediaType;
    }
    public String type(){
       return this.type;
    }
}
