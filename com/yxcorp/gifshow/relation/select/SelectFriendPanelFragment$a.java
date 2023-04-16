package com.yxcorp.gifshow.relation.select.SelectFriendPanelFragment$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.relation.select.SelectFriendPanelFragment;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.view.ViewTreeObserver;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.res.Resources;
import cw9.c;

public class SelectFriendPanelFragment$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@001981
{
    public final FrameLayout b;
    public final SelectFriendPanelFragment c;

    public void SelectFriendPanelFragment$a(SelectFriendPanelFragment p0,FrameLayout p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, SelectFriendPanelFragment$a.class, "1")) {
          return;
       }
       if (this.c.isAdded()) {
          this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          RelativeLayout$LayoutParams layoutParams = this.b.getLayoutParams();
          layoutParams.height = c.b(this.c.getResources(), 0x7f070313);
          this.b.setLayoutParams(layoutParams);
       }
       return;
    }
}
