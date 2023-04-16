package com.facebook.react.modules.statusbar.StatusBarModule$b$a;
import android.view.View$OnApplyWindowInsetsListener;
import com.facebook.react.modules.statusbar.StatusBarModule$b;
import java.lang.Object;
import android.view.View;
import android.view.WindowInsets;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class StatusBarModule$b$a implements View$OnApplyWindowInsetsListener	// class@0012e2
{
    public final StatusBarModule$b b;

    public void StatusBarModule$b$a(StatusBarModule$b p0){
       this.b = p0;
       super();
    }
    public WindowInsets onApplyWindowInsets(View p0,WindowInsets p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StatusBarModule$b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       WindowInsets windowInsets = p0.onApplyWindowInsets(p1);
       return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }
}
