package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.lang.Object;
import tpc.e0$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.cover.proportion.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class VideoCoverProportionViewBinder$d implements Observer	// class@000ea2
{
    public final VideoCoverProportionViewBinder b;

    public void VideoCoverProportionViewBinder$d(VideoCoverProportionViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverProportionViewBinder$d.class, "1")) {
       }else if(this.b.J().getActivity() == null){
          if (TextUtils.x(p0.c()) || a.g(p0.c(), a1.p(0x7f10461f))) {
             uArrayList = new ArrayList();
          }else {
             String[] stringArray = new String[]{":"};
             uArrayList = StringsKt__StringsKt.H4(p0.c(), stringArray, false, 0, 6, null);
          }
          if (!this.b.F().getHeight()) {
             this.b.F().getViewTreeObserver().addOnGlobalLayoutListener(new b(this, uArrayList, p0));
          }else {
             this.b.D(uArrayList, p0.b());
          }
       }
       return;
    }
}
