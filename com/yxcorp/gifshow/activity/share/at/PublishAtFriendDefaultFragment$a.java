package com.yxcorp.gifshow.activity.share.at.PublishAtFriendDefaultFragment$a;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendDefaultFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import mkc.b;

public final class PublishAtFriendDefaultFragment$a extends f	// class@00136d
{
    public final PublishAtFriendDefaultFragment l;

    public void PublishAtFriendDefaultFragment$a(PublishAtFriendDefaultFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, PublishAtFriendDefaultFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.k(R.drawable.arg_RES_7f0805f6);
       obj.i(a1.p(R.string.arg_RES_7f104031));
       a.o(obj, "super.getEmptyConfigBuil¡­publish_page_no_friends\)\)");
       return obj;
    }
    public b r(){
       b obj = PatchProxy.apply(null, this, PublishAtFriendDefaultFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.f;
       a.o(obj, "TipsType.LOADING_DARK_COMPAT_GRAY");
       return obj;
    }
}
