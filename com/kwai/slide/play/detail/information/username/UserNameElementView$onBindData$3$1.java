package com.kwai.slide.play.detail.information.username.UserNameElementView$onBindData$3$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import sr7.i;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import sr7.q;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.a;
import android.widget.TextView;

public final class UserNameElementView$onBindData$3$1 extends Lambda implements a	// class@00180f
{
    public final i this$0;

    public void UserNameElementView$onBindData$3$1(i p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       AppCompatTextView obj = PatchProxy.apply(null, this, UserNameElementView$onBindData$3$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.b.v(R.id.co_create_text);
       a.o(obj, "co_create_text");
       boolean b = (!obj.getVisibility())? true: false;
       return b;
    }
}
