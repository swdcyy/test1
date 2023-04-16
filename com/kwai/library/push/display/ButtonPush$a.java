package com.kwai.library.push.display.ButtonPush$a;
import android.view.View$OnClickListener;
import com.kwai.library.push.display.ButtonPush;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.kwai.library.push.display.Push;
import java.lang.String;
import jy6.b;

public final class ButtonPush$a implements View$OnClickListener	// class@0008a7
{
    public final ButtonPush b;

    public void ButtonPush$a(ButtonPush p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       ButtonPush$a tb = this.b;
       Objects.requireNonNull(tb);
       Push.e(tb, "4", "2", false, 4, null);
       b uob = tb.g();
       if (uob != null) {
          uob.a(tb, "2");
       }
       return;
    }
}
