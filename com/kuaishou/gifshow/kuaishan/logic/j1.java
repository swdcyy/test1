package com.kuaishou.gifshow.kuaishan.logic.j1;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import crd.b;
import x80.a2;
import t36.f$a;
import t36.f;

public final class j1 implements g	// class@001a55
{
    public final m1 b;
    public final KSTemplateDetailInfo c;

    public void j1(m1 p0,KSTemplateDetailInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.s0(new a2(this.c));
    }
}
