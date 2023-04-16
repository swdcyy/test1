package com.yxcorp.login.userlogin.presenter.kwaiapplogin.FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.FollowKwaiAppShareLoginPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$1 extends FunctionReferenceImpl implements l	// class@001bbd
{

    public void FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$1(FollowKwaiAppShareLoginPresenter p0){
       super(1, p0, FollowKwaiAppShareLoginPresenter.class, "handleSuccess", "handleSuccess\(Lcom/yxcorp/gifshow/model/response/login/LoginUserResponse;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LoginUserResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$1.class, "1")) {
          return;
       }
       this.receiver.h(p0);
       return;
    }
}
