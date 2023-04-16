package com.yxcorp.utility.uri.Uri$StringUri;
import com.yxcorp.utility.uri.Uri$AbstractHierarchicalUri;
import java.lang.String;
import com.yxcorp.utility.uri.Uri$a;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.utility.uri.Uri$c;
import com.yxcorp.utility.uri.Uri;
import com.yxcorp.utility.uri.Uri$b;
import android.os.Parcel;

public class Uri$StringUri extends Uri$AbstractHierarchicalUri	// class@0009d8
{
    public final String e;
    public int f;
    public Uri$c g;

    public void Uri$StringUri(String p0){
       super(null);
       this.f = -2;
       Objects.requireNonNull(p0, "uriString");
       this.e = p0;
    }
    public String c(){
       int i;
       String str;
       String b;
       Uri$b a;
       Uri$StringUri tg = this.g;
       if (tg == null) {
          tg = this.e;
          if (this.f == -2) {
             i = (this.e).indexOf(58);
             this.f = i;
          }else {
             i = this.f;
          }
          int i1 = tg.length();
          int i2 = i + 2;
          if (i1 > i2 && (tg.charAt((i + 1)) == '/' && tg.charAt(i2) == '/')) {
             i = i + 3;
             i2 = i;
             while (i2 < i1) {
                char c = tg.charAt(i2);
                if (c != '#' && (c != '/' && (c != '?' && c != '\'))) {
                   i2 = i2 + 1;
                }else {
                   break ;
                }
             }
          label_004a :
             str = tg.substring(i, i2);
          }else {
             str = null;
          }
          b = Uri.b;
          if (str == null) {
             tg = Uri$c.c;
          }else if(!str.length()){
             tg = Uri$c.d;
          }else if(b == null){
             tg = Uri$c.c;
          }else if(!b.length()){
             tg = Uri$c.d;
          }else {
             tg = new Uri$c(str, b);
          }
          this.g = tg;
       }
       Uri$b uob = (tg.a != Uri.b)? 1: null;
       if (uob) {
          a = tg.a;
       }else {
          b = Uri.b(tg.b);
          tg.a = b;
          a = b;
       }
       return a;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(1);
       p0.writeString(this.e);
    }
}
