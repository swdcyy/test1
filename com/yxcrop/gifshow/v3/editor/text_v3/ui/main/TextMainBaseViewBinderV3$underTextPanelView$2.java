package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$underTextPanelView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.view.ViewGroup$LayoutParams;

public final class TextMainBaseViewBinderV3$underTextPanelView$2 extends Lambda implements a	// class@000c3e
{
    public final TextMainBaseViewBinderV3 this$0;

    public void TextMainBaseViewBinderV3$underTextPanelView$2(TextMainBaseViewBinderV3 p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       TextMainBaseViewBinderV3$underTextPanelView$2 obj = PatchProxy.apply(objArray, this, TextMainBaseViewBinderV3$underTextPanelView$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       View view = PatchProxy.apply(objArray, obj, TextMainBaseViewBinderV3.class, "4");
       if (view != patchProxyRe) {
       }else {
          view = LayoutInflater.from(obj.t.requireContext()).inflate(R.layout.arg_RES_7f0d1647, objArray);
          a.o(view, "childView");
          FragmentActivity activity = obj.t.getActivity();
          a.m(activity);
          View view1 = activity.findViewById(0x1020002);
          a.o(view1, "fragment.activity!!.find¡­ew>\(android.R.id.content\)");
          view.setY((float)(view1.getHeight() - a1.e(362.00f)));
          view.setLayoutParams(new RelativeLayout$LayoutParams(-1, a1.e(362.00f)));
       }
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
