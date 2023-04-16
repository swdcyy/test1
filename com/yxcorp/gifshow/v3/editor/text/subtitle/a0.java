package com.yxcorp.gifshow.v3.editor.text.subtitle.a0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import k2b.e0;
import java.lang.Integer;
import k2b.s;
import a17.c$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a17.g;
import lnc.a1;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import java.util.List;
import java.util.Collections;
import com.yxcorp.gifshow.v3.editor.text.subtitle.c0;
import a17.b$b;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class a0 implements View$OnClickListener	// class@00148f
{
    public final SubtitleTextPresenter b;

    public void a0(SubtitleTextPresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, SubtitleTextPresenter.class, "18")) {
       }else {
          s.j("835", tb.H.getActivity(), 404, "clear_subtitle", objArray);
          c$a uoa = new c$a(tb.getActivity());
          uoa.l0(R.string.arg_RES_7f104b18);
          uoa.j0(Collections.singletonList(new g(a1.p(R.string.arg_RES_7f104b19), SheetItemStatus.Primary)));
          uoa.g0(R.string.cancel);
          uoa.i0(new c0(tb));
          c$a uoa1 = f.a(uoa);
          uoa1.Y(PopupInterface.a);
       }
       return;
    }
}
