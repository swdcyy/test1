package com.kwai.nearby.local.presenter.p$d;
import j85.e;
import com.kwai.nearby.local.presenter.p;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mrb.a;
import q87.c;
import nr4.a$a;
import com.google.protobuf.nano.MessageNano;
import java.lang.Throwable;

public final class p$d implements e	// class@000fbf
{
    public final p a;

    public void p$d(p p0){
       this.a = p0;
       super();
    }
    public final void onSignalReceive(String p0,String p1,byte[] p2){
       a$a uoa;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, p$d.class, "1")) {
          return;
       }
       if (p2 != null) {
          Object[] objArray = new Object[0];
          a.C().s("HomeLocalTopBubblePresenter", "onSignalReceive", objArray);
          try{
             int i = 0;
             uoa = MessageNano.mergeFrom(new a$a(), p2);
          }catch(java.lang.Exception e8){
             a.C().e("HomeLocalTopBubblePresenter", "parse relation bubble error.", e8);
          }
          if (uoa != null) {
             this.a.d9(uoa);
          }
       }
       return;
    }
}
