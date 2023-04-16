package com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment$d;
import android.content.DialogInterface$OnKeyListener;
import com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment$b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public final class ShareDialogContainerFragment$d implements DialogInterface$OnKeyListener	// class@0014aa
{
    public final ShareDialogContainerFragment b;

    public void ShareDialogContainerFragment$d(ShareDialogContainerFragment p0){
       this.b = p0;
       super();
    }
    public final boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(ShareDialogContainerFragment$d.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, ShareDialogContainerFragment$d.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       a.p(p2, "event");
       if (p1 == 4) {
          if (!p2.getAction()) {
             p0.v = true;
          }else if(p2.getAction() == 1){
             ShareDialogContainerFragment$d tb = this.b;
             if (tb.v != null) {
                ShareDialogContainerFragment t = tb.t;
                if (t != null) {
                   a.m(t);
                   if (t.a()) {
                      return true;
                   }
                }
                c childFragmen = this.b.getChildFragmentManager();
                a.o(childFragmen, "childFragmentManager");
                if (childFragmen.getBackStackEntryCount() > 0) {
                   try{
                      this.b.getChildFragmentManager().popBackStackImmediate();
                      return true;
                   }catch(java.lang.IllegalStateException e0){
                   }
                }
             }
          }
       }
       return false;
    }
}
