package com.kuaishou.gifshow.kuaishan.logic.k1;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.gifshow.kuaishan.utils.e;
import java.lang.StringBuilder;
import java.lang.String;
import x80.b2;
import t36.f$a;
import t36.f;
import x80.c2;
import lnc.g7;
import t90.i;
import s66.a;

public final class k1 implements g	// class@001a58
{
    public final m1 b;
    public final KSTemplateDetailInfo c;

    public void k1(m1 p0,KSTemplateDetailInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       k1 tb = this.b;
       k1 tc = this.c;
       Objects.requireNonNull(tb);
       String str = "Downloading works for template:";
       if (e.s(p0)) {
          e.v(p0, str+tc.mTemplateId+" failed, ģ����Դ����ʧ�ܣ����̿ռ䲻�������д����߼�");
          tb.s0(new b2(tc));
       }else {
          e.v(p0, str+tc.mTemplateId+" failed, ģ����Դ����ʧ�ܣ�����ϵ�ͻ��˿���ͬѧ����");
          tb.s0(new c2(tc));
       }
       i.c(p0.getMessage(), g7.b(tc));
       a.e("KuaiShanTemplateId");
       return;
    }
}
