package com.kuaishou.live.common.core.component.comments.fluency.quick.f;
import te1.b;
import android.content.Context;
import g81.c;
import ft5.b;
import i81.g;
import java.lang.Object;
import gf1.f;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened;
import ekd.j;
import com.kuaishou.live.common.core.component.comments.fluency.quick.LiveQuickCommentContainerView;
import gf1.d;
import gf1.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.lang.Long;
import java.lang.Runnable;
import android.widget.LinearLayout;
import te1.a;
import android.view.MotionEvent;
import te1.d;
import ft5.d;

public class f implements b	// class@00108f
{
    public final Context a;
    public f$a b;
    public f$b c;
    public final f d;

    public void f(Context p0,c p1,b p2,g p3,boolean p4){
       super();
       this.a = p0;
       this.d = new f(p1, p2, p3, p4);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       f td = this.d;
       Objects.requireNonNull(td);
       f uof = f.class;
       if (!PatchProxy.applyVoid(null, td, uof, "4")) {
          td.a = false;
          if (td.b != null && (!PatchProxy.applyVoid(null, td, uof, "6") && td.d == null)) {
             uof = td.c;
             if (uof > null) {
                td.c(uof);
             }
          }
       }
       return;
    }
    public View b(Object p0){
       LiveQuickCommentContainerView obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = null;
       if (!p0 instanceof LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened) {
          return view;
       }
       if (j.h(p0.comment)) {
          return view;
       }
       obj = new LiveQuickCommentContainerView(this.a);
       obj.e = new d(this, p0);
       obj.d = new e(this, p0);
       ArrayList uArrayList = new ArrayList(Arrays.asList(p0.comment));
       Collections.shuffle(uArrayList);
       LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened slideInterna = p0.slideInternalMs;
       if (!PatchProxy.isSupport(LiveQuickCommentContainerView.class) || !PatchProxy.applyVoidTwoRefs(uArrayList, Long.valueOf(slideInterna), obj, LiveQuickCommentContainerView.class, "4")) {
          obj.a();
          obj.f.addAll(uArrayList);
          obj.b = slideInterna;
          if (obj.f.size()) {
             obj.post(obj.g);
          }
       }
       return obj;
    }
    public void c(Object p0){
       a.d(this, p0);
    }
    public void d(Object p0){
       a.a(this, p0);
    }
    public void e(Object p0,MotionEvent p1){
       a.c(this, p0, p1);
    }
    public void f(d p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
          return;
       }
       f td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(null, td, f.class, "3")) {
          td.a = true;
          td.b();
       }
       return;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "4")) {
          return;
       }
       f td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, f.class, "2")) {
          f g = td.g;
          if (g != null) {
             g.Yj(td.h);
          }
       }
       return;
    }
}
