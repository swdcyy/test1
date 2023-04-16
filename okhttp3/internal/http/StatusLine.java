package okhttp3.internal.http.StatusLine;
import okhttp3.Protocol;
import java.lang.String;
import java.lang.Object;
import okhttp3.Response;
import java.net.ProtocolException;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class StatusLine	// class@0020bd
{
    public final int code;
    public final String message;
    public final Protocol protocol;

    public void StatusLine(Protocol p0,int p1,String p2){
       super();
       this.protocol = p0;
       this.code = p1;
       this.message = p2;
    }
    public static StatusLine get(Response p0){
       return new StatusLine(p0.protocol(), p0.code(), p0.message());
    }
    public static StatusLine parse(String p0){
       Protocol hTTP_1_0;
       StatusLine statusLine = 32;
       int i = 9;
       if (p0.startsWith("HTTP/1.")) {
          if (p0.length() >= i && p0.charAt(8) == statusLine) {
             int i1 = p0.charAt(7) - 48;
             if (!i1) {
                hTTP_1_0 = Protocol.HTTP_1_0;
             }else if(i1 == 1){
                hTTP_1_0 = Protocol.HTTP_1_1;
             }else {
                throw new ProtocolException("Unexpected status line: "+p0);
             }
          }else {
             throw new ProtocolException("Unexpected status line: "+p0);
          }
       }else if(p0.startsWith("ICY ")){
          hTTP_1_0 = Protocol.HTTP_1_0;
          i = 4;
       }else {
          throw new ProtocolException("Unexpected status line: "+p0);
       }
       int i2 = i + 3;
       if (p0.length() >= i2) {
          try{
             int i3 = Integer.parseInt(p0.substring(i, i2));
             if (p0.length() > i2) {
                if (p0.charAt(i2) == statusLine) {
                   p0 = p0.substring((i + 4));
                }else {
                   throw new ProtocolException("Unexpected status line: "+p0);
                }
             }else {
                p0 = "";
             }
             return new StatusLine(hTTP_1_0, i3, p0);
          }catch(java.lang.NumberFormatException e0){
             throw new ProtocolException("Unexpected status line: "+p0);
          }
       }else {
          throw new ProtocolException("Unexpected status line: "+p0);
       }
    }
    public String toString(){
       StringBuilder str = "";
       String str1 = (this.protocol == Protocol.HTTP_1_0)? "HTTP/1.0": "HTTP/1.1";
       char c = ' ';
       str = str+str1+c+this.code;
       if (this.message != null) {
          str = str+c+this.message;
       }
       return str;
    }
}
