package com.yxcorp.gifshow.fragment.PopupWindowFragment$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.fragment.PopupWindowFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PopupWindowFragment$a implements View$OnClickListener	// class@00126a
{
    public final PopupWindowFragment b;

    public void PopupWindowFragment$a(PopupWindowFragment p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PopupWindowFragment$a.class, "1")) {
          return;
       }
       if (this.b.sh()) {
          this.b.dismiss();
       }
       return;
    }
}
