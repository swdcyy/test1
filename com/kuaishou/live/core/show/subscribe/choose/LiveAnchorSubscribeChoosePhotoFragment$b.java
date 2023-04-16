package com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribeChoosePhotoFragment$b;
import com.yxcorp.gifshow.fragment.e;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribeChoosePhotoFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveAnchorSubscribeChoosePhotoFragment$b extends e	// class@0010c6
{
    public final LiveAnchorSubscribeChoosePhotoFragment i;

    public void LiveAnchorSubscribeChoosePhotoFragment$b(LiveAnchorSubscribeChoosePhotoFragment p0,RecyclerFragment p1){
       this.i = p0;
       super(p1);
    }
    public KwaiEmptyStateView$a s(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, LiveAnchorSubscribeChoosePhotoFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.s();
       obj.k(R.drawable.arg_RES_7f0805f8);
       return obj;
    }
}
