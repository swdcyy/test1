package com.kuaishou.raven.RestAPIClientNativeBridge$a;
import com.kuaishou.raven.b$a;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.raven.RestAPIClientNativeBridge;

public class RestAPIClientNativeBridge$a implements b$a	// class@000e8f
{
    public long a;

    public void RestAPIClientNativeBridge$a(long p0){
       super();
       this.a = p0;
    }
    public void a(int p0,Exception p1){
       RestAPIClientNativeBridge$a uoa = RestAPIClientNativeBridge$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       if (p0 != 200) {
          int i = 409;
          if (p0 >= 400 && p0 < i) {
             p0 = (p0 - 400) - 140;
          }else {
             int i1 = 500;
             if (p0 >= i && p0 < i1) {
                p0 = -149;
             }else {
                i = 509;
                if (p0 >= i1 && p0 < i) {
                   p0 = (p0 - 500) - 150;
                }else if(p0 >= i && p0 < 600){
                   p0 = -159;
                }
             }
          }
       }else {
          p0 = 0;
       }
       RestAPIClientNativeBridge.nativeOnResult(this.a, p0, null);
       return;
    }
    public void b(int p0,byte[] p1){
       RestAPIClientNativeBridge$a uoa = RestAPIClientNativeBridge$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       int i = 0;
       if (p0 != 200) {
          i = 409;
          int i1 = 400;
          if (p0 >= i1 && p0 < i) {
             i = (p0 - i1) - 140;
          }else {
             i1 = 500;
             if (p0 >= i && p0 < i1) {
                i = -149;
             }else {
                i = 509;
                if (p0 >= i1 && p0 < i) {
                   i = (p0 - i1) - 150;
                }else if(p0 >= i && p0 < 600){
                   i = -159;
                }else {
                   i = -160;
                }
             }
          }
       }
       RestAPIClientNativeBridge$a ta = this.a;
       if (i) {
          p1 = null;
       }
       RestAPIClientNativeBridge.nativeOnResult(ta, i, p1);
       return;
    }
}
