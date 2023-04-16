package com.yxcorp.image.request.cdntransform.e;
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
import java.lang.StringBuilder;
import com.yxcorp.image.request.cdntransform.IImageCDNTransformer$CDNResizeMode;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;

public class e extends b	// class@001a2a
{
    public static final Set c;
    public static final Set d;

    static {
       t$b[] uobArray = new t$b[]{t$b.e,t$b.d,t$b.a,t$b.f,t$b.i};
       e.d = new HashSet(Arrays.asList(uobArray));
       e.c = new HashSet();
    }
    public void e(){
       super();
    }
    public String c(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"/format/"+p1;
    }
    public String d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.indexOf(63) == -1) {
          return p0+"?imageView2";
       }
       return p0+"&imageView2";
    }
    public String e(String p0,int p1,int p2,t$b p3,IImageCDNTransformer$CDNResizeMode p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          p4 = PatchProxy.apply(objArray, this, uoe, "2");
          if (p4 != PatchProxyResult.class) {
             return p4;
          }
       }
       String str = (!t$b.d.equals(p3) && (!t$b.f.equals(p3) && (t$b.e.equals(p3) || t$b.a.equals(p3))))? "/2": "";
       if (t$b.i.equals(p3)) {
          str = "/1";
       }
       if (TextUtils.isEmpty(str)) {
          return p0;
       }else {
          return p0+str+"/w/"+p1+"/h/"+p2;
       }
    }
    public boolean f(int p0,int p1){
       int i = 1;
       if (p0 < i || (p0 > 9999 || (p1 < i || p1 > 9999))) {
          i = false;
       }
       return i;
    }
    public Set g(){
       return e.c;
    }
    public Set h(){
       return e.d;
    }
}
