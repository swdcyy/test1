package com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$a;
import android.content.Context;
import java.util.List;
import msd.l;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class PicTemplatePageParamBuilderPresenter$a	// class@0012fc
{
    public final Context a;
    public final List b;
    public final int c;
    public final boolean d;
    public boolean e;
    public final l f;

    public void PicTemplatePageParamBuilderPresenter$a(Context p0,List p1,int p2,boolean p3,boolean p4,l p5,int p6,u p7){
       if (p6 & 0x08) {
          p3 = false;
       }
       if (p6 & 0x10) {
          p4 = false;
       }
       a.p(p0, "context");
       a.p(p1, "mTemplateIdList");
       a.p(p5, "downloadController");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       return;
    }
    public final l a(){
       return this.f;
    }
    public final List b(){
       return this.b;
    }
}
