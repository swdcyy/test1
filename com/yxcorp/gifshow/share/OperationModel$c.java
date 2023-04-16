package com.yxcorp.gifshow.share.OperationModel$c;
import java.lang.Object;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.File;
import brd.t;
import msd.l;
import com.yxcorp.gifshow.entity.IMShareData;
import com.yxcorp.gifshow.entity.TagDetailItem;
import com.yxcorp.gifshow.share.OperationModel$Type;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;

public final class OperationModel$c	// class@001b5b
{
    public OperationModel$Type a;
    public BaseFeed b;
    public User c;
    public IMShareData d;
    public TagDetailItem e;
    public String f;
    public File g;
    public String h;
    public File i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public t n;
    public l o;
    public boolean p;
    public boolean q;
    public String r;

    public void OperationModel$c(){
       super();
       this.m = true;
       this.p = true;
       this.r = "";
    }
    public final OperationModel a(){
       Object obj = PatchProxy.apply(null, this, OperationModel$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new OperationModel(this);
    }
    public final BaseFeed b(){
       return this.b;
    }
    public final void c(boolean p0){
       this.k = p0;
    }
    public final void d(File p0){
       this.i = p0;
    }
    public final void e(t p0){
       this.n = p0;
    }
    public final void f(l p0){
       this.o = p0;
    }
    public final void g(boolean p0){
       this.l = p0;
    }
    public final void h(IMShareData p0){
       this.d = p0;
    }
    public final void i(boolean p0){
       this.m = p0;
    }
    public final void j(String p0){
       this.f = p0;
    }
    public final void k(BaseFeed p0){
       this.b = p0;
    }
    public final void l(int p0){
       this.j = p0;
    }
    public final void m(TagDetailItem p0){
       this.e = p0;
    }
    public final void n(OperationModel$Type p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationModel$c.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
    public final void o(String p0){
       this.h = p0;
    }
    public final void p(User p0){
       this.c = p0;
    }
}
