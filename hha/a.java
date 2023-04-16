package hha.a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import hha.b;
import java.util.Objects;
import android.content.Intent;
import android.net.Uri;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.j0;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Exception;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import android.content.Context;
import o56.f;

public class a implements ActivityContext$b	// class@001758
{

    public void a(){
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       a.d(this, p0);
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       b uob = b.a(-713764853);
       Objects.requireNonNull(uob);
       b uob1 = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, uob, uob1, "10") || (p0 != null && p0.getIntent() != null)) {
          if (p0.getIntent().getData() != null && p0.getIntent().getData().isHierarchical()) {
             Uri data = p0.getIntent().getData();
             Intent intent = p0.getIntent();
             Object obj = PatchProxy.applyTwoRefs(intent, data, uob, uob1, "11");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(j0.g(intent, "provider")){
                if (!uob.h(data)) {
                   Uri uri = PatchProxy.applyOneRefs(data, uob, uob1, "14");
                   if (uri != PatchProxyResult.class) {
                   }else {
                      try{
                         String str = "backUri";
                         if (!TextUtils.x(x0.a(data, str))) {
                            uri = Uri.parse(x0.a(data, str));
                         }
                      }catch(java.lang.Exception e8){
                         e8.printStackTrace();
                      }
                      uri = null;
                   }
                   if (!uob.h(uri)) {
                      uri = PatchProxy.applyOneRefs(data, uob, uob1, "12");
                      b = (uri != PatchProxyResult.class)? uri.booleanValue(): (data.toString()).contains("/home/following");
                      if (!b) {
                      label_00bb :
                         b = false;
                      }
                   }
                }
             label_00b9 :
                b = true;
             }else {
                goto label_00bb ;
             }
             if (b) {
                c.i(KsLogFollowTag.FOLLOW_VISIT.appendTag("FollowVisitSourceManagerImpl"), "visitSourcePush");
                uob.a(1);
             }else if(TextUtils.n("1", x0.a(data, "isFollowPush"))){
                uob.d = true;
             }
          }else if(f.b(p0)){
             uob.c = true;
          }
       }
       return;
    }
    public void onBackground(){
       a.e(this);
    }
    public void onForeground(){
       a.f(this);
    }
}
