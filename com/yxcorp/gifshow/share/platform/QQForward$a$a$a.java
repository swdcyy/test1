package com.yxcorp.gifshow.share.platform.QQForward$a$a$a;
import n3d.a;
import com.yxcorp.gifshow.share.platform.QQForward$a$a;
import com.yxcorp.gifshow.share.platform.QQForward$a$a$c;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;

public final class QQForward$a$a$a implements a	// class@001c0e
{
    public final QQForward$a$a b;
    public final QQForward$a$a$c c;

    public void QQForward$a$a$a(QQForward$a$a p0,QQForward$a$a$c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(QQForward$a$a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, QQForward$a$a$a.class, "1")) {
          return;
       }
       this.b.c.s(this);
       Tencent.onActivityResultData(p0, p1, p2, this.c);
       if (p0 == 0x2774 && (p1 != 0x2777 && (p1 == 0x2778 || p1 == 0x2b5f))) {
          Tencent.handleResultData(p2, this.c);
       }
       return;
    }
}
