package com.heytap.mcssdk.b.a$1;
import java.lang.Runnable;
import com.heytap.mcssdk.b.a;
import android.content.Context;
import java.lang.Object;
import com.heytap.mcssdk.utils.e;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public class a$1 implements Runnable	// class@000524
{
    public final Context a;
    public final a b;

    public void a$1(a p0,Context p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (e.f().a()) {
          return;
       }
       String str = this.a.getString(R.string.arg_RES_7f104b81);
       if (TextUtils.isEmpty(str)) {
          str = "System Default Channel";
       }
       e.f().a(a.a(this.b, this.a, "Heytap PUSH", str, 3));
       return;
    }
}
