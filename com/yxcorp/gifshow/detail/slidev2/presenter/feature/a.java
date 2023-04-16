package com.yxcorp.gifshow.detail.slidev2.presenter.feature.a;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.b;

public final class a implements KSTextDisplayHandler$a	// class@001937
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final String a(String p0,User p1){
       Object[] objArray = new Object[]{"{user_id}"};
       return String.format("at_%s", objArray);
    }
}
