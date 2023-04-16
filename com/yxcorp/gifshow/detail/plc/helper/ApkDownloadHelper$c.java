package com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$c;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$a;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import f4a.d0;
import f4a.k;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.Exception;
import f4a.b;

public class ApkDownloadHelper$c implements ApkDownloadHelper$a	// class@00166a
{
    public final ApkDownloadHelper a;

    public void ApkDownloadHelper$c(ApkDownloadHelper p0){
       this.a = p0;
       super();
    }
    public final void a(long p0,long p1,int p2){
       if (PatchProxy.isSupport(ApkDownloadHelper$c.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, ApkDownloadHelper$c.class, "6")) {
          return;
       }
       ApkDownloadHelper$c ta = this.a;
       ta.h = 1;
       ta.g(8);
       ta = this.a;
       Object[] objArray = new Object[]{Integer.valueOf(ta.i.b(p0, p1, p2))};
       ta.f(String.format(d0.a, objArray));
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ApkDownloadHelper$c.class, "3")) {
          return;
       }
       this.a.f(d0.c);
       ApkDownloadHelper$c ta = this.a;
       ta.c("4", ta.d.getActionIconUrl());
       ta = this.a;
       ta.e("4", ta.d.getTitle());
       this.a.h = 0;
       return;
    }
    public void c(long p0,long p1,int p2){
       if (PatchProxy.isSupport(ApkDownloadHelper$c.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, ApkDownloadHelper$c.class, "2")) {
          return;
       }
       this.a(p0, p1, p2);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, ApkDownloadHelper$c.class, "5")) {
          return;
       }
       ApkDownloadHelper$c ta = this.a;
       ta.h = 1;
       ta.g(8);
       Object[] objArray = new Object[]{d0.e,"..."};
       this.a.f(String.format("%s%s", objArray));
       return;
    }
    public void e(long p0,long p1,int p2){
       if (PatchProxy.isSupport(ApkDownloadHelper$c.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, ApkDownloadHelper$c.class, "1")) {
          return;
       }
       ApkDownloadHelper$c ta = this.a;
       Object[] objArray = new Object[]{Integer.valueOf(ta.i.b(p0, p1, p2))};
       ta.f(String.format(d0.b, objArray));
       ApkDownloadHelper$c ta1 = this.a;
       ta1.c("2", ta1.d.getActionIconUrl());
       ta1 = this.a;
       ta1.e("3", ta1.d.getTitle());
       return;
    }
    public void f(Exception p0){
       b.b(this, p0);
    }
    public void g(){
       b.a(this);
    }
    public void h(long p0,long p1,int p2){
       if (PatchProxy.isSupport(ApkDownloadHelper$c.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, ApkDownloadHelper$c.class, "4")) {
          return;
       }
       this.a(p0, p1, p2);
       return;
    }
}
