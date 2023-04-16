package com.yxcorp.gifshow.share.platform.QQForward$a$a$c;
import com.tencent.tauth.IUiListener;
import com.yxcorp.gifshow.share.platform.QQForward$a$a;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.exception.ForwardCancelException;
import java.lang.Exception;
import nsd.u;
import java.lang.Throwable;
import brd.g;
import com.tencent.tauth.UiError;
import java.lang.RuntimeException;

public final class QQForward$a$a$c implements IUiListener	// class@001c10
{
    public final QQForward$a$a a;
    public final v b;

    public void QQForward$a$a$c(QQForward$a$a p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, QQForward$a$a$c.class, "2")) {
          return;
       }
       ForwardCancelException uForwardCanc = new ForwardCancelException("cancel qq share", null, null, 6, null);
       this.b.onError(v7);
       return;
    }
    public void onComplete(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QQForward$a$a$c.class, "1")) {
          return;
       }
       this.b.onNext(this.a.b);
       return;
    }
    public void onError(UiError p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, QQForward$a$a$c.class, "3")) {
          return;
       }
       QQForward$a$a$c tb = this.b;
       p0 = (p0 != null)? p0.errorMessage: null;
       tb.onError(new RuntimeException(p0));
       return;
    }
    public void onWarning(int p0){
    }
}
