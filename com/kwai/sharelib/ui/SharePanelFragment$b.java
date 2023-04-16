package com.kwai.sharelib.ui.SharePanelFragment$b;
import mp7.e;
import java.lang.Object;
import uo7.j0;
import android.view.View;
import com.kwai.sharelib.model.ShareInitResponse$ThemeAreaElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import mp7.e$a;
import uo7.i0;
import com.kwai.sharelib.model.ShareInitResponse$ThemeItemElement;
import java.lang.Number;
import java.util.List;
import mp7.d;

public final class SharePanelFragment$b implements e	// class@001707
{

    public void SharePanelFragment$b(){
       super();
    }
    public boolean a(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       SharePanelFragment$b uob = SharePanelFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "v");
       return e$a.a(this, p0, p1, p2, p3, p4);
    }
    public void b(i0 p0,View p1,int p2,int p3,int p4,ShareInitResponse$ThemeItemElement p5){
       SharePanelFragment$b uob = SharePanelFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uob, "7")) {
             return;
          }
       }
       a.p(p0, "op");
       a.p(p1, "v");
       e$a.f(this, p0, p1, p2, p3, p4, p5);
       return;
    }
    public int c(i0 p0,int p1,int p2){
       if (PatchProxy.isSupport(SharePanelFragment$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SharePanelFragment$b.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "op");
       return e$a.d(this, p0, p1, p2);
    }
    public void d(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       SharePanelFragment$b uob = SharePanelFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "4")) {
             return;
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "v");
       e$a.e(this, p0, p1, p2, p3, p4);
       return;
    }
    public List e(int p0){
       return d.b(this, p0);
    }
    public boolean f(i0 p0,View p1,int p2,int p3,int p4,ShareInitResponse$ThemeItemElement p5){
       SharePanelFragment$b uob = SharePanelFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, this, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "op");
       a.p(p1, "v");
       return e$a.b(this, p0, p1, p2, p3, p4, p5);
    }
    public int g(int p0){
       SharePanelFragment$b uob = SharePanelFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return -1;
    }
    public int h(j0 p0,int p1){
       SharePanelFragment$b uob = SharePanelFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "bundle");
       return e$a.c(this, p0, p1);
    }
    public int i(int p0){
       return d.a(this, p0);
    }
}
