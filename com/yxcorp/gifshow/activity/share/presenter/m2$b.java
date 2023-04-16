package com.yxcorp.gifshow.activity.share.presenter.m2$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.share.presenter.m2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.share.presenter.c0;
import com.yxcorp.gifshow.entity.QPhoto;
import e46.b;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import vw8.a;

public class m2$b extends m	// class@001404
{
    public final m2 c;

    public void m2$b(m2 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m2$b.class, "1")) {
          return;
       }
       if (b.a(this.c.G) && !a.p0()) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("reedit_music_red_dot", true);
          g.a(uEditor);
          this.c.u.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
       }
       a.s(this.c.G);
       this.c.k9();
       return;
    }
}
