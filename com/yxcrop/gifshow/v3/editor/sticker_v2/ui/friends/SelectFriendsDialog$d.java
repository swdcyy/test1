package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$d;
import com.yxcorp.gifshow.fragment.f;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog;
import com.kwai.library.widget.refresh.RefreshLayout;
import g9c.d;
import qvb.i;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import kotlin.jvm.internal.a;

public final class SelectFriendsDialog$d extends f	// class@000aac
{
    public final SelectFriendsDialog l;

    public void SelectFriendsDialog$d(SelectFriendsDialog p0,RefreshLayout p1,d p2,i p3,boolean p4){
       this.l = p0;
       super(p1, p2, p3, p4);
    }
    public KwaiEmptyStateView$a a(){
       SelectFriendsDialog obj = PatchProxy.apply(null, this, SelectFriendsDialog$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l.A;
       if (obj != null) {
          obj.setVisibility(8);
       }
       KwaiEmptyStateView$a uoa = super.a();
       uoa.k(R.drawable.arg_RES_7f0805ea);
       uoa.d();
       uoa.m(R.string.arg_RES_7f1016e2);
       a.o(uoa, "super.getEmptyConfigBuil¡­ve_sticker_friends_empty\)");
       return uoa;
    }
}
