package com.yxcorp.gifshow.homebottom.presenter.b$a;
import com.google.android.material.tabs.KCubeTabLayout$e;
import com.yxcorp.gifshow.homebottom.presenter.b;
import java.lang.Object;
import android.view.View;
import wq6.h;
import java.lang.CharSequence;
import sn5.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import esa.s;
import java.util.Map;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.util.ReddotRecordHelper;
import com.kwai.kcube.TabIdentifier;
import on5.a;
import java.lang.Boolean;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import zq6.b;
import rn5.a;
import zq6.p;
import sn5.g;
import android.content.Context;
import com.google.android.material.tabs.NasaTabView;
import jk.w;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;

public class b$a implements KCubeTabLayout$e	// class@001692
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0,View p1,h p2,int p3,CharSequence p4,e p5){
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p5;
       b$a uoa = b$a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,oobject1,Integer.valueOf(p3),p4,oobject2};
          if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             return;
          }
       }else {
          int i2 = this;
       }
       int i1 = s.e(oobject2.a);
       e a = oobject2.a;
       if (a != null) {
          if (p3 != a) {
             s.c(oobject1, i1, oobject2.e);
          }
          s.d(p2, i1, oobject2.e, oobject2.f, -1, oobject2.b);
          if (i1 != 4) {
             ReddotRecordHelper.e.d(1, a.c(p2.M2()));
          }
       }else if(i1 != 4){
          ReddotRecordHelper.e.d(i, a.c(p2.M2()));
       }
       s.i(p1, s.e(oobject2.a), oobject2.e);
       return;
    }
    public void b(int p0,boolean p1,View p2,h p3){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, p3, this, b$a.class, "2")) {
          return;
       }
       s.g(p0, p1, p2, p3);
       if (p1) {
          e uoe = this.a.u.c().y().e(p3, a.i);
          if (uoe != null && uoe.a != null) {
             ReddotRecordHelper.e.c(a.c(p3.M2()));
          }
       }
       return;
    }
    public boolean c(){
       return true;
    }
    public void d(int p0,View p1,h p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b$a.class, "3")) {
          return;
       }
       s.f(p0, p1, p2);
       return;
    }
    public void e(int p0,View p1,h p2,g p3){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, b$a.class, "5")) {
          return;
       }
       if (p3.a != null) {
          s.c(p2, 4, p3.c);
          s.d(p2, 4, p3.c, p3.d, p3.g, "");
       }
       return;
    }
    public NasaTabView f(Context p0,h p1){
       return w.b(this, p0, p1);
    }
    public List g(b p0,h p1,NasaTabView p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new ArrayList();
    }
}
