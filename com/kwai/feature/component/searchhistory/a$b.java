package com.kwai.feature.component.searchhistory.a$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.component.searchhistory.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g06.a;
import android.view.View$OnClickListener;
import ekd.m1;

public class a$b extends PresenterV2	// class@001297
{
    public final a p;

    public void a$b(a p0){
       this.p = p0;
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       m1.a(p0, new a(this), R.id.item_root);
       return;
    }
}
