package com.yxcorp.gifshow.activity.share.presenter.a2$a;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment$c;
import com.yxcorp.gifshow.activity.share.presenter.a2;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.edit.draft.Workspace$Type;
import ow8.c;
import com.kuaishou.edit.draft.Workspace$Source;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import xw8.p0;
import com.kwai.robust.PatchProxyResult;
import fx8.s;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.android.post.topic.model.TopicItem;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import com.yxcorp.gifshow.model.topic.HotRecommendResponse;
import java.lang.Throwable;

public class a2$a implements ShareTopicGuideFragment$c	// class@0013bd
{
    public final a2 a;

    public void a2$a(a2 p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,List p1){
       boolean b;
       a2$a uoa = a2$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "ShareTopicGuidePresenter";
       a.b().w(str, "initFragment : get result="+p0, objArray);
       uoa = this.a;
       int i1 = p0 ^ 0x01;
       Objects.requireNonNull(uoa);
       a2 uoa2 = a2.class;
       if (PatchProxy.isSupport(uoa2) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(i1), uoa, uoa2, "4") && (c.q(c.i(uoa.t, uoa.u), c.f(uoa.t)) && uoa.z != null))) {
          Object[] objArray3 = new Object[i];
          a.b().w(str, "line invisible", objArray3);
          int i2 = 4;
          if (i1) {
             uoa.z.setVisibility(i2);
          }else {
             ConstraintLayout$LayoutParams layoutParams = uoa.z.getLayoutParams();
             layoutParams.topMargin = a1.d(0x7f07028d);
             uoa.z.setLayoutParams(layoutParams);
             uoa.z.setVisibility(i2);
          }
       }
       a2 q = this.a.q;
       q.B = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s os = s.class;
       TopicItem obj = PatchProxy.applyOneRefs(p1, null, os, "6");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else if(q.f(p1)){
          Object[] objArray1 = new Object[i];
          a.b().t("ShareTopicUtils", "getRecommendTopicClassId: topicItemList is null", objArray1);
       }else {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             if (obj == null) {
                Object[] objArray2 = new Object[i];
                a.b().t("ShareTopicUtils", "getRecommendTopicClassId: item is null, skip", objArray2);
             }else {
                Object obj1 = PatchProxy.applyOneRefs(obj, null, os, "7");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else if(obj.getType() == TopicItemType.RECOMMEND && TextUtils.x(obj.getMKsOrderId())){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   i = obj.getId();
                   break ;
                }
             }
          }
       }
       q.E = i;
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a2$a.class, "1")) {
          return;
       }
       a2$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a2.class, "7")) {
          ta.A.setCompoundDrawables(objArray, objArray, objArray, objArray);
          ta.B.setVisibility(0);
          ta.B.setLoadingStyle(LoadingStyle.GRAY);
          ta.B.h();
       }
       return;
    }
    public void c(HotRecommendResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a2$a.class, "3")) {
          return;
       }
       a2$a ta = this.a;
       ta.q.D = p0;
       ta.R8();
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a2$a.class, "4")) {
          return;
       }
       this.a.R8();
       return;
    }
}
