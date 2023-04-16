package com.tencent.connect.auth.a$1;
import android.view.View$OnClickListener;
import com.tencent.connect.auth.a;
import java.lang.Object;
import android.view.View;
import com.tencent.connect.auth.a$b;

public class a$1 implements View$OnClickListener	// class@000e21
{
    public final a a;

    public void a$1(a p0){
       this.a = p0;
       super();
    }
    public void onClick(View p0){
       this.a.dismiss();
       if (!a.c(this.a) && a.f(this.a) != null) {
          a.f(this.a).onCancel();
       }
       return;
    }
}
