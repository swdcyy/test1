package com.yxcorp.gifshow.music.cloudmusic.common.category.a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter$b;
import com.yxcorp.gifshow.music.network.model.response.Channel;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter$c;

public class a extends m	// class@00200c
{
    public final Channel c;
    public final CategoryOptPresenter$b d;

    public void a(CategoryOptPresenter$b p0,Channel p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.d.f.a(this.c);
       return;
    }
}
