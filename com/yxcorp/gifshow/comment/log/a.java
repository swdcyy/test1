package com.yxcorp.gifshow.comment.log.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.util.ArrayList;
import oe6.b;
import java.lang.StringBuilder;
import java.lang.String;
import km8.b;
import android.content.SharedPreferences;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import g9c.d;
import java.lang.Math;
import y8c.g;
import g9c.a;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import k2b.k;
import java.util.Objects;
import k2b.j;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.v;
import android.os.SystemClock;
import java.util.Iterator;
import java.lang.Long;
import java.lang.IllegalStateException;

public class a	// class@0010e1
{
    public final RecyclerFragment a;
    public int b;
    public boolean c;
    public boolean d;
    public QPhoto e;
    public int f;
    public List g;
    public boolean h;
    public List i;
    public boolean j;

    public void a(RecyclerFragment p0,QPhoto p1){
       super();
       this.b = -1;
       this.f = -1;
       this.g = new ArrayList();
       this.h = true;
       this.i = new ArrayList();
       this.j = true;
       this.a = p0;
       boolean booleanx = b.a.getBoolean(b.d("user")+"enable_comment_show_upload", false);
       this.c = booleanx;
       if (booleanx) {
          this.e = p1;
       }
       return;
    }
    public List a(){
       return this.g;
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.max((this.a.h0().getLayoutManager().h() - this.a.ia().b1()), 0);
    }
    public final int c(){
       Object obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.min((this.a.h0().getLayoutManager().E() - this.a.ia().b1()), (this.a.g7().getItemCount() - 1));
    }
    public boolean d(QComment p0){
       boolean b = true;
       if (p0 != null) {
          p0 = p0.mType;
          if (p0 == b || (p0 == 2 || p0 == 10)) {
             b = false;
          }
       }
       return b;
    }
    public void e(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "9")) {
          return;
       }
       if (this.j == null) {
          return;
       }
       if (this.a.h0().getLayoutManager().h()) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "10")) {
          int i = this.b();
          int i1 = this.c();
          while (i <= i1) {
             QComment qComment = this.a.g7().N0(i);
             if (!this.d(qComment)) {
                qComment.mIsShowedByDefault = true;
             }
             i = i + 1;
          }
          this.j = false;
       }
       return;
    }
    public void f(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       int i = this.c();
       int i1 = this.b();
       a tb = this.b;
       if (i > tb || i1 < this.f) {
          this.b = Math.max(i, tb);
          this.f = Math.min(i1, this.f);
          if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
             uoa = this.f;
             a tb1 = this.b;
             if (uoa <= tb1 && tb1 >= null) {
                int i2 = Math.max(uoa, 0);
                while (i2 <= this.b) {
                   if (i2 >= 0 && i2 < this.a.g7().getItemCount()) {
                      QComment qComment = this.a.g7().N0(i2);
                      if (!this.d(qComment) && qComment.getEntity().mShown == null) {
                         this.g.add(qComment);
                         if (this.c != null) {
                            k ok = k.l();
                            a te = this.e;
                            Objects.requireNonNull(ok);
                            k ok1 = k.class;
                            if (!PatchProxy.applyVoidTwoRefs(te, qComment, ok, ok1, "2") && !PatchProxy.applyVoidTwoRefs(te, qComment, ok, ok1, "3")) {
                               ok.f(new j(ok, qComment, te));
                            }
                         }
                         qComment.getEntity().mShown = true;
                      }
                   }
                   i2 = i2 + 1;
                }
             }
          }
       }
       this.j();
       return;
    }
    public void g(){
       this.b = -1;
    }
    public void h(boolean p0){
       this.d = p0;
    }
    public final void i(){
       long l1;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "12")) {
          return;
       }
       if (this.i.isEmpty()) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       Iterator iterator = this.i.iterator();
       while (true) {
          if (iterator.hasNext()) {
             QComment qComment = iterator.next();
             if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(qComment, Long.valueOf(l), this, uoa, "13")) {
                continue ;
             }else {
                QComment mLastVisible = qComment.mLastVisibleTimeStamp;
                if (mLastVisible <= 0) {
                   continue ;
                }else {
                   l1 = l - mLastVisible;
                   if (l1 >= 0) {
                      long l2 = qComment.mShowedTimeMs + l1;
                      qComment.mShowedTimeMs = l2;
                      qComment.mLastVisibleTimeStamp = 0;
                   }else {
                      break ;
                   }
                }
             }
          }else {
             this.i.clear();
             return;
          }
       }
       throw new IllegalStateException("Strange duration is "+l1);
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       this.i();
       int i = this.b();
       int i1 = this.c();
       while (i <= i1) {
          QComment qComment = this.a.g7().N0(i);
          if (!this.d(qComment)) {
             qComment.mLastVisibleTimeStamp = l;
             this.i.add(qComment);
          }
          i = i + 1;
       }
       return;
    }
}
