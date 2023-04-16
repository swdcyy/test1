package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$k;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import android.widget.AbsoluteLayout;

public final class TextElementViewBinder$k implements Runnable	// class@001409
{
    public final TextElementViewBinder b;
    public final View c;

    public void TextElementViewBinder$k(TextElementViewBinder p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextElementViewBinder$k.class, "1")) {
          return;
       }
       n.C(this.b.I().getActivity());
       this.b.J().removeView(this.c);
       return;
    }
}
