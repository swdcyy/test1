package com.yxcorp.gifshow.growth.quicksetting.a;
import w96.a$b;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class a implements a$b	// class@0014ba
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final String a(Intent p0){
       String stringExtra = (p0 != null && !TextUtils.x(p0.getStringExtra("KEY_INTENT_GROWTH_SOURCE_HANDLER")))? p0.getStringExtra("KEY_INTENT_GROWTH_SOURCE_HANDLER"): null;
       return stringExtra;
    }
}
