package eja.b$b;
import android.view.View$OnClickListener;
import eja.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.postwork.PostStatus;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import vja.c;
import uf5.x;
import n3d.a;

public final class b$b implements View$OnClickListener	// class@0026b2
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       boolean b;
       String str;
       b$b tb;
       GifshowActivity activity;
       b t;
       QPhoto mEntity;
       Object[] objArray1;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b q = this.b.q;
       if (q != null) {
          Object[] objArray = null;
          PhotoMeta mPostWorkSta = (q != null)? q.mPostWorkStatus: objArray;
          b = false;
          if (mPostWorkSta != null) {
             mPostWorkSta = (q != null)? q.mPostWorkStatus: objArray;
             if (mPostWorkSta != PostStatus.UPLOAD_COMPLETE) {
                str = null;
             label_002b :
                if (str) {
                   a.m(q);
                   String str1 = "mPhoto.mEntity";
                   if (!q.isLiked()) {
                      tb = this.b;
                      Objects.requireNonNull(tb);
                      if (!PatchProxy.applyVoid(objArray, tb, uob, "12")) {
                         activity = tb.getActivity();
                         String str2 = "";
                         t = tb.t;
                         if (t == null) {
                            a.S("mPhoto");
                         }
                         mEntity = t.mEntity;
                         a.o(mEntity, str1);
                         str2 = str2+c.a(mEntity)+"#like";
                         q = tb.t;
                         if (q == null) {
                            a.S("mPhoto");
                         }
                         new x(q, str2, "").a(activity, b);
                      }
                   }else {
                      tb = this.b;
                      Objects.requireNonNull(tb);
                      if (!PatchProxy.applyVoid(objArray, tb, uob, "13")) {
                         activity = tb.getActivity();
                         String str3 = "";
                         t = tb.t;
                         if (t == null) {
                            a.S("mPhoto");
                         }
                         mEntity = t.mEntity;
                         a.o(mEntity, str1);
                         str3 = str3+c.a(mEntity)+"#unlike";
                         q = tb.t;
                         if (q == null) {
                            a.S("mPhoto");
                         }
                         new x(q, str3, "").h(activity, objArray);
                      }
                   }
                }
             }
          }
          str = 1;
          goto label_002b ;
       }
    label_00c8 :
       return;
    }
}
