package com.yxcorp.gifshow.relation.shake.b;
import my6.b;
import java.lang.Object;
import com.kwai.library.push.model.InAppNotification;
import android.view.View;
import xbc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import i2b.a;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kwai.library.push.widget.InAppImageView;
import java.util.List;
import java.util.Collection;
import ekd.q;

public final class b implements b	// class@0019d6
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final View a(InAppNotification p0){
       View view;
       InAppImageView obj = null;
       Activity obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "8");
       if (obj1 != PatchProxyResult.class) {
          obj = obj1;
       }else {
          obj1 = ActivityContext.g().e();
          if (obj1 != null && !obj1.isFinishing()) {
             int i = 0x7f0d14d2;
             try{
                view = a.a(obj1, i);
             }catch(java.lang.Exception e0){
                Log.c("ShakeFriends", "createShakePushView errorCode", e0);
                view = obj;
             }
             if (view != null) {
                view.findViewById(R.id.btn).setText(p0.getBtnTxt());
                view.findViewById(R.id.title_tv).setText(p0.getTitle());
                view.findViewById(R.id.content_tv).setText(p0.getContent());
                obj = view.findViewById(R.id.avatar_iv);
                if (!q.f(p0.getLeftIcon())) {
                   obj.v(p0.getLeftIcon().get(0));
                }
                obj = view;
             }
          }
       }
       return obj;
    }
}
