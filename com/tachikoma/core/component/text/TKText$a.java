package com.tachikoma.core.component.text.TKText$a;
import ip8.d;
import com.tachikoma.core.component.text.TKText;
import java.lang.Object;
import android.text.SpannableString;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKText$a implements d	// class@000d90
{
    public final TKText a;

    public void TKText$a(TKText p0){
       this.a = p0;
       super();
    }
    public void a(SpannableString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText$a.class, "1")) {
          return;
       }
       TKText$a ta = this.a;
       ta.mRichTextSpannableString = p0;
       ta.setRichTextSpannableString(p0);
       return;
    }
}
