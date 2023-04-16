package com.tachikoma.core.component.button.TKButton$a;
import com.tachikoma.core.component.text.a$d;
import com.tachikoma.core.component.button.TKButton;
import java.lang.String;
import java.lang.Object;
import android.graphics.Typeface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import com.tachikoma.core.component.e;
import android.widget.TextView;
import com.tachikoma.core.component.TKBaseNativeModule;
import wo8.b;

public class TKButton$a implements a$d	// class@000d63
{
    public final String a;
    public final TKButton b;

    public void TKButton$a(TKButton p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(Typeface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKButton$a.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(this.a) && (this.a).equals(this.b.mFontFamily)) {
          TKButton$a tb = this.b;
          b.a(this.b.getView(), this.a, tb.mFontWeight, tb.mFontStyle, tb.getRootDir());
       }
       return;
    }
}
