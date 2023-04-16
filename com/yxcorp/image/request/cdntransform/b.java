package com.yxcorp.image.request.cdntransform.b;
import com.yxcorp.image.request.cdntransform.IImageCDNTransformer;
import java.lang.Object;
import android.net.Uri;
import com.yxcorp.image.request.cdntransform.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.image.request.cdntransform.IImageCDNTransformer$CDNResizeMode;
import java.util.Set;
import xb.t$b;
import java.lang.StringBuilder;

public abstract class b implements IImageCDNTransformer	// class@001a27
{
    public boolean a;
    public static final String b = "b";

    public void b(){
       super();
       this.a = false;
    }
    public Uri a(Uri p0,c p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uob, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] obj1 = PatchProxy.applyOneRefs(p1, this, uob, "1");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b = false;
          if (p1 == null) {
             if (this.a != null) {
                Objects.toString(p1);
             }
          }else {
             int i = 1;
             if (!this.f(p1.d(), p1.b())) {
                if (this.a != null) {
                   obj1 = new Object[]{Integer.valueOf(p1.d()),Integer.valueOf(p1.b())};
                   String.format("op invalid transformed failed w = %d,h = %d", obj1);
                }
             }else if(p1.a() == IImageCDNTransformer$CDNResizeMode.NONE && !this.h().contains(p1.c())){
                if (this.a != null) {
                   obj1 = new Object[i];
                   obj1[b] = p1.c();
                   String.format("transformed failed : ScaleType not supported ScaleType= %s", obj1);
                }
             }else {
                b = true;
             }
          }
       }
       if (!b) {
          if (this.a != null) {
             p0.toString();
          }
          return p0;
       }else {
          return Uri.parse(this.c(this.e(this.d(p0.toString()), p1.d(), p1.b(), p1.c(), p1.a()), p1.c));
       }
    }
    public boolean b(c p0){
       Object[] objArray;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          if (this.a != null) {
             "op invalid transformed failed : operation = "+p0;
          }
          return false;
       }else if(!this.f(p0.d(), p0.b())){
          if (this.a != null) {
             objArray = new Object[]{Integer.valueOf(p0.d()),Integer.valueOf(p0.b())};
             String.format("op invalid transformed failed w = %d,h = %d", objArray);
          }
          return false;
       }else if(p0.a() == IImageCDNTransformer$CDNResizeMode.NONE && !this.h().contains(p0.c())){
          if (this.a != null) {
             objArray = new Object[]{p0.c()};
             String.format("transformed failed : ScaleType not supported ScaleType= %s", objArray);
          }
          return false;
       }else {
          return 1;
       }
    }
    public abstract String c(String p0,String p1);
    public abstract String d(String p0);
    public abstract String e(String p0,int p1,int p2,t$b p3,IImageCDNTransformer$CDNResizeMode p4);
    public abstract boolean f(int p0,int p1);
    public abstract Set g();
    public abstract Set h();
}
