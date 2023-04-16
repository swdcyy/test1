package com.kuaishou.live.lite.comment.view.CommentMessageListAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Number;
import java.util.Objects;
import java.util.Map;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.lite.comment.view.CommentItemViewHolder;
import androidx.lifecycle.MutableLiveData;
import android.view.ViewGroup;
import android.view.View;
import ha1.b;

public final class CommentMessageListAdapter extends ViewControllerAdapter	// class@000813
{
    public final ItemViewControllerFactory j;

    public void CommentMessageListAdapter(LifecycleOwner p0,Activity p1,ItemViewControllerFactory$a p2){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "itemViewControllerDependence");
       super(p0, p1);
       this.j = new ItemViewControllerFactory(p2);
    }
    public int f0(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CommentMessageListAdapter uCommentMess = CommentMessageListAdapter.class;
       if (PatchProxy.isSupport(uCommentMess)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uCommentMess, "3");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       uCommentMess = this.j;
       Class class = this.M0(p0).getClass();
       Objects.requireNonNull(uCommentMess);
       Object obj1 = PatchProxy.applyOneRefs(class, uCommentMess, ItemViewControllerFactory.class, "1");
       if (obj1 != patchProxyRe) {
          class = obj1.intValue();
       }else {
          a.p(class, "clazz");
          Integer integer = uCommentMess.a.get(class);
          if (integer != null) {
             integer = integer.intValue();
          }else {
             throw new RuntimeException(ItemViewControllerFactory.d+" getViewType comment message can not be recognized");
          }
       }
       return class;
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       if (!PatchProxy.isSupport(CommentMessageListAdapter.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, CommentMessageListAdapter.class, "2")) {
          a.p(p0, "holder");
          a.p(p2, "payloads");
          super.x0(p0, p1, p2);
          p0.g.setValue(Integer.valueOf(p1));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       CommentMessageListAdapter uCommentMess = CommentMessageListAdapter.class;
       if (PatchProxy.isSupport(uCommentMess)) {
          CommentItemViewHolder uCommentItem = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uCommentMess, "1");
          if (uCommentItem != PatchProxyResult.class) {
          label_003c :
             return uCommentItem;
          }
       }
       a.p(p0, "parent");
       View view = b.d(p0, R.layout.live_lite_comment_item_layout, false);
       a.o(view, "itemView");
       CommentItemViewHolder uCommentItem1 = new CommentItemViewHolder(view, this.N0(), this.K0(), this.j, p1);
       goto label_003c ;
    }
}
