package com.kuaishou.live.lite.comment.view.CommentItemViewHolder;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import ba3.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.comment.view.CommentItemViewHolder$CommentItemViewHolderCaughtException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class CommentItemViewHolder extends ViewControllerAdapter$a	// class@00080f
{
    public final String f;
    public final MutableLiveData g;

    public void CommentItemViewHolder(View p0,LifecycleOwner p1,Activity p2,ItemViewControllerFactory p3,int p4){
       Lifecycle lifecycle;
       a.p(p0, "itemView");
       a.p(p1, "parentLifecycleOwner");
       a.p(p2, "activity");
       a.p(p3, "itemViewControllerFactory");
       super(p0, p1, p2);
       String str = "CommentItemViewHolder";
       this.f = str;
       MutableLiveData mutableLiveD = new MutableLiveData(Integer.valueOf(-1));
       try{
          this.g = mutableLiveD;
          lifecycle = p1.getLifecycle();
          a.o(lifecycle, "parentLifecycleOwner.lifecycle");
          b.Z(LiveLogTag.LIVE_LITE_COMMENT, str+" parentLifecycleOwner\("+p1+"\): "+lifecycle.getCurrentState()+' ');
          this.G8(R.id.live_lite_comment_item_container, p3.a(mutableLiveD, p4, this.b()));
       }catch(java.lang.Exception e4){
          Lifecycle lifecycle1 = p1.getLifecycle();
          a.o(lifecycle1, "parentLifecycleOwner.lifecycle");
          Lifecycle$State currentState = lifecycle1.getCurrentState();
          a.o(currentState, "parentLifecycleOwner.lifecycle.currentState");
          ExceptionHandler.handleCaughtException(new CommentItemViewHolder$CommentItemViewHolderCaughtException(currentState, e4));
       }
       return;
    }
}
