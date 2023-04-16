package com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment$a;
import com.yxcorp.gifshow.fragment.f;
import com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class LiveUserListFragment$a extends f	// class@000f53
{
    public final LiveUserListFragment l;

    public void LiveUserListFragment$a(LiveUserListFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public View J0(){
       View obj = PatchProxy.apply(null, this, LiveUserListFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.J0();
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       LiveUserListFragment f = this.l.F;
       if (f != null) {
          if (f != 1) {
             if (f == 2) {
                uoa.h(R.string.arg_RES_7f1014cf);
                uoa.m(R.string.arg_RES_7f1003c0);
                uoa.k(R.drawable.arg_RES_7f0805d4);
             }else {
                throw new IllegalArgumentException("Illegal mode :"+this.l.F);
             }
          }else {
             uoa.h(R.string.arg_RES_7f10284e);
          }
       }else {
          uoa.h(R.string.arg_RES_7f100d23);
          uoa.k(R.drawable.arg_RES_7f0805f6);
       }
       uoa.a(obj);
       return obj;
    }
}
