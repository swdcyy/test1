package com.yxcorp.gifshow.share.platform.QQForward$a$a$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.share.platform.QQForward$a$a;
import com.yxcorp.gifshow.share.platform.QQForward$a$a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.platform.QQForward;
import com.tencent.tauth.Tencent;
import com.yxcorp.gifshow.share.platform.QQForward$Companion;
import android.app.Activity;
import android.os.Bundle;
import com.tencent.tauth.IUiListener;

public final class QQForward$a$a$b implements Runnable	// class@001c0f
{
    public final QQForward$a$a b;
    public final QQForward$a$a$c c;

    public void QQForward$a$a$b(QQForward$a$a p0,QQForward$a$a$c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       QQForward$a$a$b tb;
       if (PatchProxy.applyVoid(null, this, QQForward$a$a$b.class, "1")) {
          return;
       }
       if (this.b.d != null) {
          tb = this.b;
          QQForward.m0.b().shareToQQ(tb.c, tb.e, this.c);
       }else {
          tb = this.b;
          QQForward.m0.b().shareToQzone(tb.c, tb.e, this.c);
       }
       return;
    }
}
