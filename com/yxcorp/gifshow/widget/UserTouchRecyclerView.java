package com.yxcorp.gifshow.widget.UserTouchRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView$onScrollListenerList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView$mHandler$2;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.os.Handler;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView$a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView$b;
import android.view.View$OnTouchListener;
import android.view.ViewGroup;

public class UserTouchRecyclerView extends RecyclerView	// class@0018e5
{
    public final p b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final p g;
    public HashMap h;

    public void UserTouchRecyclerView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = s.c(UserTouchRecyclerView$onScrollListenerList$2.INSTANCE);
       this.g = s.c(new UserTouchRecyclerView$mHandler$2(this));
       this.y(p0);
    }
    public void UserTouchRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = s.c(UserTouchRecyclerView$onScrollListenerList$2.INSTANCE);
       this.g = s.c(new UserTouchRecyclerView$mHandler$2(this));
       this.y(p0);
    }
    public void UserTouchRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = s.c(UserTouchRecyclerView$onScrollListenerList$2.INSTANCE);
       this.g = s.c(new UserTouchRecyclerView$mHandler$2(this));
       this.y(p0);
    }
    public final void A(int p0,int p1){
       if (PatchProxy.isSupport(UserTouchRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, UserTouchRecyclerView.class, "8")) {
          return;
       }
       this.smoothScrollBy((p0 - this.computeHorizontalScrollOffset()), (p1 - this.computeVerticalScrollOffset()));
       return;
    }
    public final Handler getMHandler(){
       Object obj = PatchProxy.apply(null, this, UserTouchRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final List getOnScrollListenerList(){
       Object obj = PatchProxy.apply(null, this, UserTouchRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, UserTouchRecyclerView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       this.getMHandler().removeMessages(100);
       return;
    }
    public void onScrollStateChanged(int p0){
       if (PatchProxy.isSupport(UserTouchRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, UserTouchRecyclerView.class, "4")) {
          return;
       }
       super.onScrollStateChanged(p0);
       Iterator iterator = this.getOnScrollListenerList().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this.c, p0);
       }
       this.z();
       return;
    }
    public void onScrolled(int p0,int p1){
       if (PatchProxy.isSupport(UserTouchRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, UserTouchRecyclerView.class, "5")) {
          return;
       }
       super.onScrolled(p0, p1);
       Object[] objArray = new Object[0];
       a.D().s("SubtitlePanelListVB", "view dy: "+p1+' '+"offsetY: "+this.computeVerticalScrollOffset(), objArray);
       Iterator iterator = this.getOnScrollListenerList().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.c, this.computeHorizontalScrollOffset(), this.computeVerticalScrollOffset());
       }
       this.z();
       return;
    }
    public void scrollTo(int p0,int p1){
       if (PatchProxy.isSupport(UserTouchRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, UserTouchRecyclerView.class, "7")) {
          return;
       }
       super.scrollTo(p0, p1);
       this.scrollBy((p0 - this.computeHorizontalScrollOffset()), (p1 - this.computeVerticalScrollOffset()));
       return;
    }
    public final void x(UserTouchRecyclerView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserTouchRecyclerView.class, "10")) {
          return;
       }
       a.p(p0, "listener");
       this.getOnScrollListenerList().add(p0);
       return;
    }
    public void y(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserTouchRecyclerView.class, "3")) {
          return;
       }
       a.p(p0, "context");
       this.setOnTouchListener(new UserTouchRecyclerView$b(this));
       return;
    }
    public final void z(){
       if (PatchProxy.applyVoid(null, this, UserTouchRecyclerView.class, "9")) {
          return;
       }
       this.getMHandler().removeMessages(100);
       this.getMHandler().sendEmptyMessageDelayed(100, 80);
       return;
    }
}
