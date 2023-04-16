package com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$f;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment;
import com.kwai.library.widget.refresh.RefreshLayout;
import g9c.d;
import qvb.i;
import mkc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class ShareCopyWritingListFragment$f extends f	// class@001385
{
    public final ShareCopyWritingListFragment l;

    public void ShareCopyWritingListFragment$f(ShareCopyWritingListFragment p0,RefreshLayout p1,d p2,i p3,boolean p4){
       this.l = p0;
       super(p1, p2, p3, p4);
    }
    public b r(){
       b obj = PatchProxy.apply(null, this, ShareCopyWritingListFragment$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.f;
       a.o(obj, "TipsType.LOADING_DARK_COMPAT_GRAY");
       return obj;
    }
}
