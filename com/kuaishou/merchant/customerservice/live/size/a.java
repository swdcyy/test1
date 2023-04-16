package com.kuaishou.merchant.customerservice.live.size.a;
import y8c.g;
import com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment$b;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import yb7.a;
import java.lang.Number;
import g9c.a;
import com.kuaishou.merchant.customerservice.model.CustomerServiceSize$SizeImage;
import com.kuaishou.merchant.api.core.model.Commodity;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.content.Context;
import ml8.c;
import xm4.a;
import vv3.g;
import vv3.f;

public class a extends g	// class@001674
{
    public LiveCustomerServiceSizeFragment$b w;

    public void a(LiveCustomerServiceSizeFragment$b p0){
       super();
       this.w = p0;
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this.w};
       return a.a(obj);
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Object obj1 = this.N0(p0);
       if (obj1 instanceof CustomerServiceSize$SizeImage) {
          return 1;
       }else if(obj1 instanceof Commodity){
          return 0;
       }else {
          return -1;
       }
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       if (p1) {
          if (p1 != 1) {
             return new f(new View(p0.getContext()), new PresenterV2());
          }else {
             obj.U7(new g());
             return new f(a.e(p0, 0x7f0d0685), obj);
          }
       }else {
          obj.U7(new f());
          return new f(a.e(p0, 0x7f0d0684), obj);
       }
    }
}
