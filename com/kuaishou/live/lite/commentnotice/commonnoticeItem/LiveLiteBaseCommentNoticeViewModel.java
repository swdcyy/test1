package com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewModel;
import yh3.a;
import ia3.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewModel$b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewModel$interactionStruct$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import e93.f;
import ga3.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewModel$a;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewModel$a$a;
import java.util.Queue;
import ga3.d;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewModel$a$b;
import ga3.e;
import qrd.l1;

public abstract class LiveLiteBaseCommentNoticeViewModel extends a	// class@000853
{
    public final c a;
    public final LiveData b;
    public final p c;
    public final b d;

    public void LiveLiteBaseCommentNoticeViewModel(b p0){
       a.p(p0, "delegate");
       super();
       this.d = p0;
       this.a = LiveLiteBaseCommentNoticeViewModel$b.b;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       this.c = s.c(new LiveLiteBaseCommentNoticeViewModel$interactionStruct$2(this));
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveLiteBaseCommentNoticeViewModel.class, "8")) {
          return;
       }
       super.onCleared();
       f.g(this);
       return;
    }
    public abstract a u0();
    public final a v0(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseCommentNoticeViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public void w0(LiveLiteBaseCommentNoticeViewModel$a p0){
       LiveLiteBaseCommentNoticeViewModel liveLiteBase = LiveLiteBaseCommentNoticeViewModel.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveLiteBase, "7")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof LiveLiteBaseCommentNoticeViewModel$a$a) {
          d uod = this.v0().a().poll();
          if (uod != null) {
             uod.a();
          }
          if (uod != null && uod.b == 1) {
             this.d.a(1);
          }
       }else if(a.g(p0, LiveLiteBaseCommentNoticeViewModel$a$b.a)){
          Object[] objArray = null;
          Object[] objArray1 = PatchProxy.apply(objArray, this, liveLiteBase, "5");
          if (objArray1 != PatchProxyResult.class) {
          }else {
             d uod1 = this.v0().a().peek();
             if (uod1 != null) {
                objArray = uod1.a;
             }
             objArray1 = objArray;
          }
          this.x0(objArray1);
       }
       return;
    }
    public final void x0(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseCommentNoticeViewModel.class, "6")) {
          return;
       }
       if (p0 == null) {
          this.d.c();
          return;
       }else {
          this.r0(this.b).setValue(p0);
          e f = p0.f;
          if (f != null) {
             l1 ol1 = f.invoke();
          }
          this.d.d(p0.e);
          return;
       }
    }
}
