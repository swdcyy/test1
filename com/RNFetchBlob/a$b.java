package com.RNFetchBlob.a$b;
import com.RNFetchBlob.a;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import java.lang.String;

public class a$b	// class@000d63
{
    public String a;
    public String b;
    public String c;
    public String d;
    public final a e;

    public void a$b(a p0,ReadableMap p1){
       this.e = p0;
       super();
       String str = "name";
       if (p1.hasKey(str)) {
          this.a = p1.getString(str);
       }
       str = "filename";
       if (p1.hasKey(str)) {
          this.b = p1.getString(str);
       }
       str = "type";
       if (p1.hasKey(str)) {
          this.c = p1.getString(str);
       }else if(this.b == null){
          str = "text/plain";
       }else {
          str = "application/octet-stream";
       }
       this.c = str;
       str = "data";
       if (p1.hasKey(str)) {
          this.d = p1.getString(str);
       }
       return;
    }
}
