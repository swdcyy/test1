package com.kuaishou.webkit.WebAddress;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.util.Objects;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.Locale;
import java.lang.Integer;
import com.kuaishou.webkit.ParseException;
import java.lang.StringBuilder;

public class WebAddress	// class@001264
{
    public String mAuthInfo;
    public String mHost;
    public String mPath;
    public int mPort;
    public String mScheme;
    public static Pattern sAddressPattern;

    static {
       WebAddress.sAddressPattern = Pattern.compile("\(?:\(http|https|file\)\\:\\/\\/\)?\(?:\([-A-Za-z0-9$_.+!*\'\(\),;?&=]+\(?:\\:[-A-Za-z0-9$_.+!*\'\(\),;?&=]+\)?\)@\)?\([a-zA-Z0-9\xa0-\xd7\x02\xf9\x02-\xfd\x02\xfd\x02-\xff\x02%_-][a-zA-Z0-9\xa0-\xd7\x02\xf9\x02-\xfd\x02\xfd\x02-\xff\x02%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\]\)?\(?:\\:\([0-9]*\)\)?\(\\/?[^#]*\)?.*\x00", 2);
    }
    public void WebAddress(String p0){
       super();
       Objects.requireNonNull(p0);
       String str = "";
       this.mScheme = str;
       this.mHost = str;
       this.mPort = -1;
       String str1 = "/";
       this.mPath = str1;
       this.mAuthInfo = str;
       Matcher matcher = WebAddress.sAddressPattern.matcher(p0);
       if (!matcher.matches()) {
          throw new ParseException("Bad address");
       }
       String str2 = matcher.group(1);
       if (str2 != null) {
          this.mScheme = str2.toLowerCase(Locale.ROOT);
       }
       str2 = matcher.group(2);
       if (str2 != null) {
          this.mAuthInfo = str2;
       }
       str2 = matcher.group(3);
       if (str2 != null) {
          this.mHost = str2;
       }
       str2 = matcher.group(4);
       if (str2 != null && str2.length() > 0) {
          try{
             this.mPort = Integer.parseInt(str2);
          }catch(java.lang.NumberFormatException e0){
             throw new ParseException("Bad port");
          }
       }
       matcher = matcher.group(5);
       if (matcher != null && matcher.length() > 0) {
          this.mPath = (matcher.charAt(0) == '/')? matcher: str1+matcher;
       }
    label_0088 :
       if (this.mPort == 443 && (this.mScheme).equals(str)) {
          this.mScheme = "https";
       }else if(this.mPort == -1){
          this.mPort = ((this.mScheme).equals("https"))? 443: 80;
       }
       if ((this.mScheme).equals(str)) {
          this.mScheme = "http";
       }
       return;
    }
    public static Pattern preload(){
       return WebAddress.sAddressPattern;
    }
    public String getAuthInfo(){
       return this.mAuthInfo;
    }
    public String getHost(){
       return this.mHost;
    }
    public String getPath(){
       return this.mPath;
    }
    public int getPort(){
       return this.mPort;
    }
    public String getScheme(){
       return this.mScheme;
    }
    public void setAuthInfo(String p0){
       this.mAuthInfo = p0;
    }
    public void setHost(String p0){
       this.mHost = p0;
    }
    public void setPath(String p0){
       this.mPath = p0;
    }
    public void setPort(int p0){
       this.mPort = p0;
    }
    public void setScheme(String p0){
       this.mScheme = p0;
    }
    public String toString(){
       String str = "";
       String str1 = (this.mPort == 443 || ((this.mScheme).equals("https") || (this.mPort != 80 && (this.mScheme).equals("http"))))? ":"+Integer.toString(this.mPort): str;
       if ((this.mAuthInfo).length() > 0) {
          str = this.mAuthInfo+"@";
       }
       return this.mScheme+"://"+str+this.mHost+str1+this.mPath;
    }
}
