package com.yxcorp.plugin.search.result.reduce.presenter.b$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.plugin.search.result.reduce.presenter.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Editable;
import android.widget.EditText;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import nfd.g0;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.plugin.search.utils.f0$c;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.utility.n;

public class b$b extends m	// class@00232d
{
    public final b c;

    public void b$b(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       g0.s0(this.c.getActivity()).H0(this.c.p.getText().toString());
       b$b tc = this.c;
       tc.w.c(tc.s.getText().toString());
       this.c.v.q(4);
       n.C(this.c.getActivity());
       return;
    }
}
