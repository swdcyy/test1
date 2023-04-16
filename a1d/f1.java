package a1d.f1;
import n3d.a;
import a1d.j1;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import android.os.Bundle;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.login.http.response.AuthInfoResponse$UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.yxcorp.login.http.response.AuthInfoResponse;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import java.util.ArrayList;
import com.yxcorp.login.authorization.mode.AuthEvent;
import io.reactivex.subjects.PublishSubject;

public final class f1 implements a	// class@000023
{
    public final j1 b;

    public void f1(j1 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       f1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == -1 && p2 != null) {
          Bundle extras = p2.getExtras();
          if (extras != null) {
             AuthInfoResponse$UserInfo serializable = SerializableHook.getSerializable(extras, "key_result_new_user_info");
             if (!PatchProxy.applyVoidOneRefs(serializable, tb, j1.class, "9") && serializable != null) {
                Iterator iterator = tb.p.get().mScopeList.iterator();
                while (iterator.hasNext()) {
                   AuthInfoResponse$Scope scope = iterator.next();
                   if ((tb.r.get()).equals(scope.mScope)) {
                      scope.mUserInfoList.add(serializable);
                      iterator = scope.mUserInfoList.iterator();
                      while (iterator.hasNext()) {
                         AuthInfoResponse$UserInfo userInfo = iterator.next();
                         if (userInfo.equals(serializable)) {
                            userInfo.isSelected = true;
                         }else {
                            userInfo.isSelected = false;
                            continue ;
                         }
                      }
                      tb.q.onNext(AuthEvent.REFRESH_LIST);
                      tb.P8();
                   }
                }
             }
          }
       }
       return;
    }
}
