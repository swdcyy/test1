package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$d;
import java.lang.Runnable;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;

public final class UserListBubble$d implements Runnable	// class@001a14
{
    public final View b;
    public final ViewTreeObserver$OnGlobalLayoutListener c;

    public void UserListBubble$d(View p0,ViewTreeObserver$OnGlobalLayoutListener p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, UserListBubble$d.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this.c);
       return;
    }
}
