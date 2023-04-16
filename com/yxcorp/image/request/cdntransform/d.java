package com.yxcorp.image.request.cdntransform.d;
import com.yxcorp.image.request.cdntransform.b;
import java.util.HashSet;
import xb.t$b;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.lang.StringBuilder;
import com.yxcorp.image.request.cdntransform.IImageCDNTransformer$CDNResizeMode;
import java.lang.Integer;

public class d extends b	// class@001a29
{
    public static final Set c;
    public static final HashSet d;

    static {
       t$b[] uobArray = new t$b[]{t$b.e,t$b.d,t$b.a,t$b.f,t$b.i};
       d.d = new HashSet(Arrays.asList(uobArray));
       String[] stringArray = new String[]{"jpg","JPEG","png","webp","wbmp","bmp","gif"};
       d.c = new HashSet(Arrays.asList(stringArray));
    }
    public void d(){
       super();
    }
    public String c(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.c.contains(p1)) {
          p0 = p0+"&F="+p1;
       }
       return p0;
    }
    public String d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"@base";
    }
    public String e(String p0,int p1,int p2,t$b p3,IImageCDNTransformer$CDNResizeMode p4){
       String str1;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          p4 = PatchProxy.apply(objArray, this, uod, "2");
          if (p4 != PatchProxyResult.class) {
             return p4;
          }
       }
       String str = "&m=1";
       if (p3 != t$b.e && (p3 == t$b.d || p3 == t$b.f)) {
          str1 = (p1 > p2)? str: "&m=0";
       }else {
          str1 = "";
       }
       if (p3 == t$b.i) {
          str1 = (p1 < p2)? "&m=1&c=1": "&m=0&c=1";
       }
    label_0053 :
       if (p3 == t$b.a) {
          if (p1 >= p2) {
             str = "&m=0";
          }
          str1 = str;
       }
       return p0+"@tag=imgScale"+str1+"&w="+p1+"&h="+p2;
    }
    public boolean f(int p0,int p1){
       int i = 1;
       if (p0 < i || (p0 > 4096 || (p1 < i || p1 > 4096))) {
          i = false;
       }
       return i;
    }
    public Set g(){
       return d.c;
    }
    public Set h(){
       return d.d;
    }
}
