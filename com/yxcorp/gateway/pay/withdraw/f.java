package com.yxcorp.gateway.pay.withdraw.f;
import tv8.a;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import io.reactivex.subjects.PublishSubject;
import android.content.Intent;
import com.yxcorp.gateway.pay.activity.WechatAuthActivity;
import android.content.Context;
import tv8.e;
import fv8.a;
import com.yxcorp.gateway.pay.withdraw.e;
import erd.o;
import com.yxcorp.gateway.pay.activity.WechatSSOActivity;
import tv8.f;
import com.yxcorp.gateway.pay.withdraw.d;

public class f extends a	// class@0012db
{

    public void f(BaseActivity p0){
       super(p0);
    }
    public t a(String p0){
       PublishSubject obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PublishSubject.g();
       Intent intent = new Intent(this.a, WechatAuthActivity.class);
       intent.putExtra("appId", p0);
       this.a.startActivityForCallback(intent, 4369, new e(obj));
       return obj.onErrorReturn(e.b);
    }
    public t a(String p0,String p1){
       PublishSubject obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PublishSubject.g();
       Intent intent = new Intent(this.a, WechatSSOActivity.class);
       intent.putExtra("ticket", p0);
       intent.putExtra("groupkey", p1);
       this.a.startActivityForCallback(intent, 4369, new f(obj));
       return obj.onErrorReturn(d.b);
    }
}
