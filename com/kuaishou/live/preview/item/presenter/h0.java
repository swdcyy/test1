package com.kuaishou.live.preview.item.presenter.h0;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.user.User;

public final class h0 implements KSTextDisplayHandler$a	// class@000e26
{
    public static final h0 a;

    static {
       h0.a = new h0();
    }
    public void h0(){
       super();
    }
    public final String a(String p0,User p1){
       Object[] objArray = new Object[]{"{user_id}"};
       return String.format("at_%s", objArray);
    }
}
