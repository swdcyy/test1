package com.yxcorp.gifshow.visible.ShareVisibleViewModel$d;
import n3d.a;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.os.Parcelable;
import org.parceler.b;
import java.util.Set;
import java.util.Collection;
import java.util.List;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;

public final class ShareVisibleViewModel$d implements a	// class@0016be
{
    public final ShareVisibleViewModel b;

    public void ShareVisibleViewModel$d(ShareVisibleViewModel p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(ShareVisibleViewModel$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ShareVisibleViewModel$d.class, "1")) {
          return;
       }
       if (p1 == -1 && p2 != null) {
          Set set = b.a(p2.getParcelableExtra("key_select_users_result_data"));
          if (set != null && (set.isEmpty() ^ 0x01)) {
             ShareVisibleViewModel.y0(this.b, PhotoVisibility.PART_VISIBLE, this.b.t0(set), false, 4, null);
          }else {
             ShareVisibleViewModel.y0(this.b, PhotoVisibility.PUBLIC, null, false, 4, null);
          }
       }else {
          this.b.p0().setValue(Boolean.TRUE);
       }
       return;
    }
}
