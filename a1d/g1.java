package a1d.g1;
import n3d.a;
import a1d.j1;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import android.os.Bundle;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.login.http.response.AuthInfoResponse$PhoneNum;
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

public final class g1 implements a	// class@000026
{
    public final j1 b;

    public void g1(j1 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       g1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == -1 && p2 != null) {
          Bundle extras = p2.getExtras();
          if (extras != null) {
             AuthInfoResponse$PhoneNum serializable = SerializableHook.getSerializable(extras, "key_result_new_phone_num");
             if (!PatchProxy.applyVoidOneRefs(serializable, tb, j1.class, "10") && serializable != null) {
                Iterator iterator = tb.p.get().mScopeList.iterator();
                while (iterator.hasNext()) {
                   AuthInfoResponse$Scope scope = iterator.next();
                   if ((tb.r.get()).equals(scope.mScope)) {
                      scope.mPhoneNumList.add(serializable);
                      iterator = scope.mPhoneNumList.iterator();
                      while (iterator.hasNext()) {
                         AuthInfoResponse$PhoneNum phoneNum = iterator.next();
                         if (phoneNum.equals(serializable)) {
                            phoneNum.isSelected = true;
                         }else {
                            phoneNum.isSelected = false;
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
