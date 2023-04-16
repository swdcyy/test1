package com.yxcorp.gifshow.visible.PhotoVisibilityController$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.visible.PhotoVisibilityController;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel;

public class PhotoVisibilityController$a extends m	// class@0016b0
{
    public final PhotoVisibilityController c;

    public void PhotoVisibilityController$a(PhotoVisibilityController p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       PhotoVisibilityController$a tc;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoVisibilityController$a.class, "1")) {
          return;
       }
       if (this.c.a() == PhotoVisibility.PART_VISIBLE && !this.c.g.a()) {
          tc = this.c;
          tc.k.w0(tc.j);
       }else if(this.c.a() == PhotoVisibility.PART_INVISIBLE){
          tc = this.c;
          tc.k.v0(tc.j);
       }
       return;
    }
}
