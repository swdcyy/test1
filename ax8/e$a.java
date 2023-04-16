package ax8.e$a;
import d36.d;
import ax8.e;
import java.lang.Object;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.View;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$EntranceInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Objects;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel$UserInfo;
import android.widget.EditText;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import xw8.p0;
import io.reactivex.subjects.PublishSubject;
import lq.i;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.PostPageArg;
import java.lang.Boolean;
import d36.d$a;
import ax8.e$a$a;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkPhotoParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.View$OnClickListener;
import ax8.d;
import android.widget.FrameLayout;

public class e$a implements d	// class@00032e
{
    public final boolean a;
    public final e b;

    public void e$a(e p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(UpdateShareBusinessLinkModel p0){
       e b1;
       e u;
       String str2;
       Iterator iterator;
       StringBuilder str4;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e$a.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.b().w("ShareProducerPresenter", "setServiceLinkData\(\) "+obj1+" mShareBusinessLinkInfo="+obj.b.B+" mIsImmutablePreSelect="+obj.b.p, objArray);
       e$a b = obj.b;
       if (b.p != null) {
          b.A.setVisibility(8);
       }
       String str = null;
       if (obj1 == null) {
          b = obj.b;
          b1 = b.B;
          if (b1 != null) {
             ShareBusinessLinkInfo mEntrance = b1.mEntrance;
             if (mEntrance != null) {
                b.y.setText(mEntrance.mPlaceHolder);
             }
          }
       }else {
          obj.b.y.setText(obj1.mMetaText);
          e$a b2 = obj.b;
          Objects.requireNonNull(b2);
          String str1 = PatchProxy.apply(str, b2, e.class, "7");
          if (str1 != PatchProxyResult.class) {
          }else {
             u = b2.r;
             if (u != null && u.getText() != null) {
                str1 = b2.r.getText().toString();
             }else {
                str2 = "";
             label_009d :
                e d = obj.b.D;
                Objects.requireNonNull(b2);
                e uoe = d;
                e uoe1 = d;
                if (!PatchProxy.applyVoidThreeRefs(str2, p0, uoe, b2, e.class, "3")) {
                   StringBuilder obj2 = PatchProxy.applyTwoRefs(str2, uoe1, b2, e.class, "4");
                   if (obj2 != PatchProxyResult.class) {
                      str2 = obj2;
                   }else {
                      Iterator iterator1 = uoe1.iterator();
                      while (iterator1.hasNext()) {
                         str2 = str2.replace(iterator1.next(), "");
                      }
                   }
                   uoe1.clear();
                   str1 = PatchProxy.applyThreeRefs(str2, p0, uoe1, b2, e.class, "5");
                   if (str1 != PatchProxyResult.class) {
                   }else {
                      str1 = str2;
                      UpdateShareBusinessLinkModel mTopics = obj1.mTopics;
                      String str3 = " ";
                      if (!q.f(mTopics)) {
                         iterator = mTopics.iterator();
                         while (iterator.hasNext()) {
                            str4 = "#"+iterator.next()+str3;
                            obj2 = str1+str4;
                            uoe1.add(str4);
                         }
                      }
                      mTopics = obj1.mAtFriends;
                      if (!q.f(mTopics)) {
                         iterator = mTopics.iterator();
                         while (iterator.hasNext()) {
                            UpdateShareBusinessLinkModel$UserInfo userInfo = iterator.next();
                            str4 = "@"+userInfo.mUserName+"\(O"+userInfo.mUserId+"\)"+str3;
                            obj2 = str1+str4;
                            uoe1.add(str4);
                         }
                      }
                      Object[] objArray1 = new Object[i];
                      a.b().w("ShareProducerPresenter", "getTagEditString final "+str1, objArray1);
                      str1 = str1;
                   }
                   if (!PatchProxy.applyVoidOneRefs(str1, b2, e.class, "6")) {
                      b1 = b2.r;
                      if (b1 != null) {
                         b1.setText(str1);
                      }
                   }
                }
             }
          }
          str2 = str1;
          goto label_009d ;
       }
    label_01a3 :
       str = (obj1 != null)? a.a.q(obj1): null;
       b = obj.b;
       b1 = b.v;
       if (b1 != null) {
          b1.d1().R1(str);
       }else {
          u = b.t;
          if (u != null) {
             u.R1(str);
          }else {
             ExceptionHandler.handleCaughtException(new IllegalStateException(" mDraft and mVideoContext all are null serviceData="+obj1));
          }
       }
       u = obj.b.u;
       Objects.requireNonNull(u);
       if (!PatchProxy.applyVoidOneRefs(str, u, p0.class, "12")) {
          u.v = str;
          u.k.onNext(new Object());
       }
       if (i.h()) {
          i.m().Q("serviceLinkData", str);
          if (i.g().getServiceLinkInfo().get() != null) {
             i oi = i.m();
             if (str == null) {
                i = true;
             }
             oi.Q("initiativeDeleteSchemeServiceLinkData", Boolean.valueOf(i));
          }
       }
       return;
    }
    public d$a b(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e$a$a(this);
    }
    public UpdateShareBusinessLinkModel c(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.v;
       if (obj != null) {
          objArray = obj.d1().P();
       }
       if (objArray != null && ("30").equals(objArray.mEntryId)) {
          return objArray;
       }else {
          return this.b.u.A;
       }
    }
    public ShareBusinessLinkPhotoParam d(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       String str1 = (this.a != null)? str: this.b.C;
       e s = this.b.s;
       if (s != null) {
          str = s.getPhotoId();
       }
       return new ShareBusinessLinkPhotoParam(str1, str, QCurrentUser.me().getId());
    }
    public void e(boolean p0){
       this.b.p = p0;
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       this.b.q.setOnClickListener(new d(this, p0));
       return;
    }
}
