package com.yxcorp.gifshow.util.CtrPredictorPrefetchHelper$registerCTRPredictorDataProvider$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import com.kwai.component.homepage_interface.pagelist.prefetch.HomePrefetchConfigUtils;
import com.kwai.component.homepage_interface.pagelist.model.PhotoPage;
import tra.b;
import java.lang.String;
import q87.c;
import lnc.e1;
import java.lang.StringBuilder;
import wkd.b;
import ob5.a;
import tkd.b;
import tkd.d;
import hn5.n;
import qvb.i;
import jb5.d;

public final class CtrPredictorPrefetchHelper$registerCTRPredictorDataProvider$1 extends Lambda implements l	// class@001edf
{
    public static final CtrPredictorPrefetchHelper$registerCTRPredictorDataProvider$1 INSTANCE;

    static {
       CtrPredictorPrefetchHelper$registerCTRPredictorDataProvider$1.INSTANCE = new CtrPredictorPrefetchHelper$registerCTRPredictorDataProvider$1();
    }
    public void CtrPredictorPrefetchHelper$registerCTRPredictorDataProvider$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       Object[] objArray;
       int i = 0;
       String str = "CtrPredictorPrefetchHelper";
       if (!HomePrefetchConfigUtils.b.a(PhotoPage.FOUND)) {
          objArray = new Object[i];
          b.C().w(str, "û����������Ԥȡʵ��", objArray);
          return;
       }else if(!p0){
          objArray = new Object[i];
          b.C().w(str, "ctr Ԥ�ⲻ����뷢��ҳ", objArray);
          return;
       }else if(!e1.b.a()){
          objArray = new Object[i];
          b.C().w(str, "û������ctrԤ��Ԥȡ����", objArray);
          return;
       }else if(e1.a){
          objArray = new Object[i];
          b.C().w(str, "�����Ѿ�Ԥȡ����", objArray);
          return;
       }else {
          e1.a = true;
          Object[] objArray1 = new Object[i];
          b.C().w(str, "�ڴ˴�������ҳ����Ԥȡ - handle "+p0, objArray1);
          a uoa = b.a(-1684107285);
          i oi = d.a(-1883158055).c9(3);
          if (!oi instanceof d) {
             oi = null;
          }
          uoa.c(3, oi, true);
          return;
       }
    }
}
