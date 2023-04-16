package com.yxcorp.gifshow.activity.BasePostActivity$a;
import lq.l;
import com.yxcorp.gifshow.activity.BasePostActivity;
import java.lang.Object;
import lq.l$a;
import lq.j;
import lq.i;
import java.util.Collection;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mm6.d;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.activity.x;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import w46.b;
import java.util.Iterator;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.a;

public class BasePostActivity$a implements l	// class@001332
{
    public final BasePostActivity a;

    public void BasePostActivity$a(BasePostActivity p0){
       this.a = p0;
       super();
    }
    public void a(l$a p0){
       j.a(this, p0);
    }
    public void b(i p0,boolean p1){
       j.c(this, p0, p1);
    }
    public void c(){
       j.b(this);
    }
    public void d(i p0){
       j.d(this, p0);
    }
    public void e(i p0,Collection p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BasePostActivity$a.class, "1")) {
          return;
       }
       String str = this.a.o();
       int i = 0;
       if (TextUtils.x(str) && this.a instanceof d) {
          Object[] objArray = new Object[i];
          a.D().w("BasePostActivity", "onSetDrafts\(\): getPage2 is empty, + ILogPage = "+this.toString(), objArray);
          str = this.a.G();
       }
       if (TextUtils.x(str)) {
          str = this.a.N2().o();
          Object[] objArray1 = new Object[i];
          a.D().w("BasePostActivity", "onSetDrafts\(\): getPage2 is empty, getKwaiPageLogger\(\).getPage2\(\) = "+str, objArray1);
       }
       String str1 = b.a(0x4b316083).h1(str, null);
       if (TextUtils.x(str1)) {
          Object[] objArray2 = new Object[i];
          a.D().w("BasePostActivity", "onSetDrafts\(\): userTraceInfo is empty, page2String = "+str+"ILogPage = "+this.toString(), objArray2);
          return;
       }else if(this.a.D == null){
          Object[] objArray3 = new Object[i];
          a.D().t("BasePostActivity", "onSetDrafts\(\): postSession is null", objArray3);
          return;
       }else {
          Object[] objArray4 = new Object[i];
          a.D().w("BasePostActivity", "userTraceInfo = "+str1, objArray4);
          String str2 = "USER_TRACE_INFO_KEY";
          if (TextUtils.x(this.a.D.z(str2))) {
             this.a.D.Q(str2, str1);
          }
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             if (TextUtils.x(uoc.d1().F().a.n)) {
                uoc.n = str1;
             }
          }
          return;
       }
    }
}
