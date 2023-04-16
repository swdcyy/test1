package com.yxcorp.login.util.q;
import ta6.j;
import java.lang.Object;
import java.util.Map;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class q implements j	// class@0013a7
{
    public static final q a;

    static {
       q.a = new q();
    }
    public void q(){
       super();
    }
    public final void a(Map p0){
       String preUserId = QCurrentUser.me().getPreUserId();
       if (!TextUtils.x(preUserId)) {
          p0.put("pUid", preUserId);
       }else {
          p0.remove("pUid");
       }
       return;
    }
}
