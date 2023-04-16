package com.yxcorp.image.request.cdntransform.a;
import com.yxcorp.image.request.cdntransform.b;
import java.util.HashMap;
import xb.t$b;
import java.lang.Object;
import com.yxcorp.image.request.cdntransform.IImageCDNTransformer$CDNResizeMode;
import java.util.HashSet;
import java.lang.String;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.lang.StringBuilder;
import java.lang.Integer;

public class a extends b	// class@001a26
{
    public static final Set c;
    public static final HashMap d;
    public static final HashMap e;

    static {
       HashMap hashMap = new HashMap();
       a.d = hashMap;
       hashMap.put(t$b.a, "m_fixed");
       hashMap.put(t$b.e, "m_lfit");
       hashMap.put(t$b.d, "m_lfit");
       hashMap.put(t$b.f, "m_lfit");
       hashMap.put(t$b.i, "m_fill");
       hashMap = new HashMap();
       a.e = hashMap;
       hashMap.put(IImageCDNTransformer$CDNResizeMode.NONE, "m_lfit");
       hashMap.put(IImageCDNTransformer$CDNResizeMode.LFIT, "m_lfit");
       hashMap.put(IImageCDNTransformer$CDNResizeMode.MFIT, "m_mfit");
       hashMap.put(IImageCDNTransformer$CDNResizeMode.FILL, "m_fill");
       hashMap.put(IImageCDNTransformer$CDNResizeMode.PAD, "m_pad");
       hashMap.put(IImageCDNTransformer$CDNResizeMode.FIXED, "m_fixed");
       String[] stringArray = new String[]{"jpg","png","webp","bmp","gif","tiff"};
       a.c = new HashSet(Arrays.asList(stringArray));
    }
    public void a(){
       super();
    }
    public String c(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.c.contains(p1)) {
          p0 = p0+"/format,"+p1;
       }
       return p0;
    }
    public String d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.indexOf(63) == -1) {
          return p0+"?x-oss-process=image/";
       }
       return p0+"&x-oss-process=image/";
    }
    public String e(String p0,int p1,int p2,t$b p3,IImageCDNTransformer$CDNResizeMode p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = (p4 != IImageCDNTransformer$CDNResizeMode.NONE)? a.e.get(p4): a.d.get(p3);
       p0 = p0+"resize,"+str;
       long l = (long)p1;
       if (l - 1 >= 0 && l - 4096 <= 0) {
          p0 = p0+",w_"+p1;
       }
       l = (long)p2;
       if (l - 1 >= 0 && l - 4096 <= 0) {
          p0 = p0+",h_"+p2;
       }
       return p0;
    }
    public boolean f(int p0,int p1){
       boolean b;
       long l = (long)p0;
       if (l - 1 < 0 || l - 4096 > 0) {
          long l1 = (long)p1;
          if (l1 - 1 < 0 || l1 - 4096 > 0) {
             b = false;
          label_0019 :
             return b;
          }
       }
       b = true;
       goto label_0019 ;
    }
    public Set g(){
       return a.c;
    }
    public Set h(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.d.keySet();
    }
}
