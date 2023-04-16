package dac.a0;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendTabHostFragment;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import dac.b;
import brd.t;
import mrd.c;
import java.lang.Integer;
import brd.y;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import java.lang.String;
import android.os.Bundle;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.HorizontalScrollView;
import androidx.fragment.app.FragmentActivity;
import zf6.l;
import android.app.Activity;
import ekd.i;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class a0 implements Runnable	// class@00212f
{
    public final ExploreFriendTabHostFragment b;

    public void a0(ExploreFriendTabHostFragment p0){
       this.b = p0;
    }
    public final void run(){
       int color;
       boolean b;
       boolean b1;
       a0 tb = this.b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ContactPermissionHolder uContactPerm = ContactPermissionHolder.class;
       c uoc = tb.I.c.e();
       int i = 1;
       if (tb.I.c.c()) {
          uoc.onNext(Integer.valueOf(i));
          if (!tb.t() instanceof ExploreFriendContactFragment) {
             tb.Ih("contact", null);
             if (tb.Sh() && tb.Th()) {
                tb.Vh(R.color.arg_RES_7f061f54, 0x7f060ae6, tb.E, tb.F);
                color = tb.getResources().getColor(R.color.arg_RES_7f0617b3);
                tb.B.setBackgroundColor(color);
                tb.t.setBackgroundColor(color);
                i.a(tb.getActivity(), color, l.r());
             }
          }
          tb.I.b(false);
       }else {
          b c = tb.I.c;
          Objects.requireNonNull(c);
          Object obj = PatchProxy.apply(null, c, uContactPerm, "9");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(c.b() == 2){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             uoc.onNext(Integer.valueOf(2));
          }else {
             b c1 = tb.I.c;
             Objects.requireNonNull(c1);
             Object obj1 = PatchProxy.apply(null, c1, uContactPerm, "10");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(!c1.b()){
                i = 0;
             }
             b1 = i;
             if (b1) {
                uoc.onNext(Integer.valueOf(false));
             }
          }
       }
       return;
    }
}
