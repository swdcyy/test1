package com.yxcorp.utility.uri.Uri$AbstractHierarchicalUri;
import com.yxcorp.utility.uri.Uri;
import com.yxcorp.utility.uri.Uri$a;
import java.lang.Object;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import java.io.ByteArrayOutputStream;
import xkd.a;

public abstract class Uri$AbstractHierarchicalUri extends Uri	// class@0009d7
{
    public String d;

    public void Uri$AbstractHierarchicalUri(){
       super(null);
       this.d = Uri.b;
    }
    public void Uri$AbstractHierarchicalUri(Uri$a p0){
       super(null);
       this.d = Uri.b;
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public String d(){
       int i = 1;
       Uri$AbstractHierarchicalUri uAbstractHie = (this.d != Uri.b)? 1: null;
       if (uAbstractHie) {
          uAbstractHie = this.d;
       }else {
          String str = this.c();
          String str1 = null;
          if (str != null) {
             int i1 = str.lastIndexOf(64);
             int i2 = str.indexOf(58, i1);
             str = (i2 == -1)? str.substring((i1 + i)): str.substring((i1 + i), i2);
             if (str != null) {
                Charset uCharset = Charset.forName("UTF-8");
                if (str.indexOf(37) != -1) {
                   StringBuilder str2 = new StringBuilder(str.length());
                   ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                   int i3 = 0;
                   while (i3 < str.length()) {
                      char c = str.charAt(i3);
                      if (c == '%') {
                         do {
                            int i4 = i3 + 2;
                            if (i4 < str.length()) {
                               int i5 = i3 + 1;
                               i5 = a.a(str.charAt(i5));
                               if (i5 != -1) {
                                  i4 = a.a(str.charAt(i4));
                                  if (i4 != -1) {
                                     i5 = i5 << 4;
                                     i5 = i5 + i4;
                                     uByteArrayOu.write((byte)i5);
                                  label_0093 :
                                     i3 = i3 + 3;
                                     if (i3 >= str.length() || str.charAt(i3) != '%') {
                                     }else {
                                        continue ;
                                     }
                                  }
                               }
                            }
                            byte[] bytes = ("\xff\x02\x00").getBytes(uCharset);
                            uByteArrayOu.write(bytes, 0, bytes.length);
                            goto label_0093 ;
                         } while (i3 >= str.length() || str.charAt(i3) != '%');
                         str2 = str2+new String(uByteArrayOu.toByteArray(), uCharset);
                         uByteArrayOu.reset();
                      }else {
                         str2 = str2+c;
                         i3 = i3 + 1;
                      }
                   }
                   str = str2;
                }
                str1 = str;
             }
          }
          str = str1;
          this.d = str;
       }
       return uAbstractHie;
    }
}
